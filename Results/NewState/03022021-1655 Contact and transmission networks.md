Tags :    #SIR #Epidemiology
Zettel :  03022021-1655
Status : #triage 

-----

# Contact and transmission networks

**Previous note:** [[22012021-1633 JK meeting input]]

-----

### Questions & thoughts:

In Sharkey, _Deterministic epidemic models on networks: correlations and unbiological terms,_ (2011) we find the derivation of the master equations used by Kiss et al. in their paper on Markovian SIR models on networks with and without loops. Sharkey distinguishes a contact from a transition network. A contact network, generally represented by an adjacency matrix, represents the paths of infection possible in a given network model of infection. If in a graph there is a path of infection (single edge) between two vertices $i$ and $j$, then the element at position $[i,j]$ of the adjacency matrix $G$ is equal to 1. Otherwise, it is equal to zero. We generally aren't interested in self infection, so set $G_{i i} = 0$ for the most part.

Then, a transmission network is much the same as a contact network but with weights added. Elements of the corresponding adjacency matrix $T_{i j}$ represent the _infectious pressure_ acting on $i$ due to an infected person $j$. Generally, these rates (elements of the matrix) represent a combination of the risk of transmission per contact and the rate of that contact. $T$ can change with time, but the rate of change should be slow compared to the contact rates otherwise it will no longer represent the average infectious pressure, meaning we lose all notion of a contact network.

In the SIR version of these networks, we are interested in two transitions: infection, $(S_i \rightarrow I_i)$, and removal, $(I_i\rightarrow R_i)$. What I want to discover is the effect on the number of equations required to describe the model when we add another transition to this: protection, $(S_i \rightarrow P_i)$.
 

-----
 
**Consider:**

We need to have that $\langle S_i \rangle + \langle I_i \rangle + \langle R_i \rangle + \langle P_i \rangle = 1.$ This could form a good test to verify our system of equations is on the right tracks.


**Source:** 


**Reference:** 
