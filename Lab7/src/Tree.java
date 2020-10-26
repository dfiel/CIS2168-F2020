// class TreeNode definition
class TreeNode  <T extends Comparable<T>> {
   // package access members
   TreeNode<T> leftNode;
   T data; // node value
   TreeNode<T> rightNode;

   // constructor initializes data and makes this a leaf node
   public TreeNode(T nodeData) {
      data = nodeData;
      leftNode = rightNode = null; // node has no children
   }

   // locate insertion point and insert new node; ignore duplicate values
   public void insert(T insertValue) {
      // insert in left subtree
      if (insertValue.compareTo(data) < 0) {
         // insert new TreeNode
         if (leftNode == null)
            leftNode = new TreeNode<T>(insertValue);
         else // continue traversing left subtree recursively
            leftNode.insert(insertValue);
      }
      // insert in right subtree
      else if (insertValue.compareTo(data) > 0) {
         // insert new TreeNode
         if (rightNode == null)
            rightNode = new TreeNode<T>(insertValue);
         else // continue traversing right subtree recursively
            rightNode.insert(insertValue);
      }
   }
} // end class TreeNode

// class Tree definition
public class Tree<T extends Comparable<T>> {
   private TreeNode<T> root;

   // constructor initializes an empty Tree
   public Tree() { root = null; }

   // insert a new node in the binary search tree
   public void insertNode(T insertValue) {
      if (root == null)
         root = new TreeNode<T>(insertValue); // create root node
      else
         root.insert(insertValue); // call the insert method
   }

   // begin preorder traversal
   public void preorderTraversal() {
      preorderHelper(root);
   }

   // recursive method to perform preorder traversal
   private void preorderHelper(TreeNode<T> node) {
      if (node == null) return;

      System.out.printf("%s ", node.data); // output node data
      preorderHelper(node.leftNode); // traverse left subtree
      preorderHelper(node.rightNode); // traverse right subtree
   }

   // begin inorder traversal
   public void inorderTraversal() {
      inorderHelper(root);
   }

   // recursive method to perform inorder traversal
   private void inorderHelper(TreeNode<T> node) {
      if (node == null)  return;

      // DELETE THE FOLLOWING LINE AND INSERT YOUR CODE HERE
      System.out.println("Inorder traversal is not yet implemented.");
   }

   // begin postorder traversal
   public void postorderTraversal() {
      postorderHelper(root);
   }

   // recursive method to perform postorder traversal
   private void postorderHelper(TreeNode<T> node) {
      if (node == null) return;

      // DELETE THE FOLLOWING LINE AND INSERT YOUR CODE HERE
      System.out.println("Inorder traversal is not yet implemented.");
   }

   ///////////////////////////////////////////////////////////////////
   //////////////////// ADD YOUR OWN METHODS BELOW ///////////////////
   ///////////////////////////////////////////////////////////////////

   // return a reference to the root of this tree
   public TreeNode<T> getRoot() { return this.root;}

   // get the depth of this node
   private int depth(TreeNode<T> node) {
      // YOUR CODE HERE
      System.out.println("Method depth() is not yet implemented.");
      return 2168;
   }

   // get depth of this tree
   public int depth() {
      return depth(this.root);
   }
} // end class Tree
