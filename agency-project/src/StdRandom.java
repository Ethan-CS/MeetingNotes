package io.github.ethankelly;

import java.util.Random;

/**
 * The {@code StdRandom} class provides static methods for generating pseudo-random numbers from various discrete and
 * continuous distributions, including uniform, Bernoulli, geometric, Gaussian, exponential, Pareto, Poisson, and
 * Cauchy. It also provides method for shuffling an array or sub-array and generating random permutations.
 * <p>
 * By convention, all intervals are half open. For example, <code>uniform(-1.0, 1.0)</code> returns a random number
 * between <code>-1.0</code> (inclusive) and <code>1.0</code> (exclusive). Similarly, <code>shuffle(a, lo, hi)</code>
 * shuffles the <code>hi - lo</code> elements in the array <code>a[]</code>, starting at index <code>lo</code>
 * (inclusive) and ending at index <code>hi</code> (exclusive).
 * <pre>
 *  %  java StdRandom 5
 *  seed = 1316600602069
 *  59 16.81826  true 8.83954  0
 *  32 91.32098  true 9.11026  0
 *  35 10.11874  true 8.95396  3
 *  92 32.88401  true 8.87089  0
 *  72 92.55791  true 9.46241  0
 * </pre>
 *
 * <pre>
 *  % java StdRandom 5
 *  seed = 1316600616575
 *  96 60.17070  true 8.72821  0
 *  79 32.01607  true 8.58159  0
 *  81 59.49065  true 9.10423  1
 *  96 51.65818  true 9.02102  0
 *  99 17.55771  true 8.99762  0
 * </pre>
 *
 * <pre>
 *  % java StdRandom 5 1316600616575
 *  seed = 1316600616575
 *  96 60.17070  true 8.72821  0
 *  79 32.01607  true 8.58159  0
 *  81 59.49065  true 9.10423  1
 *  96 51.65818  true 9.02102  0
 *  99 17.55771  true 8.99762  0
 * </pre>
 *
 * @author <a href="mailto:e.kelly.1@research.gla.ac.uk">Ethan Kelly</a>
 */
public final class StdRandom {

    private static Random random;    // pseudo-random number generator
    private static long seed;        // pseudo-random number generator seed

    // Static initializer
    static {
        // The same way the seed was set in Java 1.4
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    // Doesn't make sense to instantiate this class
    private StdRandom() {
    }

    /**
     * Sets the seed of the pseudo-random number generator. This method enables us to produce the same sequence of
     * "random" numbers for each execution of the program. Ordinarily, we should call this method at most once per
     * program.
     *
     * @param s the seed
     */
    public static void setSeed(long s) {
        seed = s;
        random = new Random(seed);
    }

    /**
     * @return the seed of the pseudo-random number generator.
     */
    public static long getSeed() {
        return seed;
    }

    /**
     * Uniformly generates a random real number in [0, 1).
     *
     * @return a random real number uniformly in [0, 1).
     */
    public static double uniform() {
        return random.nextDouble();
    }

    /**
     * Returns a random integer uniformly in [0, n).
     *
     * @param n number of possible integers.
     * @return a random integer uniformly between 0 (inclusive) and {@code n} (exclusive).
     * @throws IllegalArgumentException if {@code n <= 0}.
     */
    public static int uniform(int n) {
        if (n <= 0) throw new IllegalArgumentException("argument must be positive: " + n);
        return random.nextInt(n);
    }


    /**
     * Returns a random long integer uniformly in [0, n).
     *
     * @param n number of possible {@code long} integers.
     * @return a random long integer uniformly between 0 (inclusive) and {@code n} (exclusive).
     * @throws IllegalArgumentException if {@code n <= 0}.
     */
    public static long uniform(long n) throws IllegalArgumentException {
        if (n <= 0L) throw new IllegalArgumentException("argument must be positive: " + n);

        long r = random.nextLong();
        long m = n - 1;

        // Power of two
        if ((n & m) == 0L) {
            return r & m;
        }

        // Reject over-represented candidates
        long u = r >>> 1;
        while (u + m - (r = u % n) < 0L) {
            u = random.nextLong() >>> 1;
        }
        return r;
    }

    ///////////////////////////////////////////////////////////////////////////
    //  STATIC METHODS BELOW RELY ON JAVA.UTIL.RANDOM ONLY INDIRECTLY VIA    //
    //  THE STATIC METHODS ABOVE.                                            //
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Returns a random real number uniformly in [0, 1).
     *
     * @return a random real number uniformly in [0, 1).
     * @deprecated Replaced by {@link #uniform()}.
     */
    @Deprecated
    public static double random() {
        return uniform();
    }

    /**
     * Returns a random integer uniformly in [a, b).
     *
     * @param a the left endpoint.
     * @param b the right endpoint.
     * @return a random integer uniformly in [a, b).
     * @throws IllegalArgumentException if {@code b <= a} or {@code b - a >= Integer.MAX_VALUE}.
     */
    public static int uniform(int a, int b) throws IllegalArgumentException {
        if ((b <= a) || ((long) b - a >= Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");
        }
        return a + uniform(b - a);
    }

    /**
     * Returns a random real number uniformly in [a, b).
     *
     * @param a the left endpoint.
     * @param b the right endpoint.
     * @return a random real number uniformly in [a, b).
     * @throws IllegalArgumentException unless {@code a < b}.
     */
    public static double uniform(double a, double b) throws IllegalArgumentException {
        if (!(a < b)) {
            throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");
        }
        return a + uniform() * (b - a);
    }

    /**
     * Returns a random boolean from a Bernoulli distribution with success probability <em>p</em>.
     *
     * @param p the probability of returning {@code true}.
     * @return {@code true} with probability {@code p} and {@code false} with probability {@code 1 - p}.
     * @throws IllegalArgumentException unless {@code 0} &le; {@code p} &le; {@code 1.0}.
     */
    public static boolean bernoulli(double p) throws IllegalArgumentException {
        if (!(p >= 0.0 && p <= 1.0))
            throw new IllegalArgumentException("probability p must be between 0.0 and 1.0: " + p);
        return uniform() < p;
    }

    /**
     * Returns a random boolean from a Bernoulli distribution with success probability 1/2.
     *
     * @return {@code true} with probability 1/2 and {@code false} with probability 1/2.
     */
    public static boolean bernoulli() {
        return bernoulli(0.5);
    }

    /**
     * Returns a random real number from a standard Gaussian distribution.
     *
     * @return a random real number from a standard Gaussian distribution (mean 0 and standard deviation 1).
     */
    public static double gaussian() {
        // Uses the polar form of the Box-Muller transform
        double r, x, y;
        do {
            x = uniform(-1.0, 1.0);
            y = uniform(-1.0, 1.0);
            r = x * x + y * y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2 * Math.log(r) / r);

        // Remark: y * Math.sqrt(-2 * Math.log(r) / r) is an independent random gaussian
    }

    /**
     * Returns a random real number from a Gaussian distribution with mean &mu; and standard deviation &sigma;.
     *
     * @param mu    the mean.
     * @param sigma the standard deviation.
     * @return a real number distributed according to the Gaussian distribution with mean {@code mu} and standard
     * deviation {@code sigma}.
     */
    public static double gaussian(double mu, double sigma) {
        return mu + sigma * gaussian();
    }

    /**
     * Returns a random integer from a geometric distribution with success probability <em>p</em>. The integer
     * represents the number of independent trials before the first success.
     *
     * @param p the parameter of the geometric distribution.
     * @return a random integer from a geometric distribution with success probability {@code p}; or {@code
     * Integer.MAX_VALUE} if {@code p} is (nearly) equal to {@code 1.0}.
     * @throws IllegalArgumentException unless {@code p >= 0.0} and {@code p <= 1.0}.
     */
    public static int geometric(double p) throws IllegalArgumentException {
        if (!(p >= 0)) {
            throw new IllegalArgumentException("probability p must be greater than 0: " + p);
        }
        if (!(p <= 1.0)) {
            throw new IllegalArgumentException("probability p must not be larger than 1: " + p);
        }
        // using algorithm given by Knuth
        return (int) Math.ceil(Math.log(uniform()) / Math.log(1.0 - p));
    }

    /**
     * Returns a random integer from a Poisson distribution with mean &lambda;.
     *
     * @param lambda the mean of the Poisson distribution
     * @return a random integer from a Poisson distribution with mean {@code lambda}
     * @throws IllegalArgumentException unless {@code lambda > 0.0} and not infinite
     */
    public static int poisson(double lambda) throws IllegalArgumentException {
        if (!(lambda > 0.0))
            throw new IllegalArgumentException("lambda must be positive: " + lambda);
        if (Double.isInfinite(lambda))
            throw new IllegalArgumentException("lambda must not be infinite: " + lambda);
        int k = 0;
        double p = 1.0;
        double expLambda = Math.exp(-lambda);
        k++;
        p *= uniform();
        while (p >= expLambda) {
            k++;
            p *= uniform();
        }
        return k - 1;
    }

    /**
     * Returns a random real number from the standard Pareto distribution.
     *
     * @return a random real number from the standard Pareto distribution.
     */
    public static double pareto() {
        return pareto(1.0);
    }

    /**
     * Returns a random real number from a Pareto distribution with shape parameter &alpha;.
     *
     * @param alpha shape parameter
     * @return a random real number from a Pareto distribution with shape parameter {@code alpha}.
     * @throws IllegalArgumentException unless {@code alpha > 0.0}.
     */
    public static double pareto(double alpha) throws IllegalArgumentException {
        if (!(alpha > 0.0))
            throw new IllegalArgumentException("alpha must be positive: " + alpha);
        return Math.pow(1 - uniform(), -1.0 / alpha) - 1.0;
    }

    /**
     * Returns a random real number from the Cauchy distribution.
     *
     * @return a random real number from the Cauchy distribution.
     */
    public static double cauchy() {
        return Math.tan(Math.PI * (uniform() - 0.5));
    }

    /**
     * Returns a random integer from the specified discrete distribution.
     *
     * @param probabilities the probability of occurrence of each integer
     * @return a random integer from a discrete distribution: {@code i} with probability {@code probabilities[i]}
     * @throws IllegalArgumentException if {@code probabilities} is {@code null}, the sum of array entries is not (very
     *                                  nearly) equal to {@code 1.0} or unless {@code probabilities[i] >= 0.0} for each
     *                                  index {@code i}.
     */
    public static int discrete(double[] probabilities) throws IllegalArgumentException {
        if (probabilities == null) throw new IllegalArgumentException("argument array must not be null");
        double EPSILON = 1.0E-14;
        double sum = 0.0;
        for (int i = 0; i < probabilities.length; i++) {
            if (!(probabilities[i] >= 0.0))
                throw new IllegalArgumentException("array entry " + i + " must be non-negative: " + probabilities[i]);
            sum += probabilities[i];
        }
        if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)
            throw new IllegalArgumentException("sum of array entries does not approximately equal 1.0: " + sum);

        // The for loop may not return a value when both r is (nearly) 1.0 and when the
        // cumulative sum is less than 1.0 (as a result of floating-point round-off error)
        while (true) {
            double r = uniform();
            sum = 0.0;
            for (int i = 0; i < probabilities.length; i++) {
                sum = sum + probabilities[i];
                if (sum > r) return i;
            }
        }
    }

    /**
     * Returns a random integer from the specified discrete distribution.
     *
     * @param frequencies the frequency of occurrence of each integer.
     * @return a random integer from a discrete distribution: {@code i} with probability proportional to {@code
     * frequencies[i]}.
     * @throws IllegalArgumentException if {@code frequencies} is {@code null}, all array entries are {@code 0}, {@code
     *                                  frequencies[i]} is negative for any index {@code i} or the sum of frequencies
     *                                  exceeds {@code Integer.MAX_VALUE} (2<sup>31</sup> - 1).
     */
    public static int discrete(int[] frequencies) throws IllegalArgumentException {
        if (frequencies == null) throw new IllegalArgumentException("argument array must not be null");
        long sum = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] < 0)
                throw new IllegalArgumentException("array entry " + i + " must be non-negative: " + frequencies[i]);
            sum += frequencies[i];
        }
        if (sum == 0)
            throw new IllegalArgumentException("at least one array entry must be positive");
        if (sum >= Integer.MAX_VALUE)
            throw new IllegalArgumentException("sum of frequencies overflows an int");
        // pick index i with probability proportional to frequency
        double r = uniform((int) sum);
        sum = 0;
        for (int i = 0; i < frequencies.length; i++) {
            sum += frequencies[i];
            if (sum > r) return i;
        }
        // can't reach here
        assert false;
        return -1;
    }

    /**
     * Returns a random real number from an exponential distribution with rate &lambda;.
     *
     * @param lambda the rate of the exponential distribution.
     * @return a random real number from an exponential distribution with rate {@code lambda}.
     * @throws IllegalArgumentException unless {@code lambda > 0.0}.
     */
    public static double exp(double lambda) throws IllegalArgumentException {
        if (!(lambda > 0.0))
            throw new IllegalArgumentException("lambda must be positive: " + lambda);
        return -Math.log(1 - uniform()) / lambda;
    }

    /**
     * Rearranges the elements of the specified array in uniformly random order.
     *
     * @param a the array to shuffle.
     * @throws IllegalArgumentException if {@code a} is {@code null}.
     */
    public static void shuffle(Object[] a) throws IllegalArgumentException {
        validateNotNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n - i);     // between i and n-1
            Object temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Rearranges the elements of the specified array in uniformly random order.
     *
     * @param a the array to shuffle.
     * @throws IllegalArgumentException if {@code a} is {@code null}.
     */
    public static void shuffle(double[] a) throws IllegalArgumentException {
        validateNotNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n - i);     // between i and n-1
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Rearranges the elements of the specified array in uniformly random order.
     *
     * @param a the array to shuffle.
     * @throws IllegalArgumentException if {@code a} is {@code null}.
     */
    public static void shuffle(int[] a) throws IllegalArgumentException {
        validateNotNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n - i);     // between i and n-1
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Rearranges the elements of the specified array in uniformly random order.
     *
     * @param a the array to shuffle.
     * @throws IllegalArgumentException if {@code a} is {@code null}.
     */
    public static void shuffle(char[] a) throws IllegalArgumentException {
        validateNotNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n - i);     // between i and n-1
            char temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Rearranges the elements of the specified sub-array in uniformly random order.
     *
     * @param a    the array to shuffle.
     * @param low  the left endpoint (inclusive).
     * @param high the right endpoint (exclusive).
     * @throws IllegalArgumentException if {@code a} is {@code null} or unless {@code (0 <= low) && (low < high) &&
     *                                  (high <= a.length)}.
     */
    public static void shuffle(Object[] a, int low, int high) throws IllegalArgumentException {
        validateNotNull(a);
        validateSubArrayIndices(low, high, a.length);

        for (int i = low; i < high; i++) {
            int r = i + uniform(high - i);     // between i and high-1
            Object temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Rearranges the elements of the specified sub-array in uniformly random order.
     *
     * @param a    the array to shuffle.
     * @param low  the left endpoint (inclusive).
     * @param high the right endpoint (exclusive).
     * @throws IllegalArgumentException if {@code a} is {@code null} or unless {@code (0 <= low) && (low < high) &&
     *                                  (high <= a.length)}.
     */
    public static void shuffle(double[] a, int low, int high) throws IllegalArgumentException {
        validateNotNull(a);
        validateSubArrayIndices(low, high, a.length);

        for (int i = low; i < high; i++) {
            int r = i + uniform(high - i);     // between i and high-1
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Rearranges the elements of the specified sub-array in uniformly random order.
     *
     * @param a  the array to shuffle.
     * @param lo the left endpoint (inclusive).
     * @param hi the right endpoint (exclusive).
     * @throws IllegalArgumentException if {@code a} is {@code null} or unless {@code (0 <= lo) && (lo < hi) && (hi <=
     *                                  a.length)}.
     */
    public static void shuffle(int[] a, int lo, int hi) throws IllegalArgumentException {
        validateNotNull(a);
        validateSubArrayIndices(lo, hi, a.length);

        for (int i = lo; i < hi; i++) {
            int r = i + uniform(hi - i);     // between i and hi-1
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Returns a uniformly random permutation of <em>n</em> elements.
     *
     * @param n number of elements
     * @return an array of length {@code n} that is a uniformly random permutation of {@code 0}, {@code 1}, ..., {@code
     * n-1}.
     * @throws IllegalArgumentException if {@code n} is negative.
     */
    public static int[] permutation(int n) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative: " + n);
        int[] perm = new int[n];
        for (int i = 0; i < n; i++)
            perm[i] = i;
        shuffle(perm);
        return perm;
    }

    /**
     * Returns a uniformly random permutation of <em>k</em> of <em>n</em> elements.
     *
     * @param n total number of elements
     * @param k number of elements to select
     * @return an array of length {@code k} that is a uniformly random permutation of {@code k} of the elements from
     * {@code 0}, {@code 1}, ..., {@code n-1}
     * @throws IllegalArgumentException if {@code n} is negative or unless {@code 0 <= k <= n}
     */
    public static int[] permutation(int n, int k) throws IllegalArgumentException {
        assert n >= 0 : "n must be non-negative: " + n;
        assert k >= 0 && k <= n : "k must be between 0 and n: " + k;
        int[] perm = new int[k];
        for (int i = 0; i < k; i++) {
            int r = uniform(i + 1);
            perm[i] = perm[r];
            perm[r] = i;
        }
        for (int i = k; i < n; i++) {
            int r = uniform(i + 1);
            if (r < k) perm[r] = i;
        }
        return perm;
    }

    /**
     * Throws an IllegalArgumentException if {@code x} is {@code null}.
     *
     * @param x the Object instance to verify is not null.
     * @throws AssertionError if the object is not null.
     */
    private static void validateNotNull(Object x) throws AssertionError {
        assert x != null : "Argument must not be null";
    }

    /**
     * Throw an exception unless {@code 0 <= lo <= hi <= length}.
     *
     * @param lo     the left endpoint of the sub-array (inclusive).
     * @param hi     the right endpoint of the sub-array (exclusive).
     * @param length the length of the super-array.
     * @throws AssertionError if the sub-array indices are out of bounds with regards to the given length.
     */
    private static void validateSubArrayIndices(int lo, int hi, int length) throws AssertionError {
        assert lo >= 0 && hi <= length && lo <= hi : "Sub-array indices out of bounds: [" + lo + ", " + hi + ")";
    }

    /**
     * Unit tests the methods in this class.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        double[] probabilities = {0.5, 0.3, 0.1, 0.1};
        int[] frequencies = {5, 3, 1, 1};
        String[] a = "A B C D E F G".split(" ");

        StdOut.println("seed = " + StdRandom.getSeed());
        for (int i = 0; i < n; i++) {
            StdOut.printf("%2d ", uniform(100));
            StdOut.printf("%8.5f ", uniform(10.0, 99.0));
            StdOut.printf("%5b ", bernoulli(0.5));
            StdOut.printf("%7.5f ", gaussian(9.0, 0.2));
            StdOut.printf("%1d ", discrete(probabilities));
            StdOut.printf("%1d ", discrete(frequencies));
            StdOut.printf("%11d ", uniform(100000000000L));
            StdRandom.shuffle(a);
            for (String s : a)
                StdOut.print(s);
            StdOut.println();
        }
    }

}