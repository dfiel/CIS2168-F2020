import java.util.ArrayList;
import java.util.List;

public class TreeHeightCalculator {
   int n;
   int parent[];
   //private ArrayList<Integer>[] nodes;
   //int root;

   void readTree(String fileName) {
      TreeReader in = new TreeReader(fileName);
      n = in.nextInt(); // the number of nodes in the tree (first line)
      parent = in.readNInts(n); // read parent indexes from the file into parent[]
      //System.out.println(Arrays.toString(parent));

      // In your solution, you may need to add some code here, too
   }

   int computeHeight() {
      // Replace this code with a faster implementation
      int maxHeight = 0;
//      for (int vertex = 0; vertex < n; vertex++) {
//         int height = 0;
//         for (int i = vertex; i != -1; i = parent[i])
//            height++;
//         maxHeight = Math.max(maxHeight, height);
//      }
//      return maxHeight;
      //Stopwatch time = new Stopwatch();
      long stime = System.currentTimeMillis();
      boolean[] heightA = new boolean[n+1];
      for(int N : parent){
         heightA[N+1] = true;
      }
      for(boolean N : heightA) if (N) maxHeight++;
      System.out.println("Calculation Time (ms): " + (System.currentTimeMillis() - stime));
      return maxHeight;
   }

   // Test cases. If you get an error running this file, make sure your
   // IDE can find the input text files tree.txt, tree1.txt, etc. You may
   // have to move files around on your filesystem to do this.
   public static void main(String[] args) {
      TreeHeightCalculator t = new TreeHeightCalculator();
      int height;

      // test case 0 (example on page 1 of instructions)
      t.readTree("TestCases/tree.txt");
      height = t.computeHeight();
      System.out.println(height);

      // test case 1 (the tree from sample run 1 of the instructions)
      t.readTree("TestCases/tree2.txt");
      height = t.computeHeight();
      System.out.println(height);

      // test case 2 (the tree from sample run 2 of the instructions)
      t.readTree("TestCases/tree3.txt");
      height = t.computeHeight();
      System.out.println(height);

      // test case 3
      t.readTree("TestCases/treeBig.txt");
      height = t.computeHeight();
      System.out.println(height);
   }
}
