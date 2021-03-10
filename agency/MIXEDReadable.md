# Readable results of SIRP defence strategies on a random graph

## Generating Erdős–Rényi Graph:
Our graph generator class has generated an Erdős–Rényi graph with the following parameters:
 * Number of vertices: 10
 * Number of edges: 17
 * Probability: 17 / (10 * (10 - 1) / 2) = 0.38
 * Random generator seed: 1615417968994

The generated graph is represented using the following adjacency matrix:

0: 0 1 0 1 0 0 0 0 1 0 

1: 1 0 1 0 0 1 0 0 0 1 

2: 0 1 0 1 0 0 0 1 1 0 

3: 1 0 1 0 1 1 0 0 0 0 

4: 0 0 0 1 0 0 1 1 0 1 

5: 0 1 0 1 0 0 0 1 0 0 

6: 0 0 0 0 1 0 0 0 1 1 

7: 0 0 1 0 1 1 0 0 0 0 

8: 1 0 1 0 0 0 1 0 0 0 

9: 0 1 0 0 1 0 1 0 0 0 


## Model values
The values used in the model are:
 * Total defence quota each turn: 1.0
 * Probability with which the infection propagates: 1.0

## Outbreak: 0
* Agent at vertex 0: peril 1.00, protection 0.68 and state INFECTED.
* Agent at vertex 1: peril 1.00, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.17 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.45 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.50, protection 0.91 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 1.00, protection 0.25 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.21 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [1, 2, 3, 4, 6, 8, 9]
 * I: [0]
 * R: []
 * P: [5, 7]

_Strategy:_ [0.0, 0.41, 0.0, 0.53, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0]


 * S: [2, 4, 6, 8, 9]
 * I: [0]
 * R: []
 * P: [1, 3, 5, 7]

_Infecting:_ 8 

 * S: [2, 4, 6, 9]
 * I: [0, 8]
 * R: []
 * P: [1, 3, 5, 7]

_Strategy:_ [0.0, 0.0, 0.83, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 6, 9]
 * I: [0, 8]
 * R: []
 * P: [1, 2, 3, 5, 7]

_Infecting:_ 6 

 * S: [4, 9]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 5, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.38, 0.0, 0.0, 0.0, 0.0, 0.62]


 * S: [9]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4, 5, 7]

_Infecting:_ 9 

 * S: []
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4, 5, 7]

__Nothing more to protect.__
Ending model with 6 protected and 4 infected vertices in 6 turns.

#### Greatest Degree Defence


 * S: [1, 2, 3, 4, 6, 8, 9]
 * I: [0]
 * R: []
 * P: [5, 7]

_Strategy:_ [0.0, 0.41, 0.06, 0.53, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [2, 4, 6, 8, 9]
 * I: [0]
 * R: []
 * P: [1, 3, 5, 7]

_Infecting:_ 8 

 * S: [2, 4, 6, 9]
 * I: [0, 8]
 * R: []
 * P: [1, 3, 5, 7]

_Strategy:_ [0.0, 0.0, 0.77, 0.0, 0.23, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 6, 9]
 * I: [0, 8]
 * R: []
 * P: [1, 2, 3, 5, 7]

_Infecting:_ 6 

 * S: [4, 9]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 5, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.32, 0.0, 0.0, 0.0, 0.0, 0.68]


 * S: [9]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4, 5, 7]

_Infecting:_ 9 

 * S: []
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4, 5, 7]

__Nothing more to protect.__
Ending model with 6 protected and 4 infected vertices in 6 turns.

#### Highest Protection Defence


 * S: [1, 2, 3, 4, 6, 8, 9]
 * I: [0]
 * R: []
 * P: [5, 7]

_Strategy:_ [0.0, 0.41, 0.0, 0.5, 0.0, 0.0, 0.09, 0.0, 0.0, 0.0]


 * S: [2, 3, 4, 8, 9]
 * I: [0]
 * R: []
 * P: [1, 5, 6, 7]

_Infecting:_ 3 8 

 * S: [2, 4, 9]
 * I: [0, 3, 8]
 * R: []
 * P: [1, 5, 6, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.55, 0.0, 0.0, 0.0, 0.0, 0.45]


 * S: [2, 9]
 * I: [0, 3, 8]
 * R: []
 * P: [1, 4, 5, 6, 7]

_Infecting:_ 2 

 * S: [9]
 * I: [0, 2, 3, 8]
 * R: []
 * P: [1, 4, 5, 6, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34]


 * S: []
 * I: [0, 2, 3, 8]
 * R: []
 * P: [1, 4, 5, 6, 7, 9]

__Nothing more to infect.__
Ending model with 6 protected and 4 infected vertices in 5 turns.

## Outbreak: 1
* Agent at vertex 0: peril 1.00, protection 0.27 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.79 and state INFECTED.
* Agent at vertex 2: peril 1.00, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.03 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.02 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.50, protection 0.82 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.39 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.97 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 2, 3, 4, 5, 7, 8, 9]
 * I: [1]
 * R: []
 * P: [6]

_Strategy:_ [0.73, 0.0, 0.25, 0.0, 0.0, 0.02, 0.0, 0.0, 0.0, 0.0]


 * S: [3, 4, 5, 7, 8, 9]
 * I: [1]
 * R: []
 * P: [0, 2, 6]

_Infecting:_ 5 9 

 * S: [3, 4, 7, 8]
 * I: [1, 5, 9]
 * R: []
 * P: [0, 2, 6]

_Strategy:_ [0.0, 0.0, 0.0, 0.97, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 7, 8]
 * I: [1, 5, 9]
 * R: []
 * P: [0, 2, 3, 6]

_Infecting:_ 4 7 

 * S: [8]
 * I: [1, 4, 5, 7, 9]
 * R: []
 * P: [0, 2, 3, 6]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.61, 0.0]


 * S: []
 * I: [1, 4, 5, 7, 9]
 * R: []
 * P: [0, 2, 3, 6, 8]

__Nothing more to infect.__
Ending model with 5 protected and 5 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [0, 2, 3, 4, 5, 7, 8, 9]
 * I: [1]
 * R: []
 * P: [6]

_Strategy:_ [0.0, 0.0, 0.25, 0.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 3, 4, 5, 7, 8, 9]
 * I: [1]
 * R: []
 * P: [2, 6]

_Infecting:_ 0 5 9 

 * S: [3, 4, 7, 8]
 * I: [0, 1, 5, 9]
 * R: []
 * P: [2, 6]

_Strategy:_ [0.0, 0.0, 0.0, 0.22, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 7, 8]
 * I: [0, 1, 5, 9]
 * R: []
 * P: [2, 3, 6]

_Infecting:_ 4 7 8 

 * S: []
 * I: [0, 1, 4, 5, 7, 8, 9]
 * R: []
 * P: [2, 3, 6]

__Nothing more to protect.__
Ending model with 3 protected and 7 infected vertices in 4 turns.

#### Highest Protection Defence


 * S: [0, 2, 3, 4, 5, 7, 8, 9]
 * I: [1]
 * R: []
 * P: [6]

_Strategy:_ [0.0, 0.0, 0.25, 0.0, 0.0, 0.06, 0.0, 0.18, 0.49, 0.03]


 * S: [0, 3, 4, 8]
 * I: [1]
 * R: []
 * P: [2, 5, 6, 7, 9]

_Infecting:_ 0 

 * S: [3, 4, 8]
 * I: [0, 1]
 * R: []
 * P: [2, 5, 6, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.87, 0.0, 0.0, 0.0, 0.0, 0.13, 0.0]


 * S: [3, 4]
 * I: [0, 1]
 * R: []
 * P: [2, 5, 6, 7, 8, 9]

_Infecting:_ 3 

 * S: [4]
 * I: [0, 1, 3]
 * R: []
 * P: [2, 5, 6, 7, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.98, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [0, 1, 3]
 * R: []
 * P: [2, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 7 protected and 3 infected vertices in 5 turns.

## Outbreak: 2
* Agent at vertex 0: peril 0.50, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 0.49 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.90 and state INFECTED.
* Agent at vertex 3: peril 1.00, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.99 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 0.50, protection 0.35 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.26 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.

#### Proximity to Infection Defence


 * S: [0, 1, 3, 4, 6, 7, 8]
 * I: [2]
 * R: []
 * P: [5, 9]

_Strategy:_ [0.0, 0.51, 0.0, 0.35, 0.0, 0.0, 0.0, 0.14, 0.0, 0.0]


 * S: [0, 4, 6, 7, 8]
 * I: [2]
 * R: []
 * P: [1, 3, 5, 9]

_Infecting:_ 7 8 

 * S: [0, 4, 6]
 * I: [2, 7, 8]
 * R: []
 * P: [1, 3, 5, 9]

_Strategy:_ [0.42, 0.0, 0.0, 0.0, 0.01, 0.0, 0.56, 0.0, 0.0, 0.0]


 * S: [6]
 * I: [2, 7, 8]
 * R: []
 * P: [0, 1, 3, 4, 5, 9]

_Infecting:_ 6 

 * S: []
 * I: [2, 6, 7, 8]
 * R: []
 * P: [0, 1, 3, 4, 5, 9]

__Nothing more to protect.__
Ending model with 6 protected and 4 infected vertices in 4 turns.

#### Greatest Degree Defence


 * S: [0, 1, 3, 4, 6, 7, 8]
 * I: [2]
 * R: []
 * P: [5, 9]

_Strategy:_ [0.0, 0.51, 0.0, 0.35, 0.01, 0.0, 0.0, 0.13, 0.0, 0.0]


 * S: [0, 6, 7, 8]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 5, 9]

_Infecting:_ 7 8 

 * S: [0, 6]
 * I: [2, 7, 8]
 * R: []
 * P: [1, 3, 4, 5, 9]

_Strategy:_ [0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0]


 * S: [6]
 * I: [2, 7, 8]
 * R: []
 * P: [0, 1, 3, 4, 5, 9]

_Infecting:_ 6 

 * S: []
 * I: [2, 6, 7, 8]
 * R: []
 * P: [0, 1, 3, 4, 5, 9]

__Nothing more to protect.__
Ending model with 6 protected and 4 infected vertices in 4 turns.

#### Highest Protection Defence


 * S: [0, 1, 3, 4, 6, 7, 8]
 * I: [2]
 * R: []
 * P: [5, 9]

_Strategy:_ [0.42, 0.0, 0.0, 0.35, 0.01, 0.0, 0.0, 0.22, 0.0, 0.0]


 * S: [1, 6, 7, 8]
 * I: [2]
 * R: []
 * P: [0, 3, 4, 5, 9]

_Infecting:_ 1 7 8 

 * S: [6]
 * I: [1, 2, 7, 8]
 * R: []
 * P: [0, 3, 4, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.65, 0.0, 0.0, 0.0]


 * S: []
 * I: [1, 2, 7, 8]
 * R: []
 * P: [0, 3, 4, 5, 6, 9]

__Nothing more to infect.__
Ending model with 6 protected and 4 infected vertices in 3 turns.

## Outbreak: 3
* Agent at vertex 0: peril 1.00, protection 0.69 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.53 and state INFECTED.
* Agent at vertex 4: peril 1.00, protection 0.83 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.64 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 8: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.

#### Proximity to Infection Defence


 * S: [0, 2, 4, 5]
 * I: [3]
 * R: []
 * P: [1, 6, 7, 8, 9]

_Strategy:_ [0.04, 0.0, 0.79, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 5]
 * I: [3]
 * R: []
 * P: [1, 2, 4, 6, 7, 8, 9]

_Infecting:_ 0 5 

 * S: []
 * I: [0, 3, 5]
 * R: []
 * P: [1, 2, 4, 6, 7, 8, 9]

__Nothing more to protect.__
Ending model with 7 protected and 3 infected vertices in 2 turns.

#### Greatest Degree Defence


 * S: [0, 2, 4, 5]
 * I: [3]
 * R: []
 * P: [1, 6, 7, 8, 9]

_Strategy:_ [0.04, 0.0, 0.79, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 5]
 * I: [3]
 * R: []
 * P: [1, 2, 4, 6, 7, 8, 9]

_Infecting:_ 0 5 

 * S: []
 * I: [0, 3, 5]
 * R: []
 * P: [1, 2, 4, 6, 7, 8, 9]

__Nothing more to protect.__
Ending model with 7 protected and 3 infected vertices in 2 turns.

#### Highest Protection Defence


 * S: [0, 2, 4, 5]
 * I: [3]
 * R: []
 * P: [1, 6, 7, 8, 9]

_Strategy:_ [0.31, 0.0, 0.16, 0.0, 0.17, 0.36, 0.0, 0.0, 0.0, 0.0]


 * S: [2]
 * I: [3]
 * R: []
 * P: [0, 1, 4, 5, 6, 7, 8, 9]

_Infecting:_ 2 

 * S: []
 * I: [2, 3]
 * R: []
 * P: [0, 1, 4, 5, 6, 7, 8, 9]

__Nothing more to protect.__
Ending model with 8 protected and 2 infected vertices in 2 turns.

## Outbreak: 4
* Agent at vertex 0: peril 0.50, protection 0.98 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.47 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.58 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.88 and state INFECTED.
* Agent at vertex 5: peril 0.50, protection 0.81 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 0.66 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 1.00, protection 0.05 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 3, 5, 6, 7, 9]
 * I: [4]
 * R: []
 * P: [8]

_Strategy:_ [0.0, 0.0, 0.0, 0.42, 0.0, 0.0, 0.58, 0.0, 0.0, 0.0]


 * S: [0, 1, 2, 5, 6, 7, 9]
 * I: [4]
 * R: []
 * P: [3, 8]

_Infecting:_ 6 7 9 

 * S: [0, 1, 2, 5]
 * I: [4, 6, 7, 9]
 * R: []
 * P: [3, 8]

_Strategy:_ [0.02, 0.53, 0.34, 0.0, 0.0, 0.1, 0.0, 0.0, 0.0, 0.0]


 * S: [5]
 * I: [4, 6, 7, 9]
 * R: []
 * P: [0, 1, 2, 3, 8]

_Infecting:_ 5 

 * S: []
 * I: [4, 5, 6, 7, 9]
 * R: []
 * P: [0, 1, 2, 3, 8]

__Nothing more to protect.__
Ending model with 5 protected and 5 infected vertices in 4 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 3, 5, 6, 7, 9]
 * I: [4]
 * R: []
 * P: [8]

_Strategy:_ [0.0, 0.53, 0.05, 0.42, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 2, 5, 6, 7, 9]
 * I: [4]
 * R: []
 * P: [1, 3, 8]

_Infecting:_ 6 7 9 

 * S: [0, 2, 5]
 * I: [4, 6, 7, 9]
 * R: []
 * P: [1, 3, 8]

_Strategy:_ [0.02, 0.0, 0.29, 0.0, 0.0, 0.19, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [4, 6, 7, 9]
 * R: []
 * P: [0, 1, 2, 3, 5, 8]

__Nothing more to infect.__
Ending model with 6 protected and 4 infected vertices in 3 turns.

#### Highest Protection Defence


 * S: [0, 1, 2, 3, 5, 6, 7, 9]
 * I: [4]
 * R: []
 * P: [8]

_Strategy:_ [0.02, 0.0, 0.34, 0.1, 0.0, 0.19, 0.0, 0.34, 0.0, 0.0]


 * S: [1, 3, 6, 9]
 * I: [4]
 * R: []
 * P: [0, 2, 5, 7, 8]

_Infecting:_ 3 6 9 

 * S: [1]
 * I: [3, 4, 6, 9]
 * R: []
 * P: [0, 2, 5, 7, 8]

_Strategy:_ [0.0, 0.53, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [3, 4, 6, 9]
 * R: []
 * P: [0, 1, 2, 5, 7, 8]

__Nothing more to infect.__
Ending model with 6 protected and 4 infected vertices in 3 turns.

## Outbreak: 5
* Agent at vertex 0: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 1.00, protection 0.95 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.15 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 0.07 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 5: peril 1.00, protection 0.23 and state INFECTED.
* Agent at vertex 6: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 1.00, protection 0.04 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.33, protection 0.78 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.

#### Proximity to Infection Defence


 * S: [1, 2, 3, 7, 8]
 * I: [5]
 * R: []
 * P: [0, 4, 6, 9]

_Strategy:_ [0.0, 0.05, 0.0, 0.93, 0.0, 0.0, 0.0, 0.02, 0.0, 0.0]


 * S: [2, 7, 8]
 * I: [5]
 * R: []
 * P: [0, 1, 3, 4, 6, 9]

_Infecting:_ 7 

 * S: [2, 8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 3, 4, 6, 9]

_Strategy:_ [0.0, 0.0, 0.85, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 0.0]


 * S: [8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 9]

_Nothing infected._

 * S: [8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.07, 0.0]


 * S: []
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 9]

__Nothing more to infect.__
Ending model with 8 protected and 2 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [1, 2, 3, 7, 8]
 * I: [5]
 * R: []
 * P: [0, 4, 6, 9]

_Strategy:_ [0.0, 0.05, 0.02, 0.93, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [2, 7, 8]
 * I: [5]
 * R: []
 * P: [0, 1, 3, 4, 6, 9]

_Infecting:_ 7 

 * S: [2, 8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 3, 4, 6, 9]

_Strategy:_ [0.0, 0.0, 0.83, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0]


 * S: [8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 9]

_Nothing infected._

 * S: [8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0]


 * S: []
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 9]

__Nothing more to infect.__
Ending model with 8 protected and 2 infected vertices in 5 turns.

#### Highest Protection Defence


 * S: [1, 2, 3, 7, 8]
 * I: [5]
 * R: []
 * P: [0, 4, 6, 9]

_Strategy:_ [0.0, 0.05, 0.73, 0.0, 0.0, 0.0, 0.0, 0.0, 0.22, 0.0]


 * S: [2, 3, 7]
 * I: [5]
 * R: []
 * P: [0, 1, 4, 6, 8, 9]

_Infecting:_ 3 7 

 * S: [2]
 * I: [3, 5, 7]
 * R: []
 * P: [0, 1, 4, 6, 8, 9]

_Strategy:_ [0.0, 0.0, 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [3, 5, 7]
 * R: []
 * P: [0, 1, 2, 4, 6, 8, 9]

__Nothing more to infect.__
Ending model with 7 protected and 3 infected vertices in 3 turns.

## Outbreak: 6
* Agent at vertex 0: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 0.50, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.79 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.44 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 1.00, protection 0.22 and state INFECTED.
* Agent at vertex 7: peril 0.50, protection 0.29 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 0.94 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 0.63 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [2, 3, 4, 7, 8, 9]
 * I: [6]
 * R: []
 * P: [0, 1, 5]

_Strategy:_ [0.0, 0.0, 0.01, 0.0, 0.56, 0.0, 0.0, 0.0, 0.06, 0.37]


 * S: [2, 3, 7]
 * I: [6]
 * R: []
 * P: [0, 1, 4, 5, 8, 9]

_Nothing infected._

 * S: [2, 3, 7]
 * I: [6]
 * R: []
 * P: [0, 1, 4, 5, 8, 9]

_Strategy:_ [0.0, 0.0, 0.56, 0.21, 0.0, 0.0, 0.0, 0.24, 0.0, 0.0]


 * S: [7]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 9]

_Nothing infected._

 * S: [7]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.47, 0.0, 0.0]


 * S: []
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [2, 3, 4, 7, 8, 9]
 * I: [6]
 * R: []
 * P: [0, 1, 5]

_Strategy:_ [0.0, 0.0, 0.44, 0.0, 0.56, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [2, 3, 7, 8, 9]
 * I: [6]
 * R: []
 * P: [0, 1, 4, 5]

_Infecting:_ 8 9 

 * S: [2, 3, 7]
 * I: [6, 8, 9]
 * R: []
 * P: [0, 1, 4, 5]

_Strategy:_ [0.0, 0.0, 0.13, 0.21, 0.0, 0.0, 0.0, 0.67, 0.0, 0.0]


 * S: [7]
 * I: [6, 8, 9]
 * R: []
 * P: [0, 1, 2, 3, 4, 5]

_Nothing infected._

 * S: [7]
 * I: [6, 8, 9]
 * R: []
 * P: [0, 1, 2, 3, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.05, 0.0, 0.0]


 * S: []
 * I: [6, 8, 9]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7]

__Nothing more to infect.__
Ending model with 7 protected and 3 infected vertices in 5 turns.

#### Highest Protection Defence


 * S: [2, 3, 4, 7, 8, 9]
 * I: [6]
 * R: []
 * P: [0, 1, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.21, 0.36, 0.0, 0.0, 0.0, 0.06, 0.37]


 * S: [2, 4, 7]
 * I: [6]
 * R: []
 * P: [0, 1, 3, 5, 8, 9]

_Infecting:_ 4 

 * S: [2, 7]
 * I: [4, 6]
 * R: []
 * P: [0, 1, 3, 5, 8, 9]

_Strategy:_ [0.0, 0.0, 0.56, 0.0, 0.0, 0.0, 0.0, 0.44, 0.0, 0.0]


 * S: [7]
 * I: [4, 6]
 * R: []
 * P: [0, 1, 2, 3, 5, 8, 9]

_Infecting:_ 7 

 * S: []
 * I: [4, 6, 7]
 * R: []
 * P: [0, 1, 2, 3, 5, 8, 9]

__Nothing more to protect.__
Ending model with 7 protected and 3 infected vertices in 4 turns.

## Outbreak: 7
* Agent at vertex 0: peril 0.33, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.65 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 0.14 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.75 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 0.21 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 0.55 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 7: peril 1.00, protection 0.53 and state INFECTED.
* Agent at vertex 8: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 3, 4, 5]
 * I: [7]
 * R: []
 * P: [6, 8, 9]

_Strategy:_ [0.0, 0.0, 0.86, 0.0, 0.14, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 1, 3, 4, 5]
 * I: [7]
 * R: []
 * P: [2, 6, 8, 9]

_Infecting:_ 4 5 

 * S: [0, 1, 3]
 * I: [4, 5, 7]
 * R: []
 * P: [2, 6, 8, 9]

_Strategy:_ [0.28, 0.35, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [4, 5, 7]
 * R: []
 * P: [0, 1, 2, 3, 6, 8, 9]

__Nothing more to infect.__
Ending model with 7 protected and 3 infected vertices in 3 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 3, 4, 5]
 * I: [7]
 * R: []
 * P: [6, 8, 9]

_Strategy:_ [0.0, 0.0, 0.86, 0.0, 0.14, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 1, 3, 4, 5]
 * I: [7]
 * R: []
 * P: [2, 6, 8, 9]

_Infecting:_ 4 5 

 * S: [0, 1, 3]
 * I: [4, 5, 7]
 * R: []
 * P: [2, 6, 8, 9]

_Strategy:_ [0.28, 0.35, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [4, 5, 7]
 * R: []
 * P: [0, 1, 2, 3, 6, 8, 9]

__Nothing more to infect.__
Ending model with 7 protected and 3 infected vertices in 3 turns.

#### Highest Protection Defence


 * S: [0, 1, 2, 3, 4, 5]
 * I: [7]
 * R: []
 * P: [6, 8, 9]

_Strategy:_ [0.28, 0.35, 0.0, 0.25, 0.0, 0.13, 0.0, 0.0, 0.0, 0.0]


 * S: [2, 4, 5]
 * I: [7]
 * R: []
 * P: [0, 1, 3, 6, 8, 9]

_Infecting:_ 2 4 5 

 * S: []
 * I: [2, 4, 5, 7]
 * R: []
 * P: [0, 1, 3, 6, 8, 9]

__Nothing more to protect.__
Ending model with 6 protected and 4 infected vertices in 2 turns.

## Outbreak: 8
* Agent at vertex 0: peril 1.00, protection 0.53 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 2: peril 1.00, protection 0.63 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.89 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.38 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.33, protection 1.00 and state PROTECTED.
* Agent at vertex 6: peril 1.00, protection 0.72 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.59 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 9: peril 0.50, protection 1.00 and state PROTECTED.

#### Proximity to Infection Defence


 * S: [0, 2, 3, 4, 6, 7]
 * I: [8]
 * R: []
 * P: [1, 5, 9]

_Strategy:_ [0.47, 0.0, 0.37, 0.0, 0.0, 0.0, 0.15, 0.0, 0.0, 0.0]


 * S: [3, 4, 6, 7]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 5, 9]

_Infecting:_ 6 

 * S: [3, 4, 7]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.11, 0.62, 0.0, 0.0, 0.27, 0.0, 0.0]


 * S: [7]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 9]

_Nothing infected._

 * S: [7]
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.14, 0.0, 0.0]


 * S: []
 * I: [6, 8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 9]

__Nothing more to infect.__
Ending model with 8 protected and 2 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [0, 2, 3, 4, 6, 7]
 * I: [8]
 * R: []
 * P: [1, 5, 9]

_Strategy:_ [0.0, 0.0, 0.37, 0.11, 0.52, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 4, 6, 7]
 * I: [8]
 * R: []
 * P: [1, 2, 3, 5, 9]

_Infecting:_ 0 6 

 * S: [4, 7]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 0.41, 0.0, 0.0]


 * S: []
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4, 5, 7, 9]

__Nothing more to infect.__
Ending model with 7 protected and 3 infected vertices in 3 turns.

#### Highest Protection Defence


 * S: [0, 2, 3, 4, 6, 7]
 * I: [8]
 * R: []
 * P: [1, 5, 9]

_Strategy:_ [0.0, 0.0, 0.37, 0.11, 0.0, 0.0, 0.28, 0.24, 0.0, 0.0]


 * S: [0, 4, 7]
 * I: [8]
 * R: []
 * P: [1, 2, 3, 5, 6, 9]

_Infecting:_ 0 

 * S: [4, 7]
 * I: [0, 8]
 * R: []
 * P: [1, 2, 3, 5, 6, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.62, 0.0, 0.0, 0.17, 0.0, 0.0]


 * S: []
 * I: [0, 8]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 9]

__Nothing more to infect.__
Ending model with 8 protected and 2 infected vertices in 3 turns.

## Outbreak: 9
* Agent at vertex 0: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 1: peril 1.00, protection 0.05 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 1.00 and state PROTECTED.
* Agent at vertex 3: peril 0.50, protection 0.16 and state SUSCEPTIBLE.
* Agent a