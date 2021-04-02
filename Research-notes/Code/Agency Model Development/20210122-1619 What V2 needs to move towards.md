Tags :   #AgencyModel #SIR #Java #AM_V1
Zettel :  20210122-1619
Status : #final

-----

# V1 update: What this version doesn't do

**Previous note:** [[20210122-1612 What V1 does]]

-----

### Questions & thoughts:

I've introduced no temporal stuff yet - the model doesn't yet know how to progress a time step, updating which vertices should burn and which it should protect (much more complicated to determine) - so vertices can't yet enter a recovered state, but I'll need to say how many turns it takes for an infected agent to become recovered (or indeed deceased, depending on context). I also need to update some of the existing methods to deal with this - e.g. `Model.getFires`, which currently only deals with a single source node for the contagion but of course I'll need to use this when a few things are burning. Another loop needed...

I really need to organise the classes much better, and perhaps refactor some names of methods and variables here and there.

Lots of methods can be simplified quite a bit, e.g. `Agent.setState()` could certainly do the same job in fewer lines of code, but I'm not too worried unless it stops working as intended.

I have various decisions to make in designing the model moving forward:
* BIG: How do we decide how to deploy our defensive moves?
    * In vanilla Firefighter, we protect discrete vertices permanently (they can't catch on fire again), but in the agency case I think it's far more useful to have some amount of protection we can deploy each turn such as 100% and then we can choose, say, 100% increase in protection rating for one agent or 50% for two agents or 25% for one, 75% for another and so on. We would need to choose carefully, and this more continuous approach would take some serious thought.
     * Could this then deal with two more complicating factors: (1) diminishing protection (e.g. people get bored and apathetic to the influence we exerted by, say, education or they run out of PPE that we provided, so their protection rating decreases as time goes on) and (2) effectiveness of influence - perhaps we apply a 75% increase in protection to an agent with a current protection of 25%, but it turns out they e.g. don't wear the masks we provided for them quite right, so that increase only ends up as 50% (although it still used 75% of our resources). How would this be determined, some kind of global probability or individual 'receptibility to influence' rating?
* How should I distinguish between peril being 1 because the agent is infected and peril being 1 because a susceptible agent is adjacent to an infected agent?
    * Not too important yet, but I want the model to have a propagation probability so that some combination of protection rating and this propagation probability will decide if a susceptible node will contract when adjacent to an infected node.
    * On that topic, how should we combine the protection rating and propagation probability to decide whether an agent contracts?
* Is there a better way to store the state of the graph as a whole than using a huge 2D array that grows by a column everytime we play a round, before I write the methods to update this behemoth-to-be?
* How should the recovered state work? That is, I should probably have some method that allows me to play with the properties of this state a little. Perhaps it grants the agent permanent immunity, or perhaps diminishing immunity. Perhaps it could even grant immunity but only from symptoms, meaning that (maybe after a certain length of time) some agent who has recovered from infection can contract the disease asymptomatically and then transmit the disease to others unknowingly, probably represented by a much lower protection rating and a new state like 'carrier' or such like.

-----
 
**Consider:** There are also some things to consider that are less immediate.
* Long-term, I want to use some more interesting graphs than the little ones I use to test. How could this best be done? I'm currently thinking of initialising a huge grid of vertices and using percolation to randomise who has edges to who.
    * Hopefully, this would be a bit more useful in the results yielded but for the time being I'll keep using graphs that test everything I need to test and use the least computational power so I can test quickly.
* How should we represent and analyse the results from the model? That is, what sorts of methods should I come up with that tell us e.g. how many turns it takes to contain the fire on graphs of particular size, how effective certain strategies are and so on. I suppose that this question is more about what exactly the best analytical use of this model is, what aspects of the results that could be obtained would be most interesting to extract and pick apart in some written work.