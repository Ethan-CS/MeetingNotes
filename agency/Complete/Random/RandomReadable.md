# Readable results of SIRP defence strategies on a random graph
## Generating Complete Graph:

Graph generator has generated the specified graph with the following parameters:

 * Type of graph: Complete
 * Number of vertices: 20
 * Number of edges: 190
 * Probability: 190 / (20 * (20 - 1) / 2) = 1.0
 * Random generator seed: 1615819871401

The graph is represented using the following adjacency matrix:

0: 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

1: 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

2: 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

3: 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

4: 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

5: 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

6: 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 

7: 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 

8: 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 

9: 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 

10: 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 

11: 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 

12: 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 

13: 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 

14: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 

15: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 

16: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 

17: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 

18: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 

19: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 


## Model values
The values used in the model are:
 * Total defence quota each turn: 1.0
 * Probability with which the infection propagates: 1.0
## Outbreak: 0

* Agent at vertex 0: peril 1.00, protection 0.85 and state INFECTED.
* Agent at vertex 1: peril 1.00, protection 0.74 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.29 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.01 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.07 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.26, 0.71, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: [1, 2]

_Infecting:_ 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 2]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.26, 0.71, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: [1, 2]

_Infecting:_ 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [1, 2]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.26, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 0.0, 0.02, 0.0]

 * S: [2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [0]
 * R: []
 * P: [1, 5, 10, 16]

_Infecting:_ 2 3 4 6 7 8 9 11 12 13 14 15 17 18 19 


 * S: []
 * I: [0, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 15, 17, 18, 19]
 * R: []
 * P: [1, 5, 10, 16]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 2 turns.



## Outbreak: 1

* Agent at vertex 0: peril 1.00, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.10 and state INFECTED.
* Agent at vertex 2: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.62 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.37 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.18 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.04, 0.0, 0.9, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: [0, 2]

_Infecting:_ 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 2]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.04, 0.0, 0.9, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: [0, 2]

_Infecting:_ 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 2]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.04, 0.0, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.19, 0.0, 0.22, 0.0, 0.1, 0.0, 0.06, 0.0, 0.12, 0.0, 0.08]

 * S: [2, 3, 4, 5, 7, 8, 10, 12, 14, 16, 18, 19]
 * I: [1]
 * R: []
 * P: [0, 6, 9, 11, 13, 15, 17]

_Infecting:_ 2 3 4 5 7 8 10 12 14 16 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 7, 8, 10, 12, 14, 16, 18, 19]
 * R: []
 * P: [0, 6, 9, 11, 13, 15, 17]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 2 turns.



## Outbreak: 2

* Agent at vertex 0: peril 1.00, protection 0.07 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.79 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 3: peril 1.00, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.51 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.93, 0.07, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: [0]

_Infecting:_ 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.93, 0.07, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: [0]

_Infecting:_ 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.21, 0.0, 0.17, 0.15, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.08, 0.0, 0.0, 0.04, 0.06, 0.0, 0.0]

 * S: [0, 5, 6, 7, 8, 9, 10, 11, 14, 15, 18, 19]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 12, 13, 16, 17]

_Infecting:_ 0 5 6 7 8 9 10 11 14 15 18 19 


 * S: []
 * I: [0, 2, 5, 6, 7, 8, 9, 10, 11, 14, 15, 18, 19]
 * R: []
 * P: [1, 3, 4, 12, 13, 16, 17]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 2 turns.



## Outbreak: 3

* Agent at vertex 0: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.24 and state INFECTED.
* Agent at vertex 4: peril 1.00, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.54 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.93 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.37 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.03, 0.86, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.03, 0.86, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.03, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.28, 0.07, 0.0, 0.0, 0.21, 0.0, 0.0]

 * S: [1, 2, 5, 6, 8, 9, 10, 11, 12, 15, 16, 17, 18, 19]
 * I: [3]
 * R: []
 * P: [0, 4, 7, 13, 14]

_Infecting:_ 1 2 5 6 8 9 10 11 12 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 4, 7, 13, 14]

__Nothing more to protect.__

Ending model with 5 protected and 15 infected vertices in 2 turns.



## Outbreak: 4

* Agent at vertex 0: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.03 and state INFECTED.
* Agent at vertex 5: peril 1.00, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.22 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.61 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.30 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.32 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.40 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.95, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.95, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.08, 0.0, 0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.39, 0.0, 0.0, 0.0, 0.2, 0.0]

 * S: [0, 1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [4]
 * R: []
 * P: [2, 6, 14]

_Infecting:_ 0 1 3 5 7 8 9 10 11 12 13 15 16 17 18 19 


 * S: []
 * I: [0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * R: []
 * P: [2, 6, 14]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 2 turns.



## Outbreak: 5

* Agent at vertex 0: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.84 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.07 and state INFECTED.
* Agent at vertex 6: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.69 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.76 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.62, 0.38, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.62, 0.38, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 6 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.19, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.12, 0.29, 0.0, 0.24]

 * S: [0, 1, 2, 4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 * I: [5]
 * R: []
 * P: [3, 8, 16, 19]

_Infecting:_ 0 1 2 4 6 7 9 10 11 12 13 14 15 17 18 


 * S: []
 * I: [0, 1, 2, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 * R: []
 * P: [3, 8, 16, 19]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 2 turns.



## Outbreak: 6

* Agent at vertex 0: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.77 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.41 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.50 and state INFECTED.
* Agent at vertex 7: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.93 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.58, 0.23, 0.19, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.58, 0.23, 0.19, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 7 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.23, 0.0, 0.19, 0.0, 0.03, 0.0, 0.0, 0.06, 0.18, 0.0, 0.2, 0.0, 0.0, 0.05, 0.07, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 2, 4, 7, 9, 10, 12, 13, 16, 17, 18, 19]
 * I: [6]
 * R: []
 * P: [1, 3, 5, 8, 11, 14, 15]

_Infecting:_ 0 2 4 7 9 10 12 13 16 17 18 19 


 * S: []
 * I: [0, 2, 4, 6, 7, 9, 10, 12, 13, 16, 17, 18, 19]
 * R: []
 * P: [1, 3, 5, 8, 11, 14, 15]

__Nothing more to protect.__

Ending model with 7 protected and 13 infected vertices in 2 turns.



## Outbreak: 7

* Agent at vertex 0: peril 1.00, protection 0.02 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.07 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.60 and state INFECTED.
* Agent at vertex 8: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.64 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.30 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.37 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.71 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.98, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.98, 0.02, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 8 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.29]

 * S: [0, 1, 2, 3, 4, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18]
 * I: [7]
 * R: []
 * P: [5, 13, 19]

_Infecting:_ 0 1 2 3 4 6 8 9 10 11 12 14 15 16 17 18 


 * S: []
 * I: [0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18]
 * R: []
 * P: [5, 13, 19]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 2 turns.



## Outbreak: 8

* Agent at vertex 0: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.41 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.18 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.40 and state INFECTED.
* Agent at vertex 9: peril 1.00, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.77 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.75, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.75, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 9 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.15, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.09, 0.15, 0.0, 0.2, 0.0, 0.0, 0.08, 0.13, 0.0]

 * S: [0, 1, 4, 5, 6, 7, 9, 10, 12, 13, 15, 16, 19]
 * I: [8]
 * R: []
 * P: [2, 3, 11, 14, 17, 18]

_Infecting:_ 0 1 4 5 6 7 9 10 12 13 15 16 19 


 * S: []
 * I: [0, 1, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 16, 19]
 * R: []
 * P: [2, 3, 11, 14, 17, 18]

__Nothing more to protect.__

Ending model with 6 protected and 14 infected vertices in 2 turns.



## Outbreak: 9

* Agent at vertex 0: peril 1.00, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.29 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.05 and state INFECTED.
* Agent at vertex 10: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.29 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.51 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.79 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.01 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: []

_Strategy:_ [0.42, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: []

_Strategy:_ [0.42, 0.58, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 10 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [9]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.06, 0.0, 0.37, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.21, 0.08, 0.0, 0.0, 0.0]

 * S: [0, 1, 3, 5, 6, 7, 8, 10, 11, 12, 13, 14, 17, 18, 19]
 * I: [9]
 * R: []
 * P: [2, 4, 15, 16]

_Infecting:_ 0 1 3 5 6 7 8 10 11 12 13 14 17 18 19 


 * S: []
 * I: [0, 1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 17, 18, 19]
 * R: []
 * P: [2, 4, 15, 16]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 2 turns.



## Outbreak: 10

* Agent at vertex 0: peril 1.00, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.96 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.79 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.93 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.81 and state INFECTED.
* Agent at vertex 11: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.84 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.45 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.73 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: []

_Strategy:_ [0.94, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: []

_Strategy:_ [0.94, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 11 12 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [10]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.17, 0.17, 0.0, 0.0, 0.04, 0.0, 0.0, 0.21, 0.07, 0.0, 0.03, 0.16, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.1]

 * S: [0, 3, 4, 6, 7, 13, 14, 15, 17, 18, 19]
 * I: [10]
 * R: []
 * P: [1, 2, 5, 8, 9, 11, 12, 16]

_Infecting:_ 0 3 4 6 7 13 14 15 17 18 19 


 * S: []
 * I: [0, 3, 4, 6, 7, 10, 13, 14, 15, 17, 18, 19]
 * R: []
 * P: [1, 2, 5, 8, 9, 11, 12, 16]

__Nothing more to protect.__

Ending model with 8 protected and 12 infected vertices in 2 turns.



## Outbreak: 11

* Agent at vertex 0: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.99 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.57 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.01 and state INFECTED.
* Agent at vertex 12: peril 1.00, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: []

_Strategy:_ [0.3, 0.41, 0.01, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: [0, 1, 2]

_Infecting:_ 3 4 5 6 7 8 9 10 12 13 14 15 16 17 18 19 


 * S: []
 * I: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1, 2]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: []

_Strategy:_ [0.3, 0.41, 0.01, 0.28, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: [0, 1, 2]

_Infecting:_ 3 4 5 6 7 8 9 10 12 13 14 15 16 17 18 19 


 * S: []
 * I: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1, 2]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19]
 * I: [11]
 * R: []
 * P: []

_Strategy:_ [0.3, 0.0, 0.01, 0.0, 0.05, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0, 0.0, 0.33, 0.0]

 * S: [1, 3, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17, 19]
 * I: [11]
 * R: []
 * P: [0, 2, 4, 10, 18]

_Infecting:_ 1 3 5 6 7 8 9 12 13 14 15 16 17 19 


 * S: []
 * I: [1, 3, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 19]
 * R: []
 * P: [0, 2, 4, 10, 18]

__Nothing more to protect.__

Ending model with 5 protected and 15 infected vertices in 2 turns.



## Outbreak: 12

* Agent at vertex 0: peril 1.00, protection 0.11 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.09 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.84 and state INFECTED.
* Agent at vertex 13: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.88 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.61 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: []

_Strategy:_ [0.89, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: []

_Strategy:_ [0.89, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 13 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * I: [12]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.15, 0.27, 0.0, 0.0, 0.0, 0.0, 0.04, 0.11, 0.0, 0.13, 0.12, 0.0]

 * S: [0, 1, 2, 3, 5, 6, 7, 10, 11, 13, 14, 16, 19]
 * I: [12]
 * R: []
 * P: [4, 8, 9, 15, 17, 18]

_Infecting:_ 0 1 2 3 5 6 7 10 11 13 14 16 19 


 * S: []
 * I: [0, 1, 2, 3, 5, 6, 7, 10, 11, 12, 13, 14, 16, 19]
 * R: []
 * P: [4, 8, 9, 15, 17, 18]

__Nothing more to protect.__

Ending model with 6 protected and 14 infected vertices in 2 turns.



## Outbreak: 13

* Agent at vertex 0: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.40 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.24 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.51 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.45 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.81 and state INFECTED.
* Agent at vertex 14: peril 1.00, protection 0.93 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.12 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.39 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: []

_Strategy:_ [0.86, 0.14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: []

_Strategy:_ [0.86, 0.14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 14 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.31, 0.0, 0.0, 0.28, 0.34, 0.0, 0.07, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 16, 17, 18, 19]
 * I: [13]
 * R: []
 * P: [11, 12, 14]

_Infecting:_ 0 1 2 3 4 5 6 7 8 9 10 15 16 17 18 19 


 * S: []
 * I: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 16, 17, 18, 19]
 * R: []
 * P: [11, 12, 14]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 2 turns.



## Outbreak: 14

* Agent at vertex 0: peril 1.00, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.00 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.42 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.54 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.44 and state INFECTED.
* Agent at vertex 15: peril 1.00, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.34 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.06 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: []

_Strategy:_ [0.41, 0.59, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 13 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: []

_Strategy:_ [0.41, 0.59, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 13 15 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19]
 * I: [14]
 * R: []
 * P: []

_Strategy:_ [0.26, 0.0, 0.15, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34]

 * S: [0, 1, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18]
 * I: [14]
 * R: []
 * P: [2, 7, 19]

_Infecting:_ 0 1 3 4 5 6 8 9 10 11 12 13 15 16 17 18 


 * S: []
 * I: [0, 1, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * R: []
 * P: [2, 7, 19]

__Nothing more to protect.__

Ending model with 3 protected and 17 infected vertices in 2 turns.



## Outbreak: 15

* Agent at vertex 0: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.37 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.97 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.28 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.92 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.87 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.23 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.74 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.43 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.62 and state INFECTED.
* Agent at vertex 16: peril 1.00, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.43 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: []

_Strategy:_ [0.28, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: []

_Strategy:_ [0.28, 0.72, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: []

_Strategy:_ [0.28, 0.0, 0.0, 0.0, 0.03, 0.0, 0.0, 0.08, 0.22, 0.13, 0.0, 0.0, 0.26, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 5, 6, 8, 10, 11, 13, 14, 16, 17, 18, 19]
 * I: [15]
 * R: []
 * P: [0, 4, 7, 9, 12]

_Infecting:_ 1 2 3 5 6 8 10 11 13 14 16 17 18 19 


 * S: []
 * I: [1, 2, 3, 5, 6, 8, 10, 11, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 4, 7, 9, 12]

__Nothing more to protect.__

Ending model with 5 protected and 15 infected vertices in 2 turns.



## Outbreak: 16

* Agent at vertex 0: peril 1.00, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.76 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.84 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.32 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.79 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.68 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.71 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.55 and state INFECTED.
* Agent at vertex 17: peril 1.00, protection 0.52 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.80 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: []

_Strategy:_ [0.5, 0.17, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 6 7 8 9 10 11 12 13 14 15 17 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: []

_Strategy:_ [0.5, 0.17, 0.34, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 6 7 8 9 10 11 12 13 14 15 17 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19]
 * I: [16]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.17, 0.0, 0.0, 0.0, 0.04, 0.16, 0.0, 0.0, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.2]

 * S: [0, 2, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 17]
 * I: [16]
 * R: []
 * P: [1, 6, 11, 18, 19]

_Infecting:_ 0 2 3 4 5 7 8 9 10 12 13 14 15 17 


 * S: []
 * I: [0, 2, 3, 4, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17]
 * R: []
 * P: [1, 6, 11, 18, 19]

__Nothing more to protect.__

Ending model with 5 protected and 15 infected vertices in 2 turns.



## Outbreak: 17

* Agent at vertex 0: peril 1.00, protection 0.85 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.24 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.46 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.90 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.32 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.00 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.13 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.67 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.18 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.40 and state INFECTED.
* Agent at vertex 18: peril 1.00, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: []

_Strategy:_ [0.15, 0.64, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: []

_Strategy:_ [0.15, 0.64, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 18 19 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19]
 * I: [17]
 * R: []
 * P: []

_Strategy:_ [0.15, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.33, 0.0, 0.0, 0.34, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 15, 18]
 * I: [17]
 * R: []
 * P: [0, 6, 13, 16, 19]

_Infecting:_ 1 2 3 4 5 7 8 9 10 11 12 14 15 18 


 * S: []
 * I: [1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 15, 17, 18]
 * R: []
 * P: [0, 6, 13, 16, 19]

__Nothing more to protect.__

Ending model with 5 protected and 15 infected vertices in 2 turns.



## Outbreak: 18

* Agent at vertex 0: peril 1.00, protection 0.18 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.20 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.98 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.70 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.48 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.77 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.77 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.61 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.31 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.10 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.27 and state INFECTED.
* Agent at vertex 19: peril 1.00, protection 0.98 and state SUSCEPTIBLE.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: []

_Strategy:_ [0.82, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: []

_Strategy:_ [0.82, 0.18, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: [0]

_Infecting:_ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 19 


 * S: []
 * I: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0]

__Nothing more to protect.__

Ending model with 1 protected and 19 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19]
 * I: [18]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.02, 0.23, 0.0, 0.23, 0.0, 0.0, 0.0, 0.23, 0.0, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.02]

 * S: [0, 1, 2, 4, 5, 7, 8, 9, 11, 12, 13, 14, 16, 17]
 * I: [18]
 * R: []
 * P: [3, 6, 10, 15, 19]

_Infecting:_ 0 1 2 4 5 7 8 9 11 12 13 14 16 17 


 * S: []
 * I: [0, 1, 2, 4, 5, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18]
 * R: []
 * P: [3, 6, 10, 15, 19]

__Nothing more to protect.__

Ending model with 5 protected and 15 infected vertices in 2 turns.



## Outbreak: 19

* Agent at vertex 0: peril 1.00, protection 0.84 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.08 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.60 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.03 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.16 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.36 and state SUSCEPTIBLE.
* Agent at vertex 10: peril 1.00, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 11: peril 1.00, protection 0.19 and state SUSCEPTIBLE.
* Agent at vertex 12: peril 1.00, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 13: peril 1.00, protection 0.09 and state SUSCEPTIBLE.
* Agent at vertex 14: peril 1.00, protection 0.73 and state SUSCEPTIBLE.
* Agent at vertex 15: peril 1.00, protection 0.07 and state SUSCEPTIBLE.
* Agent at vertex 16: peril 1.00, protection 0.56 and state SUSCEPTIBLE.
* Agent at vertex 17: peril 1.00, protection 0.22 and state SUSCEPTIBLE.
* Agent at vertex 18: peril 1.00, protection 0.54 and state SUSCEPTIBLE.
* Agent at vertex 19: peril 1.00, protection 0.10 and state INFECTED.
#### Proximity to Infection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: []

_Strategy:_ [0.16, 0.27, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Greatest Degree Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: []

_Strategy:_ [0.16, 0.27, 0.57, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: [0, 1]

_Infecting:_ 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1]

__Nothing more to protect.__

Ending model with 2 protected and 18 infected vertices in 2 turns.



#### Highest Protection Defence

 * S: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: []

_Strategy:_ [0.16, 0.27, 0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.18, 0.0, 0.0, 0.0, 0.27, 0.0, 0.0, 0.0, 0.0, 0.0]

 * S: [2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 17, 18]
 * I: [19]
 * R: []
 * P: [0, 1, 10, 14]

_Infecting:_ 2 3 4 5 6 7 8 9 11 12 13 15 16 17 18 


 * S: []
 * I: [2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 17, 18, 19]
 * R: []
 * P: [0, 1, 10, 14]

__Nothing more to protect.__

Ending model with 4 protected and 16 infected vertices in 2 turns.



