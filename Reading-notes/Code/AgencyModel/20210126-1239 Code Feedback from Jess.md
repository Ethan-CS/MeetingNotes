Tags :   #Code #Java #AgencyModel #Feedback
Zettel :  20210126-1239
Status : #final

-----

# Existing Code Feedback from Jess

**Previous note:** [[Programming Overview]], [[20210122-1619 What V2 needs to move towards]], [[20210126-1220 Design Feedback from Jess]]

-----

### Questions & thoughts:


 1. `Agent.java`:
	-   On peril: is it intentional that we only consider the closest infection? (A fine choice, but just wanted to check). Could also do something like overall number of infections within some radius.
	-   Question on `setState` - this updates based on a graph state? It’s not progression of infection I think, right?
2. `Graph.java`:
	-   You probably know, but you could use a few more comments in this and other code. No special rush, will appear in the fullness of time, I’m sure. Do you like to use a commenting scheme, like javadoc or similar?
	-   This comment on line 73 doesn’t make obvious sense: “// Shortest path set contains vertices that have shortest path” - but I imagine expanded comments would help.
	-   I imagine `shortestPath` might be a good candidate for early careful testing
3. `Model.java`:
	-   Not a change for now, but maybe to think about later: in cases with relatively little burning, may be faster to maintain a list of burning vertices and traverse it instead/in addition to traversing the whole state.
4. `ModelState.java`:
	-   Should `adjMatrix` live here, or live inside `Graph` and be accessed there? No strong opinion, but think about it
	-   0 -> open; 1 -> defended; 2 -> burning. Consider making these values named constants
	-    `// Value of 1 if vertex (index) is burning, 0 otherwise (defended or open)` - similar to above, consider a named variable, makes code easier to come back to and understand later


-----
 
**Consider:** In general: where do you think your biggest challenge/most likely bugs are in this code? Could use this to target test cases and code review effort.


**Source:** Message from Jess
