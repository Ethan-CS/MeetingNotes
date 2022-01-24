Tags :    #Results #AgencyModel 
Zettel :  20210402-1049
Status : #triage 

-----

# How our Agency-Based Models Work

-----

## Agents

Each agent has four attributes:
* Vertex (location in the graph)
* Peril (function of proximity to infection - the amount of danger they're in)
* Protection (inherent inclination to avoid infection - various allocation methods)
* State (Susceptible, Infected, Recovered, ...)

Initialisation of a new agent follows this process:

```mermaid

%% Mermaid.js graph - rendered in Obsidian automatically, may not appear
%% in other editors!
graph TD
	%% Initialise a new agent
	A([Initialise Agent]) --> B(Allocate to a vertex);
	
	%% Is the agent infected (usually source vertex)?
	B --> B1{Currently infected?};
	
	%% Yes - just set state to infected
	B1 -->|Yes| B2[State -> Infected];

	%% No - is there a path between them and an infected agent?
	B1 -->|No| C{Pathway to infection?};

	%% Yes - calculate peril, set to susceptible
	C -->|Yes| D[Calculate peril];
	D --> E([Allocate protection]);
	E --> F[State -> Susceptible];

	%% No - set peril to 0, set state to protected
	C -->|No| G[Peril = 0];
	G --> H[Protection = 1];
	H --> I[State -> Protected];
	
```

-----

## Protection allocation

There are three methods of protection allocation at present:
1. __Deterministic:__ sets the inherent protection rating of each agent equal to their peril rating, which is a function of proximity to the closest infected vertex.
2. __Mixed:__ begins with a baseline (pseudo-)random number for protection, which is then allowed to increase with proximity to closest infection.
3. __Random:__ sets the protection ratings equal to a (pseudo-)randomly generated number.

```mermaid

graph TD;
	%% Allocating protection to vertices
	A([Protection Allocation]) --> B{Which method?};
	
	%% Deterministic
	B -->|Deterministic| C[Protection = Peril]
	
	%% Mixed
	B -->|Mixed| D[Generate Random Number, Rand]
	D --> D1[Get Peril]
	D1 --> D2{Rand + Peril > 1?} 
	D2 -->|True| D3[Protection = 1]
	D2 -->|False| D4[Protection = Rand+Peril]
	
	%% Random
	B -->|Random| E[Generate random number, rand]
	E --> E1[Protection = Rand]

```

-----

## Defence strategies

* Defence is the way in which we try to contain the infection in the graph model of disease. 
* In vanilla _Firefighter,_ defence generally entails defending a single vertex each round.
*  In our agency-based stochastic formulation of _Firefighter,_ we are given a quota of defence available that we can distribute according to some particular strategy. 
 
We have three currently available defence strategies:
1. __Degree:__  finds the vertex or vertices with highest degree and defends them, breaking ties based on proximity to closest infection.
2. __Proximity:__ finds the vertex or vertices in closest proximity to closest infection and defends them, breaking ties based on degree.
3. __Protection:__ finds the vertex or vertices with highest protection rating and defends them, without breaking ties.

```mermaid

graph TD;
	%% Implementing defence strategies
	A([Defence Strategy]) --> B{Which strategy?};
	
	%% Degree
	B -->|Degree| Deg1[Find largest degree]
	Deg1 --> Deg2{More than one?}
	Deg2 -->|Yes| Deg3[Select closest to infection] --> Defend
	Deg2 -->|No| Defend
	
	%% Proximity
	B -->|Proximity| Prox1[Find closest to infection]
	Prox1 --> Prox2{More than one?}
	Prox2 -->|Yes| Prox3[Select greatest degree] --> Defend
	Prox2 -->|No| Defend
	
	%% Protection
	B -->|Protection| Prot1[Find highest protection]
	Prot1 -->Defend

```

-----

## Winning strategy

Note: the 'winners' of each model are decided based on the following criteria (which can result in two or three of the defence strategies 'winning' a particular model) -
- First, choose the defence strategy/strategies that resulted in the _fewest infected vertices._
- If there is more than one such strategy, select the strategy/strategies that achieved this in the _shortest time_ (smallest number of turns).
- If there is more than one such strategy, select the strategy/strategies that achieved this with the _greatest number of protected vertices_ (this becomes more significant when we utilise further states such as 'recovered').

```mermaid
graph LR;
 	id1([Fewest Infected]) -->
	id2([Shortest time]) -->
	id3([Greatest protections]);
```

-----