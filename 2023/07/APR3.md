# PHD MEETING

__Meeting: APR3__
24-07-2023

[< Previous]() | [Next >]()

_Oana Andrei, Ciaran McCreesh, Ethan Hunter_


## 1. Admin

My Campus - looks as though I haven't done mandatory training, but I have (just did not enter the dates as have already done this for last two years).


## 2. Research

Oana:
 - Stop saying lack of CS background.
 - Def 3.1 Interaction Function - not clear.
 - Def 3.4
 - P8 and 9 need to justify change between 25 and 20 vertices.
 - Be clear about narrative - how do the topics in thesis structure relate?
	 - Ciaran has given me a book by Steven Pinker called The Sense of Style to improve my writing style
	 - Classical versus technical style - writing at least partially in classical style can help stand out
 - Spend less time on definitions, more on background and motivation.

Implementation of Firefighter - Ciaran.
 - How am I doing this comparison? Can't just be generate a load of random graphs and compare, this is viewed sceptically on IP/CP side.
 - IP probably won't perform well. Neither CP nor IP inherently understand dominating relationships. Dynamic programming may work - to Ciaran, this feels more like a DP problem. CP more when we can make logical inferences about constraints, DP more for lots of different ways to reach similar state.
	 - Could prove a dominance relation, which would be a substantial contribution.
 - One approach: decision diagrams combine CP and DP - inference from CP solver and state merging from DP solver.
 - Another possible approach: classical planning, the PSPACE equivalent of CP. These solvers understand dominance.
 - Would be helpful to plan carefully what would be published in a comparison between parameterised alg and FPT.
 - Frazer - former postdoc at St Andrew's - did some CP models of Firefighter for Jess.
 - Possible would need to collaborate to publish anything on 

Advice from Ciaran:
 - CP Coursera course 'modelling for discrete optimisation' - how to write models. No good resource on how a solver actually works for people who understand modelling. No nice shortcut! 
 - IP mostly trade-secret solvers. Some heuristics, e.g. linear relaxation.
 - Get to a state where I can comfortably model things in CP (why write in different ways for different solving paradigms).
 - CP solvers can show you what they're doing e.g. printing entire search tree. Then you check for sensibility, understand what constraints are doing and improve from there. Firefighter may be a run it and see instance.
 - Jess may know enough about DP to get me started.
 - CP/DP -> Ciaran, Planning -> download research software, IP -> David and students.
 - IP/CP hybrid language called haddock (?)
 - May take some time to learn the modelling language. Hopefully not too much of a problem.
 - Research software training - workshops called **software carpentry** - how do you run experiments, collect data, etc.? Look into this, could be helpful in setting up infrastructure for large problem instances.

Teaching allocation? Speak to Oana about Practical algorithms course.
may need to push back against allocation - at least one day a week guaranteed to be free for research. Say e.g. 40% pick three days, do admin on those days and 2 days on research solid.



_EH 15:15 24-07-23_
