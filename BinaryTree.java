package main.java.tree;

/**
 * Check whether a binary tree is a complete tree or not
 * @author  mohijain
 * Time : 11.16 May 10, 2017
 *
 */


public class BinaryTree
{
    Node1 root;
  
    /* This function counts the number of nodes in a binary tree */
    int countNodes(Node1 root) 
    {
        if (root == null)
            return 0;
        //System.out.println(root);
        return (1 + countNodes(root.left) + countNodes(root.right));
        
    }
  
    /* This function checks if the binary tree is complete or not */
    boolean isComplete(Node1 root, int index, int number_nodes)
    {
        // An empty tree is complete
    	
    	System.out.println(index);
        if (root == null)        
           return true;
  
        // If index assigned to current node is more than
        // number of nodes in tree, then tree is not complete
        if (index >= number_nodes){
        	System.out.println("Inside the if condition");
           return false;
         }
  
        // Recur for left and right subtrees
        //System.out.println(isComplete(root.left, 2 * index + 1, number_nodes) && isComplete(root.right, 2 * index + 2, number_nodes));
        return (isComplete(root.left, 2 * index + 1, number_nodes) && isComplete(root.right, 2 * index + 2, number_nodes));
  
    }
  
    // Driver program
    public static void main(String args[]) 
    {
        BinaryTree tree = new BinaryTree();
         
        // Let us create tree in the last diagram above
        //Node NewRoot = null;
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.right = new Node1(5);
        tree.root.left.left = new Node1(4);
       //tree.root.right.right = new Node(6);
       tree.root.right.left = new Node1(15);
          
        int node_count = tree.countNodes(tree.root);
        System.out.println("Count of the nodes" + node_count);
        int index = 0;
          
        if (tree.isComplete(tree.root, index, node_count))
            System.out.print("The binary tree is complete");
        else
            System.out.print("The binary tree is not complete"); 
    }
}