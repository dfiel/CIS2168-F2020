import java.util.NoSuchElementException;

public class SLList<Item> {
   private Node<Item> first;
   private Node<Item> last;
   private int n; // size of the list

   // helper node class
   private class Node<Item> {
      Item item;
      Node<Item> next;
   }

   // constructor: initializes an empty list
   public SLList() {
      first = last = null;
      n = 0;
   }

   // is the list empty?
   public boolean isEmpty() {
      return first == null;
   }

   // return the size of the list
   public int size() {
      return n;
   }

   // Exercise 2.3
   // Get a specific node at index
   private Node<Item> getNode(int index){
      if(n == 0 || index >= n) throw new NoSuchElementException();
      Node<Item> current = first;
      for(int i = 0; i < index; i++){
         current = current.next;
      }
      return current;
   }

   // Exercise 2.4
   // insert a node after node k
   public void addAfter(int k, Item item){
      Node<Item> nodeK = getNode(k); // Get the node we want to add after
      Node<Item> nodeK1 = new Node<>();
      nodeK1.item = item;
      nodeK1.next = getNode(k+1); // Set the new next node to point to the original next node
      nodeK.next = nodeK1; // Add the new next node
      n++; // Increment size after insertion
   }

   // Exercise 2.5
   // Remove a node after specified node
   private Item removeAfter(Node<Item> node){
      if(node.next == null) throw new NoSuchElementException();
      Item retval = node.next.item;
      node.next = node.next.next;
      n--;
      return retval;
   }

   // Exercise 2.6
   // Delete a node at element k
   public Item deleteKth(int k){
      return removeAfter(getNode(k-1));
   }

   // insert an item at the front of the list
   public void addFirst(Item item) {
      if (isEmpty()) { // first & last refer to the same node
         first = last = new Node<Item>();
         first.item = last.item = item;
      } else {  //first refers to the new node
         Node<Item> oldFirst = first;
         first = new Node<Item>();
         first.item = item;
         first.next = oldFirst;
      }
      n++; // increment size after insertion
   }

   // insert item at the end of the list
   public void addLast(Item item) {
      if (isEmpty()) { // first & last refer to the same node
         first = last = new Node<Item>();
         first.item = last.item = item;
      } else { // last.next refers to the new node
         last = last.next = new Node<Item>();
         last.item = item;
      }
      n++; // increment size after insertion
   }

   // remove & return the first item in the list
   public Item removeFirst() {
      if (isEmpty()) throw new RuntimeException("empty list");
      Item removedItem = first.item;  // retrieve the data item being removed
      if (first == last)              // if there's only one node in the list,
         first = last = null;         // update both first & last references
      else       // otherwise, update first only
         first = first.next;
      n--; // decrement size after removal
      return removedItem;
   }


   // remove & return the last item in the list
   public Item removeLast() {
      if (isEmpty()) throw new RuntimeException("empty list");
      Item item = last.item;   // retrieve the data item being removed

      if (first == last)       // if there's only one node in the list,
         first = last = null;  // update both first & last references
      else {  // iterate through the list to locate the last node
         Node current = first;
         while (current.next != last)
            current = current.next;
         last = current;  // current is the new last node
         current.next = null;
      } // end else
      n--; // decrement size after removal
      return item;
//      This method doesn't require the 'last' field
//      Node<Item> current = first.next;
//      Node<Item> offset = first;
//      Item retval;
//      if(current == null){
//         retval = first.item;
//         first = null;
//         n--;
//         return retval;
//      }
//      while(current.next != null){
//         offset = offset.next;
//         current = current.next;
//      }
//      retval = current.item;
//      offset.next = null;
//      n--;
//      return retval;
   }

   @Override
   public String toString() {
      StringBuilder s = new StringBuilder();
      Node<Item> current = first;
      while (current != null) {
         s.append(current.item + " -> ");
         // s.append(current.item + " ");
         current = current.next;
      }
      s.append("null");
      //s.append("\n");
      return s.toString();
   }
}
