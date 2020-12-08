import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildHeap {
   private int[] a;          // array to be turned into a heap
   private List<Swap> swaps; // list of swapped elements while building the heap
   private PrintWriter out;  // helps print the answer (swaps) to screen.

   public static void main(String[] args) {
      new BuildHeap().solve();
   }

   // solves the problem
   public void solve() {
      readData();
      generateSwaps();
      writeResponse();
   }


   // reads the integer array a[]
   private void readData() {
      //In in = new In("5intsReverseSorted.txt");
      In in = new In("10Kints.txt");
      int n = in.readInt();
      a = new int[n];
      for (int i = 0; i < n; ++i) {
         a[i] = in.readInt();
      }
   }

   // prints the answer
   private void writeResponse() {
      out = new PrintWriter(new BufferedOutputStream(System.out));
      out.println(swaps.size());
      for (Swap swap : swaps) {
         out.println(swap.index1 + " " + swap.index2);
      }
      //out.println(Arrays.toString(a));
      out.close();
   }

   // swaps are generated when sinking array elements (see sink())
   private void generateSwaps() {
      swaps = new ArrayList<Swap>();

      // The following naive implementation sorts the given
      // sequence and saves the resulting sequence of swaps.
      // This turns the given array into a heap, but uses
      // (in the worst case) a quadratic number of swaps.
      // TODO: replace by a more efficient implementation
//      for (int i = 0; i < a.length; ++i) {
//         for (int j = i + 1; j < a.length; ++j) {
//            if (a[i] > a[j]) {
//               //swaps.add(new Swap(i, j));
//               exch(a, i, j);
//            }
//         }
//      }

      for(int i = (a.length-1)/2; i >= 0; i--){
         heapify(a, i);
      }

      // int n = a.length-1;  // the largest index in a[]
   }

   private void heapify(int[] a, int i){
      int left = (i*2)+1;
      int right = (i*2)+2;
      int min = i;
      if (left < a.length && a[left] < a[min]) min = left;
      if (right < a.length && a[right] < a[min]) min = right;
      if (min != i) {
         exch(a, i, min);
         heapify(a, min);
      }
   }

   // helper: exchanges elements at positions i and j in array a[]
   private void exch(int[] a, int i, int j) {
      swaps.add(new Swap(i, j));
      int swap = a[i];
      a[i] = a[j];
      a[j] = swap;
   }


   // helper class: a record of the indices of the swapped elements
   static class Swap {
      int index1;
      int index2;

      public Swap(int index1, int index2) {
         this.index1 = index1;
         this.index2 = index2;
      }
   }
}