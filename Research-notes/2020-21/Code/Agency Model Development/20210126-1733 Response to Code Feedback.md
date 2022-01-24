Tags :   #Code #Java #AgencyModel #Response
Zettel :  20210126-1733
Status : #triage 

-----

# Response to Code Feedback from Jess

**Previous note:** [[20210126-1239 Code Feedback from Jess]]

-----

### Questions & thoughts:

#### 1. `Agent.java`

>On peril: is it intentional that we only consider the closest infection? (A fine choice, but just wanted to check). Could also do something like overall number of infections within some radius.

Peril: will add method to determine peril based on overall number of infections closer than $n$ vertices away to the TODO list. As well as current method or instead of? That is, could we use this to contribute to the peril rating or would this be instead of the current shortest path to closest infected vertex contribution?

> Question on `setState` - this updates based on a graph state? It’s not progression of infection I think, right?

Currently, `setState()` is being used just to initialise the state. It sets state to defended if there's no conceivable way of the agent contracting, infected if it's the source node and susceptible otherwise, so yes you're right all it bases the assignment on is the (initial) state of the graph and the source node location. I *don't yet have a mechanism to update state further than round 0!*


#### 2. `Graph.java`

> You probably know, but you could use a few more comments in this and other code. No special rush, will appear in the fullness of time, I’m sure. Do you like to use a commenting scheme, like Javadoc or similar?

Completely right, I've been rubbish with comments. I've gone through and added Javadoc comments to every method in every class plus some in  the Enum. That's helped me keep my head a lot clearer and simplified/tidied up my code a lot.

> This comment on line 73 doesn’t make obvious sense:
> `// Shortest path set contains vertices that have shortest path”`
> but I imagine expanded comments would help.

Again, totally agree and I've now addressed this - hopefully, the `shortestPath()` method makes more sense now! 

>  I imagine `shortestPath` might be a good candidate for early careful testing

Definitely - I've now set up a `JUnit` test and just need to remember how to use them now!


#### 3. `Model.java`

> Not a change for now, but maybe to think about later: in cases with relatively little burning, may be faster to maintain a list of burning vertices and traverse it instead/in addition to traversing the whole state.

This is also now on the TODO list, I think it's an important optimisation for lots or little burning - thanks! I'll just try to develop a working version of the project first and then come back to this, but it shouldn't take too much work (class attribute?).


#### 4. `ModelState.java`

> Should `adjMatrix` live here, or live inside `Graph` and be accessed there? No strong opinion, but think about it

Definitely, it made no sense in `ModelState` - not entirely sure how or why it ended up there... It's now in `Graph` and both have been tidied up a bit. Thanks!

> 0 -> open; 1 -> defended; 2 -> burning. Consider making these values named constants

That would definitely make sense, plus it gives me the option to add more than just those three states (i.e. each state in the Enum) if I use a 2d string array or named variables rather than hard-coding in the numbers. This is also on the list!

-----
 
**Consider:**


**Source:** 


**Reference:** 
