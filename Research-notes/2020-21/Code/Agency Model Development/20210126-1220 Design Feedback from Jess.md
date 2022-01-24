Tags :   #Design #AgencyModel
Zettel :  20210126-1220
Status : #triage 

-----

# Design Feedback from Jess

**Previous note:** [[Programming Overview]], [[20210122-1619 What V2 needs to move towards]]

-----

### Questions & thoughts:

_How protection should work:_
-   Idea about increasing percentage protection is a good one - almost like deploying communication resources/exerting influence in some way.
-   In addition to coding this, you could also in the longer term think about some theoretical algorithmic aspects, for example this is almost certain to be a formally hard problem, but there may be some cases where we can optimally deploy this protect (e.g. paths?)
-   I also like the idea of fading protection, or different costs to influence. Probably not next on the agenda, since it seems so complicated, but a medium-term goal?


_Distinguishing between reasons for peril of 1_
-   This (and whether it is important) will depend on exactly how we use peril. **Discuss at meeting? Might be good to talk through an example?**
-   On deciding probability of transmission - we should just pick a reasonable function and start with it - if software is designed reasonably, it will be easy to change later.


Efficient representation of graph state:
-   Hmm, this may need some thought. There will be more compact ways of representing it, but may or may not be worth it depending on the computation bottlenecks


Recovered state:
-   If you implement decay from recovered back to susceptible and want to run experiments in which recovery gives perfect immunity, could always just set decay rate to 0


More interesting graphs:
-   Doing your own percolation is an option, but there are probably also graph generators available (there definitely are in python, I’d be surprised if there weren’t in Java) - might be easier to deal with them? Have you looked at a few favourite classes, like Erdos-Renyi, preferential attachment, random geometric, etc?


How to represent and analyse results:
-   Good question - always a good idea to think of what the figures will look like if the research is brilliantly successful! Starting points might be time to containment, total percentage burn?


-----
 
**Consider:** Several questions here to consider, and lots of things I can start implementing straight away.


**Source:** Message from Jess.
