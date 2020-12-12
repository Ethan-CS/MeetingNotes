[[DEF. Percolation|Percolation]] Theory aims to explain behaviour of a graph when vertices or edges between them are removed.

Percolation is a type of [[DEF. Phase Transition|phase transition]]: when a critical fraction of removal is reached, the network breaks into smaller connected clusters.

Source of the name from representative question: suppose some liquid is poured ontop of some porous material - can the liquid reach the bottom by going from hole to hole? This is modelled mathematically as a network of $n \times n \times n$ vertices or 'sites' where the edge or 'bond' between two neigbouring vertices may be open with probability $p$ or closed with probability $(1-p)$. These possibilities are assumed to be independent.[^1]

Corresponding problem: site percolation. Site is occupied with probability $p$ and empty with probability $1-p$ - then, its edges are removed. The question is the same: for some given $p$, what is the probability that a path exists between top and bottom? Analagously, we can ask whether, given a connected graph, at what fraction $1-p$ of failures the graph will become disconnected (no large component).

In the infinite case, does an infinite open cluster exist? I.e. is there a path of connected points of infinite length through the entire network?



[^1] S R Broadbent, J M Hammersley, *Percolation processes: I. Crystals and mazes*, Mathematical Proceedings of the Cambridge Philosophical Society, vol. 53, issue 3, July 1957, pp. 629-641