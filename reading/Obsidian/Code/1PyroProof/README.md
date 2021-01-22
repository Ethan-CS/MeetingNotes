# Firefighting-Problem-Demo
Summary: An interective demo of my proof for containing the 1-pyro, an extension of the firefighting problem.

In the Firefighter Problem, a fire begins on a single vertex on a graph and expands to every unprotected adjacent vertex
on each of it's turns. After each of the fire's turns, a firefighter can protect some set number, n, of vertices. In this problem, given some set graph and number n, the firefighter can attempt to completely contain the fire  while minimizing the time it takes to do so or the number of burnt vertices or both or contain it within a certain fraction of the graph.

Two summers ago, I worked with Dr. Margaret-Ellen Messinger on an extension of this problem: the 1-pyro Firefighting 
problem. In our research, we used the cartesian plane as our graph and n as 1. The difference between this extension 
and the original problem is that the fire is what we denoted a 1-pyro. Rather than being able to burn from every possible vertex that is burning on each turn, the fire can only choose one. Our research was to determine whether or not such a fire could be contained by a firefighter only able to protect one vertex each turn.

Our strategy was to consider a huge group of points all an equal distance away from the fire that are encircling it. On the cartesian plane, this would be a diamond. As the fire started to expand, one could protect the points on it arbitrarily. As the fire neared any part of the diamond, the firefighter could focus on protecting vertices on the diamond closest to where the fire came. We showed that it is impossible to contain the fire protecting along the edges of a diamond of distance 6 from the origin. We were able to prove that by following a very specific algorithm, the fire can always be contained within a diamond of size 7.

Our algorithm focused on assigning threat values to points on the diamond at distance 5, D5. Based on which areas were most threatened, the algorithm would pick which vertex should be protected on each turn.

This GUI demonstrates our algorithm by showing the 1-pyro problem with a fire that can either be random or user played and a firefighter that can either be user played, follow the algorithm, or randomly protect along D7. 
