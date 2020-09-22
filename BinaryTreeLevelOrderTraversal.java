package main.java.tree;

import java.util.*;
/**
 * Print the level order traversal of the given tree
 * @author mohitjai
 *
 */
public class BinaryTreeLevelOrderTraversal {
	
	Node1 root;
	
	public BinaryTreeLevelOrderTraversal(){
		root = null;
	}
	
	void treeLevelTraversal(Node1 root){
		if(root == null) return;
		Queue<Node1> queue = new LinkedList<Node1>();
		queue.add(root);
		//System.out.println(root.key);
		while(queue.size() > 0){
			root = queue.poll();
			System.out.println(root.key);
			if(root.left != null){
				queue.add(root.left);
			}
			if(root.right != null){
				queue.add(root.right);
			}
		}
	}
	public static void main(String [] args){
		
		BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();
		tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.right.left = new Node1(15);
        tree.root.right.right = new Node1(6);
        tree.treeLevelTraversal(tree.root);
		
	}

}
