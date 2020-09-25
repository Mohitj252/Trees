package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

//				1
//			/		\
//		2				3								o/p  1
//	/	  \			  /   \									 2 3
//4			5		6		7								 4 5 6 7
//
//
//
public class LevelOrderTraversalLevelByLevel {

	Node1 root;

	public LevelOrderTraversalLevelByLevel() {
		root = null;
	}

	void levelOrderTraversal(Node1 root) {

		if (root == null) {
			return;
		}

		Queue<Node1> q1 = new LinkedList<Node1>();
		Queue<Node1> q2 = new LinkedList<Node1>();

		q1.add(root);
		while ((!q1.isEmpty()) || (!q2.isEmpty())) {

			while (!q1.isEmpty()) {
				root = q1.poll();
				if (root.left != null) {
					q2.add(root.left);
				}
				if (root.right != null) {
					q2.add(root.right);
				}
				System.out.print(root.key + " ");
			}
			System.out.println();
			while (!q2.isEmpty()) {
				root = q2.poll();
				if (root.left != null) {
					q1.add(root.left);
				}
				if (root.right != null) {
					q1.add(root.right);
				}
				System.out.print(root.key + " ");
				if(q2.isEmpty()){
					System.out.println();
				}
			}
			

		}

	}
	
	public static void main(String args[]) 
    {
		LevelOrderTraversalLevelByLevel tree = new LevelOrderTraversalLevelByLevel();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(7);
        tree.levelOrderTraversal(tree.root);
    }
        
        

}
