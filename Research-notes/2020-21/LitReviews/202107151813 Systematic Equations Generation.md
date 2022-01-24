Tags :   #Equation #ODE
Zettel :  20210715-1815
Status : #triage 

-----

# Systematic Equations Generation Method

-----

## Method outline

Our equation generation process is as follows:
1. Assume pairwise statistical independence by writing the tuple as the product of the relevant individual single equations (we will make adjustments to this assumption later on in considering probabilities where single sites are referenced more than once).
2. Obtain derivatives of both sides (generally requiring the product rule)
3. Substitute first order derivative single terms for the relevant single equations
4. Deal with any occasions where sums could lead to consideration of a site being referenced more than once in the same product or combined probability[^2]
	- The product of probabilities of a site being in two different states is 0
	- The product of probabilities of a site being in the same state can be reduced to just a single reference to this probability

We will now see some worked examples of this method.


## Equations for Doubles (size $n=2$)

With pairwise independence, the doublet state is given by 
$$
\langle S_i I_j \rangle = \langle S_i \rangle \langle I_j \rangle
$$
and computing derivatives yields:
$$ 
\dot{\langle S_i I_j \rangle} = \dot{\langle S_i \rangle} \langle I_j \rangle + \langle S_i \rangle \dot{\langle I_j \rangle}.
$$

We already have the equations of singles, which we will write as
$$
\begin{align}
\dot{\langle S_i \rangle } & = -\sum_kT_{ik}\langle S_i \rangle \langle I_k \rangle,\\
\dot{\langle I_j \rangle} & = \sum_k T_{jk} \langle S_j \rangle \langle I_k \rangle - g_j \langle I_j \rangle.
\end{align}
$$
Using these as substitutions, we obtain
$$ 
\begin{align}
\dot{\langle S_i I_j \rangle} & = \left( -\sum_kT_{ik}\langle S_i \rangle \langle I_k \rangle \right) \langle I_j \rangle + \langle S_i \rangle \left(\sum_k T_{jk} \langle S_j \rangle \langle I_k \rangle - g_j \langle I_j \rangle \right)\\
& = \sum_k T_{jk} \langle S_i \rangle \langle S_j \rangle \langle I_k \rangle -\sum_kT_{ik}\langle S_i \rangle \langle I_j \rangle \langle I_k \rangle - g_j \langle S_i \rangle \langle I_j \rangle
\end{align}
$$
We can see that the summations do not deal with a state being referenced more than once, for instance where $k=i$ in the first term or $k=j$ in the second term. We explicitly write these cases in order to deal with them directly:
$$ 
\begin{align}
\dot{\langle S_i I_j \rangle} = \sum_{k, k\neq i} T_{jk} \langle S_i \rangle & \langle S_j \rangle \langle I_k \rangle -\sum_{k, k\neq j}T_{ik}\langle S_i \rangle \langle I_j \rangle \langle I_k \rangle - g_j \langle S_i \rangle \langle I_j \rangle \\ & - T_{ji} \langle S_i \rangle \langle S_j \rangle \langle I_j \rangle - T_{ij} \langle S_i \rangle \langle I_j \rangle \langle I_j \rangle
\end{align}
$$
Now, we note the following: firstly, we specify that the probability of a single state being in more than one state at the same time must be zero by the assumption of a compartmental model; secondly, the probability of a site being in a certain state given that it is in that state must be one. To clarify, for distinct epidemic states $A$ and $B$, at any site $s$ the following must hold:
$$
\begin{align}
\langle A_s B_s\rangle & = 0,\\
\langle A_s A_s\rangle & = \langle A_s\rangle.
\end{align}
$$
Using these facts, and writing products as combined probabilities, our expression becomes:
$$ 
\dot{\langle S_i I_j \rangle} = \sum_{k, k\neq i} T_{jk} \langle S_i S_j I_k \rangle -\sum_{k, k\neq j}T_{ik}\langle S_i I_j I_k \rangle - g_j \langle S_i I_j \rangle - T_{ij} \langle S_i I_j \rangle 
$$
which is exactly the provided equation for the doublet state $\dot{\langle S_i I_j \rangle}$, as derived from the master equation[^1]. Note that this breaks the pairwise independence assumption and shows that we do not have pairwise statistical independence for states being in given states for the epidemic model with tuples of size greater than 1.


## Equations for Triples (size $n=3$)

Once again, we begin with assuming pairwise independence to write the equation for the triple $\langle S_i S_j I_k \rangle$ as
$$
\langle S_i S_j I_k \rangle = \langle S_i \rangle \langle S_j \rangle \langle  I_k \rangle .
$$

Taking derivatives yields (using the product rule once again)
 $$
\dot{\langle S_i S_j I_k \rangle} = \dot{\langle S_i \rangle} \langle S_j \rangle \langle  I_k \rangle + \langle S_i \rangle \dot{\langle S_j \rangle} \langle  I_k \rangle + \langle S_i \rangle \langle S_j \rangle \dot{\langle  I_k \rangle}.
$$

As before, we substitute in the equations for singles referenced here to obtain
 $$
 \begin{align}
\dot{\langle S_i S_j I_k \rangle} = - \sum_lT_{il}\langle S_i S_j I_k I_l\rangle 
- \sum_l T_{jl} \langle S_i S_j I_k I_l \rangle + \\ 
+ \sum_l T_{kl} \langle S_i S_j S_k I_l \rangle - g_k \langle S_i S_j I_k \rangle.
\end{align}
$$

As in the $n=2$ case, we will directly deal with the cases where one site is referenced more than once in a single term:
$$
 \begin{align}
\dot{\langle S_i S_j I_k \rangle} = - \sum_{l,l\notin\{j,k\}}T_{il}\langle S_i S_j I_k I_l\rangle 
- \sum_{l,l\notin\{i,k\}} T_{jl} \langle S_i S_j I_k I_l \rangle + \\ 
+ \sum_{l,l\notin\{i, j\}} T_{kl} \langle S_i S_j S_k I_l \rangle - g_k \langle S_i S_j I_k \rangle \\
- T_{ij}\langle S_i S_j I_j I_k \rangle
- T_{ik}\langle S_i S_j I_k I_k \rangle \\
- T_{ji}\langle S_i I_i S_j I_k \rangle
- T_{jk}\langle S_i S_j I_k I_k \rangle \\
- T_{ki}\langle S_i I_i S_j S_k \rangle
- T_{kj}\langle S)i S_j I_j S_k \rangle
\end{align}
$$
and, applying our usual rules to correct the equation (i.e. set any probabilities with contradictory states for like states to zero and reduce probabilities with repeated terms) yields the following:?
$$
 \begin{align}
\dot{\langle S_i S_j I_k \rangle} = - \sum_{l,l\notin\{j,k\}}T_{il}\langle S_i S_j I_k I_l\rangle 
- \sum_{l,l\notin\{i,k\}} T_{jl} \langle S_i S_j I_k I_l \rangle + \\ 
+ \sum_{l,l\notin\{i, j\}} T_{kl} \langle S_i S_j S_k I_l \rangle - g_k \langle S_i S_j I_k \rangle \\
- T_{ik}\langle S_i S_j I_k \rangle
- T_{jk}\langle S_i S_j I_k \rangle
\end{align}
$$
This is indeed the equation for triples derived from the master equation, as required[^1].

[^1]: Kieran J. Sharkey, "Deterministic epidemic models on contact networks: Correlations and unbiological terms," _Theoretical Population Biology,_ Volume 79, Issue 4, 2011, pp. 115-129, ISSN 0040-5809, https://doi.org/10.1016/j.tpb.2011.01.004, available at: https://www.sciencedirect.com/science/article/pii/S0040580911000128, last accessed 16/07/21
[^2]: Note that, in making these adjustments, we break pairwise statistical independence.