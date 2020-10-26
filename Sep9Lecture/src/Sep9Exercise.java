import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sep9Exercise {
   /* Your goal by the end of today's class:
      Write a java program that
        1) Reads the input text file into an ArrayList of Strings
        2) Make sure part 1) went well by printing the list. It should
           output [one, two, three, four, five, once, I, caught, a, fish, alive]
        3) Transform the list you created in part 2) into a new list by inserting
           a "~" (tilde) in front of each word, doubling the size of the list

           Thus, the list shown above is transformed to
                [~, one, ~, two, ~, three, .... ~, alive]
        4) Now do the reverse operation: remove the tildes from the list to get
           the original list back.
        5) Upload your running program to Canvas - it is worth 3 points.
   */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner iFile = new Scanner(new File("input.txt"));
      ArrayList<String> stringArrayList= new ArrayList<>();

      while(iFile.hasNext()){
         stringArrayList.add(iFile.next());
      }
      System.out.println(stringArrayList);

      int initialArraySize = stringArrayList.size();
      for(int i = 0; i < initialArraySize; i++){
         stringArrayList.add(i*2, "~");
      }
      System.out.println(stringArrayList);

      while(stringArrayList.contains("~")){
         stringArrayList.remove("~");
      }
      System.out.println(stringArrayList);
   }
}
