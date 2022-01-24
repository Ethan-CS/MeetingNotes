Tags :   #Def #SurvivingRate #Epidemiology #Disease
Zettel :  26112020-1130
Status : #triage 

-----

# DEF: Surviving rate

-----

### Questions & thoughts:

Defined as the expected proportion of vertices that it is possible to save when a fire breaks out at a vertex of $G$ chosen uniformly at random. Precise values for the surviving rate $\rho$ of a graph $G$, $\rho(G)$, have been found for paths and cycles (Cai and Wang) and bounds have been determined for trees ([[Papers/Surviving Rate of a graph/0. Meta|Cai and Wang]]; Cai, Cheng, Verbin and Zhou), planar graphs, $K_4$-free minor graphs and outerplanar graphs. Sparse graphs - surviving rates should be fairly large.

Finbow et al. - any graph $G$ with $n\geq 2$ vertices and at most $\displaystyle\left(4/3 - \epsilon\right)n$ edges has the property that $\rho(G)\geq\frac{6}{5}\epsilon$, where $0<\epsilon<\frac{5}{24}$ is fixed.

Pralat showed that graphs with at most $\left(\frac{15}{11}-\epsilon\right)n$ edges has surviving rate $\rho(G)\geq \frac{1}{60}\epsilon$, where $0<\epsilon<1/2$ is fixed. Further, construction of a random graph by proposition shows that no further improvement upon this is possible - i.e. 15/11 is the threshold.

In the context of [[DEF. k-firefighter|k-firefighter]], for a vertex $v$ in $G$, we define $\text{sn}_k(G,v)$ to be the number of vertices it is possible to save if a fire breaks out at $v$. For $G$ a finite graph, its *$k$-surviving rate* is: 
$$\rho(G, k) = \frac{1}{n^2}\sum_{u\in V(G)}\text{sn}_k(G, u).$$
Since $\text{sn}_k(G, u)/n$ is the proportion of vertices that can be saved when a fire breaks out at $u$, $\rho(G, k)$ is the expected percentage of vertices that can be saved when a fire breaks out at a random vetex of $G$ (uniform distribution for initial placement). E.g. for a [[DEF. Clique|clique]]:
$$\rho(K_n,k)=\frac{\lceil(n-1)/(k+1)\rceil}{n}\geq\frac{1}{k+1}\left(1-\frac{1}{n}\right).$$ This is found by noting that the firefighter can save one vertex in each step and then the fire spreads to $k$ vertices, regardless of where fire starts - after $\lceil(n-1)/(k+1)\rceil$ steps, the process is completed.

For a path:
$$\rho(P_n, k)=\rho(P_n)=\frac{2}{n}\cdot\frac{n-1}{n}+\frac{n-2}{n}\cdot\frac{n-2}{n}=1-\frac{2}{n}+\frac{2}{n^2}.$$ To obtain this, we note that the firefighter can save $n-1$ vertices if the fire breaks out at the end vertices or otherwise $n-2$.


-----
 
**Consider:**


**Source:** 


**Reference:** Introduced first in Cai and Wang, [[Papers/Surviving Rate of a graph/0. Meta|The surviving rate of a graph for the firefighter problem]].




