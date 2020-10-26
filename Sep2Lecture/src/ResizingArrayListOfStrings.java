public class ResizingArrayListOfStrings {

   private String[] data;  // list elements
   private int n;          // number of elements in the list


   public ResizingArrayListOfStrings() {
      // YOUR CODE HERE
   }

   // adds a String item to the end of the list
   public void add(String item) {
      // YOUR CODE HERE
   }

   // resize the underlying array holding the elements
   private void resize(int capacity) {
      assert capacity >= n; // make sure capacity is large enough

      // YOUR CODE HERE

      // alternative implementation
      // data = java.util.Arrays.copyOf(data, capacity);
   }

   // adds a String item to the list. The order of this item in the list
   // is index. The item is stored at position index of the data array.
   public void add(int index, String item) {
      // YOUR CODE HERE
   }

   // return the item at index
   public String get(int index) {
      if (index < 0 || index >= n)
         throw new ArrayIndexOutOfBoundsException(index);
      return data[index];
   }

   // remove and return the item at index
   public String remove(int index) {
      // YOUR CODE HERE
      return "Hello? I'm not implemented yet";  // <- CHANGE THIS LINE
   }

   public String set(int index, String s) {
      // YOUR CODE HERE
      return "Hello? I'm not implemented yet";  // <- CHANGE THIS LINE
   }

   public int indexOf(String s) {
      // YOUR CODE HERE
      return -2168;  // <- CHANGE THIS LINE
   }

   public int size() { return n; }

   // extra methods - this may be one of lab exercises
   public boolean remove(String s) {
      // YOUR CODE HERE
      return true;  // <- CHANGE THIS LINE
   }


   public String toString() {
      StringBuilder sb = new StringBuilder("[ ");
      int i = 0;
      while (i < size()-1) {
         sb.append(get(i) + ", ");
         i++;
      }
      sb.append(get(i) + " ]");
      return sb.toString();
   }

   public static void main(String[] args) {
      ResizingArrayListOfStrings items = new ResizingArrayListOfStrings();

      items.add("Aiko"); // append an item to the list
      items.add(0, "Zeno"); // insert "yellow" at index 0

      // testing add()
      System.out.println(
            "\nPrinting list contents after first adding \"Aiko\" to the list, then adding \"Zeno\" at index 0:");
      System.out.println(items);

      items.add("Fluffy"); // add "Fluffy" to the end of the list
      items.add("Zeno"); // add "Zeno" to the end of the list
      System.out.println("\nPrinting items after adding \"Fluffy\" and \"Zeno\":");
      System.out.println(items);

      // testing remove() (this will be a lab exercise)
      items.remove("absent"); // remove the first "yellow"
      System.out.println("\nPrinting items after removing an element that's not in the list, \"absent\":");
      System.out.println(items);

      // testing remove()
      items.remove(1); // remove item at index 1
      System.out.println("\nPrinting items after removing an item at index 1:");
      System.out.println(items);

      // display number of elements in the List
      System.out.printf("\nSize: %s\n", items.size());

      // testing set()
      items.set(2, "Bobby");
      System.out.println(items);

      // items.set(7, "Donny");  // should throw an exception

      // testing indexOf()
      System.out.print("Where is Aiko? " + items.indexOf("Aiko") + ". "); // -1
      System.out.print("Where is Bobby? " + items.indexOf("Bobby") + ". "); // 2
      System.out.println("Where is Zeno? " + items.indexOf("Zeno")); // 0

      // testing get()
      System.out.println( "\nWho's at index 0? " + items.get(0) ); // Zeno
      System.out.println( "Who's at index 2? " + items.get(2) ); // Bobby
      //System.out.println( "Who's at index 20? " + items.get(20) ); // Should throw an exception

      System.out.print("\nIs the list modified afer get() calls?");
      System.out.println("\tPrinting the list...");
      System.out.println(items);

   }
}
