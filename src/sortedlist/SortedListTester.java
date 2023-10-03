package sortedlist;

public class SortedListTester {
    public static void main(String[] args)
    {
        testAddToEnd();
        // testAddToBeginning();
        // testAddToMiddle();
        // testGet();
        // More tests here for the other functions.
        // Be sure to test get/contains/remove for elements
        // at the head, tail, and in the middle!
    }

    private static void testAddToEnd()
    {
        // Test adding items to end of list.
        SortedList<Integer> mylist = new SortedList<Integer>();
        System.out.println(mylist.toInternalString());
        mylist.add(10);
        System.out.println(mylist.toInternalString());
        mylist.add(20);
        System.out.println(mylist.toInternalString());
        mylist.add(30);
        System.out.println(mylist.toInternalString());
        mylist.add(40);
        System.out.println(mylist.toInternalString());
    }

}
