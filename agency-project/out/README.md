# Initial test results

These are some initial model test results on various randomly generated graphs. The inputs for graph generation are as follows: 
```java
// Numbers of vertices and edges
int numVertices = 8;
int numEdges = 16;

// Split vertices into two partitions for bipartite graphs
int numVertices1 = numVertices / 2;
int numVertices2 = numVertices - numVertices1;

// Probability for testing Erdős–Rényi and Erdős–Rényi bipartite graphs
double p = (double) numEdges / (numVertices * (numVertices - 1) / 2.0);

 // Total defence (improvement in protection ratings) that can be deployed each turn
double totalDefence = 1.0;
// Probability with which the infection transmits
double probabilityOfInfection = 1.0;
```

Each graph has an associated seed, used to generate the random numbers that were in turn used to generate the graph. After generation, the model cycles through the number of vertices (beginning at 0), taking each to be a source node and runs the model based on each single outbreak.
