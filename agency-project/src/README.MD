# 02-01-2021

## What it does

So far, from the previous versions, I've made the following significant changes:
* Overhauled the entire project, considering each individual model and attribute and removing any unnecessary `static` declarations and simplifying logic.
* Removed `ModelState` and wrote any relevant methods into the most appropriate classes. This may return in future, as `Model` has now become enormous, but for the time being I was unahppy enough with the name `ModelState` that it had to go.
* Added extensive comments, specificaly Javadoc for each class, constructor and method. I may have gone a little overboard, so some of this could be improved for conciseness in future.
* Added methods for protection and infection:
    * Infection: we take a probability of infection as a parameter of the method, then look at each susceptible agent. If a given susceptible agent is a neighbour of an infected agent, we decide whether it contracts the infection based on both the probability of infection and the current protection rating of the agent.
    * Defence: we take a total defence "quota" as a parameter, and currently distribute this in the following way. We first find the agent(s) with highest peril rating(s) and try and increase their protection(s) by the total defence amount. If this increase would result in a protection going over 1, we increase that protection to 1 and redistribute the remaining defence amount. Then, if we have any defence amount remaining, we find the agent(s) with the next highest peril rating(s) and repeat the process until we have no remaining defence amount.
* When we run the model, it alternates between infecting and protecting until there are no further susceptible agents. The model then ends.


## What it doesn't do

I haven't yet included any methods that track information that would be useful for analysis, all that happens currently is that the model prints the currently susceptible, infected, recovered and protected vertices per turn. I need to consider what information to maintain and use to analyse the model, but I have some ideas.


Further, the model does not currently use the recovered state or reduce protection ratings over time - I plan on creating methods that imlpement a decay in protection. That is, after a cerain number of turns (or even immediately), an agent that was protected transitions back to susceptible with some given rate of reduction in their protection rating. Similarly, infected agents need to leave that state and transition to recovered with some defined rate (e.g. after 5 turns). These should be flexible enough to easily change depending on the contagion we are interested in modelling.
