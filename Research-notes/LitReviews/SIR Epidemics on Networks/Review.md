The authors note that there are generally three approaches to compartmental models of disease. We can take averages at population level, maintain a probabilistic view by considering the full state space or begin modelling at the level of vertices and build up to larger structures from there. The latter of these three approaches is the one used by the authors: begin by considering equations for single vertices, then consider dependencies on pairs, then triples and so on until we reach the full system size. Such equations are well defined and consistent, which is not difficult to see.

The paper presented has two aims. Firstly, to provide an exact, deterministic representations of Markovian $SIR$ epidemics on networks with and without loops. Secondly, to identify a link between the structural properties of the networks and the viability of closures that can be used to write down exact systems of equations that can be numerically evaluated. In particular, the authors show this structural link is founded on cut-vertices and bridge edges. Cut-vertices are vertices that, if removed from a connected graph, result in the formation of two (or more) disconnected sub-graphs. Bridges are edges that lie between two cut-vertices.

The authors spend significant time expanding intuitions on the identification of closures, which allow us to approximate or even exactly specify higher-order moments in terms of lower-order moments. They claim this is well known to be feasible for tree-like graphs and for graphs with loops starting from some specific initial conditions. They present some examples to develop the intuition that "loops cannot be closed by breaking them down to their component parts."

The main result of the work reveals an important relation between structure of the graph used in the epidemic model and types of closures that are feasible using cut-vertices and bridges.

They also prove an impressively general result: if a graph with $N$ vertices and  $E$ edges has $T$ triangles and no larger loops than size 3 (meaning also that triangles cannot have overlapping edges), an upper bound on the size of the system of equations describing the system dynamics can be calculated:
$$
2N + 3E + 7T \leq 10N
$$

The authors also provide a "recipe-like" approach to establish the feasibility of writing down an exact representation for a given network even more generally. They use this to provide an upper bound for the number of equations required to describe epidemic dynamics exactly:
$$
\displaystyle N_{EQ}(G)=\sum^P_{i=1}m_if_i - 2\sum^{L}_{j=1}(\text{Ind}(v_{i_j})-1).
$$
where:
- $P$ is the number of distinct subgraphs produced when the original graph is spliced into independent subgraphs through cut-vertices.
- $m_i$ represents the number of equations required to describe the corresponding subnetwork $i$
- $f_i$ is the frequency or count of the subnetwork $G_i$
- $\text{Ind}(v_{i_j})$ is the number of subnetworks that the cut-vertex $v_{i_j}$ belongs to

This takes a sum across the number of equations for all subnetworks and adjusts to account for unnecessary multiplications caused by cut-vertices being part of multiple subnetworks, which is a move made in illustrative examples throughout the work.