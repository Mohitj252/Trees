package main.java.tree;

/**
 * Find the height of a given tree
 * @author mohitjai
 *
 */
public class BinaryTreeHeight {
	static Node1 root;
	
	public BinaryTreeHeight(){
		root = null;
	}
	int height(Node1 root){
		if (root == null){
			return 0;
		}
		
		return (1 + Math.max(height(root.left),height(root.right)));
		
	}
	
	public static void main(String [] args){
		
		BinaryTreeHeight bth = new BinaryTreeHeight();
		BinaryTreeHeight.root = new Node1(1);
		BinaryTreeHeight.root.left = new Node1(2);
        BinaryTreeHeight.root.right = new Node1(3);
        BinaryTreeHeight.root.left.right = new Node1(5);
        BinaryTreeHeight.root.left.left = new Node1(4);
        BinaryTreeHeight.root.right.right = new Node1(6);
        BinaryTreeHeight.root.right.left = new Node1(15);
        
        int height = bth.height(root);
        System.out.println(height);
	}

}
