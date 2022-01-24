Tags :   #Markovian #SIR #SIRP #Epidemiology 
Zettel :  20210401-1818
Status : #triage 

-----

# 4. Applications of the Main Result

**Previous note:** [20210401-1028 Main result](20210401-1028%20Main%20result.md)

-----

### Questions & thoughts:

Authors consider a specific network, the _star-triangle network._

![Star Triangle Network with M triangles](Screenshot%202021-04-01%20at%2018.21.30.png)
_The Star Triangle Network with $M$ Triangles_

#### Star-triangle network


They write down and program in the exact system and then compare the results from the ODEs to results from Gillespie-like simulations. Label central node 1, the exterior nodes in the $i^{\text{th}}$ triangle are labelled $i_1, i_2$. They note that, from the exact reduced system of equations, it is straightforward to see that the number of equations depends on the number of triangles.
- An isolated triangle requires 18 equations :
	- 6 for the nodes as each can be $S$ or $I$,
	- 6 for the edges as each can be $SI$ or $IS$ and 
	- 6 triples - out of eight possible configurations of $S$ and $I$, we discard the dynamically unimportant $SSS$ and $III$ triples.
- If this triangle is instead part of a whole network, we need to consider:
	- The $SS$-type edges where at least one of the connected vertices is a cut-vertex. This accounts for infections coming from outside the triangle.
	- Equations for $SSS$ to capture infection coming from a cut-vertex from outside.
- This extension procedure results in the addition of 3 extra equations - one for $SSS$ and two for the edges. We don't need an equation for $\langle S_{i_1} S_{i_2} \rangle$ as this pair can't be infected from outside the triangle.
- Hence, the reduced system (appears to) require $21M$ equations, but note that the cut-vertex (central node, 1) has a multiplicity $M$ so $\langle S_1 \rangle$ and $\langle I_1 \rangle$ appear $M$ times _although they are needed only once._ 
- Hence, the final number of equations required in the reduced system is given by $21M-2(M-1)=19M+2.$

#### General networks with loops of maximum size 3


They also prove a much more general result: if a network has loops no larger than size 3 (meaning also that triangles cannot have overlapping edges) an upper bound on the size of the system of equations describing the system dynamics can be calculated.

__Theorem 2:__ Consider a network with $N$ nodes, $E$ edges, $T$ triangles and no larger loops. The number of equations needed to fully describe the system dynamics is less than 
$$
2N + 3E + 7T \leq 10N
$$
(Proof from p13 to 15).

E.g. the lollipop network: $2N+3E+7T=2(4)+3(4)+7(1)=27$. However, the complete system they provide contains only 26 equations, since they didn't require $\langle S_3 S_4 \rangle$ for any of the closures.


#### Feasibility of the reduction by closure technique for general networks

The authors provide a recipe-like approach to establish the feasibility of writing down an exact representation for a given network. To achieve this for a network $G={V, E}$, the follow steps should be taken.
1. Find all cut-vertices of $G$ by using the _depth-first search algorithm_ and denote by $C=\{v_{i_1}, v_{i_2}, \dots, v_{i_L}\} \subset V$. This runs in poly time in $(|E|+|V|)$
2. Splice original network into independent subnetworks (each well connected but any two disconnected) as determined by number and properties of cut-vertices[^1]. 
3. Relation between distinct subnetworks $P$, frequency and number of vertices in subnetworks will determine number of equations required for a full, exact representation. This relation is made more precise with multipliers $m_1, m_2, \dots, m_P$ representing the number of equations required for each subnetwork.[^2]

Hence, an upper bound for the number of equations required to describe epidemic dynamics exactly is given by
$$
\displaystyle N_{EQ}(G)=\sum^P_{i=1}m_if_i - 2\sum^{L}_{j=1}(\text{Ind}(v_{i_j})-1).
$$
This simply takes a sum across the number of equations for all subnetworks and adjusts to account for unnecessary multiplications caused by cut-vertices being part of multiple subnetworks. Some examples:
- Simplest case of tree-like networks; $N_{EQ}=2|V|+3|E|$.
- Tree-like networks with triangles only, removing all cut-vertices leaves subnetworks which are either the edge or triangle, yielding $N_{EQ}(G)=2|V|+3|E|+7T$ (where again $T$ is the number of triangles in the network.)

$N_{EQ}$ is an upper bound since it accounts for all $SS$ pairs regardless of whether all need to be linked to other subnetworks. Similarly, other fully susceptible arrangements at higher levels may need to account appropriately for outside infections, as in the star-triangle network discussion. Clearly, the over-estimate of this formula depends in a non-trivial way on interaction between graph structure and epidemic dynamics and removing the $SS$ variables does not hugely decrease the number of equations.

Note there are two extreme scenarios in graph decomposition here:
1. Lots of cut-vertices, few distinct subnetworks with high frequency
2. Graph decomposes to relatively few subnetworks but of large sizes.

- Tree-like networks are a good example of (1) where the only subnetwork is the edge where each edge requires only 3 equations - fewer equations per subnetwork, but lots of subnetworks.
- More structured networks typically have distinct subnetworks of larger sizes which require more equations per subnetwork for an exact description - fewer subnetworks, more equations per subnetwork.
- Importantly, it is non-trivial to find a simple relation between subnetworks and number of equations needed for an exact description - this requires further attention and work.
- The desirable scenario to have is (1) for an exact representation: likely that, in this case, an exact description is possible.
- Complexity increases quickly from 22 for a fully connected triangle to 57 for a subnetwork equivalent to a toast network. Both scenarios therefore require lots of equations.
- Generating and implementing equations required for an exact description is prone to error, so authors recommend development of an algorithmic approach where equations can be generated automatically rather than manually. 
- It is likely that writing down an exact system of equations for networks with few cut vertices may be fairly difficult.



-----
 
**Consider:**

Perhaps code could:
- Ask the user to enter/load/generate a graph
- Identify whether writing down an exact representation of the system would be feasible (perhaps print upper bound) and warn the user if generation is not feasible
- If closures can be achieved, give user choice to generate full system, reduced system or both


**Source:** 

[[markovian.pdf | Paper]]


**Reference:** 

```tex
@article{kiss_2014, 
		title={Exact deterministic representation of Markovian $${SIR}$$ epidemics on networks with and without loops},
		volume={70}, 
		DOI={10.1007/s00285-014-0772-0}, 
		number={3}, 
		journal={Journal of Mathematical Biology}, 
		author={Kiss, Istvan Z. and Morris, Charles G. and Sélley, Fanni and Simon, Péter L. and Wilkinson, Robert R.}, 
		year={2014}, 
		pages={437–464}}
```

[^1]: This can be done such that cut-vertices are maintained in all subnetworks they generate. Let $\text{Ind}(V_{i_j})$ for $j = 1, 2, \dots, L$ denote the number of subnetworks the cut-vertex $v_{i_j}$ belongs to. Then, the subnetwork is a generalisation of the loop concept in that it must be connected and with no further cut-vertices. As indicated, closures within loops or subnetworks will not be exact.

[^2]: E.g. An edge needs 7 equations - 4 for the nodes, 3 at pair level. A triangle needs 22 equations - 6 for nodes, 9 for edges, 7 for triples. A cycle with 4 nodes needs 45 equations. The toast network needs 57 equations.