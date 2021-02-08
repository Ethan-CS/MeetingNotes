# 08-01-2021

## What it does

Some major additions in this version, mostly in order to provide functionality for reading and writing files. In particular, I want the Agency project to be able to either take a graph for the model as specified by an input file or generate a random graph of a certain type given some specifications.Further, I want to be able to output the outcome of the model and the graph it ran on (including any relevant random seeds) in order to analyse the results I obtain. The added files take some of the open source code from [here](https://algs4.cs.princeton.edu/code/) but have taken a good deal of my own work to tailor them to my code context and update the documentation accordingly.


## What it doesn't do

I haven't yet made the leap to inputting and outputting from files, but I felt it was necessary to update the current version and back this up as a good many useful classes have been added and they all hold up to preliminary unit testing so far. I now need to actually use this accessory code to read from a file (to obtain a specific graph), use the graph generator to come up with a specific type of random graph and output the results _including all necessary data to reproduce the results_ to files I can compile and analyse.