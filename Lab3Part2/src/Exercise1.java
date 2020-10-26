import java.util.*;

public class Exercise1 {
   public static List<Integer> moveElementToEnd(List<Integer> list, int toMove) {
      // Write your code here.
      int numRemoved = 0;

      while(list.contains(toMove)){
         numRemoved++;
         list.remove((Object) toMove);
      }

      for(int i = 0; i < numRemoved; i++){
         list.add(toMove);
      }

      return list;
   }

   public static void main(String[] args) {
      List<Integer> list;
      List<Integer> result;
      /*------------- START TEST 1 ---------------*/
      list = new ArrayList<>(List.of(2, 1, 2, 2, 2, 6, 8, 2));
      result = moveElementToEnd(list, 2);
      System.out.println(result + "\n");  // should print [1, 6, 8, 2, 2, 2, 2, 2]

      /*------------- START TEST 2 ---------------*/
      list = new ArrayList<>(List.of(1, 2, 3, 4));
      result = moveElementToEnd(list, 3);
      System.out.println(result + "\n");  // should print [1, 2, 4, 3]

      /*------------- START TEST 3 ---------------*/
      list = new ArrayList<>(List.of(0, 8, 3, 0));
      result = moveElementToEnd(list, 1);
      System.out.println(result + "\n");  // should print [0, 8, 3, 0]

      /*------------- START TEST 4 ---------------*/
      list = new ArrayList<>(List.of(4, 4, 4, 4, 4, 4, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12));
      result = moveElementToEnd(list, 4);
      System.out.println(result + "\n");  // should print [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4]

      /*------------- START TEST 5 ---------------*/
      list = new ArrayList<>(List.of());
      result = moveElementToEnd(list, 1);
      System.out.println(result + "\n");  // should print [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4]

      /*------------- START TEST 6 ---------------*/
      list = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4));
      result = moveElementToEnd(list, 4);
      System.out.println(result + "\n");  // should print [1, 2, 3, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4, 4]

      /*------------- START TEST 7 ---------------*/
      list = new ArrayList<>(List.of(1, 1, 1, 1, 1));
      result = moveElementToEnd(list, 1);
      System.out.println(result + "\n");  // should print [1, 1, 1, 1, 1]
   }
}
