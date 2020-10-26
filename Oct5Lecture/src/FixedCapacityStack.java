/******************************************************************************
 *  Compilation:  javac FixedCapacityStack.java
 *  Execution:    java FixedCapacityStack
 *
 *  Generic stack implementation with a fixed-size array.
 *
 *  Example:
 *  Input: tobe.txt (local file):
 *  to be or not to - be - - that - - - is
 *
 *  Output:
 *  to be not that or be
 *
 ******************************************************************************/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FixedCapacityStack<Item> implements Iterable<Item> {
   private Item[] a;    // holds the items
   private int N;       // number of items in stack

   // create an empty stack with given capacity
   public FixedCapacityStack(int capacity) {
      a = (Item[]) new Object[capacity];   // no generic array creation
      N = 0;
   }

   public boolean isEmpty()          {
      // Your code here
      return N == 0; // change this line
   }
   public void push(Item item)       {
      a[N++] = item;
   }
   public Item pop()                 {
      // Your code here
      return a[--N];     // change this line
   }
   public Iterator<Item> iterator()  { return new ReverseArrayIterator(); }


   public class ReverseArrayIterator implements Iterator<Item> {
      private int i = N-1;

      public boolean hasNext() {
         return i >= 0;
      }

      public Item next() {
         if (!hasNext()) throw new NoSuchElementException();
         // Your code here
         return a[i--]; // change this line
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }
   }


   public static void main(String[] args) {
      int max = 10;  // <- this is what we want to avoid doing
      FixedCapacityStack<String> stack = new FixedCapacityStack<String>(max);
      In in = new In("tobe.txt");
      while (!in.isEmpty()) {
         String item = in.readString();
         if (!item.equals("-")) stack.push(item);
         else if (stack.isEmpty())  System.out.println("BAD INPUT");
         else                       System.out.print(stack.pop() + " ");
      }
      System.out.println();

      // print what's left on the stack
      System.out.print("Left on stack: ");
      for (String s : stack) {
         System.out.print(s + " ");
      }
      System.out.println();
   }
}
