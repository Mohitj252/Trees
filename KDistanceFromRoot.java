package main.java.tree;

import java.util.Queue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Given a Binary Tree of size N and an integer K. Print all nodes that are at distance k from root (root is considered at distance 0 from itself). Nodes should be printed from left to right. If k is more that height of tree, nothing should be printed.
 *  For example, if below is given tree and k is 2. Output should be 4 5 6.
 *  
 *  	 1
       /   \
     2      3
    /      / \
   4      5   6 
    \
     8
 * @author mohitjai
 *
 */
public class KDistanceFromRoot {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int k) {
			this.data = k;
			this.left = null;
			this.right = null;
		}
	}

	private ArrayList<Integer> printKDistanceNodesFromRoot(Node root, int k) {

		if (root == null) {
			return null;
		}

		int count = 0;
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		q1.add(root);
		ArrayList<Integer> list = new ArrayList();
		while ((!q1.isEmpty()) || (!q2.isEmpty())) {

			while (!q1.isEmpty()) {
				//check the condition for the kth level
				if (count == k) {
					while (!q1.isEmpty()) {
						list.add(q1.poll().data);
					}
					return list;
				}
				root = q1.poll();
				if (root.left != null) {
					q2.add(root.left);
				}
				if (root.right != null) {
					q2.add(root.right);
				}
			}
			
			++count;
			
			while (!q2.isEmpty()) {
				//check the condition for the kth level
				if (count == k) {
					while (!q2.isEmpty()) {
						list.add(q2.poll().data);
					}
					return list;
				}
				root = q2.poll();
				if (root.left != null) {
					q1.add(root.left);
				}
				if (root.right != null) {
					q1.add(root.right);
				}
			}
			
			++count;
			
		}
		return list;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		KDistanceFromRoot printElementsFromKDistance = new KDistanceFromRoot();
		ArrayList list = printElementsFromKDistance.printKDistanceNodesFromRoot(root, 0);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
