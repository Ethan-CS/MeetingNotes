# Agency-based contagion modelling

Below is an overview of the project I am to create. I hope to outline the key functions of each object, especially how they are instantiated, accessed and updated as the model progresses, as well as the structure of the model and how programs will interact with each other. Much of the aims and objectives below are idealistic and long-term goals, meaning they are fairly complex. Not all of the features suggested will have been implemented at all times, but the project should be progressing to those places.


## Class: `Agent`

Each `Agent` object will have several attributes:
- `vertex` - their position in the graph
- `peril` - based on their proximity to the closest fire (uses Dijkstra's algorithm to determine)
	- 0 - Perfectly safe
	- 1 - On fire
-  `protection` - combination of a baseline protection rating (between 0 and 1) and the peril rating. Contagion is based on this protection rating.
	-  0 - Completely unprotected (would immediately contract)
	-  1 - Completely protected (would not contract)
-  `state` - whether they are susceptible, infected(, recovered) or defended.

An `Agent` object is created and gains these attributes - `vertex` is passed to the constructor, `peril` is based on the initial state of the graph (where the outbreak occured), `protection` is then calculated based on their proximity to fire and then their `state` is determined.

At the next time step, the player gets to play a defensive move. In vanilla Firefighter, we fully protect the vertices we select in this capacity. In the agency-based version we propose, we instead have a 'quota' of 'influence' that we can exert in each round. For instance, if our quota (perhaps due to budget or time constraints) is the equivalent of increasing one person's protection rating by 100%, we might choose to increase two peoples' ratings by 50% each or three by 50%, 30% and 20% and so on. Some distribution of this influence will be played each turn in order to defend the graph and aim to contain the contagion as quickly as possible.

Each agent needs to be updated whenever they are protected, become closer to fire (especially in close enough proximity to determine whether they may contract, based on `protection`) and when they recover from an infection. These things need to be checked every turn and updated where appropriate. Burning happens on even numbered turns, defence happens on odd numbered turns.



## Class: `Graph`

The `Graph` class contains methods to instantiate a graph and represent it using an adjacency matrix. This class will be used with `Agents` as vertices for the contagion to spread.


## Class: `GraphGenerator`

The `GraphGenerator` has the capacity to generate any of the following types of random graph:
- Simple,
- Erdős–Rényi,
- Complete,
- Bipartite,
- Complete bipartite,
- Erdős–Rényi bipartite,
- Path,
- Binary tree
- Cycle,
- Eulerian path,
- Eulerian cycle,
- Wheel,
- Star,
- Regular,
- Tree.

There is also a unit test in the `main` method of this class that tests each of these graphs generate correctly, given a number of vertices and a number of edges and/or probability as and when appropriate.



## Class: `MinPriorityQueue`

This class can be instantiated to represent a priority queue of generic keys, with the usual methods as well as the capacity to see the minimum key, get whether the queue is empty and iterate through all of the keys. This utilises a binary heap and has various notes about run times and complexity for general interest.


## Class: `Model`

This will be the 'engine' of the project. Here, we can pass in the values (probabilities) which dictate whether someone will contract and run the simulation in the console. This also contains all methods involved in storing and updating the state of play will be kept and called from. For instance, a method for getting the currently burning vertices (based on probabilistic propagation) and for updating the state (stored as a matrix) of the graph. The matrix keeping information about how the contagion has progressed will begin with one colum of all zeros, where each row represents the vertex corresponding to the row index. Then, in this first column, the outbreak will have the value 2 here and from now on and all others will remain 0. Another column will represent a defensive move - if any vertices have been influenced to the level required to deem them immune to the disease (perhaps by a vaccine), then they move to the protected state and have the value 1 in their row from now on. Then, another column is added to represent any transmissions that occur - based on the probability of transmission and the protection rating of the agents the contagion is currently adjacent to. Then, another defence turn is played and so on, until no more moves can be made - either burning or defence. This class also needs to contain methods that check for this instance after every turn and thereby end the simulation.


## Class: `Set`

The `Set` class represents an ordered set of comparable keys. We have the usual methods and some ordered methods for finding the minimum, maximum, floor and ceiling and also set methods for union, intersection and equality.


## Enum: `State`

This enum will contain the states that an agent can be in. All agents begin as susceptible. The possible states are:
- _`SUSCEPTIBLE`_ - Not currently exposed to/infected by the contagion
- _`EXPOSED`_ - (potentially) Has been exposed to the contagion
- _`INFECTED`_ - Currently infected by the contagion and can infect others
- _`RECOVERED`_ (potentially) Has had but no longer has the contagion
- _`PROTECTED`_ Protected from the contagion (significant `protected` rating, usually 1)



## Class: `StdIn`

The `StdIn` class gives many static methods used to read strings and numbers from standard input, which are handled as detailed in the documentation for this class.


## Class: `StdOut`

The `StdOut` class gives many static methods used to print strings and numbers to standard output. These operations are again handled as detailed in the documentation for this class.


## Class: `StdRandom`

The `StdRandom` class provides many static methods to generate pseudo-random numbers from the following distributions:
- Uniform,
- Bernoulli,
- Gaussian,
- Geometric,
- Poisson,
- Pareto,
- Cauchy,
- Discrete
- Exponential.

The class also provides methods to shuffle an array of various types of Objects/primitives and return a uniformly random permutation. Importantly, the class also provides a seed for the random number generation, so that results can be reproduced if/when required (when used to generate random graphs).
