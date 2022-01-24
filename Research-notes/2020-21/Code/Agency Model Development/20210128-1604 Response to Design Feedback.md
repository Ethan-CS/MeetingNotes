Tags :   #Response #Code #AgencyModel #AM_V2
Zettel :  20210128-1604
Status : #triage 

-----

# Response to Design Feedback from Jess

**Previous note:** [[20210126-1220 Design Feedback from Jess]]

-----

### Questions & thoughts:

#### How protection should work.

> Idea about increasing percentage protection is a good one - almost like deploying communication resources/exerting influence in some way.
> In addition to coding this, you could also in the longer term think about some theoretical algorithmic aspects, for example this is almost certain to be a formally hard problem, but there may be some cases where we can optimally deploy this protection (e.g. paths?)
> I also like the idea of fading protection, or different costs to influence. Probably not next on the agenda, since it seems so complicated, but a medium-term goal?

All important considerations I think, they're certainly worth considering and hopefully implementing further down the line!

#### Distinguishing between reasons for peril of 1

> This (and whether it is important) will depend on exactly how we use peril. Discuss at meeting? Might be good to talk through an example?
> On deciding probability of transmission - we should just pick a reasonable function and start with it - if software is designed reasonably, it will be easy to change later.

I'll try and come up with some example(s) for the next meeting, so that we can discuss how exactly we should use peril and therefore whether it should matter why it's 1 or not. Importantly,  I think this will become clearer when I change the values in the graph state matrix to named variables.


#### Efficient representation of the graph state

> Hmm, this may need some thought. There will be more compact ways of representing it, but may or may not be worth it depending on the computation bottlenecks

Definitely worth keeping in mind, but nothing too urgent I shouldn't think.


#### Recovered state

> If you implement decay from recovered back to susceptible and want to run experiments in which recovery gives perfect immunity, could always just set decay rate to 0

Great, I'll have a crack at some kind of decay rate that determines when someone goes from recovered to susceptible - perhaps a number of turns, or a variable percentage decrease in protection each turn until back below some significant level? Another question then: **How/when do we decide someone has changed from susceptible to protected - significant protection level?**


#### More interesting graphs

> Doing your own percolation is an option, but there are probably also graph generators available (there definitely are in python, I’d be surprised if there weren’t in Java) - might be easier to deal with them? Have you looked at a few favourite classes, like Erdos-Renyi, preferential attachment, random geometric, etc?

I'll start with percolation in that case, since I already have some code for it. After that, I'll for sure try and find some Java graph generators but I don't want to spend more time than it's worth getting those to play nice with my code. Hence, I'll try looking at those graph classes and how they usually pan out in vanilla firefighter to see if there's any I could/should commit to implementing for this model


#### How to represent and analyse results

> Good question - always a good idea to think of what the figures will look like if the research is brilliantly successful! Starting points might be time to containment, total percentage burn?

Great, thank you - I'll start by storing those, probably percentage burn would be the easiest and most useful to start with so I'll give that a go.


-----
 
**Consider:** Several TODOs above to consider and begin implementing (when finished preliminary planning).
