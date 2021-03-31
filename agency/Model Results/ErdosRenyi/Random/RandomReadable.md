# Readable results of SIRP defence strategies on a random graph
## Generating Erdős–Rényi Graph:

Graph generator has generated the specified graph with the following parameters:

 * Type of graph: Erdős–Rényi
 * Number of vertices: 20
 * Number of edges: 82
 * Probability: 82 / (20 * (20 - 1) / 2) = 0.43
 * Random generator seed: 1615826141222

The graph is represented using the following adjacency matrix:

0: 0 0 1 0 0 1 1 0 0 0 1 0 0 1 1 0 0 1 1 0 

1: 0 0 1 0 0 1 0 0 0 1 0 1 0 1 1 0 1 1 1 1 

2: 1 1 0 1 0 1 0 1 0 1 0 0 0 1 0 0 0 1 0 1 

3: 0 0 1 0 1 1 0 1 1 0 1 0 0 0 0 0 1 0 0 1 

4: 0 0 0 1 0 1 0 1 1 1 0 0 0 0 1 1 0 0 0 0 

5: 1 1 1 1 1 0 0 0 0 1 0 1 1 0 1 1 1 1 1 1 

6: 1 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 1 0 

7: 0 0 1 1 1 0 0 0 1 1 1 1 0 1 1 0 0 0 1 0 

8: 0 0 0 1 1 0 0 1 0 1 0 1 1 0 0 1 1 0 1 0 

9: 0 1 1 0 1 1 0 1 1 0 1 0 0 0 1 0 0 0 1 0 

10: 1 0 0 1 0 0 0 1 0 1 0 1 0 1 0 0 0 0 0 1 

11: 0 1 0 0 0 1 1 1 1 0 1 0 0 0 0 0 1 0 0 1 

12: 0 0 0 0 0 1 0 0 1 0 0 0 0 0 1 1 0 0 0 0 

13: 1 1 1 0 0 0 0 1 0 0 1 0 0 0 0 0 1 1 1 0 

14: 1 1 0 0 1 1 0 1 0 1 0 0 1 0 0 0 0 1 1 0 

15: 0 0 0 0 1 1 1 0 1 0 0 0 1 0 0 0 0 0 1 0 

16: 0 1 0 1 0 1 0 0 1 0 0 1 0 1 0 0 0 0 1 0 

17: 1 1 1 0 0 1 0 0 0 0 0 0 0 1 1 0 0 0 1 0 

18: 1 1 0 0 0 1 1 1 1 1 0 0 0 1 1 1 1 1 0 1 

19: 0 1 1 1 0 1 0 0 0 0 1 1 0 0 0 0 0 0 1 0 


## Model values
The values used in the model are:
 * Total defence quota each turn: 1.0
 * Probability with which the infection propagates: 1.0
## Outbreak: 0

* Agent at vertex 0: peril 1.00, protection 0.40 and state INFECTED.
* Agent at vertex 1: peril 0.50, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.52 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.61 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.32 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.98 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.34 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.72, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [0]
 * R: []
 * P: [5, 18]

_Infecting:_ 2 6 10 13 14 17 


 * S: [1, 3, 4, 7, 8, 9, 11, 12, 15, 16, 19]
 * I: [0, 2, 6, 10, 13, 14, 17]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.84, 0.0, 0.0, 0.0, 0.0, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 7, 8, 9, 11, 12, 15, 16, 19]
 * I: [0, 2, 6, 10, 13, 14, 17]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 3 4 7 9 11 12 15 16 19 


 * S: [8]
 * I: [0, 2, 3, 4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 3, 4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 8, 18]

__Nothing more to infect.__

Ending model with 4 protected and 16 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.72, 0.0, 0.0, 0.0, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [0]
 * R: []
 * P: [5, 18]

_Infecting:_ 2 6 10 13 14 17 


 * S: [1, 3, 4, 7, 8, 9, 11, 12, 15, 16, 19]
 * I: [0, 2, 6, 10, 13, 14, 17]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.69, 0.19, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 8, 9, 11, 12, 15, 16, 19]
 * I: [0, 2, 6, 10, 13, 14, 17]
 * R: []
 * P: [1, 5, 7, 18]

_Infecting:_ 3 4 9 11 12 15 16 19 


 * S: [8]
 * I: [0, 2, 3, 4, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 7, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 3, 4, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 7, 8, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.35, 0.0, 0.0, 0.08, 0.0, 0.03, 0.05, 0.0, 0.04, 0.15, 0.02, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 7, 8, 9, 10, 13, 17, 19]
 * I: [0]
 * R: []
 * P: [5, 6, 11, 12, 14, 15, 16, 18]

_Infecting:_ 2 10 13 17 


 * S: [1, 3, 4, 7, 8, 9, 19]
 * I: [0, 2, 10, 13, 17]
 * R: []
 * P: [5, 6, 11, 12, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.48, 0.0, 0.0, 0.0, 0.21, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 3, 7, 8, 19]
 * I: [0, 2, 10, 13, 17]
 * R: []
 * P: [4, 5, 6, 9, 11, 12, 14, 15, 16, 18]

_Infecting:_ 1 3 7 19 


 * S: [8]
 * I: [0, 1, 2, 3, 7, 10, 13, 17, 19]
 * R: []
 * P: [4, 5, 6, 9, 11, 12, 14, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 3, 7, 10, 13, 17, 19]
 * R: []
 * P: [4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 18]

__Nothing more to infect.__

Ending model with 11 protected and 9 infected vertices in 5 turns.



## Outbreak: 1

* Agent at vertex 0: peril 0.50, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.51 and state INFECTED.
* Agent at vertex 2: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.77 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.98 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.40 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.45 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.22, 0.0, 0.0, 0.02, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.25, 0.0]

 * S: [0, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [1]
 * R: []
 * P: [2, 5, 9, 18]

_Infecting:_ 11 13 14 16 17 19 


 * S: [0, 3, 4, 6, 7, 8, 10, 12, 15]
 * I: [1, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 9, 18]

_Strategy:_ [0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 3, 4, 6, 10, 12, 15]
 * I: [1, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 7, 8, 9, 18]

_Infecting:_ 0 3 4 6 10 12 


 * S: [15]
 * I: [0, 1, 3, 4, 6, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 7, 8, 9, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.55, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 3, 4, 6, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 7, 8, 9, 15, 18]

__Nothing more to infect.__

Ending model with 7 protected and 13 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.22, 0.0, 0.0, 0.02, 0.0, 0.34, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0]

 * S: [0, 3, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [1]
 * R: []
 * P: [2, 5, 7, 18]

_Infecting:_ 9 11 13 14 16 17 19 


 * S: [0, 3, 4, 6, 8, 10, 12, 15]
 * I: [1, 9, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 7, 18]

_Strategy:_ [0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 3, 4, 6, 10, 12, 15]
 * I: [1, 9, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 7, 8, 18]

_Infecting:_ 0 3 4 6 10 12 


 * S: [15]
 * I: [0, 1, 3, 4, 6, 9, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 7, 8, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.55, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 3, 4, 6, 9, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [2, 5, 7, 8, 15, 18]

__Nothing more to infect.__

Ending model with 6 protected and 14 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.22, 0.0, 0.23, 0.02, 0.0, 0.0, 0.0, 0.2, 0.05, 0.0, 0.08, 0.0, 0.0, 0.0, 0.11, 0.0, 0.09, 0.0]

 * S: [0, 3, 6, 7, 8, 11, 13, 14, 15, 17, 18, 19]
 * I: [1]
 * R: []
 * P: [2, 4, 5, 9, 10, 12, 16]

_Infecting:_ 11 13 14 17 18 19 


 * S: [0, 3, 6, 7, 8, 15]
 * I: [1, 11, 13, 14, 17, 18, 19]
 * R: []
 * P: [2, 4, 5, 9, 10, 12, 16]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.55, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 3, 6, 8]
 * I: [1, 11, 13, 14, 17, 18, 19]
 * R: []
 * P: [2, 4, 5, 7, 9, 10, 12, 15, 16]

_Infecting:_ 0 3 6 8 


 * S: []
 * I: [0, 1, 3, 6, 8, 11, 13, 14, 17, 18, 19]
 * R: []
 * P: [2, 4, 5, 7, 9, 10, 12, 15, 16]

__Nothing more to protect.__

Ending model with 9 protected and 11 infected vertices in 4 turns.



## Outbreak: 2

* Agent at vertex 0: peril 1.00, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.79 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.76 and state INFECTED.
* Agent at vertex 3: peril 1.00, protection 0.54 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.00 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.03 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.24 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.61 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.62 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.86 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.41 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.03, 0.0, 0.0, 0.0, 0.97, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: [5]

_Infecting:_ 0 1 3 7 9 13 17 19 


 * S: [4, 6, 8, 10, 11, 12, 14, 15, 16, 18]
 * I: [0, 1, 2, 3, 7, 9, 13, 17, 19]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.23, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.32, 0.0]

 * S: [4, 6, 10, 11, 12, 15, 16]
 * I: [0, 1, 2, 3, 7, 9, 13, 17, 19]
 * R: []
 * P: [5, 8, 14, 18]

_Infecting:_ 4 6 10 11 16 


 * S: [12, 15]
 * I: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 16, 17, 19]
 * R: []
 * P: [5, 8, 14, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.14, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 16, 17, 19]
 * R: []
 * P: [5, 8, 12, 14, 15, 18]

__Nothing more to infect.__

Ending model with 6 protected and 14 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.97, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0]

 * S: [0, 1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: [5]

_Infecting:_ 0 1 3 7 9 13 17 19 


 * S: [4, 6, 8, 10, 11, 12, 14, 15, 16, 18]
 * I: [0, 1, 2, 3, 7, 9, 13, 17, 19]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.26, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.29, 0.0]

 * S: [4, 6, 10, 11, 12, 15, 16]
 * I: [0, 1, 2, 3, 7, 9, 13, 17, 19]
 * R: []
 * P: [5, 8, 14, 18]

_Infecting:_ 4 6 10 11 16 


 * S: [12, 15]
 * I: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 16, 17, 19]
 * R: []
 * P: [5, 8, 14, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.14, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 16, 17, 19]
 * R: []
 * P: [5, 8, 12, 14, 15, 18]

__Nothing more to infect.__

Ending model with 6 protected and 14 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.07, 0.0, 0.14, 0.19, 0.0, 0.32, 0.0]

 * S: [0, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 17, 19]
 * I: [2]
 * R: []
 * P: [1, 8, 15, 16, 18]

_Infecting:_ 0 3 5 7 9 13 17 19 


 * S: [4, 6, 10, 11, 12, 14]
 * I: [0, 2, 3, 5, 7, 9, 13, 17, 19]
 * R: []
 * P: [1, 8, 15, 16, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.12, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 6, 11, 12]
 * I: [0, 2, 3, 5, 7, 9, 13, 17, 19]
 * R: []
 * P: [1, 8, 10, 14, 15, 16, 18]

_Infecting:_ 4 6 11 12 


 * S: []
 * I: [0, 2, 3, 4, 5, 6, 7, 9, 11, 12, 13, 17, 19]
 * R: []
 * P: [1, 8, 10, 14, 15, 16, 18]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 4 turns.



## Outbreak: 3

* Agent at vertex 0: peril 0.50, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.75 and state INFECTED.
* Agent at vertex 4: peril 1.00, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.33, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.43 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.54 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.22 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.41 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.49 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: [5]

_Infecting:_ 2 4 7 8 10 16 19 


 * S: [0, 1, 6, 9, 11, 12, 13, 14, 15, 17, 18]
 * I: [2, 3, 4, 7, 8, 10, 16, 19]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.59, 0.0]

 * S: [0, 6, 9, 11, 12, 13, 14, 15, 17]
 * I: [2, 3, 4, 7, 8, 10, 16, 19]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 0 9 11 12 13 14 15 17 


 * S: [6]
 * I: [0, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 6, 18]

__Nothing more to infect.__

Ending model with 4 protected and 16 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.23, 0.0]

 * S: [0, 1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: [5]

_Infecting:_ 2 4 7 8 10 16 19 


 * S: [0, 1, 6, 9, 11, 12, 13, 14, 15, 17, 18]
 * I: [2, 3, 4, 7, 8, 10, 16, 19]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0]

 * S: [0, 6, 9, 11, 12, 13, 14, 15, 17]
 * I: [2, 3, 4, 7, 8, 10, 16, 19]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 0 9 11 12 13 14 15 17 


 * S: [6]
 * I: [0, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 6, 18]

__Nothing more to infect.__

Ending model with 4 protected and 16 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.11, 0.0, 0.0, 0.12, 0.0, 0.27, 0.3, 0.0, 0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0]

 * S: [0, 2, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [3]
 * R: []
 * P: [1, 4, 6, 10, 17]

_Infecting:_ 2 5 7 8 16 19 


 * S: [0, 9, 11, 12, 13, 14, 15, 18]
 * I: [2, 3, 5, 7, 8, 16, 19]
 * R: []
 * P: [1, 4, 6, 10, 17]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.41, 0.46, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 9, 11, 12, 13, 18]
 * I: [2, 3, 5, 7, 8, 16, 19]
 * R: []
 * P: [1, 4, 6, 10, 14, 15, 17]

_Infecting:_ 0 9 11 12 13 18 


 * S: []
 * I: [0, 2, 3, 5, 7, 8, 9, 11, 12, 13, 16, 18, 19]
 * R: []
 * P: [1, 4, 6, 10, 14, 15, 17]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 4 turns.



## Outbreak: 4

* Agent at vertex 0: peril 0.50, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.18 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.60 and state INFECTED.
* Agent at vertex 5: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.40 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.11 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 2, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: [5]

_Infecting:_ 3 7 8 9 14 15 


 * S: [0, 1, 2, 6, 10, 11, 12, 13, 16, 17, 18, 19]
 * I: [3, 4, 7, 8, 9, 14, 15]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.0]

 * S: [0, 1, 2, 6, 10, 11, 12, 13, 16, 17, 19]
 * I: [3, 4, 7, 8, 9, 14, 15]
 * R: []
 * P: [5, 18]

_Infecting:_ 0 1 2 6 10 11 12 13 16 17 19 


 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [5, 18]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0]

 * S: [0, 1, 2, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: [5]

_Infecting:_ 3 7 8 9 14 15 


 * S: [0, 1, 2, 6, 10, 11, 12, 13, 16, 17, 18, 19]
 * I: [3, 4, 7, 8, 9, 14, 15]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.73, 0.0]

 * S: [0, 1, 2, 6, 10, 11, 12, 13, 16, 17, 19]
 * I: [3, 4, 7, 8, 9, 14, 15]
 * R: []
 * P: [5, 18]

_Infecting:_ 0 1 2 6 10 11 12 13 16 17 19 


 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [5, 18]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.19, 0.27, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.1, 0.0, 0.0, 0.05, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 5, 7, 8, 9, 10, 13, 14, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: [1, 3, 6, 11, 12, 15]

_Infecting:_ 5 7 8 9 14 


 * S: [0, 2, 10, 13, 16, 17, 18, 19]
 * I: [4, 5, 7, 8, 9, 14]
 * R: []
 * P: [1, 3, 6, 11, 12, 15]

_Strategy:_ [0.14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 13, 16, 17, 18, 19]
 * I: [4, 5, 7, 8, 9, 14]
 * R: []
 * P: [0, 1, 3, 6, 10, 11, 12, 15]

_Infecting:_ 2 13 16 17 18 19 


 * S: []
 * I: [2, 4, 5, 7, 8, 9, 13, 14, 16, 17, 18, 19]
 * R: []
 * P: [0, 1, 3, 6, 10, 11, 12, 15]

__Nothing more to protect.__

Ending model with 8 protected and 12 infected vertices in 4 turns.



## Outbreak: 5

* Agent at vertex 0: peril 1.00, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.79 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.71 and state INFECTED.
* Agent at vertex 6: peril 0.50, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.22 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.93 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [5]
 * R: []
 * P: [18]

_Infecting:_ 0 1 2 3 4 9 11 12 14 15 16 17 19 


 * S: [6, 7, 8, 10, 13]
 * I: [0, 1, 2, 3, 4, 5, 9, 11, 12, 14, 15, 16, 17, 19]
 * R: []
 * P: [18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.15, 0.0, 0.26, 0.0, 0.0, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 10]
 * I: [0, 1, 2, 3, 4, 5, 9, 11, 12, 14, 15, 16, 17, 19]
 * R: []
 * P: [7, 8, 13, 18]

_Infecting:_ 6 10 


 * S: []
 * I: [0, 1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 14, 15, 16, 17, 19]
 * R: []
 * P: [7, 8, 13, 18]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 4 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [5]
 * R: []
 * P: [18]

_Infecting:_ 0 1 2 3 4 9 11 12 14 15 16 17 19 


 * S: [6, 7, 8, 10, 13]
 * I: [0, 1, 2, 3, 4, 5, 9, 11, 12, 14, 15, 16, 17, 19]
 * R: []
 * P: [18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.15, 0.0, 0.26, 0.0, 0.0, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 10]
 * I: [0, 1, 2, 3, 4, 5, 9, 11, 12, 14, 15, 16, 17, 19]
 * R: []
 * P: [7, 8, 13, 18]

_Infecting:_ 6 10 


 * S: []
 * I: [0, 1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 14, 15, 16, 17, 19]
 * R: []
 * P: [7, 8, 13, 18]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.08, 0.25, 0.15, 0.03, 0.0, 0.0, 0.09, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.07]

 * S: [0, 1, 3, 4, 10, 11, 13, 14, 15, 16, 17, 18]
 * I: [5]
 * R: []
 * P: [2, 6, 7, 8, 9, 12, 19]

_Infecting:_ 0 1 3 4 11 14 15 16 17 18 


 * S: [10, 13]
 * I: [0, 1, 3, 4, 5, 11, 14, 15, 16, 17, 18]
 * R: []
 * P: [2, 6, 7, 8, 9, 12, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.66, 0.0, 0.0, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10]
 * I: [0, 1, 3, 4, 5, 11, 14, 15, 16, 17, 18]
 * R: []
 * P: [2, 6, 7, 8, 9, 12, 13, 19]

_Infecting:_ 10 


 * S: []
 * I: [0, 1, 3, 4, 5, 10, 11, 14, 15, 16, 17, 18]
 * R: []
 * P: [2, 6, 7, 8, 9, 12, 13, 19]

__Nothing more to protect.__

Ending model with 8 protected and 12 infected vertices in 4 turns.



## Outbreak: 6

* Agent at vertex 0: peril 1.00, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.84 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.33, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.41 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.70 and state INFECTED.
* Agent at vertex 7: peril 0.50, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.62 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.41 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.09 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.64 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0]

 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [6]
 * R: []
 * P: [18]

_Infecting:_ 0 11 15 


 * S: [1, 2, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 16, 17, 19]
 * I: [0, 6, 11, 15]
 * R: []
 * P: [18]

_Strategy:_ [0.0, 0.16, 0.0, 0.0, 0.0, 0.44, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 7, 8, 9, 10, 12, 13, 14, 16, 17, 19]
 * I: [0, 6, 11, 15]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 2 4 7 8 10 12 13 14 16 17 19 


 * S: [3, 9]
 * I: [0, 2, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 3, 5, 9, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.02, 0.0, 0.0, 0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0]

 * S: [0, 1, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [6]
 * R: []
 * P: [5, 18]

_Infecting:_ 0 11 15 


 * S: [1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 14, 16, 17, 19]
 * I: [0, 6, 11, 15]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.86, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 7, 8, 9, 10, 12, 13, 14, 16, 17, 19]
 * I: [0, 6, 11, 15]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 2 4 7 8 10 12 13 14 16 17 19 


 * S: [3, 9]
 * I: [0, 2, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.51, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 3, 5, 9, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.16, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.05, 0.0, 0.2, 0.05, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 4, 5, 7, 8, 9, 10, 11, 13, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: [1, 3, 12, 14, 15]

_Infecting:_ 0 11 18 


 * S: [2, 4, 5, 7, 8, 9, 10, 13, 16, 17, 19]
 * I: [0, 6, 11, 18]
 * R: []
 * P: [1, 3, 12, 14, 15]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.14, 0.0, 0.0, 0.12, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36]

 * S: [2, 4, 5, 7, 9, 13, 16, 17]
 * I: [0, 6, 11, 18]
 * R: []
 * P: [1, 3, 8, 10, 12, 14, 15, 19]

_Infecting:_ 2 5 7 9 13 16 17 


 * S: [4]
 * I: [0, 2, 5, 6, 7, 9, 11, 13, 16, 17, 18]
 * R: []
 * P: [1, 3, 8, 10, 12, 14, 15, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.59, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 5, 6, 7, 9, 11, 13, 16, 17, 18]
 * R: []
 * P: [1, 3, 4, 8, 10, 12, 14, 15, 19]

__Nothing more to infect.__

Ending model with 9 protected and 11 infected vertices in 5 turns.



## Outbreak: 7

* Agent at vertex 0: peril 0.50, protection 0.03 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.52 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.03 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.00 and state INFECTED.
* Agent at vertex 8: peril 1.00, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.61 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.65 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.79, 0.0]

 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [7]
 * R: []
 * P: [18]

_Infecting:_ 2 3 4 8 9 10 11 13 14 


 * S: [0, 1, 5, 6, 12, 15, 16, 17, 19]
 * I: [2, 3, 4, 7, 8, 9, 10, 11, 13, 14]
 * R: []
 * P: [18]

_Strategy:_ [0.02, 0.41, 0.0, 0.0, 0.0, 0.56, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 12, 15, 16, 17, 19]
 * I: [2, 3, 4, 7, 8, 9, 10, 11, 13, 14]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 0 6 12 15 16 17 19 


 * S: []
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 4 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.56, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.44, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: [5]

_Infecting:_ 2 3 4 8 9 10 11 13 14 18 


 * S: [0, 1, 6, 12, 15, 16, 17, 19]
 * I: [2, 3, 4, 7, 8, 9, 10, 11, 13, 14, 18]
 * R: []
 * P: [5]

_Strategy:_ [0.59, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 6, 12, 15, 16, 17, 19]
 * I: [2, 3, 4, 7, 8, 9, 10, 11, 13, 14, 18]
 * R: []
 * P: [1, 5]

_Infecting:_ 0 6 12 15 16 17 19 


 * S: []
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 5]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.29, 0.0, 0.26]

 * S: [0, 1, 2, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [7]
 * R: []
 * P: [3, 8, 17]

_Infecting:_ 2 4 9 10 11 13 14 18 


 * S: [0, 1, 5, 6, 12, 15, 16, 19]
 * I: [2, 4, 7, 9, 10, 11, 13, 14, 18]
 * R: []
 * P: [3, 8, 17]

_Strategy:_ [0.0, 0.41, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.49, 0.0, 0.0, 0.0, 0.09]

 * S: [0, 5, 6, 12, 15, 16]
 * I: [2, 4, 7, 9, 10, 11, 13, 14, 18]
 * R: []
 * P: [1, 3, 8, 17, 19]

_Infecting:_ 0 5 6 12 15 16 


 * S: []
 * I: [0, 2, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 18]
 * R: []
 * P: [1, 3, 8, 17, 19]

__Nothing more to protect.__

Ending model with 5 protected and 15 infected vertices in 4 turns.



## Outbreak: 8

* Agent at vertex 0: peril 0.50, protection 0.76 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.93 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.41 and state INFECTED.
* Agent at vertex 9: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.69 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.11 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.89, 0.0]

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [8]
 * R: []
 * P: [18]

_Infecting:_ 3 4 7 9 11 12 15 16 


 * S: [0, 1, 2, 5, 6, 10, 13, 14, 17, 19]
 * I: [3, 4, 7, 8, 9, 11, 12, 15, 16]
 * R: []
 * P: [18]

_Strategy:_ [0.0, 0.43, 0.16, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 6, 10, 13, 14, 17, 19]
 * I: [3, 4, 7, 8, 9, 11, 12, 15, 16]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 2 6 10 13 14 19 


 * S: [0, 17]
 * I: [2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.24, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0]

 * S: []
 * I: [2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19]
 * R: []
 * P: [0, 1, 5, 17, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.58, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: [5]

_Infecting:_ 3 4 7 9 11 12 15 16 18 


 * S: [0, 1, 2, 6, 10, 13, 14, 17, 19]
 * I: [3, 4, 7, 8, 9, 11, 12, 15, 16, 18]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.43, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 6, 10, 13, 14, 17, 19]
 * I: [3, 4, 7, 8, 9, 11, 12, 15, 16, 18]
 * R: []
 * P: [1, 5]

_Infecting:_ 0 2 6 10 13 14 17 19 


 * S: []
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 5]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.12, 0.0, 0.0, 0.0, 0.07, 0.0, 0.22, 0.0, 0.0, 0.0, 0.2, 0.0, 0.2, 0.0, 0.0, 0.03, 0.0, 0.17, 0.0, 0.0]

 * S: [0, 1, 2, 3, 5, 7, 9, 11, 13, 14, 16, 18, 19]
 * I: [8]
 * R: []
 * P: [4, 6, 10, 12, 15, 17]

_Infecting:_ 3 7 9 11 16 18 


 * S: [0, 1, 2, 5, 13, 14, 19]
 * I: [3, 7, 8, 9, 11, 16, 18]
 * R: []
 * P: [4, 6, 10, 12, 15, 17]

_Strategy:_ [0.12, 0.15, 0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 14, 19]
 * I: [3, 7, 8, 9, 11, 16, 18]
 * R: []
 * P: [0, 4, 5, 6, 10, 12, 13, 15, 17]

_Infecting:_ 1 2 14 19 


 * S: []
 * I: [1, 2, 3, 7, 8, 9, 11, 14, 16, 18, 19]
 * R: []
 * P: [0, 4, 5, 6, 10, 12, 13, 15, 17]

__Nothing more to protect.__

Ending model with 9 protected and 11 infected vertices in 4 turns.



## Outbreak: 9

* Agent at vertex 0: peril 0.50, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.18 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.81 and state INFECTED.
* Agent at vertex 10: peril 1.00, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.98 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.06, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.83, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [9]
 * R: []
 * P: [5, 18]

_Infecting:_ 1 2 4 7 8 10 14 


 * S: [0, 3, 6, 11, 12, 13, 15, 16, 17, 19]
 * I: [1, 2, 4, 7, 8, 9, 10, 14]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.09, 0.0, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 11, 12, 13, 15, 16, 17, 19]
 * I: [1, 2, 4, 7, 8, 9, 10, 14]
 * R: []
 * P: [0, 3, 5, 18]

_Infecting:_ 11 12 13 15 16 17 19 


 * S: [6]
 * I: [1, 2, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [0, 3, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.65, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 2, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [0, 3, 5, 6, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.06, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.83, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [9]
 * R: []
 * P: [5, 18]

_Infecting:_ 1 2 4 7 8 10 14 


 * S: [0, 3, 6, 11, 12, 13, 15, 16, 17, 19]
 * I: [1, 2, 4, 7, 8, 9, 10, 14]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.09, 0.0, 0.0, 0.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [6, 11, 12, 13, 15, 16, 17, 19]
 * I: [1, 2, 4, 7, 8, 9, 10, 14]
 * R: []
 * P: [0, 3, 5, 18]

_Infecting:_ 11 12 13 15 16 17 19 


 * S: [6]
 * I: [1, 2, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [0, 3, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.65, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 2, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [0, 3, 5, 6, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: []

_Strategy:_ [0.09, 0.0, 0.18, 0.0, 0.2, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.09, 0.24, 0.0, 0.02]

 * S: [1, 3, 6, 7, 8, 10, 11, 13, 14, 15, 17, 18]
 * I: [9]
 * R: []
 * P: [0, 2, 4, 5, 12, 16, 19]

_Infecting:_ 1 7 8 10 14 18 


 * S: [3, 6, 11, 13, 15, 17]
 * I: [1, 7, 8, 9, 10, 14, 18]
 * R: []
 * P: [0, 2, 4, 5, 12, 16, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.65, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.16, 0.0, 0.0]

 * S: [3, 11, 13, 15]
 * I: [1, 7, 8, 9, 10, 14, 18]
 * R: []
 * P: [0, 2, 4, 5, 6, 12, 16, 17, 19]

_Infecting:_ 3 11 13 15 


 * S: []
 * I: [1, 3, 7, 8, 9, 10, 11, 13, 14, 15, 18]
 * R: []
 * P: [0, 2, 4, 5, 6, 12, 16, 17, 19]

__Nothing more to protect.__

Ending model with 9 protected and 11 infected vertices in 4 turns.



## Outbreak: 10

* Agent at vertex 0: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.51 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.99 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.17 and state INFECTED.
* Agent at vertex 11: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.33, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.33, protection 0.99 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.24 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.52 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.39 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.44, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: [0, 7, 9]

_Infecting:_ 3 11 13 19 


 * S: [1, 2, 4, 5, 6, 8, 12, 14, 15, 16, 17, 18]
 * I: [3, 10, 11, 13, 19]
 * R: []
 * P: [0, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.46, 0.0]

 * S: [1, 2, 4, 6, 8, 12, 14, 15, 16, 17, 18]
 * I: [3, 10, 11, 13, 19]
 * R: []
 * P: [0, 5, 7, 9]

_Infecting:_ 1 2 4 6 8 16 17 18 


 * S: [12, 14, 15]
 * I: [1, 2, 3, 4, 6, 8, 10, 11, 13, 16, 17, 18, 19]
 * R: []
 * P: [0, 5, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.41, 0.01, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [1, 2, 3, 4, 6, 8, 10, 11, 13, 16, 17, 18, 19]
 * R: []
 * P: [0, 5, 7, 9, 12, 14, 15]

__Nothing more to infect.__

Ending model with 7 protected and 13 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.54, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.46, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: [5]

_Infecting:_ 0 3 7 9 11 13 19 


 * S: [1, 2, 4, 6, 8, 12, 14, 15, 16, 17, 18]
 * I: [0, 3, 7, 9, 10, 11, 13, 19]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.49, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.02, 0.0]

 * S: [2, 4, 6, 8, 12, 14, 15, 16, 17]
 * I: [0, 3, 7, 9, 10, 11, 13, 19]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 2 4 6 8 14 16 17 


 * S: [12, 15]
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [1, 5, 12, 15, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.06, 0.0, 0.35, 0.19, 0.0, 0.38, 0.01, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 7, 8, 13, 14, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: [0, 6, 9, 11, 12, 15]

_Infecting:_ 3 7 13 19 


 * S: [1, 2, 4, 5, 8, 14, 16, 17, 18]
 * I: [3, 7, 10, 13, 19]
 * R: []
 * P: [0, 6, 9, 11, 12, 15]

_Strategy:_ [0.0, 0.49, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.0, 0.48, 0.0]

 * S: [2, 4, 5, 8, 16, 17]
 * I: [3, 7, 10, 13, 19]
 * R: []
 * P: [0, 1, 6, 9, 11, 12, 14, 15, 18]

_Infecting:_ 2 4 5 8 16 17 


 * S: []
 * I: [2, 3, 4, 5, 7, 8, 10, 13, 16, 17, 19]
 * R: []
 * P: [0, 1, 6, 9, 11, 12, 14, 15, 18]

__Nothing more to protect.__

Ending model with 9 protected and 11 infected vertices in 4 turns.



## Outbreak: 11

* Agent at vertex 0: peril 0.50, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.76 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.09 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.30 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.79 and state INFECTED.
* Agent at vertex 12: peril 0.50, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.09 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.98 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.09, 0.0, 0.0, 0.0, 0.91, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: [5]

_Infecting:_ 1 6 7 8 10 16 19 


 * S: [0, 2, 3, 4, 9, 12, 13, 14, 15, 17, 18]
 * I: [1, 6, 7, 8, 10, 11, 16, 19]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.63, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37, 0.0]

 * S: [0, 2, 3, 4, 9, 12, 13, 14, 15, 17]
 * I: [1, 6, 7, 8, 10, 11, 16, 19]
 * R: []
 * P: [5, 18]

_Infecting:_ 0 2 3 4 9 12 13 14 15 17 


 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [5, 18]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.91, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.09, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: [5]

_Infecting:_ 1 6 7 8 10 16 19 


 * S: [0, 2, 3, 4, 9, 12, 13, 14, 15, 17, 18]
 * I: [1, 6, 7, 8, 10, 11, 16, 19]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0]

 * S: [0, 2, 3, 4, 9, 12, 13, 14, 15, 17]
 * I: [1, 6, 7, 8, 10, 11, 16, 19]
 * R: []
 * P: [5, 18]

_Infecting:_ 0 2 3 4 9 12 13 14 15 17 


 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [5, 18]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: []

_Strategy:_ [0.04, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.02, 0.0, 0.0, 0.3, 0.33]

 * S: [1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 13, 16, 17, 18]
 * I: [11]
 * R: []
 * P: [0, 3, 14, 15, 19]

_Infecting:_ 1 5 6 7 8 10 16 


 * S: [2, 4, 9, 12, 13, 17, 18]
 * I: [1, 5, 6, 7, 8, 10, 11, 16]
 * R: []
 * P: [0, 3, 14, 15, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.61, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.07, 0.0]

 * S: [2, 9, 12, 13, 17]
 * I: [1, 5, 6, 7, 8, 10, 11, 16]
 * R: []
 * P: [0, 3, 4, 14, 15, 18, 19]

_Infecting:_ 2 9 12 13 17 


 * S: []
 * I: [1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 17]
 * R: []
 * P: [0, 3, 4, 14, 15, 18, 19]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 4 turns.



## Outbreak: 12

* Agent at vertex 0: peril 0.50, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.41 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.03 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.33, protection 0.30 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.69 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.46 and state INFECTED.
* Agent at vertex 13: peril 0.33, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.00 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 0.50, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.63 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0, 0.67, 0.0, 0.0, 0.0, 0.0, 0.0, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: [5, 8]

_Infecting:_ 14 15 


 * S: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 16, 17, 18, 19]
 * I: [12, 14, 15]
 * R: []
 * P: [5, 8]

_Strategy:_ [0.0, 0.47, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 16, 17, 19]
 * I: [12, 14, 15]
 * R: []
 * P: [5, 8, 18]

_Infecting:_ 0 1 4 6 7 9 17 


 * S: [2, 3, 10, 11, 13, 16, 19]
 * I: [0, 1, 4, 6, 7, 9, 12, 14, 15, 17]
 * R: []
 * P: [5, 8, 18]

_Strategy:_ [0.0, 0.0, 0.52, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 10, 11, 13, 16, 19]
 * I: [0, 1, 4, 6, 7, 9, 12, 14, 15, 17]
 * R: []
 * P: [2, 5, 8, 18]

_Infecting:_ 3 10 11 13 16 19 


 * S: []
 * I: [0, 1, 3, 4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [2, 5, 8, 18]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 6 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.44, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.53, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19]
 * I: [12]
 * R: []
 * P: [5, 18]

_Infecting:_ 8 14 15 


 * S: [0, 1, 2, 3, 4, 6, 7, 9, 10, 11, 13, 16, 17, 19]
 * I: [8, 12, 14, 15]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.15, 0.52, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 3, 4, 6, 9, 10, 11, 13, 16, 17, 19]
 * I: [8, 12, 14, 15]
 * R: []
 * P: [1, 2, 5, 7, 18]

_Infecting:_ 0 3 4 6 9 11 16 17 


 * S: [10, 13, 19]
 * I: [0, 3, 4, 6, 8, 9, 11, 12, 14, 15, 16, 17]
 * R: []
 * P: [1, 2, 5, 7, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.52, 0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.37]

 * S: [10]
 * I: [0, 3, 4, 6, 8, 9, 11, 12, 14, 15, 16, 17]
 * R: []
 * P: [1, 2, 5, 7, 13, 18, 19]

_Infecting:_ 10 


 * S: []
 * I: [0, 3, 4, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17]
 * R: []
 * P: [1, 2, 5, 7, 13, 18, 19]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 6 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: []

_Strategy:_ [0.06, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.19, 0.0, 0.0, 0.0, 0.31, 0.0, 0.12, 0.0, 0.0, 0.18, 0.12, 0.0, 0.0]

 * S: [1, 2, 3, 4, 6, 8, 9, 10, 14, 15, 17, 18, 19]
 * I: [12]
 * R: []
 * P: [0, 5, 7, 11, 13, 16]

_Infecting:_ 8 14 15 


 * S: [1, 2, 3, 4, 6, 9, 10, 17, 18, 19]
 * I: [8, 12, 14, 15]
 * R: []
 * P: [0, 5, 7, 11, 13, 16]

_Strategy:_ [0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.37]

 * S: [1, 2, 3, 4, 6, 10, 18]
 * I: [8, 12, 14, 15]
 * R: []
 * P: [0, 5, 7, 9, 11, 13, 16, 17, 19]

_Infecting:_ 1 3 4 6 18 


 * S: [2, 10]
 * I: [1, 3, 4, 6, 8, 12, 14, 15, 18]
 * R: []
 * P: [0, 5, 7, 9, 11, 13, 16, 17, 19]

_Strategy:_ [0.0, 0.0, 0.44, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.56, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [10]
 * I: [1, 3, 4, 6, 8, 12, 14, 15, 18]
 * R: []
 * P: [0, 2, 5, 7, 9, 11, 13, 16, 17, 19]

_Infecting:_ 10 


 * S: []
 * I: [1, 3, 4, 6, 8, 10, 12, 14, 15, 18]
 * R: []
 * P: [0, 2, 5, 7, 9, 11, 13, 16, 17, 19]

__Nothing more to protect.__

Ending model with 10 protected and 10 infected vertices in 6 turns.



## Outbreak: 13

* Agent at vertex 0: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.02 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.30 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.09 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.77 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.33, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.87 and state INFECTED.
* Agent at vertex 14: peril 0.50, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.13 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45, 0.0]

 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 19]
 * I: [13]
 * R: []
 * P: [1, 18]

_Infecting:_ 0 2 7 10 16 17 


 * S: [3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 19]
 * I: [0, 2, 7, 10, 13, 16, 17]
 * R: []
 * P: [1, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 6, 8, 9, 11, 12, 14, 15, 19]
 * I: [0, 2, 7, 10, 13, 16, 17]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 3 4 6 8 9 11 14 19 


 * S: [12, 15]
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [1, 5, 12, 15, 18]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.87, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: [5]

_Infecting:_ 0 1 2 7 10 16 17 18 


 * S: [3, 4, 6, 8, 9, 11, 12, 14, 15, 19]
 * I: [0, 1, 2, 7, 10, 13, 16, 17, 18]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.29, 0.23, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 6, 11, 12, 15, 19]
 * I: [0, 1, 2, 7, 10, 13, 16, 17, 18]
 * R: []
 * P: [5, 8, 9, 14]

_Infecting:_ 3 4 6 11 15 19 


 * S: [12]
 * I: [0, 1, 2, 3, 4, 6, 7, 10, 11, 13, 15, 16, 17, 18, 19]
 * R: []
 * P: [5, 8, 9, 14]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 10, 11, 13, 15, 16, 17, 18, 19]
 * R: []
 * P: [5, 8, 9, 12, 14]

__Nothing more to infect.__

Ending model with 5 protected and 15 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.29, 0.23, 0.01, 0.0, 0.0, 0.0, 0.13, 0.06, 0.0, 0.28, 0.0, 0.0]

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 10, 12, 16, 18, 19]
 * I: [13]
 * R: []
 * P: [8, 9, 11, 14, 15, 17]

_Infecting:_ 0 1 2 7 10 16 18 


 * S: [3, 4, 5, 6, 12, 19]
 * I: [0, 1, 2, 7, 10, 13, 16, 18]
 * R: []
 * P: [8, 9, 11, 14, 15, 17]

_Strategy:_ [0.0, 0.0, 0.0, 0.35, 0.0, 0.0, 0.65, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 5, 12, 19]
 * I: [0, 1, 2, 7, 10, 13, 16, 18]
 * R: []
 * P: [6, 8, 9, 11, 14, 15, 17]

_Infecting:_ 3 4 5 19 


 * S: [12]
 * I: [0, 1, 2, 3, 4, 5, 7, 10, 13, 16, 18, 19]
 * R: []
 * P: [6, 8, 9, 11, 14, 15, 17]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.77, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 3, 4, 5, 7, 10, 13, 16, 18, 19]
 * R: []
 * P: [6, 8, 9, 11, 12, 14, 15, 17]

__Nothing more to infect.__

Ending model with 8 protected and 12 infected vertices in 5 turns.



## Outbreak: 14

* Agent at vertex 0: peril 1.00, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.01 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.61 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.51 and state INFECTED.
* Agent at vertex 15: peril 0.50, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.84 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.01 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: [5]

_Infecting:_ 0 1 4 7 9 12 17 18 


 * S: [2, 3, 6, 8, 10, 11, 13, 15, 16, 19]
 * I: [0, 1, 4, 7, 9, 12, 14, 17, 18]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.96, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 6, 8, 10, 11, 13, 15, 16, 19]
 * I: [0, 1, 4, 7, 9, 12, 14, 17, 18]
 * R: []
 * P: [2, 5]

_Infecting:_ 3 6 8 10 11 13 15 16 19 


 * S: []
 * I: [0, 1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [2, 5]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.64, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: [5]

_Infecting:_ 0 1 4 7 9 12 17 18 


 * S: [2, 3, 6, 8, 10, 11, 13, 15, 16, 19]
 * I: [0, 1, 4, 7, 9, 12, 14, 17, 18]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.96, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 6, 8, 10, 11, 13, 15, 16, 19]
 * I: [0, 1, 4, 7, 9, 12, 14, 17, 18]
 * R: []
 * P: [2, 5]

_Infecting:_ 3 6 8 10 11 13 15 16 19 


 * S: []
 * I: [0, 1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [2, 5]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.08, 0.0, 0.32, 0.0, 0.0, 0.24, 0.16, 0.0, 0.0]

 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 12, 15, 16, 18, 19]
 * I: [14]
 * R: []
 * P: [4, 11, 13, 17]

_Infecting:_ 0 1 5 7 9 12 18 


 * S: [2, 3, 6, 8, 10, 15, 16, 19]
 * I: [0, 1, 5, 7, 9, 12, 14, 18]
 * R: []
 * P: [4, 11, 13, 17]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0]

 * S: [2, 3, 8, 10, 15, 19]
 * I: [0, 1, 5, 7, 9, 12, 14, 18]
 * R: []
 * P: [4, 6, 11, 13, 16, 17]

_Infecting:_ 2 3 8 10 15 19 


 * S: []
 * I: [0, 1, 2, 3, 5, 7, 8, 9, 10, 12, 14, 15, 18, 19]
 * R: []
 * P: [4, 6, 11, 13, 16, 17]

__Nothing more to protect.__

Ending model with 6 protected and 14 infected vertices in 4 turns.



## Outbreak: 15

* Agent at vertex 0: peril 0.50, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.64 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.01 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.32 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.33, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.76 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.28 and state INFECTED.
* Agent at vertex 16: peril 0.50, protection 0.62 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.82 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19]
 * I: [15]
 * R: []
 * P: [5, 18]

_Infecting:_ 4 6 8 12 


 * S: [0, 1, 2, 3, 7, 9, 10, 11, 13, 14, 16, 17, 19]
 * I: [4, 6, 8, 12, 15]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.52, 0.0, 0.0, 0.0, 0.0, 0.0, 0.48, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 3, 7, 9, 10, 11, 13, 14, 16, 17, 19]
 * I: [4, 6, 8, 12, 15]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 0 3 7 9 11 14 16 


 * S: [2, 10, 13, 17, 19]
 * I: [0, 3, 4, 6, 7, 8, 9, 11, 12, 14, 15, 16]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.43, 0.0, 0.0, 0.0, 0.37, 0.0, 0.18]

 * S: [10]
 * I: [0, 3, 4, 6, 7, 8, 9, 11, 12, 14, 15, 16]
 * R: []
 * P: [1, 2, 5, 13, 17, 18, 19]

_Infecting:_ 10 


 * S: []
 * I: [0, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16]
 * R: []
 * P: [1, 2, 5, 13, 17, 18, 19]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 6 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.43, 0.0, 0.0, 0.0, 0.36, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19]
 * I: [15]
 * R: []
 * P: [5, 18]

_Infecting:_ 4 6 8 12 


 * S: [0, 1, 2, 3, 7, 9, 10, 11, 13, 14, 16, 17, 19]
 * I: [4, 6, 8, 12, 15]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.9, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 3, 7, 9, 10, 11, 13, 14, 16, 17, 19]
 * I: [4, 6, 8, 12, 15]
 * R: []
 * P: [1, 5, 18]

_Infecting:_ 0 3 7 9 11 14 16 


 * S: [2, 10, 13, 17, 19]
 * I: [0, 3, 4, 6, 7, 8, 9, 11, 12, 14, 15, 16]
 * R: []
 * P: [1, 5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.43, 0.0, 0.0, 0.0, 0.37, 0.0, 0.18]

 * S: [10]
 * I: [0, 3, 4, 6, 7, 8, 9, 11, 12, 14, 15, 16]
 * R: []
 * P: [1, 2, 5, 13, 17, 18, 19]

_Infecting:_ 10 


 * S: []
 * I: [0, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16]
 * R: []
 * P: [1, 2, 5, 13, 17, 18, 19]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 6 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.12, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.24, 0.0, 0.0, 0.0, 0.22, 0.18]

 * S: [0, 1, 4, 5, 6, 7, 8, 9, 10, 12, 13, 16, 17]
 * I: [15]
 * R: []
 * P: [2, 3, 11, 14, 18, 19]

_Infecting:_ 4 5 6 8 12 


 * S: [0, 1, 7, 9, 10, 13, 16, 17]
 * I: [4, 5, 6, 8, 12, 15]
 * R: []
 * P: [2, 3, 11, 14, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.38, 0.37, 0.0, 0.0]

 * S: [0, 1, 7, 9, 10, 13]
 * I: [4, 5, 6, 8, 12, 15]
 * R: []
 * P: [2, 3, 11, 14, 16, 17, 18, 19]

_Infecting:_ 0 1 7 9 


 * S: [10, 13]
 * I: [0, 1, 4, 5, 6, 7, 8, 9, 12, 15]
 * R: []
 * P: [2, 3, 11, 14, 16, 17, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.61, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 4, 5, 6, 7, 8, 9, 12, 15]
 * R: []
 * P: [2, 3, 10, 11, 13, 14, 16, 17, 18, 19]

__Nothing more to infect.__

Ending model with 10 protected and 10 infected vertices in 5 turns.



## Outbreak: 16

* Agent at vertex 0: peril 0.50, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.18 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.22 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.21 and state INFECTED.
* Agent at vertex 17: peril 0.50, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.01 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.88 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.96, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: [5]

_Infecting:_ 1 3 8 11 13 18 


 * S: [0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 17, 19]
 * I: [1, 3, 8, 11, 13, 16, 18]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 4, 6, 9, 10, 12, 14, 15, 17, 19]
 * I: [1, 3, 8, 11, 13, 16, 18]
 * R: []
 * P: [2, 5, 7]

_Infecting:_ 0 4 6 9 10 12 14 15 17 19 


 * S: []
 * I: [0, 1, 3, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [2, 5, 7]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 4 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.96, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.04, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: [5]

_Infecting:_ 1 3 8 11 13 18 


 * S: [0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 17, 19]
 * I: [1, 3, 8, 11, 13, 16, 18]
 * R: []
 * P: [5]

_Strategy:_ [0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 4, 6, 9, 10, 12, 14, 15, 17, 19]
 * I: [1, 3, 8, 11, 13, 16, 18]
 * R: []
 * P: [2, 5, 7]

_Infecting:_ 0 4 6 9 10 12 14 15 17 19 


 * S: []
 * I: [0, 1, 3, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [2, 5, 7]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: []

_Strategy:_ [0.15, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.07, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.0, 0.12]

 * S: [1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 18]
 * I: [16]
 * R: []
 * P: [0, 2, 8, 17, 19]

_Infecting:_ 1 3 5 11 13 18 


 * S: [4, 6, 7, 9, 10, 12, 14, 15]
 * I: [1, 3, 5, 11, 13, 16, 18]
 * R: []
 * P: [0, 2, 8, 17, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 6, 9, 10, 12, 15]
 * I: [1, 3, 5, 11, 13, 16, 18]
 * R: []
 * P: [0, 2, 7, 8, 14, 17, 19]

_Infecting:_ 4 6 9 10 12 15 


 * S: []
 * I: [1, 3, 4, 5, 6, 9, 10, 11, 12, 13, 15, 16, 18]
 * R: []
 * P: [0, 2, 7, 8, 14, 17, 19]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 4 turns.



## Outbreak: 17

* Agent at vertex 0: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.45 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.43 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.24 and state INFECTED.
* Agent at vertex 18: peril 1.00, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 0.50, protection 0.67 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.22, 0.0, 0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19]
 * I: [17]
 * R: []
 * P: [5, 18]

_Infecting:_ 0 1 2 13 14 


 * S: [3, 4, 6, 7, 8, 9, 10, 11, 12, 15, 16, 19]
 * I: [0, 1, 2, 13, 14, 17]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.13, 0.5, 0.22, 0.0, 0.07, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 6, 10, 11, 12, 15, 16, 19]
 * I: [0, 1, 2, 13, 14, 17]
 * R: []
 * P: [3, 5, 7, 8, 9, 18]

_Infecting:_ 4 6 10 11 12 16 19 


 * S: [15]
 * I: [0, 1, 2, 4, 6, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [3, 5, 7, 8, 9, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 4, 6, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [3, 5, 7, 8, 9, 15, 18]

__Nothing more to infect.__

Ending model with 7 protected and 13 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.22, 0.0, 0.0, 0.0, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19]
 * I: [17]
 * R: []
 * P: [5, 18]

_Infecting:_ 0 1 2 13 14 


 * S: [3, 4, 6, 7, 8, 9, 10, 11, 12, 15, 16, 19]
 * I: [0, 1, 2, 13, 14, 17]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.13, 0.5, 0.22, 0.0, 0.07, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 6, 10, 11, 12, 15, 16, 19]
 * I: [0, 1, 2, 13, 14, 17]
 * R: []
 * P: [3, 5, 7, 8, 9, 18]

_Infecting:_ 4 6 10 11 12 16 19 


 * S: [15]
 * I: [0, 1, 2, 4, 6, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [3, 5, 7, 8, 9, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.57, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 4, 6, 10, 11, 12, 13, 14, 16, 17, 19]
 * R: []
 * P: [3, 5, 7, 8, 9, 15, 18]

__Nothing more to infect.__

Ending model with 7 protected and 13 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.17, 0.08, 0.0, 0.0, 0.09, 0.13, 0.0, 0.22, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.05, 0.0]

 * S: [0, 1, 4, 5, 8, 10, 11, 12, 13, 14, 15, 16, 19]
 * I: [17]
 * R: []
 * P: [2, 3, 6, 7, 9, 18]

_Infecting:_ 0 1 5 13 14 


 * S: [4, 8, 10, 11, 12, 15, 16, 19]
 * I: [0, 1, 5, 13, 14, 17]
 * R: []
 * P: [2, 3, 6, 7, 9, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33]

 * S: [8, 10, 11, 12, 15, 16]
 * I: [0, 1, 5, 13, 14, 17]
 * R: []
 * P: [2, 3, 4, 6, 7, 9, 18, 19]

_Infecting:_ 10 11 12 15 16 


 * S: [8]
 * I: [0, 1, 5, 10, 11, 12, 13, 14, 15, 16, 17]
 * R: []
 * P: [2, 3, 4, 6, 7, 9, 18, 19]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 5, 10, 11, 12, 13, 14, 15, 16, 17]
 * R: []
 * P: [2, 3, 4, 6, 7, 8, 9, 18, 19]

__Nothing more to infect.__

Ending model with 9 protected and 11 infected vertices in 5 turns.



## Outbreak: 18

* Agent at vertex 0: peril 1.00, protection 0.74 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.07 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.43 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.93 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 0.50, protection 0.54 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 0.50, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.29 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.64 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.33 and state INFECTED.
* Agent at vertex 19: peril 1.00, protection 0.44 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.25, 0.0, 0.0, 0.0, 0.57, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: [1, 5]

_Infecting:_ 0 6 7 8 9 13 14 15 16 17 19 


 * S: [2, 3, 4, 10, 11, 12]
 * I: [0, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 5]

_Strategy:_ [0.0, 0.0, 0.4, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 10, 11, 12]
 * I: [0, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 2, 3, 5]

_Infecting:_ 4 10 11 12 


 * S: []
 * I: [0, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 2, 3, 5]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 4 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.25, 0.0, 0.0, 0.0, 0.57, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: [1, 5]

_Infecting:_ 0 6 7 8 9 13 14 15 16 17 19 


 * S: [2, 3, 4, 10, 11, 12]
 * I: [0, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 5]

_Strategy:_ [0.0, 0.0, 0.4, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 10, 11, 12]
 * I: [0, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 2, 3, 5]

_Infecting:_ 4 10 11 12 


 * S: []
 * I: [0, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 2, 3, 5]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 4 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: []

_Strategy:_ [0.26, 0.25, 0.0, 0.0, 0.0, 0.0, 0.15, 0.0, 0.03, 0.07, 0.0, 0.0, 0.0, 0.0, 0.0, 0.21, 0.04, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 7, 10, 11, 12, 13, 14, 15, 17, 19]
 * I: [18]
 * R: []
 * P: [0, 1, 6, 8, 9, 16]

_Infecting:_ 5 7 13 14 15 17 19 


 * S: [2, 3, 4, 10, 11, 12]
 * I: [5, 7, 13, 14, 15, 17, 18, 19]
 * R: []
 * P: [0, 1, 6, 8, 9, 16]

_Strategy:_ [0.0, 0.0, 0.4, 0.29, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 10, 11, 12]
 * I: [5, 7, 13, 14, 15, 17, 18, 19]
 * R: []
 * P: [0, 1, 2, 3, 6, 8, 9, 16]

_Infecting:_ 4 10 11 12 


 * S: []
 * I: [4, 5, 7, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * R: []
 * P: [0, 1, 2, 3, 6, 8, 9, 16]

__Nothing more to protect.__

Ending model with 8 protected and 12 infected vertices in 4 turns.



## Outbreak: 19

* Agent at vertex 0: peril 0.50, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.32 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.86 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.52 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.64 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 0.50, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 0.50, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 0.50, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 0.50, protection 0.62 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 0.50, protection 0.99 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 0.50, protection 0.74 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.13 and state INFECTED.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.13, 0.0, 0.0, 0.0, 0.84, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]
 * I: [19]
 * R: []
 * P: [5, 18]

_Infecting:_ 1 2 3 10 11 


 * S: [0, 4, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17]
 * I: [1, 2, 3, 10, 11, 19]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.85, 0.14, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 4, 6, 9, 12, 13, 14, 15, 16, 17]
 * I: [1, 2, 3, 10, 11, 19]
 * R: []
 * P: [5, 7, 8, 18]

_Infecting:_ 0 4 6 9 13 14 16 17 


 * S: [12, 15]
 * I: [0, 1, 2, 3, 4, 6, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [5, 7, 8, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 3, 4, 6, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [5, 7, 8, 12, 15, 18]

__Nothing more to infect.__

Ending model with 6 protected and 14 infected vertices in 5 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.13, 0.0, 0.0, 0.0, 0.84, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.03, 0.0]

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]
 * I: [19]
 * R: []
 * P: [5, 18]

_Infecting:_ 1 2 3 10 11 


 * S: [0, 4, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17]
 * I: [1, 2, 3, 10, 11, 19]
 * R: []
 * P: [5, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.85, 0.14, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 4, 6, 9, 12, 13, 14, 15, 16, 17]
 * I: [1, 2, 3, 10, 11, 19]
 * R: []
 * P: [5, 7, 8, 18]

_Infecting:_ 0 4 6 9 13 14 16 17 


 * S: [12, 15]
 * I: [0, 1, 2, 3, 4, 6, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [5, 7, 8, 18]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0]

 * S: []
 * I: [0, 1, 2, 3, 4, 6, 9, 10, 11, 13, 14, 16, 17, 19]
 * R: []
 * P: [5, 7, 8, 12, 15, 18]

__Nothing more to infect.__

Ending model with 6 protected and 14 infected vertices in 5 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.14, 0.0, 0.03, 0.25, 0.18, 0.0, 0.0, 0.0, 0.01, 0.26, 0.03, 0.0]

 * S: [0, 1, 3, 4, 5, 6, 7, 9, 11, 13, 14, 15]
 * I: [19]
 * R: []
 * P: [2, 8, 10, 12, 16, 17, 18]

_Infecting:_ 1 3 5 11 


 * S: [0, 4, 6, 7, 9, 13, 14, 15]
 * I: [1, 3, 5, 11, 19]
 * R: []
 * P: [2, 8, 10, 12, 16, 17, 18]

_Strategy:_ [0.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0]

 * S: [4, 6, 7, 9, 13, 14]
 * I: [1, 3, 5, 11, 19]
 * R: []
 * P: [0, 2, 8, 10, 12, 15, 16, 17, 18]

_Infecting:_ 4 6 7 9 13 14 


 * S: []
 * I: [1, 3, 4, 5, 6, 7, 9, 11, 13, 14, 19]
 * R: []
 * P: [0, 2, 8, 10, 12, 15, 16, 17, 18]

__Nothing more to protect.__

Ending model with 9 protected and 11 infected vertices in 4 turns.



