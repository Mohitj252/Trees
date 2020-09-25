package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Print Right view of the binary tree
 * @author mohitjai
 *
 */
public class RightViewOfBinaryTree {

	Node1 root;

	public RightViewOfBinaryTree() {
		root = null;
	}

	public void rightViewOfTree(Node1 root) {
		if (root == null) {
			return;
		}
		
		Queue<Node1> queue1 = new LinkedList();
		Queue<Node1> queue2 = new LinkedList<Node1>();
		
		queue1.add(root);
		
		while ((!queue1.isEmpty()) || (!queue2.isEmpty())) {
			while (!queue1.isEmpty()) {
				
				root = queue1.poll();
				/**
				 * we need last element of each level in case of right view of binary tree,
				   if queue1 is empty means we reached to the last element of that specific level
				**/
				if (queue1.isEmpty()) {
					System.out.println(root.key);
				}
				if (root.left != null) {
					queue2.add(root.left);
				}
				if (root.right != null) {
					queue2.add(root.right);
				}
			}
			while (!queue2.isEmpty()) {
				
				root = queue2.poll();
				/**
				 * we need last element of each level in case of right view of binary tree,
				   if queue1 is empty means we reached to the last element of that specific level
				**/
				if (queue2.isEmpty()) {
					System.out.println(root.key);
				}
				if (root.left != null) {
					queue1.add(root.left);
				}
				if (root.right != null) {
					queue1.add(root.right);
				}
			}

		}

	}

	public static void main(String[] args) {

		RightViewOfBinaryTree tree = new RightViewOfBinaryTree();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(6);
		tree.root.right.right = new Node1(7);
		tree.root.right.left.right = new Node1(8);
		tree.root.right.right.right = new Node1(9);
		tree.rightViewOfTree(tree.root);
	}

}
