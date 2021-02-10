package io.github.ethankelly;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The {@code MinPriorityQueue} class represents a priority queue of generic keys. It provides the usual <em>insert</em>
 * and <em>delete the minimum</em> operations as well as methods for peeking at the minimum key, testing if the priority
 * queue is empty and iterating through all keys.
 * <p>
 * This implementation uses a <em>binary heap</em>. The insert and delete the minimum operations take &Theta;(log
 * <em>n</em>) amortized time, where <em>n</em> is the number of elements in the priority queue. This is an amortized
 * bound (not a worst-case bound) because of array resizing operations. The <em>min</em>, <em>size</em>, and <em>is
 * empty</em> operations take &Theta;(1) time in the worst case. Construction takes time proportional to the specified
 * capacity or the number of items used to initialize the data structure.
 * <p>
 *
 * @param <Key> the generic type of key on the priority queue.
 * @author <a href="mailto:e.kelly.1@research.gla.ac.uk">Ethan Kelly</a>
 */
public class MinPriorityQueue<Key> implements Iterable<Key> {
    private Key[] pq;                    // Store items at indices 1 to n
    private int n;                       // Number of items on priority queue
    private Comparator<Key> comparator;  // (Optional) comparator

    /**
     * Initialises an empty priority queue with some specified initial capacity.
     *
     * @param initCapacity the initial capacity of this priority queue.
     */
    @SuppressWarnings("unchecked")
    public MinPriorityQueue(int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    /**
     * Initialises an empty priority queue.
     */
    public MinPriorityQueue() {
        this(1);
    }

    /**
     * Initialises an empty priority queue with the given initial capacity using the given comparator.
     *
     * @param initCapacity the initial capacity of this priority queue.
     * @param comparator   the order in which to compare the keys.
     */
    @SuppressWarnings("unchecked")
    public MinPriorityQueue(int initCapacity, Comparator<Key> comparator) {
        this.comparator = comparator;
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    /**
     * Initialises an empty priority queue using the given comparator.
     *
     * @param comparator the order in which to compare the keys
     */
    public MinPriorityQueue(Comparator<Key> comparator) {
        this(1, comparator);
    }

    /**
     * Initialises a priority queue from the array of keys. This takes time proportional to the number of keys, using
     * sink-based heap construction.
     *
     * @param keys the array of keys.
     */
    @SuppressWarnings("unchecked")
    public MinPriorityQueue(Key[] keys) {
        n = keys.length;
        pq = (Key[]) new Object[keys.length + 1];
        System.arraycopy(keys, 0, pq, 1, n);
        for (int k = n / 2; k >= 1; k--)
            sink(k);
        assert isMinHeap();
    }

    /**
     * @return {@code true} if this priority queue is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * @return the number of keys on this priority queue
     */
    public int size() {
        return n;
    }

    /**
     * @return a smallest key on this priority queue
     * @throws AssertionError if this priority queue is empty
     */
    public Key min() {
        assert !isEmpty() : "Priority queue underflow";
        return pq[1];
    }

    /**
     * Resizes the underlying array to the given capacity.
     *
     * @param capacity the new dimension for the underlying array to take.
     */
    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        assert capacity > n;
        Key[] temp = (Key[]) new Object[capacity];
        if (n >= 0) System.arraycopy(pq, 1, temp, 1, n);
        pq = temp;
    }

    /**
     * Adds a new key to this priority queue.
     *
     * @param x the key to add to this priority queue
     */
    public void insert(Key x) {
        // double size of array if necessary
        if (n == pq.length - 1) resize(2 * pq.length);

        // add x, and percolate it up to maintain heap invariant
        pq[++n] = x;
        swim(n);
        assert isMinHeap();
    }

    /**
     * Removes and returns the smallest key on this priority queue, which may not be unique.
     *
     * @return the smallest key on this priority queue
     * @throws AssertionError if this priority queue is empty
     */
    public Key delMin() {
        assert !isEmpty() : "Priority queue underflow";
        Key min = pq[1];
        each(1, n--);
        sink(1);
        pq[n + 1] = null;     // to avoid loitering and help with garbage collection
        if ((n > 0) && (n == (pq.length - 1) / 4)) resize(pq.length / 2);
        assert isMinHeap();
        return min;
    }

    /***************************************************************************
     * Helper functions to restore the heap invariant.
     ***************************************************************************/

    private void swim(int k) {
        while (k > 1 && greater(k / 2, k)) {
            each(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && greater(j, j + 1)) j++;
            if (!greater(k, j)) break;
            each(k, j);
            k = j;
        }
    }

    /***************************************************************************
     * Helper functions for compares and swaps.
     ***************************************************************************/

    @SuppressWarnings("unchecked")
    private boolean greater(int i, int j) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[i]).compareTo(pq[j]) > 0;
        } else {
            return comparator.compare(pq[i], pq[j]) > 0;
        }
    }

    private void each(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    // Is pq[1..n] a min heap?
    private boolean isMinHeap() {
        for (int i = 1; i <= n; i++) {
            if (pq[i] == null) return false;
        }
        for (int i = n + 1; i < pq.length; i++) {
            if (pq[i] != null) return false;
        }
        if (pq[0] != null) return false;
        return isMinHeapOrdered(1);
    }

    // Is subtree of pq[1..n] rooted at k a min heap?
    private boolean isMinHeapOrdered(int k) {
        if (k > n) return true;
        int left = 2 * k;
        int right = 2 * k + 1;
        if (left <= n && greater(k, left)) return false;
        if (right <= n && greater(k, right)) return false;
        return isMinHeapOrdered(left) && isMinHeapOrdered(right);
    }


    /**
     * Returns an iterator that iterates over the keys on this priority queue in ascending order.
     *
     * @return an iterator that iterates over the keys in ascending order
     */
    public Iterator<Key> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Key> {
        // Create a new pq
        private final MinPriorityQueue<Key> copy;

        // Add all items to copy of heap,
        // takes linear time (since already in heap order) so no keys move
        public HeapIterator() {
            if (comparator == null) copy = new MinPriorityQueue<>(size());
            else copy = new MinPriorityQueue<>(size(), comparator);
            for (int i = 1; i <= n; i++)
                copy.insert(pq[i]);
        }

        public boolean hasNext() {
            return !copy.isEmpty();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Key next() {
            if (!hasNext()) throw new NoSuchElementException();
            return copy.delMin();
        }
    }

    /**
     * Unit tests the {@code MinPQ} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        MinPriorityQueue<Integer> pq = new MinPriorityQueue<>();
//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            if (!item.equals("-")) pq.insert(item);
//            else if (!pq.isEmpty()) StdOut.print(pq.delMin() + " ");
//        }
        int[] toAdd = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21};
        for (int i : toAdd) pq.insert(i);
        StdOut.print(pq.delMin() + " ");
        StdOut.println("(" + pq.size() + " left on pq)");
    }

}