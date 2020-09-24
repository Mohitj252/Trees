package main.java.tree;
//check binary tree is binary search tree
/**
 * Check weather binary tree is BST or not
 * One solution I provided below, one more method is we can solve the problem using the in order traversal as well, because
 * in order traversal of BST gives you sorted array.
 * @author mohitjai
 *
 */
public class IsBinaryTree_BinarySearchTree {
	
	Node1 root;
	
	public IsBinaryTree_BinarySearchTree(){
		root = null;
	}
	
	boolean isBinarySearchTree(Node1 root, int min, int max){
		if(root == null) {
			return true;
		}
		if(root.key <= min || root.key >= max ) {
			return false;
		}
		
		return isBinarySearchTree(root.left, min, root.key) && isBinarySearchTree(root.right, root.key, max);
	}
	public static void main(String [] args){
		IsBinaryTree_BinarySearchTree tree = new IsBinaryTree_BinarySearchTree();
		/**
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.right.left = new Node1(15);
        tree.root.right.right = new Node1(6);
        */
        
        tree.root = new Node1(10); 
        tree.root.left = new Node1(5);
        tree.root.left.right = new Node1(12);
        tree.root.right = new Node1(30);  
        tree.root.right.left = new Node1(20); 
        //tree.root.right.right = new Node1(30); 
        if(tree.isBinarySearchTree(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
        	System.out.println("The Given tree is BST.");
        }else {
        	System.out.println("The Given tree is not BST.");
        }
        
		
	}

}
