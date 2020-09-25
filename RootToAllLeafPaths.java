package main.java.tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Print all the paths from root to leafs.
 * We can solve this problem using iterative post order traversal as well (1 stack required)
 * @author mohitjai
 *
 */
public class RootToAllLeafPaths {
	Node1 root;
	Stack<Node1> stack = new Stack<Node1>();
	public RootToAllLeafPaths() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	private void printAllPaths(Node1 root) {
		if(root == null) {
			return;
		}
		stack.push(root);
		printAllPaths(root.left);
		//check this condition for the leaf element, if you reach to the leaf element print the entire stack and remove the leaf 
		//element.
		if(root.left == null && root.right == null) {
			stack.forEach(k->{System.out.print(k.key +" ");});
			stack.pop();
			System.out.println();
			return;
		}
		// traverse all the right element
		printAllPaths(root.right);
		//finally remove the root element
		stack.pop();
	}
	public static void main(String[] args) {
		RootToAllLeafPaths tree = new RootToAllLeafPaths();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(15);
		tree.root.right.right = new Node1(13);
		tree.root.right.right.left = new Node1(12);
		tree.printAllPaths(tree.root);
	}

}
