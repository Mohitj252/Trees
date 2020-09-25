package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Find LCA for given nodes n1 and n2
 * @author mohitjai
 *
 */
public class LeftViewOfBinaryTree {

	Node1 root;

	public LeftViewOfBinaryTree() {
		root = null;
	}

	public void leftViewOfTree(Node1 root) {
		if (root == null) {
			return;
		}
		Queue<Node1> queue1 = new LinkedList();
		Queue<Node1> queue2 = new LinkedList<Node1>();
		queue1.add(root);
		//added leftElementOfLevel to print only the first element at each level
		boolean leftElementOfLevel = true;
		while ((!queue1.isEmpty()) || (!queue2.isEmpty())) {
			while (!queue1.isEmpty()) {
				root = queue1.poll();
				if (leftElementOfLevel) {
					System.out.println(root.key);
					leftElementOfLevel = false;
				}
				if (root.left != null) {
					queue2.add(root.left);
				}
				if (root.right != null) {
					queue2.add(root.right);
				}
			}
			//again making it to true (print first element of queue2 of level order traversal)
			leftElementOfLevel = true;
			while (!queue2.isEmpty()) {
				root = queue2.poll();
				if (leftElementOfLevel) {
					System.out.println(root.key);
					leftElementOfLevel = false;
				}
				if (root.left != null) {
					queue1.add(root.left);
				}
				if (root.right != null) {
					queue1.add(root.right);
				}
			}
			leftElementOfLevel = true;

		}

	}

	public static void main(String[] args) {

		LeftViewOfBinaryTree tree = new LeftViewOfBinaryTree();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(6);
		tree.root.right.right = new Node1(7);
		tree.root.right.left.right = new Node1(8);
		tree.root.right.right.right = new Node1(9);
		tree.leftViewOfTree(tree.root);
	}

}
