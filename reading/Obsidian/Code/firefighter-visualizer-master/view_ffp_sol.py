#!/usr/bin/python3

import getopt
import math
import queue
import subprocess
import sys
import tempfile
from collections import defaultdict

from igraph import *


# Processo de simulação do espalhamento e contenção do fogo
def simulate(g, n, n_e, B_init, toSave, outputfile_name):
    UNTOUCHED = "#A9A9A9"
    BURNED = "#FF0000"
    SAVED = "#00FF00"
    # cria um diretório temporário para as imagens
    tmpdir = tempfile.TemporaryDirectory()
    # fila de vértices a serem visitados
    q = queue.Queue()
    # espessura das arestas
    g.es["width"] = 2
    # cor dos vértices intocados
    g.vs["color"] = UNTOUCHED
    # tamanho dos vértices
    g.vs["size"] = 50
    # tamanho do rótulo dos vértices
    g.vs["label_size"] = 20
    # rótulo dos vértices = ID
    g.vs["label"] = [v.index for v in g.vs]
    # layout do grafo
    #layout = g.layout_drl(fixed=[True for v in g.vs])
    layout = g.layout_lgl()
    #layout = g.layout_reingold_tilford()
    visual_style = {}
    visual_style["layout"] = layout
    visual_style["margin"] = [30, 30, 30, 30]
    visual_style["bbox"] = (1024, 900)
    visual_style["keep_aspect_ratio"] = True
    # focos de incêndio
    for v in B_init:
        g.vs[v]["color"] = BURNED
        g.vs[v]["label"] = str(v) + "/" + str(0)
        g.vs[v]["label_color"] = "#FFFFFF"
        q.put(v)
    # marcador de iteração no tempo
    q.put(-1)
    # iteração
    iter = 1
    plot(g, **visual_style, target=str(tmpdir.name) + '/out0.png')
    #plot(g, **visual_style, target='out0.png')

    # processo de espalhamento e contenção do fogo
    # bem similar a uma BFS
    while not q.empty():
        v = q.get()
        # se é um marcador de iteração no tempo
        if v == -1:
            # marca uma nova iteração quando os vértices atualmente na fila
            # forem todos visitados
            if not q.empty():
                q.put(-1)
            #plot(g, **visual_style, target=str(tmpdir.name) + '/out' + str(iter) + '.png')
            plot(g, **visual_style, target=str(tmpdir.name) +
                 '/out' + str(iter) + '.png')
            iter = iter + 1
        else:
            # para cada vizinho de um vértice queimado na iteração anterior
            for e_u in g.incident(v):
                u = int(g.es[e_u].target)
                if u == v:
                    u = int(g.es[e_u].source)
                # se ele deve ser salvo e ainda não foi salvo
                if toSave[u] == True and g.vs[u]["color"] == UNTOUCHED:
                    g.vs[u]["color"] = SAVED
                    g.vs[u]["label"] = str(u) + "/" + str(iter)
                    g.vs[u]["label_color"] = "#FFFFFF"
                # se não deve ser salvo e está intocado
                elif toSave[u] == False and g.vs[u]["color"] == UNTOUCHED:
                    g.vs[u]["color"] = BURNED
                    # só visita vizinhos de vértice intocados
                    q.put(u)
                    g.vs[u]["label"] = str(u) + "/" + str(iter)
                    g.vs[u]["label_color"] = "#FFFFFF"

    # Por alguma razão esdrúxula, o resolvedor pode salvar vértices que estão
    # distantes do fogo, de maneira que mesmo que o fogo seja contido, eles
    # estejam além do corte de vértices formado pela barreira dos firefighters
    for v in range(0, n):
        if toSave[v] == True and g.vs[v]["color"] != SAVED:
            g.vs[v]["color"] = SAVED
    # plot(g, **visual_style, target=str(tmpdir.name) +
    #      '/out' + str(iter) + '.png')

    # Gera o vídeo
    devnull = open(os.devnull, 'w')
    subprocess.call(["ffmpeg", "-y", "-framerate", "1/3", "-start_number", "0", "-i", str(tmpdir.name) + "/out%d.png",
                     "-c:v", "libx264", "-r", "30", "-qscale", "1", "-pix_fmt", "yuv420p", "-threads", "0", outputfile_name], stdout=devnull, stderr=devnull)


def simulate2(g, n, n_e, B_init, to_save, to_burn, max_t, outputfile_name):
    UNTOUCHED = "#A9A9A9"
    BURNED = "#FF0000"
    SAVED = "#00FF00"
    THREAT = "#00CED1"
    # cria um diretório temporário para as imagens
    tmpdir = tempfile.TemporaryDirectory()
    # espessura das arestas
    g.es["width"] = 2
    # cor dos vértices intocados
    g.vs["color"] = UNTOUCHED
    # tamanho dos vértices
    g.vs["size"] = 50
    # tamanho do rótulo dos vértices
    g.vs["label_size"] = 20
    # rótulo dos vértices = ID
    g.vs["label"] = [v.index for v in g.vs]
    # layout do grafo
    #layout = g.layout_drl(fixed=[True for v in g.vs])
    #layout = g.layout_lgl()
    layout = g.layout_fruchterman_reingold()
    #layout = g.layout_reingold_tilford()
    visual_style = {}
    visual_style["layout"] = layout
    visual_style["margin"] = [30, 30, 30, 30]
    visual_style["bbox"] = (1000, 1000)
    visual_style["keep_aspect_ratio"] = True
    #visual_style['hovermode'] = 'closest'

    for t in range(0, max_t + 1):
        for v in to_save[t]:
            g.vs[v]["color"] = SAVED
            g.vs[v]["label"] = str(v) + "/" + str(t)
            g.vs[v]["label_color"] = "#FFFFFF"
        for v in to_burn[t]:
            g.vs[v]["color"] = BURNED
            g.vs[v]["label"] = str(v) + "/" + str(t)
            g.vs[v]["label_color"] = "#FFFFFF"
            for e_u in g.incident(v):
                u = int(g.es[e_u].target)
                if u == v:
                    u = int(g.es[e_u].source)
                if g.vs[u]["color"] == UNTOUCHED:
                    g.vs[u]["color"] = THREAT
        plot(g, **visual_style, target=str(tmpdir.name) +
             '/out' + str(t) + '.png')

    # Gera o vídeo
    devnull = open(os.devnull, 'w')
    subprocess.call(["ffmpeg", "-y", "-framerate", "1/5", "-start_number", "0", "-i", str(tmpdir.name) + "/out%d.png", "-filter:v", "scale=1000:-1",
                     "-c:v", "libx264", "-r", "30", "-qscale", "1", "-pix_fmt", "yuv420p", "-threads", "0", outputfile_name], stdout=devnull, stderr=devnull)


def main(argv):
    inputfile_name = ''
    src = 0
    dst = 0
    try:
        opts, args = getopt.getopt(argv, "hi:o:", ["ifile="])
    except getopt.GetoptError:
        print('view_instance.py -i <inputfile_name>')
        sys.exit(2)
    for opt, arg in opts:
        if opt == '-h':
            print('view_instance.py -i <inputfile_name>')
            sys.exit()
        elif opt in ("-i", "--ifile"):
            inputfile_name = arg
    g = Graph(directed=None)
    input_f = open(file=inputfile_name, mode='r')
    # número de vértices
    n = int(input_f.readline())
    # número de arestas
    n_e = int(input_f.readline())
    # número de vértices que são focos de incêndio
    n_B_init = int(input_f.readline())
    # foco de incêndio
    B_init = map(int, input_f.readline().split())

    # cria os vértices de 0 a n-1
    g.add_vertices(n)

    # lê as arestas
    for e in range(0, n_e):
        src, dst = map(int, input_f.readline().split())
        g.add_edges([(src, dst)])

    max_t = -1
    n_to_save = int(input_f.readline())
    to_save = defaultdict(list)
    v = 0
    t = 0
    for e in range(0, n_to_save):
        v, t = map(int, input_f.readline().split())
        max_t = max(max_t, t)
        to_save[t].append(v)

    n_to_burn = int(input_f.readline())
    to_burn = defaultdict(list)
    v = 0
    t = 0
    for e in range(0, n_to_burn):
        v, t = map(int, input_f.readline().split())
        max_t = max(max_t, t)
        to_burn[t].append(v)

    input_f.close()
    #simulate(g, n, n_e, B_init, toSave, outputfile_name)
    simulate2(g, n, n_e, B_init, to_save, to_burn, max_t,
              os.path.splitext(inputfile_name)[0] + ".mp4")

if __name__ == "__main__":
    main(sys.argv[1:])
