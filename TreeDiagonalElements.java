package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Print Diagonal Elements of tree
 * @author mohitjai
 *
 */
public class TreeDiagonalElements {
	Node1 root;
	public TreeDiagonalElements() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	private void printDiagonalElements(Node1 root) {
		if(root == null) {
			return;
		}
		Queue<Node1> q1 = new LinkedList<>();
		Queue<Node1> q2 = new LinkedList<>();
		q1.add(root);
		while((!q1.isEmpty()) || (!q2.isEmpty())) {
			while(!q1.isEmpty()) {
				root = q1.poll();
				System.out.print(root.key);
				if(root.right !=null) {
					q1.add(root.right);
				}
				if(root.left !=null) {
					q2.add(root.left);
				}
				System.out.print(" ");
			}
			System.out.println();
			while(!q2.isEmpty()) {
				root = q2.poll();
				System.out.print(root.key);
				if(root.right!=null) {
					q2.add(root.right);
				}
				if(root.left != null) {
					q1.add(root.left);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String [] args) {
		TreeDiagonalElements tree = new TreeDiagonalElements();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(15);
		tree.root.right.right = new Node1(6);
		tree.root.right.right.left = new Node1(12);
		tree.printDiagonalElements(tree.root);
	}
}
