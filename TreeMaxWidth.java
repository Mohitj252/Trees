package main.java.tree;

/**
 * Java program to calculate width of binary tree
 * another solution: We can use level order traversal to calculate max width at each level.
 * @author mohitjai
 *
 */
class Node 
{
 int data;
 Node left, right;

 Node(int item) 
 {
     data = item;
     left = right = null;
 }
}

class BinaryTree1 
{
 Node root;

 /* Function to get the maximum width of a binary tree*/
 int getMaxWidth(Node node) 
 {
     int maxWidth = 0;
     int width;
     int h = height(node);
     int i;

     /* Get width of each level and compare 
        the width with maximum width so far */
     for (i = 1; i <= h; i++) 
     {
         width = getWidth(node, i);
         if (width > maxWidth)
             maxWidth = width;
     }

     return maxWidth;
 }

 /* Get width of a given level */
 int getWidth(Node node, int level) 
 {
     if (node == null)
         return 0;

     if (level == 1)
         return 1;
     else if (level > 1)
         return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
     return 0;
 }

 /* UTILITY FUNCTIONS */
  
 /* Compute the "height" of a tree -- the number of
  nodes along the longest path from the root node
  down to the farthest leaf node.*/
 int height(Node node) 
 {
     if (node == null)
         return 0;
     else
     {
         /* compute the height of each subtree */
         int lHeight = height(node.left);
         int rHeight = height(node.right);
           
         /* use the larger one */
         //return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
         return (1+ Math.max(lHeight, rHeight));
     }
 }

 /* Driver program to test above functions */
 public static void main(String args[]) 
 {
     BinaryTree1 tree = new BinaryTree1();
      
     /*
     Constructed binary tree is:
           1
         /  \
        2    3
      /  \    \
     4   5     8 
              /  \
             6   7
      */
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);
     tree.root.right.right = new Node(8);
     tree.root.right.right.left = new Node(6);
     tree.root.right.right.right = new Node(7);

     System.out.println("Maximum width is " + tree.getMaxWidth(tree.root));
 }
}
