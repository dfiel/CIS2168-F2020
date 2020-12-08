class TreeNode<Integer> {
   TreeNode<Integer> left;
   Integer data; // node value
   TreeNode<Integer> right;

   // Constructor. Initializes node data and makes this a leaf node.
   public TreeNode(Integer data) {
      this.data = data;
      left = right = null; // node has no children
   }
}