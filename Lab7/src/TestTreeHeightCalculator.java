import java.io.IOException;

// Test cases for TreeHeightCalculator.java. To run this file, you
// need to download the tree.txt and treeBig.txt input files and put
// them in a place where this file can find them. You may need to edit
// the filenames in main() accordingly.
public class TestTreeHeightCalculator {
   public static void main(String[] args) {
      TreeHeightCalculator t = new TreeHeightCalculator();
      int height;

      // test case 0 (example on page 1 of instructions)
      t.readTree("TestCases/tree.txt");
      height = t.computeHeight();
      System.out.println(height);

      // ------------------------------------ //
      // you can add your own test cases here //
      // ------------------------------------ //

      // test case: the big tree (the naive solution takes a long time to run this
      //                          your solution should take a couple of seconds.)
      new Thread(null, new Runnable() {
         public void run() {
            try {
               new TestTreeHeightCalculator().run();
            } catch (IOException e) {
            }
         }
      }, "1", 1 << 26).start();
   }

   public void run() throws IOException {
      TreeHeightCalculator tree = new TreeHeightCalculator();
      tree.readTree("TestCases/treeBig.txt");
      System.out.println(tree.computeHeight());
   }
}
