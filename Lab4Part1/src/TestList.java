public class TestList {
   public static void main(String[] args) {
      // create SLlist and add a few items
      SLList<Integer> list = new SLList();
      list.addFirst(8);
      list.addFirst(6);
      list.addFirst(1);
      list.addFirst(2);
      System.out.println(list);  // prints 2 -> 1 -> 6 -> 8 -> null
      System.out.printf("list size: %d.\n", list.size());

      // removing items from the list
      int removedItem = list.removeFirst();
      System.out.printf("\n%d removed\n", removedItem);
      System.out.println(list);  // prints 1 -> 6 -> 8 -> null
      System.out.printf("list size: %d.\n", list.size());

      removedItem = list.removeLast();
      System.out.printf("\n%d removed\n", removedItem);
      System.out.println(list); // prints 1 -> 6 -> null
      System.out.printf("list size: %d.\n", list.size());

      // throwing exceptions when the list is empty
      list.removeLast();
      list.removeLast();
      System.out.printf("list size after removing 2 items: %d.\n", list.size());

      System.out.println("removing from an empty list...");
      list.removeLast();
   }
}
