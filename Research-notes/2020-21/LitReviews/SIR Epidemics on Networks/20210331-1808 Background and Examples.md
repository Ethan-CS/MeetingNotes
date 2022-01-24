Tags :   #Markovian #SIR #SIRP #Epidemiology 
Zettel :  31032021-1808
Status : #triage 

-----

# 2: Background and Examples

**Previous note:** [20210331-1644 Introduction](20210331-1644%20Introduction.md)

-----

### Questions & thoughts:

To generate equations, we begin at level of individuals and build up to singles dependencies on pairs, then dependencies of pairs on triples, etc. until we have the full system size. These equations are _well defined and self consistent._

Aim here is to find _closures_ so higher-order moments can be approximated or exactly specified in terms of lower-order moments. Well known this is feasible for tree-like networks and for networks with loops starting from some specific initial conditions/example graphs.

They present some examples to develop the intuition "loops cannot be closed by breaking them down to their component parts."


-----
 
**Consider:**

Closures are starting to make a lot more sense now I'm revisiting this with a better understanding of graph theoretical concepts like cut-vertices, but it's important I understand the main result (theorem 1 in §4).

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
