/******************************************************************************
 *  Compilation:  javac Heap.java
 *  Execution:    java Heap  [< input.txt]
 *  Dependencies: In.java
 *  Data files:   tiny.txt, words3.txt
 *
 *  Sorts a sequence of strings from standard input using heapsort.
 *
 *  % more tiny.txt
 *  S O R T E X A M P L E
 *
 *  % java Heap [ with tiny.txt as input ]
 *  A E E L M O P R S T X
 *
 *  % more words3.txt
 *  bed bug dad yes zoo ... all bad yet
 *
 *  % java Heap [ with words3.txt as input]
 *  all bad bed bug dad ... yes yet zoo   [ one string per line ]
 *
 ******************************************************************************/

/**
 *  The Heap class provides a static method to sort an array using heapsort.
 *
 *  This implementation takes Theta (n  log  n ) time  to sort any array of
 *  length n (assuming comparisons take constant time). It makes at most
 *  2n log n compares.
 *
 *  This sorting algorithm is not stable. It uses Theta(1) extra memory
 *  (not including the input array).
 *
 */
public class Heap {

   // This class should not be instantiated.
   private Heap() { }

   // Rearranges the array in ascending order, using the natural order.
   public static void sort(Comparable[] pq) {
      // YOUR CODE HERE
      int len = pq.length;
      for (int i = len / 2; i >= 1; i--) sink(pq, i, len);
      while (len > 1) {
         exch(pq, 1, len);
         sink(pq, 1, --len);
      }
   }

   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/

   private static void sink(Comparable[] pq, int k, int n) {
      // YOUR CODE HERE
      while(2*k <= n){
         int j  = 2*k;
         if (j < n && less(pq, j, j+1)) j++;
         if (!less(pq, k, j)) break;
         exch(pq, k, j);
         k = j;
      }
   }

   /***************************************************************************
    * Helper functions for comparisons and swaps.
    * Indices are "off-by-one" to support 1-based indexing.
    ***************************************************************************/
   private static boolean less(Comparable[] pq, int i, int j) {
      return pq[i-1].compareTo(pq[j-1]) < 0;
   }

   private static void exch(Object[] pq, int i, int j) {
      Object swap = pq[i-1];
      pq[i-1] = pq[j-1];
      pq[j-1] = swap;
   }

   // print array to standard output
   private static void show(Comparable[] a) {
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + " ");
      }
      System.out.println();
   }

   // Reads in a sequence of strings from files; heapsorts them;
   // and prints them to standard output in ascending order.
   public static void main(String[] args) {
      String[] a = new In("tiny.txt").readAllStrings();
      //String[] a = new In("words3.txt").readAllStrings();
      Heap.sort(a);
      show(a);


      // test heapsort with integers
      In in = new In("10ints.txt");
      int n = in.readInt();
      Integer[] b = new Integer[n];
      for (int i = 0; i < n; i++) {
         b[i] = in.readInt();
      }

      Heap.sort(b);
      show(b);
   }
}