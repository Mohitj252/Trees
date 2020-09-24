package main.java.tree;

import java.util.Stack;
/**
 * In order traversal using iterative way using 1 stack
 * @author mohitjai
 *
 */
public class InOrderTraversal {

	static Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	private void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		while (true) {
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			if(s.isEmpty()){break;}
			root = s.pop();
			System.out.println(root.data);
			root = root.right;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		InOrderTraversal iot = new InOrderTraversal();
		iot.inOrderTraversal(root);

	}

}
