# Firefighter

In this directory are the most up-to-date Java files that I have been working on to understand different aspects of the Firefighter Problem. Below is a rough contents of this, which will be updated as I carry on with this project:


## `Agent`

Not currently in use, but is accessory code for a version of the Firefighter Problem I aim to work on soon that involves using the methods in this file to imbue each vertex (individual) with some agency-related properties, for instance a defense rating which corresponds to the level of protection they have from the contagion propagating through the graph.

## `Graph`

Gives some basic properties and methods we use to describe and work with graphs in the rest of the work, for instance how to instantiate and represent as an adjacency matrix, how to get and remove edges and so on.


## `GreedyFirefighter`

Takes a given graph, randomly selects a vertex to begin the fire and then fights it according to the "greedy algorithm" - it calculates which open (neither burning nor defended) vertex is of greatest weight and defends that one on each turn.


## `NaiveOptimalFirefighter`

Much like the name suggests, this takes a graph, starts the fire at a random vertex, generates all permutations of the other ('open') vertices and tries each permutation from the first defensible vertex as a defence strategy, sees which one contains the fire in the fewest number of turns and returns that optimal strategy.
## `Permutation`

While not currently in use, this class contains methods to take an array (in theory, of any type) and return all the permutations of the elements.


## `Point`

This is also not currently in use, but contains some accessory code so that - in future - I can more effectively and efficiently represent graphs, perhaps using ASCII drawings on the console, to understand more complex systems better when we play Firefighter on the.
## `State`

Contains methods to create the matrix (`int[][]`) that stores the state of each vertex at each turn of the game, including how to update the state when we want to defend or burn and how to represent the state in a human-readable way.

## Exceptions:

### `InvalidStateException`

This will be thrown if there is an invalid state, by which I mean a matrix (`int[][]`) that stores the state of each vertex at each turn: 0 -> open, 1 -> defended, 2 -> burning.


### `InvalidTurnCountException`

By design, the code here burns on even numbered turns (start is turn zero) and defends on odd numbered turns; this exception is thrown if we try to defend in an even turn or burn in an odd one.
