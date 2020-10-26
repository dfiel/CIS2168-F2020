import java.io.*;

public class BufferedReaderExample {

   public static void main(String[] args) throws IOException {
      // open the loremipsum.txt file.
      // for each line in the file, do
      //   - read the line as a String
      //   - print that String to the console
      File infile = new File("Xanadu.txt");
      BufferedReader reader = new BufferedReader(new FileReader(infile));
      String line;

      while ((line = reader.readLine()) != null) {
         System.out.println(line);
      }
   }
}
