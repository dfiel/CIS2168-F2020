/*   Class SLList implements a singly-linked list. Node is a helper class used by SLList.

   Assignment: 1. Complete the implementation by filling in the code (by Wed, Sep 18)
               2. Create a separate file, DLList.java that implements a doubly-linked-list (by Fri, Sep 20)
               3. Implement a circular-list (by Fri, Sep 20)
               4. Use one of these implementations to complete homework 2, where you're asked to write a file
                  called Leader.java, which will use one of these implementations to efficiently fine the leader.

 Parts 1, 2, and 3 must be demonstrated by Friday, Sep 20. Part 4 - by Monday, Sep 23.
 */

class Node<E> {
    E data;
    Node<E> next;

    // constructors...
    // Your code here

    Node(E newData){
        this(newData, null);
    }

    Node(E newData,Node<E> node){
        data = newData;
        next = node;
    }
}

public class SLList<E> {
    private Node<E> first;
    private Node<E> last;

    // insert item at front of list (takes constant time)
    public void insertAtFront(E item) {
        // Your code here
    }

    // insert item at end of list (takes constant time)
    public void insertAtBack(E item) {
        // Your code here
    }

    // remove first node from list (takes constant time)
    public E removeFromFront() {
        // Your code here
        return null; // change this return statement
    }

    // remove last node from list (takes time proportional to the size of the list)
    public E removeFromBack() {
        // Your code here
        return null; // change this return statement
    }

    // is this list empty? return true if yes, false otherwise.
    public boolean isEmpty() {
        return first == null;
    }

    // print the data items currently in the list
    public void print() {
        if ( isEmpty() ) System.out.println("this list is empty");
        Node current = first;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.print("\n\n");
    }
}
