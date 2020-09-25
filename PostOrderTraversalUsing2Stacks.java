package main.java.tree;

import java.util.Stack;
/**
 * This class implements Post Order Traversal of a binary tree using two stacks
 * @author mohijain
 *
 */

public class PostOrderTraversalUsing2Stacks {
	static Node root;
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	/**
	 * 
	 * @param root root node of the tree
	 */
	private void postOrderTraversal (Node root){
		if(root == null){
			return;
		}
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while(s1.size() > 0){
			root = s1.pop();
			s2.push(root);
			if(root.left != null){
				s1.push(root.left);
			}
			if(root.right != null){
				s1.push(root.right);
			}
		}
		while(s2.size() > 0){
			System.out.println(s2.pop().data);
		}
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		PostOrderTraversalUsing2Stacks pot = new PostOrderTraversalUsing2Stacks();
		pot.postOrderTraversal(root);
	}

}
