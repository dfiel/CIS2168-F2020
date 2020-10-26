import java.util.ArrayList;

public class Demo1ArrayList {
   public static void main(String[] args) {
      // Create an empty ArrayList
      ArrayList<String> items = new ArrayList<>();

      // Add items to the list. By default, items are added to the end
      items.add("conan"); // [conan]
      items.add("leno");  // [conan, leno] - leno added at the end
      items.add("zeno");  // [conan, leno, zeno] - zeno added at the end
      System.out.println(items); // prints [conan, leno, zeno]

      // Find out how many elements are in the list
      System.out.println(items.size()); // prints 3

      // concatenate all items in the list [conan, leno, zeno]
      String str = "";
      for (int i = 0; i < items.size(); i++) {
         str = str + items.get(i);
      }
      System.out.println(str); // prints conanlenozeno

      // Add the given item at the given index,
      // shifting subsequent items right
      items.add(1, "gaga");
      System.out.println(items ); // prints [conan, gaga, leno, zeno]


      // remove the item at the given index,
      // shifting subsequent items left
      items.remove(0); // now the list is [gaga, leno, zeno]
      items.remove(1); // this one now removes leno
      System.out.println(items); // prints [gaga, zeno]

      // replace the item at the given index
      items.set(0, "alfalfa");
      System.out.println(items); // prints [alfalfa, zeno]

      // remove all items from the list
      items.clear(); // the list is now empty: []
      System.out.println(items);
   }
}
