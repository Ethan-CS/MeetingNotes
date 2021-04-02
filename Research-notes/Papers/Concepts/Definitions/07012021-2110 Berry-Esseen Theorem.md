Tags :   #Def #Theorem
Zettel :  07012021-2110
Status : #triage 

-----

# DEF: The Berry-Esseen theorem

**Previous note:** [[]]

-----

### Questions & thoughts:

The Berry-Esseen Theorem is a result in probability theory, related to the central limit theorem (which states that, given particular circumstances, the probability distribution of the scaled mean of a random sample converges to a normal distribution as the sample size goes to infinity). The BE theorem gives a more quantitative result by specifying that the rate at which convergence takes place is bounded by the maximal error of approximation between the normal and true distribution of the scaled sample mean. The approximation is measured by the Kolmogorov-Smirnov distance. If we have independent samples, the convergence rate is $n^{1/2}$ (where $n$ is the sample size) and the constant is determined by estimating in terms of third absolute normalised moments.


Statement of the theorem (for identically distributed summands):
There exists a positive constant $C$ such that, if $X_1, X_2, \dots$ are independent and identically distributed random variables with $E(X_1)=0, E(X_1^2)=\sigma^2>0$ and $E(|X_1|^3)=\rho<\infty$ and if we define the sample mean as $$\displaystyle Y_n=\frac{X_1+X_2+\dots+X_n}{n}$$ and the cumulative distrubution function as $$F_n=\frac{Y_n\sqrt{n}}{\sigma},$$ and $\phi$ the cumulative distribution function of the standard normal distribution, then for all $x$ and $n$ we have:
$$\displaystyle |F_n(x)-\Phi(x)|\leq\frac{C_{\rho}}{\sigma^3\sqrt{n}}.$$

-----
 
**Consider:**


**Source:** 


**Reference:** 