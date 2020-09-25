package main.java.tree;

import java.util.Stack;


/**
 * print post order traversal using one stack using a current(left node) and a temp(right node) node pointer.
 * @author mohitjai
 *
 */
public class PostOrderTraversalUsingOneStack {
	Node1 root;

	public PostOrderTraversalUsingOneStack() {
		root = null;
	}

	void postOrderTraversal(Node1 root) {
		if (root == null) {
			return;
		}
		Stack<Node1> stack = new Stack<Node1>();
		Node1 current = root;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				Node1 temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					System.out.print(temp.key + ",");
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.key + ",");
					}
				} else {
					current = temp;
				}

			}
		}

	}
	
	public static void main(String [] args){
		PostOrderTraversalUsingOneStack tree = new PostOrderTraversalUsingOneStack();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.right = new Node1(6);
		tree.root.right.right.right = new Node1(7);
		tree.postOrderTraversal(tree.root);
		
	}
}
