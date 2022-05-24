# MEETING WITH ISTVAN KISS

12:00 20-05-2022

[< Previous](51_17-05-22) | [Next >]()

_I. Z. Kiss,_
_Jess Enright,_
_Ethan Kelly_


## 1. Admin

This meeting was requested by Jess, on Ethan's behalf, to discuss some questions about Istvan's work on systems of equations describing compartmental models on graphs. The questions are outlined [here.](https://hackmd.io/@2dkYNbTEQqSgWui5OwM4MA/SkggSlbwc) 

## 2. Research

Istvan detailed to Ethan the difference in equation generation done when working on the papers and the procedure he is using. In particular, the equations 'generate themselves:'
- Start with equations for singles (equations for all vertices being in all relevant states)
- While tuples are shorter than the number of vertices in the graph:
	- Look through equations already generated
	- If any tuples appear in those equations that have not yet had an equation generated for them, generate an equation for them

Istvan also confirmed that the discrepancy between the reported 10 equations for the reduced system for the toast network (and Ethan's reproduced system containing 12 equations) is likely to be a typo in the paper and the reduced system should in fact contain 12 equations, because of the inclusion of the equations for closures.

Istvan noted that Kieran Sharkey wrote some code generating the equations for the procedure they have been discussing. Ethan and Jess agreed they should go away and look at this code, which is written in Matlab, to understand how Ethan's currently differs and where he can build on this combined codebase in novel directions.

As part of a broader discussion on what Ethan has been working on in his PhD, Istvan, Jess and Ethan discussed protection allocation. Ethan worked on this last year and Istvan has also worked on a similar idea (which he called awareness, rather than protection). Istvan pointed to two papers on this, one is perhaps more relevant to Ethan as it uses a compartmental modelling framework (while the other does not). Istvan also suggested looking up papers by Sebastian Funk on a similar topic from around 10 years ago.

The group discussed Ethan's plan to extend Istvan's single-vertex cut-set result to larger (clique) cut-sets. Istvan discussed a PhD thesis he was asked to examine that involved concatenating graphs on cut-vertices that he advised Ethan look at to avoid running over ground already covered by others. Istvan suggested a very good result would be an error bound for larger graphs - this will take some thought for Ethan.

Jess and Ethan will discuss these points in the upcoming regular PhD meeting. Both thanked Istvan for his time and closed the meeting at 12:30.


_EK 13:15 20-05-22_
