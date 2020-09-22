package main.java.tree;
/**
 * Find the size of a given tree
 * @author mohitjai
 *
 */
public class BinaryTreeSize {

	Node1 root;
	public static int size(Node1 root){
		
		if(root == null){
			return 0;
		}
		
		int leftcount = size(root.left);
		int rightcount = size(root.right);
		return 1 + leftcount + rightcount;
	}
	
	public static void main(String [] args){
		BinaryTreeSize bts = new BinaryTreeSize();
		bts.root = new Node1(1);
		bts.root.left = new Node1(2);
        bts.root.right = new Node1(3);
        bts.root.left.right = new Node1(5);
        bts.root.left.left = new Node1(4);
        bts.root.right.right = new Node1(6);
        bts.root.right.left = new Node1(15);
        
        int count = size(bts.root);
        System.out.println("Size of the binary tree is = " + count);
	}
}
