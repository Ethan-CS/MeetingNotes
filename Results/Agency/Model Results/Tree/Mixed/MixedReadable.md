# Readable results of SIRP defence strategies on a random graph
## Generating Tree Graph:

Graph generator has generated the specified graph with the following parameters:

 * Type of graph: Tree
 * Number of vertices: 20
 * Number of edges: 19
 * Probability: 19 / (20 * (20 - 1) / 2) = 0.1
 * Random generator seed: 1615826088771

The graph is represented using the following adjacency matrix:

0: 0 1 0 0 1 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 

1: 1 0 0 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 

2: 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 

3: 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 

4: 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

5: 0 1 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 

6: 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 0 0 0 0 

7: 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

8: 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 

9: 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 

10: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 

11: 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 1 

12: 0 0 0 0 0 1 1 0 0 0 0 1 0 0 0 0 0 0 0 0 

13: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 

14: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 

15: 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 0 0 0 0 0 

16: 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

17: 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 0 

18: 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 0 0 1 0 0 

19: 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 


## Model values
The values used in the model are:
 * Total defence quota each turn: 1.0
 * Probability with which the infection propagates: 1.0
## Outbreak: 0

* Agent at vertex 0: peril 1.00, protection 0.87 and state INFECTED.
* Agent at vertex 1: peril 1.00, protection 0.74 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 1.00, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 1.00, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.33, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.20, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [1, 4, 9, 12]
 * I: [0]
 * R: []
 * P: [2, 3, 5, 6, 7, 8, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.26, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 3 turns.



#### Greatest Degree Defence

 * S: [1, 4, 9, 12]
 * I: [0]
 * R: []
 * P: [2, 3, 5, 6, 7, 8, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Infecting:_ 4 


 * S: [12]
 * I: [0, 4]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.39, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 4]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 3 turns.



#### Highest Protection Defence

 * S: [1, 4, 9, 12]
 * I: [0]
 * R: []
 * P: [2, 3, 5, 6, 7, 8, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.26, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [12]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 3 turns.



## Outbreak: 1

* Agent at vertex 0: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.75 and state INFECTED.
* Agent at vertex 2: peril 0.33, protection 0.40 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.50, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.33, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.24 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.50, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.25, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 2, 4, 5, 6, 7, 12]
 * I: [1]
 * R: []
 * P: [3, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.22, 0.0, 0.0, 0.0, 0.0, 0.72, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 6, 7, 12]
 * I: [1]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Infecting:_ 7 


 * S: [2, 4, 6, 12]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.95, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 6]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2, 4, 6]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.2, 0.0, 0.38, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 7]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [0, 2, 4, 5, 6, 7, 12]
 * I: [1]
 * R: []
 * P: [3, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.22, 0.0, 0.0, 0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 6, 7, 12]
 * I: [1]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Infecting:_ 7 


 * S: [2, 4, 6, 12]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.89, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 6]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2, 4, 6]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.26, 0.0, 0.43, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2]
 * I: [1, 7]
 * R: []
 * P: [0, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 7]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Highest Protection Defence

 * S: [0, 2, 4, 5, 6, 7, 12]
 * I: [1]
 * R: []
 * P: [3, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.22, 0.0, 0.0, 0.0, 0.36, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 5, 7, 12]
 * I: [1]
 * R: []
 * P: [0, 3, 6, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Infecting:_ 5 7 


 * S: [2, 4, 12]
 * I: [1, 5, 7]
 * R: []
 * P: [0, 3, 6, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.6, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [12]
 * I: [1, 5, 7]
 * R: []
 * P: [0, 2, 3, 4, 6, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

_Infecting:_ 12 


 * S: []
 * I: [1, 5, 7, 12]
 * R: []
 * P: [0, 2, 3, 4, 6, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to protect.__

Ending model with 16 protected and 4 infected vertices in 4 turns.



## Outbreak: 2

* Agent at vertex 0: peril 0.50, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 1.00, protection 0.26 and state INFECTED.
* Agent at vertex 3: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.14, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 0.25, protection 0.02 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.33, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.20, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.33, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.52 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.14, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 8, 9, 13, 14, 16, 17, 18]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 10, 11, 12, 15, 19]

_Strategy:_ [0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.48, 0.0]

 * S: [8, 13, 14, 16, 17]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 18, 19]

_Nothing infected._
 * S: [8, 13, 14, 16, 17]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.73, 0.0, 0.0]

 * S: [8, 13, 14, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 17, 18, 19]

_Nothing infected._
 * S: [8, 13, 14, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.46, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [8, 13, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [8, 13, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.43, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0]

 * S: []
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [0, 8, 9, 13, 14, 16, 17, 18]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 10, 11, 12, 15, 19]

_Strategy:_ [0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.48, 0.0]

 * S: [8, 13, 14, 16, 17]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 18, 19]

_Nothing infected._
 * S: [8, 13, 14, 16, 17]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.73, 0.0, 0.0]

 * S: [8, 13, 14, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 17, 18, 19]

_Nothing infected._
 * S: [8, 13, 14, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.7, 0.3, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [8, 14, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 15, 17, 18, 19]

_Nothing infected._
 * S: [8, 14, 16]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.43, 0.0, 0.08, 0.0, 0.0, 0.0]

 * S: []
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



#### Highest Protection Defence

 * S: [0, 8, 9, 13, 14, 16, 17, 18]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 10, 11, 12, 15, 19]

_Strategy:_ [0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.35, 0.0]

 * S: [13, 14, 17, 18]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, 19]

_Nothing infected._
 * S: [13, 14, 17, 18]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.73, 0.0, 0.0, 0.14, 0.13, 0.0]

 * S: [13, 17]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19]

_Nothing infected._
 * S: [13, 17]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.8, 0.0, 0.0]

 * S: [13]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [13]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



## Outbreak: 3

* Agent at vertex 0: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 1.00, protection 0.40 and state INFECTED.
* Agent at vertex 4: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.09, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.00 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.10, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.14, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [10, 11, 12, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10, 12, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 19]

_Nothing infected._
 * S: [10, 12, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.61, 0.0, 0.0, 0.0, 0.0, 0.0, 0.39, 0.0]

 * S: [10, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 19]

_Nothing infected._
 * S: [10, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.65, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0]

 * S: []
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [10, 11, 12, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10, 12, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 19]

_Nothing infected._
 * S: [10, 12, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.61, 0.0, 0.0, 0.0, 0.0, 0.0, 0.39, 0.0]

 * S: [10, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 19]

_Nothing infected._
 * S: [10, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.65, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0]

 * S: []
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [10, 11, 12, 18]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.43, 0.0]

 * S: [10, 11, 12]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18, 19]

_Infecting:_ 11 


 * S: [10, 12]
 * I: [3, 11]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.65, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [3, 11]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 3 turns.



## Outbreak: 4

* Agent at vertex 0: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.33, protection 0.40 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 1.00, protection 0.68 and state INFECTED.
* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.20, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.50, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.25, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.25, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.25, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.17, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 2, 6, 9, 12, 14, 17]
 * I: [4]
 * R: []
 * P: [1, 3, 5, 7, 8, 10, 11, 13, 15, 16, 18, 19]

_Strategy:_ [0.45, 0.0, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 6, 12, 14, 17]
 * I: [4]
 * R: []
 * P: [0, 1, 3, 5, 7, 8, 9, 10, 11, 13, 15, 16, 18, 19]

_Nothing infected._
 * S: [2, 6, 12, 14, 17]
 * I: [4]
 * R: []
 * P: [0, 1, 3, 5, 7, 8, 9, 10, 11, 13, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0]

 * S: [6, 14, 17]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]

_Nothing infected._
 * S: [6, 14, 17]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0, 0.0, 0.22, 0.0, 0.0]

 * S: []
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 2, 6, 9, 12, 14, 17]
 * I: [4]
 * R: []
 * P: [1, 3, 5, 7, 8, 10, 11, 13, 15, 16, 18, 19]

_Strategy:_ [0.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0]

 * S: [2, 6, 14, 17]
 * I: [4]
 * R: []
 * P: [0, 1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]

_Nothing infected._
 * S: [2, 6, 14, 17]
 * I: [4]
 * R: []
 * P: [0, 1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.62, 0.0, 0.0]

 * S: [2, 14]
 * I: [4]
 * R: []
 * P: [0, 1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2, 14]
 * I: [4]
 * R: []
 * P: [0, 1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.54, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 2, 6, 9, 12, 14, 17]
 * I: [4]
 * R: []
 * P: [1, 3, 5, 7, 8, 10, 11, 13, 15, 16, 18, 19]

_Strategy:_ [0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.32, 0.0, 0.0, 0.12, 0.0, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 17]
 * I: [4]
 * R: []
 * P: [1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]

_Infecting:_ 0 


 * S: [2, 17]
 * I: [0, 4]
 * R: []
 * P: [1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0]

 * S: [17]
 * I: [0, 4]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]

_Nothing infected._
 * S: [17]
 * I: [0, 4]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0, 0.0]

 * S: []
 * I: [0, 4]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



## Outbreak: 5

* Agent at vertex 0: peril 0.50, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.33, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 1.00, protection 0.74 and state INFECTED.
* Agent at vertex 6: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.50, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.33, protection 0.61 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.50, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.17, protection 0.22 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.33, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 1, 3, 7, 9, 11, 12, 13, 16]
 * I: [5]
 * R: []
 * P: [2, 4, 6, 8, 10, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0]

 * S: [0, 3, 7, 9, 11, 13, 16]
 * I: [5]
 * R: []
 * P: [1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 18, 19]

_Infecting:_ 16 


 * S: [0, 3, 7, 9, 11, 13]
 * I: [5, 16]
 * R: []
 * P: [1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.61, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 7, 9, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 4, 6, 8, 10, 11, 12, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [3, 7, 9, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 4, 6, 8, 10, 11, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.04, 0.0, 0.39, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [0, 1, 3, 7, 9, 11, 12, 13, 16]
 * I: [5]
 * R: []
 * P: [2, 4, 6, 8, 10, 14, 15, 17, 18, 19]

_Strategy:_ [0.13, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 7, 9, 11, 13, 16]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 18, 19]

_Infecting:_ 16 


 * S: [3, 7, 9, 11, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.39, 0.0, 0.16, 0.0, 0.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 7, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 4, 6, 8, 9, 10, 11, 12, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [3, 7, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 4, 6, 8, 9, 10, 11, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 3, 7, 9, 11, 12, 13, 16]
 * I: [5]
 * R: []
 * P: [2, 4, 6, 8, 10, 14, 15, 17, 18, 19]

_Strategy:_ [0.13, 0.29, 0.0, 0.16, 0.0, 0.0, 0.0, 0.29, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 9, 11, 13, 16]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 4, 6, 7, 8, 10, 12, 14, 15, 17, 18, 19]

_Infecting:_ 16 


 * S: [3, 9, 11, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 4, 6, 7, 8, 10, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.39, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [11, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [11, 13]
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [5, 16]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



## Outbreak: 6

* Agent at vertex 0: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.33, protection 0.22 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.20, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.53 and state INFECTED.
* Agent at vertex 7: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.20, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.10, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.50, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.33, protection 0.11 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [1, 4, 5, 8, 9, 11, 12, 19]
 * I: [6]
 * R: []
 * P: [0, 2, 3, 7, 10, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 4, 5, 8, 9, 11, 19]
 * I: [6]
 * R: []
 * P: [0, 2, 3, 7, 10, 12, 13, 14, 15, 16, 17, 18]

_Infecting:_ 8 


 * S: [1, 4, 5, 9, 11, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 2, 3, 7, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.55, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 4, 9, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 2, 3, 5, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [1, 4, 9, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 2, 3, 5, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77]

 * S: [4, 9, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [4, 9, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12]

 * S: []
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [1, 4, 5, 8, 9, 11, 12, 19]
 * I: [6]
 * R: []
 * P: [0, 2, 3, 7, 10, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.14, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 4, 8, 9, 11, 19]
 * I: [6]
 * R: []
 * P: [0, 2, 3, 5, 7, 10, 12, 13, 14, 15, 16, 17, 18]

_Infecting:_ 8 


 * S: [1, 4, 9, 11, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 2, 3, 5, 7, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 9, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [4, 9, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.89]

 * S: [4]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [4]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Highest Protection Defence

 * S: [1, 4, 5, 8, 9, 11, 12, 19]
 * I: [6]
 * R: []
 * P: [0, 2, 3, 7, 10, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.25, 0.28, 0.0, 0.0, 0.0, 0.3, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 4, 8, 12, 19]
 * I: [6]
 * R: []
 * P: [0, 2, 3, 5, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]

_Infecting:_ 8 12 


 * S: [1, 4, 19]
 * I: [6, 8, 12]
 * R: []
 * P: [0, 2, 3, 5, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.74, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 19]
 * I: [6, 8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [1, 19]
 * I: [6, 8, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.89]

 * S: []
 * I: [6, 8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 5 turns.



## Outbreak: 7

* Agent at vertex 0: peril 0.50, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.33, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 1.00, protection 0.97 and state INFECTED.
* Agent at vertex 8: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.25, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 0.17, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.25, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.20, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 1, 4, 11, 13, 18]
 * I: [7]
 * R: []
 * P: [2, 3, 5, 6, 8, 9, 10, 12, 14, 15, 16, 17, 19]

_Strategy:_ [0.44, 0.1, 0.0, 0.0, 0.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [11, 13, 18]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 14, 15, 16, 17, 19]

_Nothing infected._
 * S: [11, 13, 18]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0]

 * S: [13]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [13]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 4, 11, 13, 18]
 * I: [7]
 * R: []
 * P: [2, 3, 5, 6, 8, 9, 10, 12, 14, 15, 16, 17, 19]

_Strategy:_ [0.44, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.0]

 * S: [4, 13, 18]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 19]

_Nothing infected._
 * S: [4, 13, 18]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.67, 0.0, 0.0, 0.0, 0.0, 0.29, 0.0]

 * S: [4]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [4]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 4, 11, 13, 18]
 * I: [7]
 * R: []
 * P: [2, 3, 5, 6, 8, 9, 10, 12, 14, 15, 16, 17, 19]

_Strategy:_ [0.15, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0]

 * S: [0, 4, 13]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [0, 4, 13]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.29, 0.0, 0.0, 0.0, 0.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [13]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [13]
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



## Outbreak: 8

* Agent at vertex 0: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.33, protection 0.37 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 1.00, protection 0.57 and state INFECTED.
* Agent at vertex 9: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.09, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.33, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.24 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.10, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.25, protection 0.04 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [5, 6, 11, 12, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 9, 10, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.76, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [5, 11, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [5, 11, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.49, 0.0, 0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [11, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [11, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.85]

 * S: [19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.11]

 * S: []
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [5, 6, 11, 12, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 9, 10, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.76, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [5, 6, 11, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Infecting:_ 6 


 * S: [5, 11, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0, 0.0, 0.62, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [11, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [11, 19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.96]

 * S: [19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [19]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Highest Protection Defence

 * S: [5, 6, 11, 12, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 9, 10, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.63, 0.11, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [11, 12, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [11, 12, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [12, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [12, 19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.85]

 * S: [19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [19]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.11]

 * S: []
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



## Outbreak: 9

* Agent at vertex 0: peril 1.00, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 1.00, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.17, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.33, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 1.00, protection 0.65 and state INFECTED.
* Agent at vertex 10: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.25, protection 0.62 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.25, protection 0.99 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.25, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.17, protection 0.66 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 2, 3, 7, 12, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: [1, 4, 5, 6, 8, 10, 11, 13, 14]

_Strategy:_ [0.15, 0.0, 0.19, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.66, 0.0]

 * S: [2, 3, 7, 12, 15, 16, 17, 19]
 * I: [9]
 * R: []
 * P: [0, 1, 4, 5, 6, 8, 10, 11, 13, 14, 18]

_Infecting:_ 2 


 * S: [3, 7, 12, 15, 16, 17, 19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 4, 5, 6, 8, 10, 11, 13, 14, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.0]

 * S: [3, 12, 15, 16, 19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 4, 5, 6, 7, 8, 10, 11, 13, 14, 17, 18]

_Nothing infected._
 * S: [3, 12, 15, 16, 19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 4, 5, 6, 7, 8, 10, 11, 13, 14, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.01, 0.37, 0.0, 0.0, 0.17]

 * S: [19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17]

 * S: []
 * I: [2, 9]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [0, 2, 3, 7, 12, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: [1, 4, 5, 6, 8, 10, 11, 13, 14]

_Strategy:_ [0.15, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.0, 0.0, 0.0, 0.66, 0.0]

 * S: [2, 3, 7, 12, 15, 16, 17, 19]
 * I: [9]
 * R: []
 * P: [0, 1, 4, 5, 6, 8, 10, 11, 13, 14, 18]

_Infecting:_ 2 


 * S: [3, 7, 12, 15, 16, 17, 19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 4, 5, 6, 8, 10, 11, 13, 14, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.01, 0.05, 0.47, 0.0, 0.0]

 * S: [3, 16, 19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 17, 18]

_Nothing infected._
 * S: [3, 16, 19]
 * I: [2, 9]
 * R: []
 * P: [0, 1, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.34]

 * S: []
 * I: [2, 9]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 2, 3, 7, 12, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: [1, 4, 5, 6, 8, 10, 11, 13, 14]

_Strategy:_ [0.15, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.22]

 * S: [2, 12, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 13, 14, 15]

_Infecting:_ 2 18 


 * S: [12, 16, 17, 19]
 * I: [2, 9, 18]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 13, 14, 15]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.37, 0.14, 0.0, 0.11]

 * S: [17]
 * I: [2, 9, 18]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 19]

_Infecting:_ 17 


 * S: []
 * I: [2, 9, 17, 18]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 19]

__Nothing more to protect.__

Ending model with 16 protected and 4 infected vertices in 4 turns.



## Outbreak: 10

* Agent at vertex 0: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.17, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.09, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.10, protection 0.74 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.09, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 1.00, protection 0.07 and state INFECTED.
* Agent at vertex 11: peril 0.10, protection 0.62 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 0.50, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 1.00, protection 0.43 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.09, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [2, 6, 11, 13, 15]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 12, 14, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 6, 11]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2, 6, 11]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [10]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 3 turns.



#### Greatest Degree Defence

 * S: [2, 6, 11, 13, 15]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 12, 14, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.38, 0.0, 0.05, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 6, 13]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2, 6, 13]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 11, 12, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.56, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [10]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 3 turns.



#### Highest Protection Defence

 * S: [2, 6, 11, 13, 15]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8, 9, 12, 14, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.38, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 15]
 * I: [10]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]

_Infecting:_ 15 


 * S: [2]
 * I: [10, 15]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [10, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 3 turns.



## Outbreak: 11

* Agent at vertex 0: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 1.00, protection 0.02 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.50, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.10, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 1.00, protection 0.80 and state INFECTED.
* Agent at vertex 12: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.14, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 1.00, protection 0.87 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [3, 5, 6, 12, 17, 19]
 * I: [11]
 * R: []
 * P: [0, 1, 2, 4, 7, 8, 9, 10, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.67, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 5, 6, 17, 19]
 * I: [11]
 * R: []
 * P: [0, 1, 2, 4, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Infecting:_ 3 19 


 * S: [5, 6, 17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.59, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Nothing infected._
 * S: [6, 17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.75, 0.0, 0.0]

 * S: [17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Nothing infected._
 * S: [17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0]

 * S: []
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [3, 5, 6, 12, 17, 19]
 * I: [11]
 * R: []
 * P: [0, 1, 2, 4, 7, 8, 9, 10, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 6, 17, 19]
 * I: [11]
 * R: []
 * P: [0, 1, 2, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Infecting:_ 3 19 


 * S: [6, 17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0]

 * S: [17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Nothing infected._
 * S: [17]
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.44, 0.0, 0.0]

 * S: []
 * I: [3, 11, 19]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [3, 5, 6, 12, 17, 19]
 * I: [11]
 * R: []
 * P: [0, 1, 2, 4, 7, 8, 9, 10, 13, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13]

 * S: [3, 6, 17]
 * I: [11]
 * R: []
 * P: [0, 1, 2, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 19]

_Infecting:_ 3 


 * S: [6, 17]
 * I: [3, 11]
 * R: []
 * P: [0, 1, 2, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.71, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.29, 0.0, 0.0]

 * S: [17]
 * I: [3, 11]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 19]

_Nothing infected._
 * S: [17]
 * I: [3, 11]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.56, 0.0, 0.0]

 * S: []
 * I: [3, 11]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



## Outbreak: 12

* Agent at vertex 0: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.50, protection 0.40 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.24 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.33, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.82 and state INFECTED.
* Agent at vertex 13: peril 0.14, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.17, protection 0.64 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.50, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [1, 5, 6, 7, 8, 11, 13, 17]
 * I: [12]
 * R: []
 * P: [0, 2, 3, 4, 9, 10, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 6, 7, 8, 13, 17]
 * I: [12]
 * R: []
 * P: [0, 2, 3, 4, 5, 9, 10, 11, 14, 15, 16, 18, 19]

_Infecting:_ 6 


 * S: [1, 7, 8, 13, 17]
 * I: [6, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 9, 10, 11, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.09, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0]

 * S: [13, 17]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 18, 19]

_Nothing infected._
 * S: [13, 17]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.75, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0]

 * S: [13]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [13]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [1, 5, 6, 7, 8, 11, 13, 17]
 * I: [12]
 * R: []
 * P: [0, 2, 3, 4, 9, 10, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.6, 0.0, 0.0, 0.0, 0.3, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 7, 8, 13, 17]
 * I: [12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 9, 10, 11, 14, 15, 16, 18, 19]

_Infecting:_ 6 


 * S: [7, 8, 13, 17]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 9, 10, 11, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0]

 * S: [7, 8, 13]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Infecting:_ 8 


 * S: [7, 13]
 * I: [6, 8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [6, 8, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [1, 5, 6, 7, 8, 11, 13, 17]
 * I: [12]
 * R: []
 * P: [0, 2, 3, 4, 9, 10, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.05, 0.0, 0.0, 0.0, 0.3, 0.0, 0.09, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0]

 * S: [1, 6, 13]
 * I: [12]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Infecting:_ 6 


 * S: [1, 13]
 * I: [6, 12]
 * R: []
 * P: [0, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.55, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [13]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [13]
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [6, 12]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



## Outbreak: 13

* Agent at vertex 0: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.17, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.50, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 1.00, protection 0.64 and state INFECTED.
* Agent at vertex 14: peril 0.33, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 1.00, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.11, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [5, 10, 14, 15, 17, 18]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.75, 0.0, 0.25, 0.0, 0.0]

 * S: [5, 10, 14, 17, 18]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 15, 16, 19]

_Infecting:_ 17 


 * S: [5, 10, 14, 18]
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.83, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.11, 0.0]

 * S: [5, 14]
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19]

_Nothing infected._
 * S: [5, 14]
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [5, 10, 14, 15, 17, 18]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0, 0.0, 0.11, 0.0]

 * S: [10, 14, 15, 17]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 16, 18, 19]

_Infecting:_ 15 17 


 * S: [10, 14]
 * I: [13, 15, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.83, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [14]
 * I: [13, 15, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16, 18, 19]

_Nothing infected._
 * S: [14]
 * I: [13, 15, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [13, 15, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [5, 10, 14, 15, 17, 18]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.0, 0.12, 0.11, 0.0]

 * S: [10, 15, 17]
 * I: [13]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 18, 19]

_Infecting:_ 15 17 


 * S: [10]
 * I: [13, 15, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.83, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [13, 15, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 3 turns.



## Outbreak: 14

* Agent at vertex 0: peril 0.33, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.33, protection 0.29 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.50, protection 0.09 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 1.00, protection 0.22 and state INFECTED.
* Agent at vertex 15: peril 0.25, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.50, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.13, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 2, 9, 15, 17, 18]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.9, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.0]

 * S: [0, 2, 9, 15, 17]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 16, 18, 19]

_Nothing infected._
 * S: [0, 2, 9, 15, 17]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 16, 18, 19]

_Strategy:_ [0.91, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.0]

 * S: [0, 2, 15]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 17, 18, 19]

_Nothing infected._
 * S: [0, 2, 15]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 17, 18, 19]

_Strategy:_ [0.01, 0.0, 0.71, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0]

 * S: [15]
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 17, 18, 19]

_Nothing infected._
 * S: [15]
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [0, 2, 9, 15, 17, 18]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.9, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.0]

 * S: [0, 2, 9, 15, 17]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 16, 18, 19]

_Nothing infected._
 * S: [0, 2, 9, 15, 17]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 16, 18, 19]

_Strategy:_ [0.92, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.07, 0.0, 0.0]

 * S: [2, 15, 17]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 18, 19]

_Nothing infected._
 * S: [2, 15, 17]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.67, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.01, 0.0, 0.0]

 * S: [2]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [2]
 * I: [14]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



#### Highest Protection Defence

 * S: [0, 2, 9, 15, 17, 18]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.08, 0.1, 0.0]

 * S: [0, 2, 9]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [0, 2, 9]
 * I: [14]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.79, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 9]
 * I: [14]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [0, 9]
 * I: [14]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Strategy:_ [0.88, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0]
 * I: [14]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Nothing infected._
 * S: [0]
 * I: [14]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

_Strategy:_ [0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



## Outbreak: 15

* Agent at vertex 0: peril 0.20, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.10, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.11, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.10, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 1.00, protection 0.76 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 1.00, protection 0.01 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.25, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.12 and state INFECTED.
* Agent at vertex 16: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.50, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.10, protection 0.87 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 6, 10, 13, 14, 17, 19]
 * I: [15]
 * R: []
 * P: [1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.99, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 10, 14, 17, 19]
 * I: [15]
 * R: []
 * P: [1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 16, 18]

_Infecting:_ 10 


 * S: [0, 6, 14, 17, 19]
 * I: [10, 15]
 * R: []
 * P: [1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 16, 18]

_Strategy:_ [0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.05, 0.0, 0.0]

 * S: [6, 19]
 * I: [10, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18]

_Nothing infected._
 * S: [6, 19]
 * I: [10, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13]

 * S: []
 * I: [10, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 6, 10, 13, 14, 17, 19]
 * I: [15]
 * R: []
 * P: [1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 16, 18]

_Strategy:_ [0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 10, 13, 14, 17, 19]
 * I: [15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 16, 18]

_Infecting:_ 10 13 


 * S: [6, 14, 17, 19]
 * I: [10, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.86, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.09, 0.0, 0.0, 0.05, 0.0, 0.0]

 * S: [14, 19]
 * I: [10, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 16, 17, 18]

_Nothing infected._
 * S: [14, 19]
 * I: [10, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.13]

 * S: []
 * I: [10, 13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 6, 10, 13, 14, 17, 19]
 * I: [15]
 * R: []
 * P: [1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 16, 18]

_Strategy:_ [0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.05, 0.0, 0.13]

 * S: [6, 13, 14]
 * I: [15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 16, 17, 18, 19]

_Infecting:_ 13 


 * S: [6, 14]
 * I: [13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.86, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [13, 15]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 3 turns.



## Outbreak: 16

* Agent at vertex 0: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.25, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.25, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.84 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.25, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 0.33, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 1.00, protection 0.24 and state INFECTED.
* Agent at vertex 17: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 0.25, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [3, 4, 5, 8, 11]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 6, 7, 9, 10, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.13, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [3, 4, 8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.06, 0.73, 0.0, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [3, 4, 5, 8, 11]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 6, 7, 9, 10, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.13, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [3, 4, 8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.06, 0.73, 0.0, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [8]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [3, 4, 5, 8, 11]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 6, 7, 9, 10, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.18, 0.0, 0.16, 0.0, 0.0, 0.58, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 11]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [4, 11]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Nothing infected._
 * S: [4]
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [16]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 5 turns.



## Outbreak: 17

* Agent at vertex 0: peril 0.33, protection 0.45 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.25, protection 0.76 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 10: peril 0.33, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.14, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.17, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.69 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.41 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.17, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.87 and state INFECTED.
* Agent at vertex 18: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.13, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 4, 10, 11, 12, 13, 14, 15, 16, 18]
 * I: [17]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.44, 0.0, 0.0, 0.25, 0.0]

 * S: [0, 4, 10, 11, 12, 14, 15, 16]
 * I: [17]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 13, 18, 19]

_Nothing infected._
 * S: [0, 4, 10, 11, 12, 14, 15, 16]
 * I: [17]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 13, 18, 19]

_Strategy:_ [0.55, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.29, 0.15, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 10, 11, 12, 16]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 13, 14, 15, 18, 19]

_Nothing infected._
 * S: [4, 10, 11, 12, 16]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 13, 14, 15, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.32, 0.06, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0]

 * S: [11]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 19]

_Nothing infected._
 * S: [11]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 7 turns.



#### Greatest Degree Defence

 * S: [0, 4, 10, 11, 12, 13, 14, 15, 16, 18]
 * I: [17]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 19]

_Strategy:_ [0.55, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0]

 * S: [4, 10, 11, 13, 14, 15, 16]
 * I: [17]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 12, 18, 19]

_Infecting:_ 13 


 * S: [4, 10, 11, 14, 15, 16]
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 12, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.04, 0.59, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 10, 14, 16]
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 15, 18, 19]

_Nothing infected._
 * S: [4, 10, 14, 16]
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 15, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.25, 0.0, 0.13, 0.0, 0.0, 0.0]

 * S: []
 * I: [13, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19]

__Nothing more to infect.__

Ending model with 18 protected and 2 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 4, 10, 11, 12, 13, 14, 15, 16, 18]
 * I: [17]
 * R: []
 * P: [1, 2, 3, 5, 6, 7, 8, 9, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.06, 0.0, 0.06, 0.0, 0.13, 0.0, 0.25, 0.0]

 * S: [0, 11, 13, 14, 15]
 * I: [17]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 16, 18, 19]

_Infecting:_ 13 


 * S: [0, 11, 14, 15]
 * I: [13, 17]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 16, 18, 19]

_Strategy:_ [0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 15]
 * I: [13, 17]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]

_Infecting:_ 15 


 * S: [0]
 * I: [13, 15, 17]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]

_Strategy:_ [0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [13, 15, 17]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 5 turns.



## Outbreak: 18

* Agent at vertex 0: peril 0.50, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.33, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.33, protection 0.40 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.25, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 1.00, protection 0.51 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.25, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 12: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.33, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 1.00, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.91 and state INFECTED.
* Agent at vertex 19: peril 0.14, protection 1.00 and state PROTECTED.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 4, 5, 9, 10, 14, 15, 17]
 * I: [18]
 * R: []
 * P: [3, 6, 7, 8, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.49, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0]

 * S: [0, 1, 2, 4, 5, 10, 14, 15, 17]
 * I: [18]
 * R: []
 * P: [3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Infecting:_ 14 17 


 * S: [0, 1, 2, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Strategy:_ [0.87, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Nothing infected._
 * S: [1, 2, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.3, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 2, 3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Nothing infected._
 * S: [1, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 2, 3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.16, 0.0, 0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 5, 10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Nothing infected._
 * S: [4, 5, 10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.16, 0.47, 0.0, 0.0, 0.0, 0.0, 0.37, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Nothing infected._
 * S: [10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 11 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 4, 5, 9, 10, 14, 15, 17]
 * I: [18]
 * R: []
 * P: [3, 6, 7, 8, 11, 12, 13, 16, 19]

_Strategy:_ [0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.49, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 2, 4, 5, 10, 14, 15, 17]
 * I: [18]
 * R: []
 * P: [3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Infecting:_ 14 17 


 * S: [0, 1, 2, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Strategy:_ [0.36, 0.47, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Nothing infected._
 * S: [2, 4, 5, 10, 15]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 3, 6, 7, 8, 9, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.0, 0.31, 0.0, 0.0, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 3, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Nothing infected._
 * S: [2, 4, 10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 3, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.52, 0.0, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Nothing infected._
 * S: [4, 10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.88, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Nothing infected._
 * S: [10]
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.07, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [14, 17, 18]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 19]

__Nothing more to infect.__

Ending model with 17 protected and 3 infected vertices in 11 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 4, 5, 9, 10, 14, 15, 17]
 * I: [18]
 * R: []
 * P: [3, 6, 7, 8, 11, 12, 13, 16, 19]

_Strategy:_ [0.0, 0.47, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 4, 5, 9, 10, 14, 17]
 * I: [18]
 * R: []
 * P: [1, 3, 6, 7, 8, 11, 12, 13, 15, 16, 19]

_Infecting:_ 9 14 17 


 * S: [0, 2, 4, 5, 10]
 * I: [9, 14, 17, 18]
 * R: []
 * P: [1, 3, 6, 7, 8, 11, 12, 13, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.06, 0.0, 0.6, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 10]
 * I: [9, 14, 17, 18]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 11, 12, 13, 15, 16, 19]

_Infecting:_ 0 2 


 * S: [10]
 * I: [0, 2, 9, 14, 17, 18]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 11, 12, 13, 15, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.95, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 9, 14, 17, 18]
 * R: []
 * P: [1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 15, 16, 19]

__Nothing more to infect.__

Ending model with 14 protected and 6 infected vertices in 5 turns.



## Outbreak: 19

* Agent at vertex 0: peril 0.20, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 4: peril 0.17, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.33, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.20, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.17, protection 0.98 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.09, protection 1.00 and state PROTECTED.
* Agent at vertex 11: peril 1.00, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 13: peril 0.11, protection 1.00 and state PROTECTED.
* Agent at vertex 14: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 15: peril 0.10, protection 1.00 and state PROTECTED.
* Agent at vertex 16: peril 0.25, protection 1.00 and state PROTECTED.
* Agent at vertex 17: peril 0.13, protection 1.00 and state PROTECTED.
* Agent at vertex 18: peril 0.14, protection 1.00 and state PROTECTED.
* Agent at vertex 19: peril 1.00, protection 0.67 and state INFECTED.
#### Proximity to Infection Defence

 * S: [6, 7, 9, 11]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 7, 9]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [6, 7, 9]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.04, 0.0, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 3 turns.



#### Greatest Degree Defence

 * S: [6, 7, 9, 11]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.24, 0.0, 0.0, 0.02, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 7]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Nothing infected._
 * S: [6, 7]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

__Nothing more to infect.__

Ending model with 19 protected and 1 infected vertices in 3 turns.



#### Highest Protection Defence

 * S: [6, 7, 9, 11]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 10, 12, 13, 14, 15, 16, 17, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.51, 0.04, 0.0, 0.02, 0.0, 0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [11]
 * I: [19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18]

_Infecting:_ 11 


 * S: []
 * I: [11, 19]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18]

__Nothing more to protect.__

Ending model with 18 protected and 2 infected vertices in 2 turns.



