# Readable results of SIRP defence strategies on a random graph

## Generating Erdős–Rényi Graph:
Our graph generator class has generated an Erdős–Rényi graph with the following parameters:
 * Number of vertices: 10
 * Number of edges: 17
 * Probability: 17 / (10 * (10 - 1) / 2) = 0.38
 * Random generator seed: 1615419373661

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
* Agent at vertex 0: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 1: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.33, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.50 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 5, 6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 8]

_Nothing infected._

 * S: [4, 5, 6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0, 0.0]


 * S: [6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 8]

_Nothing infected._

 * S: [6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5]


 * S: [7]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Nothing infected._

 * S: [7]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0]


 * S: []
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 7 turns.

#### Greatest Degree Defence


 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 5, 6, 7, 8, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3]

_Infecting:_ 8 

 * S: [4, 5, 6, 7, 9]
 * I: [0, 8]
 * R: []
 * P: [1, 2, 3]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0, 0.0]


 * S: [6, 7, 9]
 * I: [0, 8]
 * R: []
 * P: [1, 2, 3, 4, 5]

_Infecting:_ 6 

 * S: [7, 9]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5]


 * S: [7]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4, 5, 9]

_Nothing infected._

 * S: [7]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0]


 * S: []
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4, 5, 7, 9]

__Nothing more to infect.__
Ending model with 7 protected and 3 infected vertices in 7 turns.

#### Highest Protection Defence


 * S: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * I: [0]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 5, 6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 8]

_Nothing infected._

 * S: [4, 5, 6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 5, 6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 8]

_Nothing infected._

 * S: [4, 5, 6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.25, 0.75, 0.0, 0.0, 0.0, 0.0]


 * S: [6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 8]

_Nothing infected._

 * S: [6, 7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0]


 * S: [7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8]

_Nothing infected._

 * S: [7, 9]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5]


 * S: [7]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Nothing infected._

 * S: [7]
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0]


 * S: []
 * I: [0]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 11 turns.

## Outbreak: 1
* Agent at vertex 0: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 2: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 1.00 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 6, 7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 5, 9]

_Nothing infected._

 * S: [4, 6, 7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0]


 * S: [7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9]

_Nothing infected._

 * S: [7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]


 * S: []
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 4, 5, 6, 7, 8, 9]
 * I: [1]
 * R: []
 * P: [2, 3]

_Infecting:_ 0 5 9 

 * S: [4, 6, 7, 8]
 * I: [0, 1, 5, 9]
 * R: []
 * P: [2, 3]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0]


 * S: [7, 8]
 * I: [0, 1, 5, 9]
 * R: []
 * P: [2, 3, 4, 6]

_Infecting:_ 7 8 

 * S: []
 * I: [0, 1, 5, 7, 8, 9]
 * R: []
 * P: [2, 3, 4, 6]

__Nothing more to protect.__
Ending model with 4 protected and 6 infected vertices in 4 turns.

#### Highest Protection Defence


 * S: [0, 2, 3, 4, 5, 6, 7, 8, 9]
 * I: [1]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 6, 7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 5, 9]

_Nothing infected._

 * S: [4, 6, 7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 6, 7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 5, 9]

_Nothing infected._

 * S: [4, 6, 7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 5, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.75, 0.0, 0.0, 0.0]


 * S: [7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9]

_Nothing infected._

 * S: [7, 8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0]


 * S: [8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9]

_Nothing infected._

 * S: [8]
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]


 * S: []
 * I: [1]
 * R: []
 * P: [0, 2, 3, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 9 turns.

## Outbreak: 2
* Agent at vertex 0: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 3: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.50 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 7, 8]

_Nothing infected._

 * S: [0, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0, 0.0]


 * S: [6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8]

_Nothing infected._

 * S: [6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: []
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 7, 8]

_Nothing infected._

 * S: [0, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [1, 3, 4, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0, 0.0]


 * S: [6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8]

_Nothing infected._

 * S: [6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: []
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 5 turns.

#### Highest Protection Defence


 * S: [0, 1, 3, 4, 5, 6, 7, 8, 9]
 * I: [2]
 * R: []
 * P: []

_Strategy:_ [1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 7, 8]

_Nothing infected._

 * S: [4, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [4, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 7, 8]

_Nothing infected._

 * S: [4, 5, 6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.25, 0.75, 0.0, 0.0, 0.0, 0.0]


 * S: [6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8]

_Nothing infected._

 * S: [6, 9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0]


 * S: [9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8]

_Nothing infected._

 * S: [9]
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: []
 * I: [2]
 * R: []
 * P: [0, 1, 3, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 9 turns.

## Outbreak: 3
* Agent at vertex 0: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 4: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.50 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0]


 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Nothing infected._

 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0]


 * S: [8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7]

_Nothing infected._

 * S: [8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: []
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0]


 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Nothing infected._

 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0]


 * S: [8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7]

_Nothing infected._

 * S: [8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: []
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 5 turns.

#### Highest Protection Defence


 * S: [0, 1, 2, 4, 5, 6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: []

_Strategy:_ [0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Nothing infected._

 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0]


 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Nothing infected._

 * S: [6, 7, 8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.75, 0.0, 0.0]


 * S: [8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7]

_Nothing infected._

 * S: [8, 9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]


 * S: [9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8]

_Nothing infected._

 * S: [9]
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: []
 * I: [3]
 * R: []
 * P: [0, 1, 2, 4, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 9 turns.

## Outbreak: 4
* Agent at vertex 0: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 5: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 1.00 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 2, 5, 8]
 * I: [4]
 * R: []
 * P: [1, 3, 6, 7, 9]

_Nothing infected._

 * S: [0, 2, 5, 8]
 * I: [4]
 * R: []
 * P: [1, 3, 6, 7, 9]

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0]


 * S: [5, 8]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 6, 7, 9]

_Nothing infected._

 * S: [5, 8]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 6, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]


 * S: []
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 5 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 2, 5, 6, 7, 8, 9]
 * I: [4]
 * R: []
 * P: [1, 3]

_Infecting:_ 6 7 9 

 * S: [0, 2, 5, 8]
 * I: [4, 6, 7, 9]
 * R: []
 * P: [1, 3]

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0]


 * S: [5, 8]
 * I: [4, 6, 7, 9]
 * R: []
 * P: [0, 1, 2, 3]

_Infecting:_ 5 8 

 * S: []
 * I: [4, 5, 6, 7, 8, 9]
 * R: []
 * P: [0, 1, 2, 3]

__Nothing more to protect.__
Ending model with 4 protected and 6 infected vertices in 4 turns.

#### Highest Protection Defence


 * S: [0, 1, 2, 3, 5, 6, 7, 8, 9]
 * I: [4]
 * R: []
 * P: []

_Strategy:_ [1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [1, 2, 5, 8]
 * I: [4]
 * R: []
 * P: [0, 3, 6, 7, 9]

_Nothing infected._

 * S: [1, 2, 5, 8]
 * I: [4]
 * R: []
 * P: [0, 3, 6, 7, 9]

_Strategy:_ [0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [1, 2, 5, 8]
 * I: [4]
 * R: []
 * P: [0, 3, 6, 7, 9]

_Nothing infected._

 * S: [1, 2, 5, 8]
 * I: [4]
 * R: []
 * P: [0, 3, 6, 7, 9]

_Strategy:_ [0.0, 0.25, 0.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [5, 8]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 6, 7, 9]

_Nothing infected._

 * S: [5, 8]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 6, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0]


 * S: [8]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 9]

_Nothing infected._

 * S: [8]
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]


 * S: []
 * I: [4]
 * R: []
 * P: [0, 1, 2, 3, 5, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 9 turns.

## Outbreak: 5
* Agent at vertex 0: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 6: peril 0.33, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 0.33, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.50 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 4, 6, 8, 9]
 * I: [5]
 * R: []
 * P: [1, 2, 3, 7]

_Nothing infected._

 * S: [0, 4, 6, 8, 9]
 * I: [5]
 * R: []
 * P: [1, 2, 3, 7]

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: [6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 7]

_Nothing infected._

 * S: [6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.67, 0.0, 0.33, 0.0]


 * S: [8]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 9]

_Nothing infected._

 * S: [8]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0]


 * S: []
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 7 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 4, 6, 7, 8, 9]
 * I: [5]
 * R: []
 * P: [1, 2, 3]

_Infecting:_ 7 

 * S: [0, 4, 6, 8, 9]
 * I: [5, 7]
 * R: []
 * P: [1, 2, 3]

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: [6, 8, 9]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4]

_Nothing infected._

 * S: [6, 8, 9]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.67, 0.0, 0.33, 0.0]


 * S: [8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 9]

_Nothing infected._

 * S: [8]
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.34, 0.0]


 * S: []
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 9]

__Nothing more to infect.__
Ending model with 8 protected and 2 infected vertices in 7 turns.

#### Highest Protection Defence


 * S: [0, 1, 2, 3, 4, 6, 7, 8, 9]
 * I: [5]
 * R: []
 * P: []

_Strategy:_ [1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [2, 4, 6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 3, 7]

_Nothing infected._

 * S: [2, 4, 6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 3, 7]

_Strategy:_ [0.0, 0.0, 0.33, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [2, 4, 6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 3, 7]

_Nothing infected._

 * S: [2, 4, 6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 3, 7]

_Strategy:_ [0.0, 0.0, 0.17, 0.0, 0.83, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 7]

_Nothing infected._

 * S: [6, 8, 9]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.5]


 * S: [6, 8]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 9]

_Nothing infected._

 * S: [6, 8]
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.67, 0.0]


 * S: []
 * I: [5]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 9 turns.

## Outbreak: 6
* Agent at vertex 0: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.33, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 7: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 1.00, protection 1.00 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 2, 3, 5, 7]
 * I: [6]
 * R: []
 * P: [1, 4, 8, 9]

_Nothing infected._

 * S: [0, 2, 3, 5, 7]
 * I: [6]
 * R: []
 * P: [1, 4, 8, 9]

_Strategy:_ [0.5, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 5, 7]
 * I: [6]
 * R: []
 * P: [1, 2, 3, 4, 8, 9]

_Nothing infected._

 * S: [0, 5, 7]
 * I: [6]
 * R: []
 * P: [1, 2, 3, 4, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5, 0.0, 0.0]


 * S: [5]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 8, 9]

_Nothing infected._

 * S: [5]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 7 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 2, 3, 5, 7, 8, 9]
 * I: [6]
 * R: []
 * P: [1, 4]

_Infecting:_ 8 9 

 * S: [0, 2, 3, 5, 7]
 * I: [6, 8, 9]
 * R: []
 * P: [1, 4]

_Strategy:_ [0.5, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 5, 7]
 * I: [6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4]

_Infecting:_ 0 

 * S: [5, 7]
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5, 0.0, 0.0]


 * S: [5]
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4, 7]

_Nothing infected._

 * S: [5]
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4, 7]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4, 5, 7]

__Nothing more to infect.__
Ending model with 6 protected and 4 infected vertices in 7 turns.

#### Highest Protection Defence


 * S: [0, 1, 2, 3, 4, 5, 7, 8, 9]
 * I: [6]
 * R: []
 * P: []

_Strategy:_ [1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [1, 2, 3, 5, 7]
 * I: [6]
 * R: []
 * P: [0, 4, 8, 9]

_Nothing infected._

 * S: [1, 2, 3, 5, 7]
 * I: [6]
 * R: []
 * P: [0, 4, 8, 9]

_Strategy:_ [0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [1, 2, 3, 5, 7]
 * I: [6]
 * R: []
 * P: [0, 4, 8, 9]

_Nothing infected._

 * S: [1, 2, 3, 5, 7]
 * I: [6]
 * R: []
 * P: [0, 4, 8, 9]

_Strategy:_ [0.0, 0.25, 0.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [3, 5, 7]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 4, 8, 9]

_Nothing infected._

 * S: [3, 5, 7]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 4, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [5, 7]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 8, 9]

_Nothing infected._

 * S: [5, 7]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5, 0.0, 0.0]


 * S: [5]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 8, 9]

_Nothing infected._

 * S: [5]
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 7, 8, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [6]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 7, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 11 turns.

## Outbreak: 7
* Agent at vertex 0: peril 0.33, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 8: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 9: peril 0.50, protection 0.50 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 3, 6, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 4, 5]

_Nothing infected._

 * S: [0, 3, 6, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5, 0.0]


 * S: [0, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6]

_Nothing infected._

 * S: [0, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6]

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: [0]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Nothing infected._

 * S: [0]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Strategy:_ [0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 7 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 3, 5, 6, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 4]

_Infecting:_ 5 

 * S: [0, 3, 6, 8, 9]
 * I: [5, 7]
 * R: []
 * P: [1, 2, 4]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.5, 0.0]


 * S: [0, 8, 9]
 * I: [5, 7]
 * R: []
 * P: [1, 2, 3, 4, 6]

_Nothing infected._

 * S: [0, 8, 9]
 * I: [5, 7]
 * R: []
 * P: [1, 2, 3, 4, 6]

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: [0]
 * I: [5, 7]
 * R: []
 * P: [1, 2, 3, 4, 6, 8, 9]

_Nothing infected._

 * S: [0]
 * I: [5, 7]
 * R: []
 * P: [1, 2, 3, 4, 6, 8, 9]

_Strategy:_ [0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [5, 7]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 8, 9]

__Nothing more to infect.__
Ending model with 8 protected and 2 infected vertices in 7 turns.

#### Highest Protection Defence


 * S: [0, 1, 2, 3, 4, 5, 6, 8, 9]
 * I: [7]
 * R: []
 * P: []

_Strategy:_ [0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 3, 6, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 4, 5]

_Nothing infected._

 * S: [0, 3, 6, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 3, 6, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 4, 5]

_Nothing infected._

 * S: [0, 3, 6, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 4, 5]

_Strategy:_ [0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.75, 0.0, 0.0, 0.0]


 * S: [0, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6]

_Nothing infected._

 * S: [0, 8, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0]


 * S: [0, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8]

_Nothing infected._

 * S: [0, 9]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8]

_Strategy:_ [0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5]


 * S: [0]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Nothing infected._

 * S: [0]
 * I: [7]
 * R: []
 * P: [1, 2, 3, 4, 5, 6, 8, 9]

_Strategy:_ [0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [7]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 8, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 11 turns.

## Outbreak: 8
* Agent at vertex 0: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 1: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 2: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 3: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 4: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 5: peril 0.33, protection 0.33 and state SUSCEPTIBLE.
* Agent at vertex 6: peril 1.00, protection 1.00 and state SUSCEPTIBLE.
* Agent at vertex 7: peril 0.50, protection 0.50 and state SUSCEPTIBLE.
* Agent at vertex 8: peril 1.00, protection 1.00 and state INFECTED.
* Agent at vertex 9: peril 0.50, protection 0.50 and state SUSCEPTIBLE.

#### Proximity to Infection Defence


 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [3, 4, 5, 7, 9]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 6]

_Nothing infected._

 * S: [3, 4, 5, 7, 9]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 6]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.5, 0.0, 0.0]


 * S: [5, 7, 9]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 6]

_Nothing infected._

 * S: [5, 7, 9]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 6]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.5]


 * S: [5]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 9]

_Nothing infected._

 * S: [5]
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 6, 7, 9]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [8]
 * R: []
 * P: [0, 1, 2, 3, 4, 5, 6, 7, 9]

__Nothing more to infect.__
Ending model with 9 protected and 1 infected vertices in 7 turns.

#### Greatest Degree Defence


 * S: [0, 1, 2, 3, 4, 5, 6, 7, 9]
 * I: [8]
 * R: []
 * P: []

_Strategy:_ [0.0, 0.5, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


 * S: [0, 3, 4, 5, 6, 7, 9]
 * I: [8]
 * R: []
 * P: [1, 2]

_Infecting:_ 0 6 

 * S: [3, 4, 5, 7, 9]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.5, 0.0, 0.0]


 * S: [5, 7, 9]
 * I: [0, 6, 8]
 * R: []
 * P: [1, 2, 3, 4]

_Infecting:_ 9 

 * S: [5, 7]
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4]

_Strategy:_ [0.0, 0.0, 0.0, 0.0, 0.0, 0.67, 0.0, 0.0, 0.0, 0.0]


 * S: []
 * I: [0, 6, 8, 9]
 * R: []
 * P: [1, 2, 3, 4, 5, 7]

