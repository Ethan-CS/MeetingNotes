Tags :    #Results #AgencyModel 
Zettel :  20210402-1049
Status : #triage 

-----

# Graphs of Model Results

**Previous note:** [202117041541 Preferential Attachment model results](202117041541%20Preferential%20Attachment%20model%20results.md)

**How these models work:** [202104021049 How Agency-Based Models Work](202104021049%20How%20Agency-Based%20Models%20Work.md)

-----

## Model Results: Barabási–Albert-Generated Preferential Attachment Graphs

For each increment, 10 graphs are generated. For each of these ten graphs, we cycle through each vertex - we let that vertex be the source node, begin infection, perform defence, determine new infections and so on until the infection is contained. We increment through minimum degrees from 1 to a maximum of 4.

-----

### Deterministic protection allocation

* In the deterministic case, the proximity and protection strategies are incredibly similar because protection is allocated based entirely on proximity to closest infection.
* This means any defence based on protection is in fact based on proximity. 
* However, there is a key difference between the two strategies:
	*  In proximity-based defence, we break ties based on the _degree_ of vertices,
	*  In defence based on protection, _we do not break ties,_ meaning ties are broken by whoever is lexicographically first. 
*  In some cases, defence based on degree may not do very well as a defence strategy, meaning breaking ties on degree presumably also is not a great choice. 
*  There are also cases where there aren't many ties to break when considering proximity, owing to graph structure and current progression of the contagion.

-----


![](Results/202117041543%20charts/percent_infected/1%20-%204/boxplots/Deterministic.jpg)

![](Results/202117041543%20charts/percent_infected/1%20-%204/violinplots/Deterministic.jpg)

![](Results/202117041543%20charts/winners/1%20-%204/Deterministic.jpg)

-----

### Mixed protection allocation

The mixed protection allocation involves assigning each agent a baseline pseudo-random number as their protection rating and allowing this to increase as their proximity to fire increases. This represents some variation in the baseline protective inclinations of individuals and the observed behaviour that, as infection becomes perceivably closer to the individual, their protective inclinations (wearing PPE, avoiding physical contact, etc.) increase.

-----

![](Results/202117041543%20charts/percent_infected/1%20-%204/boxplots/Mixed.jpg)

![](Results/202117041543%20charts/percent_infected/1%20-%204/violinplots/Mixed.jpg)

![](Results/202117041543%20charts/winners/1%20-%204/Mixed.jpg)

-----

### Random protection allocation

Random protection allocation involves each agent being assigned an entirely (pseudo-)random number to represent their intrinsic inclination towards defence against the contagion propagating through the graph.

-----


![](Results/202117041543%20charts/percent_infected/1%20-%204/boxplots/Random.jpg)

![](Results/202117041543%20charts/percent_infected/1%20-%204/violinplots/Random.jpg)

![](Results/202117041543%20charts/winners/1%20-%204/Random.jpg)

-----
