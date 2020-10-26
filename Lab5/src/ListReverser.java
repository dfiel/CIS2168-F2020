public class ListReverser {
   public static LinkedList reverse(LinkedList head) {
      LinkedList current = head;
      LinkedList previous = null;
      LinkedList next;

      while(current != null){
         next = current.next; // Grab the next element
         current.next = previous; // Change its next element to the last element
         previous = current; // move previous forward one node
         current = next; // move current forward one node
      }

      return previous;   // <- change this line
   }

   static class LinkedList {
      int value;
      LinkedList next = null;

      public LinkedList(int value) {
         this.value = value;
      }
   }
}
