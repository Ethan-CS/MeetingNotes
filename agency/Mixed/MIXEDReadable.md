# Readable results of SIRP defence strategies on a random graph
## Generating Tree Graph:

Graph generator has generated the specified graph with the following parameters:

 * Type of graph: Tree
 * Number of vertices: 20
 * Number of edges: 19
 * Probability: 19 / (20 * (20 - 1) / 2) = 0.1
 * Random generator seed: 1615490422208

The generated graph is represented using the following adjacency matrix:

0: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 

1: 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 1 

2: 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 0 0 0 0 0 

3: 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

4: 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 

5: 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 1 0 0 1 

6: 0 1 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 

7: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 

8: 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 1 0 

9: 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

10: 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 

11: 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

12: 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 1 0 0 0 

13: 0 0 1 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 

14: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 

15: 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 

16: 0 0 0 0 0 1 0 0 0 0 0 0 1 0 0 0 0 0 0 0 

17: 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 0 0 

18: 1 0 0 0 1 0 0 1 1 0 0 0 0 0 0 0 0 0 0 0 

19: 0 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 


## Model values
The values used in the model are:
 * Total defence quota each turn: 1.0
 * Probability with which the infection propagates: 1.0
## Outbreak: 0
* Agent at vertex 0: peril 1.00, protection 0.21 and state INFECTED.* Agent at vertex 1: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.50, protection 0.03 and state SUSCEPTIBLE.* Agent at vertex 5: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.50, protection 0.53 and state SUSCEPTIBLE.* Agent at vertex 8: peril 0.50, protection 0.03 and state SUSCEPTIBLE.* Agent at vertex 9: peril 0.17, protection 0.30 and state SUSCEPTIBLE.* Agent at vertex 10: peril 0.09, protection 0.08 and state SUSCEPTIBLE.* Agent at vertex 11: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.33, protection 0.98 and state SUSCEPTIBLE.* Agent at vertex 13: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 1.00, protection 0.70 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.17, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [4, 7, 8, 9, 10, 12, 18]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 11, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 0.0]

 * S: [4, 7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [4, 7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.24, 0.27, 0.0, 0.0, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [9, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [9, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.43, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 9 turns.


#### Greatest Degree Defence

 * S: [4, 7, 8, 9, 10, 12, 18]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 11, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 0.0]

 * S: [4, 7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [4, 7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [7, 8, 9, 10, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 11, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.24, 0.0, 0.74, 0.0, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7, 9, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [7, 9, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.35, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 9 turns.


#### Highest Protection Defence

 * S: [4, 7, 8, 9, 10, 12, 18]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 11, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.21, 0.0, 0.0, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 0.0]

 * S: [4, 8, 9, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [4, 8, 9, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.49, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 8, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [4, 8, 10]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.59, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 8]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [4, 8]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.63, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [8]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [8]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 9 turns.


## Outbreak: 1
* Agent at vertex 0: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 1.00, protection 0.11 and state INFECTED.* Agent at vertex 2: peril 0.33, protection 0.19 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.50, protection 0.57 and state SUSCEPTIBLE.* Agent at vertex 6: peril 1.00, protection 0.01 and state SUSCEPTIBLE.* Agent at vertex 7: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.20, protection 0.90 and state SUSCEPTIBLE.* Agent at vertex 9: peril 0.33, protection 0.61 and state SUSCEPTIBLE.* Agent at vertex 10: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.33, protection 0.64 and state SUSCEPTIBLE.* Agent at vertex 17: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 1.00, protection 0.24 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [2, 5, 6, 8, 9, 16, 19]
 * I: [1]
 * R: []
 * P: [0, 3, 4, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.99, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01]

 * S: [2, 5, 8, 9, 16, 19]
 * I: [1]
 * R: []
 * P: [0, 3, 4, 6, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Infecting:_ 19 

 * S: [2, 5, 8, 9, 16]
 * I: [1, 19]
 * R: []
 * P: [0, 3, 4, 6, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.57, 0.0, 0.0, 0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 8, 9, 16]
 * I: [1, 19]
 * R: []
 * P: [0, 3, 4, 5, 6, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Nothing infected._
 * S: [2, 8, 9, 16]
 * I: [1, 19]
 * R: []
 * P: [0, 3, 4, 5, 6, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.0, 0.0, 0.02, 0.39, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0]

 * S: [8]
 * I: [1, 19]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [8]
 * I: [1, 19]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 19]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 7 turns.


#### Greatest Degree Defence

 * S: [2, 5, 6, 8, 9, 16, 19]
 * I: [1]
 * R: []
 * P: [0, 3, 4, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.43, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 6, 8, 9, 16, 19]
 * I: [1]
 * R: []
 * P: [0, 3, 4, 5, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Infecting:_ 6 19 

 * S: [2, 8, 9, 16]
 * I: [1, 6, 19]
 * R: []
 * P: [0, 3, 4, 5, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.81, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.0]

 * S: [8, 9, 16]
 * I: [1, 6, 19]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Nothing infected._
 * S: [8, 9, 16]
 * I: [1, 6, 19]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.39, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 6, 19]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [2, 5, 6, 8, 9, 16, 19]
 * I: [1]
 * R: []
 * P: [0, 3, 4, 7, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 0.0, 0.0, 0.1, 0.39, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0]

 * S: [2, 5, 6, 19]
 * I: [1]
 * R: []
 * P: [0, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
_Infecting:_ 6 19 

 * S: [2, 5]
 * I: [1, 6, 19]
 * R: []
 * P: [0, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.72, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2]
 * I: [1, 6, 19]
 * R: []
 * P: [0, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [2]
 * I: [1, 6, 19]
 * R: []
 * P: [0, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 6, 19]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 5 turns.


## Outbreak: 2
* Agent at vertex 0: peril 0.10, protection 0.46 and state SUSCEPTIBLE.* Agent at vertex 1: peril 0.33, protection 0.28 and state SUSCEPTIBLE.* Agent at vertex 2: peril 1.00, protection 0.45 and state INFECTED.* Agent at vertex 3: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 1.00, protection 0.18 and state SUSCEPTIBLE.* Agent at vertex 11: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 1.00, protection 0.50 and state SUSCEPTIBLE.* Agent at vertex 14: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.50, protection 0.48 and state SUSCEPTIBLE.* Agent at vertex 16: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.50, protection 0.60 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 0.25, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 1, 10, 13, 15, 17]
 * I: [2]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 10, 15, 17]
 * I: [2]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 18, 19]
_Infecting:_ 10 

 * S: [0, 1, 15, 17]
 * I: [2, 10]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.08, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.52, 0.0, 0.4, 0.0, 0.0]

 * S: [0, 1]
 * I: [2, 10]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 1]
 * I: [2, 10]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.36, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0]
 * I: [2, 10]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0]
 * I: [2, 10]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [2, 10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 7 turns.


#### Greatest Degree Defence

 * S: [0, 1, 10, 13, 15, 17]
 * I: [2]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 10, 15, 17]
 * I: [2]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 18, 19]
_Infecting:_ 10 

 * S: [0, 1, 15, 17]
 * I: [2, 10]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0]

 * S: [0, 1, 15]
 * I: [2, 10]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 1, 15]
 * I: [2, 10]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]
_Strategy:_ [0.36, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.52, 0.0, 0.0, 0.0, 0.0]

 * S: [0]
 * I: [2, 10]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0]
 * I: [2, 10]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [2, 10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 7 turns.


#### Highest Protection Defence

 * S: [0, 1, 10, 13, 15, 17]
 * I: [2]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.11, 0.0, 0.4, 0.0, 0.0]

 * S: [0, 1, 10, 15]
 * I: [2]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]
_Infecting:_ 10 

 * S: [0, 1, 15]
 * I: [2, 10]
 * R: []
 * P: [3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]
_Strategy:_ [0.54, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0]

 * S: [1]
 * I: [2, 10]
 * R: []
 * P: [0, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [1]
 * I: [2, 10]
 * R: []
 * P: [0, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.68, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [2, 10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 5 turns.


## Outbreak: 3
* Agent at vertex 0: peril 0.33, protection 0.54 and state SUSCEPTIBLE.* Agent at vertex 1: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 1.00, protection 0.96 and state INFECTED.* Agent at vertex 4: peril 1.00, protection 0.43 and state SUSCEPTIBLE.* Agent at vertex 5: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.33, protection 0.40 and state SUSCEPTIBLE.* Agent at vertex 8: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.07, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 0.50, protection 0.59 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.14, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 4, 7, 18]
 * I: [3]
 * R: []
 * P: [1, 2, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.02, 0.0, 0.0, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0]

 * S: [0, 7]
 * I: [3]
 * R: []
 * P: [1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 7]
 * I: [3]
 * R: []
 * P: [1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [7]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [0, 4, 7, 18]
 * I: [3]
 * R: []
 * P: [1, 2, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.02, 0.0, 0.0, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0]

 * S: [0, 7]
 * I: [3]
 * R: []
 * P: [1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 7]
 * I: [3]
 * R: []
 * P: [1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [7]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [0, 4, 7, 18]
 * I: [3]
 * R: []
 * P: [1, 2, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.46, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0]

 * S: [4, 7]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Infecting:_ 4 

 * S: [7]
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


## Outbreak: 4
* Agent at vertex 0: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 1.00, protection 0.65 and state SUSCEPTIBLE.* Agent at vertex 4: peril 1.00, protection 0.52 and state INFECTED.* Agent at vertex 5: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.17, protection 0.10 and state SUSCEPTIBLE.* Agent at vertex 10: peril 0.09, protection 0.57 and state SUSCEPTIBLE.* Agent at vertex 11: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 1.00, protection 0.29 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.17, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [3, 9, 10, 18]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.71, 0.0]

 * S: [3, 9, 10]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Infecting:_ 3 

 * S: [9, 10]
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.9, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10]
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [10]
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [3, 9, 10, 18]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.71, 0.0]

 * S: [3, 9, 10]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Infecting:_ 3 

 * S: [9, 10]
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [9]
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [9]
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [3, 4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [3, 9, 10, 18]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.23, 0.0]

 * S: [9, 18]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Infecting:_ 18 

 * S: [9]
 * I: [4, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.9, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [4, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


## Outbreak: 5
* Agent at vertex 0: peril 0.20, protection 0.34 and state SUSCEPTIBLE.* Agent at vertex 1: peril 0.50, protection 0.42 and state SUSCEPTIBLE.* Agent at vertex 2: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 1.00, protection 0.57 and state INFECTED.* Agent at vertex 6: peril 0.33, protection 0.39 and state SUSCEPTIBLE.* Agent at vertex 7: peril 0.20, protection 0.41 and state SUSCEPTIBLE.* Agent at vertex 8: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 1.00, protection 0.92 and state SUSCEPTIBLE.* Agent at vertex 10: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 1.00, protection 0.52 and state SUSCEPTIBLE.* Agent at vertex 12: peril 0.50, protection 0.12 and state SUSCEPTIBLE.* Agent at vertex 13: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 1.00, protection 0.22 and state SUSCEPTIBLE.* Agent at vertex 17: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 6, 7, 9, 11, 12, 16, 19]
 * I: [5]
 * R: []
 * P: [2, 3, 4, 8, 10, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.78, 0.0, 0.0, 0.22]

 * S: [0, 1, 6, 7, 9, 11, 12, 19]
 * I: [5]
 * R: []
 * P: [2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Infecting:_ 9 11 19 

 * S: [0, 1, 6, 7, 12]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 7, 12]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [0, 6, 7, 12]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0, 0.0, 0.0, 0.0, 0.0, 0.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [0, 6, 7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.66, 0.0, 0.0, 0.0, 0.0, 0.0, 0.07, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [5, 9, 11, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 10, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 16 protected and 4 infected vertices in 9 turns.


#### Greatest Degree Defence

 * S: [0, 1, 6, 7, 9, 11, 12, 16, 19]
 * I: [5]
 * R: []
 * P: [2, 3, 4, 8, 10, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.78, 0.0, 0.0, 0.22]

 * S: [0, 1, 6, 7, 9, 11, 12, 19]
 * I: [5]
 * R: []
 * P: [2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Infecting:_ 9 11 19 

 * S: [0, 1, 6, 7, 12]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 7, 12]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [0, 6, 7, 12]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0, 0.0, 0.0, 0.0, 0.0, 0.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [0, 6, 7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [1, 2, 3, 4, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.66, 0.0, 0.0, 0.0, 0.0, 0.0, 0.07, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [7]
 * I: [5, 9, 11, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 10, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [5, 9, 11, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 10, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 16 protected and 4 infected vertices in 9 turns.


#### Highest Protection Defence

 * S: [0, 1, 6, 7, 9, 11, 12, 16, 19]
 * I: [5]
 * R: []
 * P: [2, 3, 4, 8, 10, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 6, 7, 12, 16, 19]
 * I: [5]
 * R: []
 * P: [2, 3, 4, 8, 9, 10, 11, 13, 14, 15, 17, 18]
_Infecting:_ 16 19 

 * S: [0, 1, 6, 7, 12]
 * I: [5, 16, 19]
 * R: []
 * P: [2, 3, 4, 8, 9, 10, 11, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.14, 0.0, 0.0, 0.0, 0.0, 0.27, 0.59, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 12]
 * I: [5, 16, 19]
 * R: []
 * P: [1, 2, 3, 4, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18]
_Infecting:_ 12 

 * S: [0, 6]
 * I: [5, 12, 16, 19]
 * R: []
 * P: [1, 2, 3, 4, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18]
_Strategy:_ [0.66, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [5, 12, 16, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18]
__Nothing more to infect.__
Ending model with 16 protected and 4 infected vertices in 5 turns.


## Outbreak: 6
* Agent at vertex 0: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 1.00, protection 0.07 and state SUSCEPTIBLE.* Agent at vertex 2: peril 0.50, protection 0.84 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 1.00, protection 0.11 and state INFECTED.* Agent at vertex 7: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.17, protection 0.60 and state SUSCEPTIBLE.* Agent at vertex 9: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 1.00, protection 0.78 and state SUSCEPTIBLE.* Agent at vertex 14: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.25, protection 0.47 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 0.50, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [1, 2, 8, 13, 17]
 * I: [6]
 * R: []
 * P: [0, 3, 4, 5, 7, 9, 10, 11, 12, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 8, 17]
 * I: [6]
 * R: []
 * P: [0, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Infecting:_ 1 

 * S: [2, 8, 17]
 * I: [1, 6]
 * R: []
 * P: [0, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0, 0.0]

 * S: [8]
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [8]
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [1, 2, 8, 13, 17]
 * I: [6]
 * R: []
 * P: [0, 3, 4, 5, 7, 9, 10, 11, 12, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 8, 17]
 * I: [6]
 * R: []
 * P: [0, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Infecting:_ 1 

 * S: [2, 8, 17]
 * I: [1, 6]
 * R: []
 * P: [0, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0, 0.0]

 * S: [8]
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [8]
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [1, 2, 8, 13, 17]
 * I: [6]
 * R: []
 * P: [0, 3, 4, 5, 7, 9, 10, 11, 12, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.0, 0.0, 0.23, 0.0, 0.0]

 * S: [1, 17]
 * I: [6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Infecting:_ 1 

 * S: [17]
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 0.0, 0.0]

 * S: []
 * I: [1, 6]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


## Outbreak: 7
* Agent at vertex 0: peril 0.50, protection 0.25 and state SUSCEPTIBLE.* Agent at vertex 1: peril 0.14, protection 0.60 and state SUSCEPTIBLE.* Agent at vertex 2: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.50, protection 0.08 and state SUSCEPTIBLE.* Agent at vertex 5: peril 0.20, protection 0.23 and state SUSCEPTIBLE.* Agent at vertex 6: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 1.00, protection 0.84 and state INFECTED.* Agent at vertex 8: peril 0.50, protection 0.82 and state SUSCEPTIBLE.* Agent at vertex 9: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 1.00, protection 0.74 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.17, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 1, 4, 5, 8, 18]
 * I: [7]
 * R: []
 * P: [2, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0]

 * S: [0, 1, 4, 5, 8]
 * I: [7]
 * R: []
 * P: [2, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 1, 4, 5, 8]
 * I: [7]
 * R: []
 * P: [2, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.65, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 5]
 * I: [7]
 * R: []
 * P: [2, 3, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 1, 5]
 * I: [7]
 * R: []
 * P: [2, 3, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.1, 0.13, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1]
 * I: [7]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [1]
 * I: [7]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 7 turns.


#### Greatest Degree Defence

 * S: [0, 1, 4, 5, 8, 18]
 * I: [7]
 * R: []
 * P: [2, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0]

 * S: [0, 1, 4, 5, 8]
 * I: [7]
 * R: []
 * P: [2, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 1, 4, 5, 8]
 * I: [7]
 * R: []
 * P: [2, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.92, 0.02, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 8]
 * I: [7]
 * R: []
 * P: [2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 1, 8]
 * I: [7]
 * R: []
 * P: [2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.48, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 7 turns.


#### Highest Protection Defence

 * S: [0, 1, 4, 5, 8, 18]
 * I: [7]
 * R: []
 * P: [2, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
_Strategy:_ [0.16, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0]

 * S: [0, 4, 5]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [0, 4, 5]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.58, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 5]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [4, 5]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.65, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [4]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 7 turns.


## Outbreak: 8
* Agent at vertex 0: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.20, protection 0.05 and state SUSCEPTIBLE.* Agent at vertex 2: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.50, protection 0.88 and state SUSCEPTIBLE.* Agent at vertex 8: peril 1.00, protection 0.59 and state INFECTED.* Agent at vertex 9: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.25, protection 0.20 and state SUSCEPTIBLE.* Agent at vertex 12: peril 1.00, protection 0.12 and state SUSCEPTIBLE.* Agent at vertex 13: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.50, protection 0.55 and state SUSCEPTIBLE.* Agent at vertex 17: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 1.00, protection 0.66 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.25, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [1, 7, 11, 12, 16, 18]
 * I: [8]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.66, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0]

 * S: [1, 7, 11, 12, 16]
 * I: [8]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 17, 18, 19]
_Infecting:_ 12 

 * S: [1, 7, 11, 16]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.43, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0, 0.0, 0.0]

 * S: [1, 11]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [1, 11]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.63, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [1]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 7 turns.


#### Greatest Degree Defence

 * S: [1, 7, 11, 12, 16, 18]
 * I: [8]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.66, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0]

 * S: [1, 7, 11, 12, 16]
 * I: [8]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 17, 18, 19]
_Infecting:_ 12 

 * S: [1, 7, 11, 16]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.55, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0, 0.0, 0.0]

 * S: [1, 7, 11]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [1, 7, 11]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [11]
 * I: [8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [11]
 * I: [8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 7 turns.


#### Highest Protection Defence

 * S: [1, 7, 11, 12, 16, 18]
 * I: [8]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9, 10, 13, 14, 15, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0, 0.34, 0.0]

 * S: [1, 11, 12]
 * I: [8]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Infecting:_ 12 

 * S: [1, 11]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [1]
 * I: [8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.67, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 5 turns.


## Outbreak: 9
* Agent at vertex 0: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.14, protection 0.84 and state SUSCEPTIBLE.* Agent at vertex 4: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 1.00, protection 0.69 and state SUSCEPTIBLE.* Agent at vertex 6: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 1.00, protection 0.71 and state INFECTED.* Agent at vertex 10: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.13, protection 0.80 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 0.50, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [3, 5, 17]
 * I: [9]
 * R: []
 * P: [0, 1, 2, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.16, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0]

 * S: []
 * I: [9]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 1 turn.


#### Greatest Degree Defence

 * S: [3, 5, 17]
 * I: [9]
 * R: []
 * P: [0, 1, 2, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.16, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0]

 * S: []
 * I: [9]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 1 turn.


#### Highest Protection Defence

 * S: [3, 5, 17]
 * I: [9]
 * R: []
 * P: [0, 1, 2, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.16, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0]

 * S: []
 * I: [9]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 1 turn.


## Outbreak: 10
* Agent at vertex 0: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 1.00, protection 0.22 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 1.00, protection 0.55 and state INFECTED.* Agent at vertex 11: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.50, protection 0.23 and state SUSCEPTIBLE.* Agent at vertex 14: peril 0.50, protection 0.65 and state SUSCEPTIBLE.* Agent at vertex 15: peril 0.33, protection 0.40 and state SUSCEPTIBLE.* Agent at vertex 16: peril 0.14, protection 0.89 and state SUSCEPTIBLE.* Agent at vertex 17: peril 1.00, protection 0.37 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 0.20, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [2, 13, 14, 15, 16, 17]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 18, 19]
_Strategy:_ [0.0, 0.0, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.0]

 * S: [13, 14, 15, 16, 17]
 * I: [10]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 18, 19]
_Infecting:_ 17 

 * S: [13, 14, 15, 16]
 * I: [10, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [14, 15, 16]
 * I: [10, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 18, 19]
_Infecting:_ 14 

 * S: [15, 16]
 * I: [10, 14, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6, 0.11, 0.0, 0.0, 0.0]

 * S: []
 * I: [10, 14, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [2, 13, 14, 15, 16, 17]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 18, 19]
_Strategy:_ [0.0, 0.0, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 14, 15, 16, 17]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 18, 19]
_Infecting:_ 2 17 

 * S: [14, 15, 16]
 * I: [2, 10, 17]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.54, 0.11, 0.0, 0.0, 0.0]

 * S: [15]
 * I: [2, 10, 17]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 18, 19]
_Nothing infected._
 * S: [15]
 * I: [2, 10, 17]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [2, 10, 17]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [2, 13, 14, 15, 16, 17]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.54, 0.11, 0.0, 0.0, 0.0]

 * S: [2, 13, 15, 17]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 18, 19]
_Infecting:_ 2 17 

 * S: [13, 15]
 * I: [2, 10, 17]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [2, 10, 17]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 3 turns.


## Outbreak: 11
* Agent at vertex 0: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.17, protection 0.07 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 1.00, protection 0.52 and state SUSCEPTIBLE.* Agent at vertex 6: peril 0.25, protection 0.20 and state SUSCEPTIBLE.* Agent at vertex 7: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 1.00, protection 0.83 and state INFECTED.* Agent at vertex 12: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.50, protection 0.53 and state SUSCEPTIBLE.* Agent at vertex 17: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 0.50, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [2, 5, 6, 16]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 7, 8, 9, 10, 12, 13, 14, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.0, 0.0]

 * S: [2, 6]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [2, 6]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.76, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [2]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.69, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [11]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [2, 5, 6, 16]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 7, 8, 9, 10, 12, 13, 14, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.0, 0.0]

 * S: [2, 6]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [2, 6]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.76, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [2]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.69, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [11]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [2, 5, 6, 16]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 7, 8, 9, 10, 12, 13, 14, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.0, 0.0]

 * S: [2, 6]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [2, 6]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.76, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Nothing infected._
 * S: [2]
 * I: [11]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.69, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [11]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


## Outbreak: 12
* Agent at vertex 0: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 1.00, protection 0.37 and state SUSCEPTIBLE.* Agent at vertex 9: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 1.00, protection 0.13 and state INFECTED.* Agent at vertex 13: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 1.00, protection 0.67 and state SUSCEPTIBLE.* Agent at vertex 17: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 0.50, protection 0.69 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.33, protection 0.21 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [8, 16, 18, 19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.63, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.04, 0.0]

 * S: [18, 19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17]
_Nothing infected._
 * S: [18, 19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.73]

 * S: [19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06]

 * S: []
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [8, 16, 18, 19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.63, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.31, 0.0]

 * S: [16, 19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18]
_Infecting:_ 16 

 * S: [19]
 * I: [12, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.79]

 * S: []
 * I: [12, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


#### Highest Protection Defence

 * S: [8, 16, 18, 19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.31, 0.0]

 * S: [8, 19]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]
_Infecting:_ 8 

 * S: [19]
 * I: [8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.79]

 * S: []
 * I: [8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


## Outbreak: 13
* Agent at vertex 0: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 1.00, protection 0.50 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 1.00, protection 0.18 and state SUSCEPTIBLE.* Agent at vertex 7: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 1.00, protection 0.56 and state INFECTED.* Agent at vertex 14: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 1.00, protection 0.08 and state SUSCEPTIBLE.* Agent at vertex 16: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.33, protection 0.96 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 0.33, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [2, 6, 15, 17]
 * I: [13]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 15, 17]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]
_Infecting:_ 6 15 

 * S: [17]
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0]

 * S: []
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 3 turns.


#### Greatest Degree Defence

 * S: [2, 6, 15, 17]
 * I: [13]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 15, 17]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]
_Infecting:_ 6 15 

 * S: [17]
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0]

 * S: []
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 3 turns.


#### Highest Protection Defence

 * S: [2, 6, 15, 17]
 * I: [13]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0]

 * S: [6, 15]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18, 19]
_Infecting:_ 6 15 

 * S: []
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18, 19]
__Nothing more to protect.__
Ending model with 17 protected and 3 infected vertices in 2 turns.


## Outbreak: 14
* Agent at vertex 0: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.33, protection 0.97 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.07, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 1.00, protection 0.50 and state INFECTED.* Agent at vertex 15: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 1.00, protection 0.13 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.08, protection 0.06 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.14, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [2, 17, 18]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 19]
_Strategy:_ [0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.1, 0.0]

 * S: [18]
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 19]
_Nothing infected._
 * S: [18]
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.84, 0.0]

 * S: []
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 3 turns.


#### Greatest Degree Defence

 * S: [2, 17, 18]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.94, 0.0]

 * S: [2, 17]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]
_Infecting:_ 17 

 * S: [2]
 * I: [14, 17]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


#### Highest Protection Defence

 * S: [2, 17, 18]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 19]
_Strategy:_ [0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.1, 0.0]

 * S: [18]
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 19]
_Nothing infected._
 * S: [18]
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.84, 0.0]

 * S: []
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 3 turns.


## Outbreak: 15
* Agent at vertex 0: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.50, protection 0.09 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.50, protection 0.82 and state SUSCEPTIBLE.* Agent at vertex 7: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.33, protection 0.24 and state SUSCEPTIBLE.* Agent at vertex 11: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 1.00, protection 0.46 and state SUSCEPTIBLE.* Agent at vertex 14: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 1.00, protection 0.01 and state INFECTED.* Agent at vertex 16: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.25, protection 0.84 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.11, protection 0.47 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.25, protection 0.41 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [2, 6, 10, 13, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 14, 16]
_Strategy:_ [0.0, 0.0, 0.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 6, 10, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 16]
_Nothing infected._
 * S: [2, 6, 10, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 16]
_Strategy:_ [0.0, 0.0, 0.45, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16]
_Nothing infected._
 * S: [10, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.16, 0.0, 0.44]

 * S: [18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17]
_Nothing infected._
 * S: [18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.53, 0.14]

 * S: []
 * I: [15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 7 turns.


#### Greatest Degree Defence

 * S: [2, 6, 10, 13, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 14, 16]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0]

 * S: [2, 6, 10, 13, 17, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 14, 16, 18]
_Infecting:_ 13 

 * S: [2, 6, 10, 17, 19]
 * I: [13, 15]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 14, 16, 18]
_Strategy:_ [0.0, 0.0, 0.91, 0.0, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 10, 17, 19]
 * I: [13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 14, 16, 18]
_Infecting:_ 6 

 * S: [10, 17, 19]
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 14, 16, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.76, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.16, 0.0, 0.08]

 * S: [19]
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18]
_Nothing infected._
 * S: [19]
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.51]

 * S: []
 * I: [6, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 7 turns.


#### Highest Protection Defence

 * S: [2, 6, 10, 13, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 14, 16]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.16, 0.53, 0.0]

 * S: [2, 10, 13, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 17, 18]
_Infecting:_ 13 

 * S: [2, 10, 19]
 * I: [13, 15]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.59]

 * S: [2, 10]
 * I: [13, 15]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 17, 18, 19]
_Infecting:_ 2 

 * S: [10]
 * I: [2, 13, 15]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [2, 13, 15]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 5 turns.


## Outbreak: 16
* Agent at vertex 0: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.17, protection 0.20 and state SUSCEPTIBLE.* Agent at vertex 3: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 1.00, protection 0.74 and state SUSCEPTIBLE.* Agent at vertex 6: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.25, protection 0.73 and state SUSCEPTIBLE.* Agent at vertex 8: peril 0.50, protection 0.42 and state SUSCEPTIBLE.* Agent at vertex 9: peril 0.50, protection 0.40 and state SUSCEPTIBLE.* Agent at vertex 10: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 1.00, protection 0.49 and state SUSCEPTIBLE.* Agent at vertex 13: peril 0.20, protection 0.19 and state SUSCEPTIBLE.* Agent at vertex 14: peril 0.11, protection 0.80 and state SUSCEPTIBLE.* Agent at vertex 15: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 1.00, protection 0.01 and state INFECTED.* Agent at vertex 17: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 0.33, protection 0.48 and state SUSCEPTIBLE.* Agent at vertex 19: peril 0.50, protection 0.36 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [2, 5, 7, 8, 9, 12, 13, 14, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 6, 10, 11, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.23, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 7, 8, 9, 13, 14, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 12, 15, 17]
_Nothing infected._
 * S: [2, 7, 8, 9, 13, 14, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 12, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64]

 * S: [2, 7, 9, 13, 14, 18]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 8, 10, 11, 12, 15, 17, 19]
_Nothing infected._
 * S: [2, 7, 9, 13, 14, 18]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 8, 10, 11, 12, 15, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0]

 * S: [2, 7, 13, 14, 18]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 8, 9, 10, 11, 12, 15, 17, 19]
_Nothing infected._
 * S: [2, 7, 13, 14, 18]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 8, 9, 10, 11, 12, 15, 17, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.63, 0.0, 0.0, 0.0, 0.0, 0.1, 0.0]

 * S: [2, 13, 14]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 17, 18, 19]
_Nothing infected._
 * S: [2, 13, 14]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.8, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [14]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 17, 18, 19]
_Nothing infected._
 * S: [14]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 11 turns.


#### Greatest Degree Defence

 * S: [2, 5, 7, 8, 9, 12, 13, 14, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 6, 10, 11, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.0, 0.0, 0.0, 0.52, 0.0]

 * S: [2, 7, 8, 9, 12, 13, 14, 19]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 15, 17, 18]
_Infecting:_ 12 

 * S: [2, 7, 8, 9, 13, 14, 19]
 * I: [12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.59, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 7, 8, 9, 14, 19]
 * I: [12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 13, 15, 17, 18]
_Infecting:_ 8 

 * S: [2, 7, 9, 14, 19]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 13, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64]

 * S: [2, 7, 9, 14]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 13, 15, 17, 18, 19]
_Nothing infected._
 * S: [2, 7, 9, 14]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 10, 11, 13, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.56, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [7, 9, 14]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 10, 11, 13, 15, 17, 18, 19]
_Nothing infected._
 * S: [7, 9, 14]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 10, 11, 13, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 9 turns.


#### Highest Protection Defence

 * S: [2, 5, 7, 8, 9, 12, 13, 14, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 6, 10, 11, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 8, 9, 12, 13, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 10, 11, 14, 15, 17]
_Infecting:_ 12 

 * S: [2, 8, 9, 13, 18, 19]
 * I: [12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 10, 11, 14, 15, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.52, 0.0]

 * S: [2, 8, 9, 13, 19]
 * I: [12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 10, 11, 14, 15, 17, 18]
_Infecting:_ 8 

 * S: [2, 9, 13, 19]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 10, 11, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4]

 * S: [2, 13, 19]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 14, 15, 17, 18]
_Nothing infected._
 * S: [2, 13, 19]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.76, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.24]

 * S: [2, 13]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 14, 15, 17, 18, 19]
_Nothing infected._
 * S: [2, 13]
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 14, 15, 17, 18, 19]
_Strategy:_ [0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.81, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [8, 12, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17, 18, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 9 turns.


## Outbreak: 17
* Agent at vertex 0: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 8: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 1.00, protection 0.03 and state SUSCEPTIBLE.* Agent at vertex 11: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 1.00, protection 0.89 and state SUSCEPTIBLE.* Agent at vertex 15: peril 0.25, protection 0.82 and state SUSCEPTIBLE.* Agent at vertex 16: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 1.00, protection 0.39 and state INFECTED.* Agent at vertex 18: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 0.17, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [10, 14, 15]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.97, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [14, 15]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 18, 19]
_Infecting:_ 14 

 * S: [15]
 * I: [14, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


#### Greatest Degree Defence

 * S: [10, 14, 15]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.97, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [14, 15]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 18, 19]
_Infecting:_ 14 

 * S: [15]
 * I: [14, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]
__Nothing more to infect.__
Ending model with 18 protected and 2 infected vertices in 3 turns.


#### Highest Protection Defence

 * S: [10, 14, 15]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 16, 18, 19]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.11, 0.18, 0.0, 0.0, 0.0, 0.0]

 * S: [10]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19]
_Infecting:_ 10 

 * S: []
 * I: [10, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19]
__Nothing more to protect.__
Ending model with 18 protected and 2 infected vertices in 2 turns.


## Outbreak: 18
* Agent at vertex 0: peril 1.00, protection 0.56 and state SUSCEPTIBLE.* Agent at vertex 1: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 2: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 1.00, protection 0.51 and state SUSCEPTIBLE.* Agent at vertex 5: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 6: peril 0.14, protection 0.79 and state SUSCEPTIBLE.* Agent at vertex 7: peril 1.00, protection 0.77 and state SUSCEPTIBLE.* Agent at vertex 8: peril 1.00, protection 0.44 and state SUSCEPTIBLE.* Agent at vertex 9: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 10: peril 0.10, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 12: peril 0.50, protection 0.36 and state SUSCEPTIBLE.* Agent at vertex 13: peril 0.13, protection 1.00 and state PROTECTED.* Agent at vertex 14: peril 0.08, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.11, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 17: peril 0.09, protection 1.00 and state PROTECTED.* Agent at vertex 18: peril 1.00, protection 0.32 and state INFECTED.* Agent at vertex 19: peril 0.20, protection 0.28 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 4, 6, 7, 8, 12, 19]
 * I: [18]
 * R: []
 * P: [1, 2, 3, 5, 9, 10, 11, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.49, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 7, 8, 12, 19]
 * I: [18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 13, 14, 15, 16, 17]
_Infecting:_ 0 7 8 

 * S: [6, 12, 19]
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36]

 * S: [6, 19]
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17]
_Nothing infected._
 * S: [6, 19]
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37]

 * S: []
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
__Nothing more to infect.__
Ending model with 16 protected and 4 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [0, 4, 6, 7, 8, 12, 19]
 * I: [18]
 * R: []
 * P: [1, 2, 3, 5, 9, 10, 11, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.49, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 7, 8, 12, 19]
 * I: [18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 13, 14, 15, 16, 17]
_Infecting:_ 0 7 8 

 * S: [6, 12, 19]
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36]

 * S: [6, 19]
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17]
_Nothing infected._
 * S: [6, 19]
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37]

 * S: []
 * I: [0, 7, 8, 18]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
__Nothing more to infect.__
Ending model with 16 protected and 4 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [0, 4, 6, 7, 8, 12, 19]
 * I: [18]
 * R: []
 * P: [1, 2, 3, 5, 9, 10, 11, 13, 14, 15, 16, 17]
_Strategy:_ [0.44, 0.0, 0.0, 0.0, 0.12, 0.0, 0.21, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 8, 12, 19]
 * I: [18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17]
_Infecting:_ 4 8 

 * S: [12, 19]
 * I: [4, 8, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36]

 * S: [19]
 * I: [4, 8, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17]
_Nothing infected._
 * S: [19]
 * I: [4, 8, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37]

 * S: []
 * I: [4, 8, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
__Nothing more to infect.__
Ending model with 17 protected and 3 infected vertices in 5 turns.


## Outbreak: 19
* Agent at vertex 0: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 1: peril 1.00, protection 0.76 and state SUSCEPTIBLE.* Agent at vertex 2: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 3: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 4: peril 0.17, protection 1.00 and state PROTECTED.* Agent at vertex 5: peril 1.00, protection 0.89 and state SUSCEPTIBLE.* Agent at vertex 6: peril 0.50, protection 1.00 and state PROTECTED.* Agent at vertex 7: peril 0.17, protection 0.97 and state SUSCEPTIBLE.* Agent at vertex 8: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 9: peril 0.50, protection 0.58 and state SUSCEPTIBLE.* Agent at vertex 10: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 11: peril 0.50, protection 0.48 and state SUSCEPTIBLE.* Agent at vertex 12: peril 0.33, protection 1.00 and state PROTECTED.* Agent at vertex 13: peril 0.33, protection 0.92 and state SUSCEPTIBLE.* Agent at vertex 14: peril 0.14, protection 1.00 and state PROTECTED.* Agent at vertex 15: peril 0.25, protection 1.00 and state PROTECTED.* Agent at vertex 16: peril 0.50, protection 0.45 and state SUSCEPTIBLE.* Agent at vertex 17: peril 0.17, protection 0.51 and state SUSCEPTIBLE.* Agent at vertex 18: peril 0.20, protection 1.00 and state PROTECTED.* Agent at vertex 19: peril 1.00, protection 0.36 and state INFECTED.
#### Proximity to Infection Defence

 * S: [1, 5, 7, 9, 11, 13, 16, 17]
 * I: [19]
 * R: []
 * P: [0, 2, 3, 4, 6, 8, 10, 12, 14, 15, 18]
_Strategy:_ [0.0, 0.24, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.55, 0.0, 0.0, 0.0]

 * S: [7, 9, 11, 13, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 10, 12, 14, 15, 16, 18]
_Nothing infected._
 * S: [7, 9, 11, 13, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 10, 12, 14, 15, 16, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.52, 0.0, 0.08, 0.0, 0.0, 0.0, 0.07, 0.0, 0.0]

 * S: [7, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18]
_Nothing infected._
 * S: [7, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0]

 * S: []
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


#### Greatest Degree Defence

 * S: [1, 5, 7, 9, 11, 13, 16, 17]
 * I: [19]
 * R: []
 * P: [0, 2, 3, 4, 6, 8, 10, 12, 14, 15, 18]
_Strategy:_ [0.0, 0.24, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.55, 0.01, 0.0, 0.0]

 * S: [7, 9, 11, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 10, 12, 13, 14, 15, 16, 18]
_Nothing infected._
 * S: [7, 9, 11, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 10, 12, 13, 14, 15, 16, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.0, 0.0]

 * S: [7, 11]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18]
_Nothing infected._
 * S: [7, 11]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


#### Highest Protection Defence

 * S: [1, 5, 7, 9, 11, 13, 16, 17]
 * I: [19]
 * R: []
 * P: [0, 2, 3, 4, 6, 8, 10, 12, 14, 15, 18]
_Strategy:_ [0.0, 0.24, 0.0, 0.0, 0.0, 0.11, 0.0, 0.03, 0.0, 0.42, 0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0]

 * S: [11, 16, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 18]
_Nothing infected._
 * S: [11, 16, 17]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.52, 0.0, 0.0, 0.0, 0.0, 0.1, 0.38, 0.0, 0.0]

 * S: [16]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
_Nothing infected._
 * S: [16]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0, 0.0, 0.0]

 * S: []
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
__Nothing more to infect.__
Ending model with 19 protected and 1 infected vertices in 5 turns.


