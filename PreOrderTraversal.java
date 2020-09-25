package main.java.tree;

import java.util.Stack;
/**
 * Print pre order traversal of binary tree using a stack
 * @author mohitjai
 *
 */
public class PreOrderTraversal {
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
	
	private void preOrderTraversal (Node root){
		if(root == null){
			return;
		}
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		
		while(!s.empty()){
			 root = s.pop();
			System.out.println(root.data);
			if(root.right != null){
				s.push(root.right);
			}
			if(root.left != null){
				s.push(root.left);
			}
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
		PreOrderTraversal pot = new PreOrderTraversal();
		pot.preOrderTraversal(root);
	}

}
