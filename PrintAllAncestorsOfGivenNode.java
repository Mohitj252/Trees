package main.java.tree;

import main.java.tree.LeafNodesAtSameLevel.Node1;

/**
 * Print all the ancestors of a given node.
 * 
 * @author mohitjai
 *
 */
public class PrintAllAncestorsOfGivenNode {

	Node1 root;

	static class Node1 {
		int data;
		Node1 left;
		Node1 right;

		Node1(int k) {
			this.data = k;
			this.left = null;
			this.right = null;
		}
	}

	private boolean printAncestorsOfGivenNode(Node1 root, int givenNodekey) {
		if (root == null) {
			return false;
		}
		// when we found the givenNodeKey, stop the searching of the key and just print the parent nodes in recursive way.
		if (root.data == givenNodekey) {
			return true;
		}
		//traverse left sub tree if the key is not equal to the givenNodekey
		if (printAncestorsOfGivenNode(root.left, givenNodekey)) {
			System.out.println(root.data);
			return true;
		}
		//traverse right sub tree if the key is not equal to the givenNodekey
		if (printAncestorsOfGivenNode(root.right, givenNodekey)) {
			System.out.println(root.data);
			return true;
		}
		//If key is not there simply return false.
		return false;
	}

	public static void main(String[] args) {
		PrintAllAncestorsOfGivenNode tree = new PrintAllAncestorsOfGivenNode();
		tree.root = new Node1(10);
		tree.root.left = new Node1(5);
		tree.root.right = new Node1(30);
		tree.root.right.left = new Node1(20);
		tree.root.right.right = new Node1(30);
		tree.root.left.left = new Node1(2);
		tree.root.left.left.left = new Node1(1);
		tree.printAncestorsOfGivenNode(tree.root, 5);
	}

}
