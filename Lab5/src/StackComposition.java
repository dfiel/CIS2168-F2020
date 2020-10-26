public class StackComposition<E> {
   private SLList<E> stackList;

   // no-argument constructor
   public StackComposition() {
      stackList = new SLList<E>();
   }

   // add an element to this stack
   public void push(E element) {
      stackList.addFirst(element);
   }

   // remove an element from this stack
   public E pop() {
      return stackList.removeFirst();
   }

   // determine if the stack is empty
   public boolean isEmpty() {
      return stackList.isEmpty();
   }

   // A String representation of this stack
   @Override
   public String toString() {
      return stackList.toString();
   }

   // return the size of this stack
   public int size() {
      return stackList.size();
   }

   // test StackComposition
   public static void main(String[] args) {
      StackComposition<Integer> stack = new StackComposition<>();
      // YOUR TEST-CASES BELOW

//      stack.push(8);
//      stack.push(77);
//      System.out.println(stack);
//      System.out.println("the popped element is " + stack.pop());
//
//      System.out.println("the stack now is");
//      System.out.println(stack);
//      System.out.println(stack.size());
//      stack.pop();
//      System.out.println(stack.size());
//      stack.pop();
//      System.out.println(stack);



      // Another test: Make a stack of Strings and read items from a file.
      // (uncomment all commented lines lines below this one.)
      StackComposition<String> stack1 = new StackComposition<>();
      In in = new In("tobe.txt");
      while (!in.isEmpty()) {
         String item = in.readString();
         if (!item.equals("-")) stack1.push(item);
         else if (!stack1.isEmpty()) System.out.print(stack1.pop() + " ");
      }
      System.out.println("(" + stack1.size() + " left on stack)");
      System.out.println(stack1);
   }
}