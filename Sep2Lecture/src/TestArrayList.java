import java.util.ArrayList;

public class TestArrayList {
   public static void main(String[] args) {
      // create a new ArrayList of Strings with an initial capacity of 10
      ArrayList<String> items = new ArrayList<String>();

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
