## Definition: $k$-firefighter

Fixed positive integer $k$. In each round, fire chooses at most $k$ neighbouring vertices to burn. In this variant, a move for the fire is to spread to *at most* *k* unprotected vertices.

This results in a two-player variant of [[DEF. Firefighter Problem|the Firefighter Problem]]. In this variant, an optimal strategy for the fire aims to burn as many vertices as possible and for the firefighter aims to save as many vertices as possible.

By tracking score between vertices burned and vertices saved (on a finite graph), $k$-firefighter can be interpreted as a [[DEF. Combinotorial Game|combinotorial game]].

This variant considers spread of fire with limited resources: the fire is constrained to a given number of neighbours to spread to, rather than to every unprotected vertex. 
**This could be used to implement information about $R$ numbers (reproduction rate of particular disease, e.g. $R=15$ for measles)

This therefore makes it applicable to the spread of gossip, news or information in a social network: agents in these networks have finite time and resources and thus spread gossip only to a finite selection of their friends (neighbouring vertices).

This was first suggested as a variant of the original problem in [[Papers/Fire containment in grids/0. Meta|Fire containment in grids of dimension three and higher]].