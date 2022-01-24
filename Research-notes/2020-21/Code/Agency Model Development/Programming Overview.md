# Programming

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

## Enum: `State`

This enum will contain the states that an agent can be in. All agents begin as susceptible. The possible states are:
- _`SUSCEPTIBLE`_ - Not currently exposed to/infected by the contagion
- _`EXPOSED`_ - (potentially) Has been exposed to the contagion
- _`INFECTED`_ - Currently infected by the contagion and can infect others
- _`RECOVERED`_ (potentially) Has had but no longer has the contagion
- _`PROTECTED`_ Protected from the contagion (significant `protected` rating, usually 1)

## Class: `Graph`

The `Graph` class contains methods to instantiate a graph and represent it using an adjacency matrix. This class will be used with `Agents` as vertices for the contagion to spread.

## Class: `Model`

This will be the 'engine' of the project. Here, we can pass in the values (probabilities) which dictate whether someone will contract and run the simulation in the console.

## Class: `ModelState`

Here, all methods involved in storing and updating the state of play will be kept and called from. For instance, a method for getting the currently burning vertices (based on probabilistic propagation) and for updating the state (stored as a matrix) of the graph. The matrix keeping information about how the contagion has progressed will begin with one column of all zeros, where each row represents the vertex corresponding to the row index. Then, in this first column, the outbreak will have the value 2 here and from now on and all others will remain 0. Another column will represent a defensive move - if any vertices have been influenced to the level required to deem them immune to the disease (perhaps by a vaccine), then they move to the protected state and have the value 1 in their row from now on. Then, another column is added to represent any transmissions that occur - based on the probability of transmission and the protection rating of the agents the contagion is currently adjacent to. Then, another defence turn is played and so on, until no more moves can be made - either burning or defence. This class also needs to contain methods that check for this instance after every turn and thereby end the simulation.