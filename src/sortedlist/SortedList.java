package sortedlist;

public class SortedList<E extends Comparable<E>> {

    private Node<E> head;  // points to the head of the list.
    private Node<E> tail;  // points to the tail of the list.
    private int size; // number of nodes (items) in the list.

    /**
     * Create a new, empty SortedList.
     */
    public SortedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Return true if this SortedList is empty, false otherwise.
     */
    public int size() {
        return size;
    }

    /**
     * Return the item at a specified index in this SortedList.
     * If index < the halfway point in the list (based on the size), the list should be traversed
     * forwards from the head.  If index > the halfway point, the traversal should start at the tail
     * and proceed in reverse.  For an index exactly halfway, you may start at either end.
     */
    public E get(int index)
    {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bounds (" + index + ") for SortedList with size=" + size);

        // Your code here.
        return null; // remove this line
    }

    /**
     * Remove all the items in the SortedList.
     */
    public void clear() {
        // Your code here.
    }

    /**
     * Add a new item into this SortedList.  Position will be determined automatically based on sorted order.
     * An item < head or > tail should be added in O(1) time. Other items requiring a traversal may be added
     * in O(n) time.
     * We assume this item does not already exist in the list.
     */
    public void add(E item) {
        // Your code here.
    }

    /**
     * Returns true if this SortedList contains item, false otherwise.
     */
    public boolean contains(E item)
    {
        // Your code here.
        return false; // remove this line
    }

    /**
     * Remove an item from this SortedList.  If the item occurs multiple times,
     * only one copy will be removed.
     */
    public void remove(E item)
    {
        // Your code here.
    }

    /**
     * This function should return an "internal" representation of the string, which consists of the
     * list printed both head-to-tail and tail-to-head, and the size, calculated in both directions.
     * Example: For a list with the numbers 1, 2, 3, this should return "[1 2 3] size=3 [3 2 1] size=3"
     * Do this with a forwards traversal, counting the elements, followed by a backwards traversal, re-counting
     * the elements.  This is useful to detect incorrectly-pointing prev/next pointers.
     *
     * Hint: Check to make sure the forward-size and the backward-size are the same and both match the
     * size variable.  If there is a mismatch, print an error message because this is very helpful to
     * detect errors.
     *
     * (If you want, when the list is empty, you may just return "[] size=0" instead of doing the traversals.)
     */
    public String toInternalString() {
        // Your code here.
        return ""; // remove this line
    }

    /**
     * Return a string representation of this list from the user's perspective.
     * Should look like [item1 item2 item3...]
     */
    public String toString()
    {
        // Your code here.
        return ""; // remove this line
    }

    /**
     * It is very common to have private classes nested inside other classes.  This is most commonly used when
     * the nested class has no meaning apart from being a helper class or utility class for the outside class.
     * In this case, this Node class has no meaning outside of this SortedList class, so we nest it inside here
     * so as to not prevent another class from declaring a Node class as well.
     *
     * Note that even though the members of node are public, because the class itself is private
     */
    private static class Node<E> {
        public E data = null;
        public Node<E> next = null;   // you may initialize member variables of a class when they are defined;
        public Node<E> prev = null;   // this behaves as if they were initialized in a constructor.
    }
}
