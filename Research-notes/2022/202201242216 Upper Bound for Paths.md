Tags :
Zettel :  20220124-2216
Status : #triage 

-----

# Upper Bounding Equations for Paths

Maths won't show up on GitHub - link to HackMD for rendered LaTeX [here.](https://hackmd.io/@2dkYNbTEQqSgWui5OwM4MA/SJ7XX3n6t)

-----

### Questions & thoughts:

For $k$ states on a graph on $n$ vertices:

- __SINGLES:__ $(kn)$ 
	- State combinations: $k$
	- Tuples: $n$
- __DOUBLES:__  $(k^2-k)(n-1)$
	- State combinations: $k^2$ total combinations, but we don't need $k$ of them ($k$ combinations where all states the same, so dynamically uninteresting)
	- Tuples: there are $n-1$ pairs of vertices
- __TRIPLES:__ $(k^3-k)(n-2)$
	- State combinations: $k^3$ total, minus $k$ for all-same state combinations
	- Tuples: $n-3$ tuples of size 3
- __HIGHER-ORDER TUPLES:__ $\sum_{i=4}^n k(n-(i-1))$
	- State combinations: only state combinations where no "blocks" exist - e.g. $SISISI\dots$ is required, but $SISSI$ can be split into $SIS$ and $SI$, which are already accounted for in the tuples and doubles, so we need only $k$ of each tuple to account for only these irreducible states. 
	- Tuples: $n-(t-1)$ tuples of size $t$

We can write an expression for the sum representing numbers of equations for t-tuples of length $t>3:$
$$
\begin{align}
\sum_{i=4}^n k(n-(i-1)) &= k\left[\sum_{i=1}^n (n-(i-1))-\sum_{i=1}^3(n-(i-1))\right]\\
&=k\left[\sum_{i=1}^n n-\sum_{i=1}^ni-\sum_{i=1}^n1-(3n-3)\right]\\
&=k\left[n^2-\frac{n(n+1)}{2}-n-(3n-3)\right]\\
&=\frac{k}{2}\left(n^2-7n+6\right)
\end{align}
$$
and, using this expression, we can write the full formula for the number of equations for a path on $n$ vertices as
$$
\begin{align}
\text{Eq}(P_n)=\left[kn+(k^2-k)(n-1)+(k^3-k)(n-2)+\frac{k}{2}\left(n^2-7n+6\right)\right].
\end{align}
$$
We can see that the highest-order terms are $k^3$ and $n^2$, meaning that the numbers of equations are cubic in the number of states in the model and quadratic in the number of vertices in the graph.

-----
 
**To Consider:**

- This feels fairly specific to $SIR$ - especially the higher-order tuple expression derivation. Do I need to translate this into language about transition graphs/model dynamics?
- What does it mean for this expression to be cubic in the number of states and quadratic in the number of vertices? Would this be expressed as $O(k^3+n^2)$?
	- Maybe not such bad news if cubic in $k$ as we rarely want to scale number of states significantly (at least not as much as vertices).
