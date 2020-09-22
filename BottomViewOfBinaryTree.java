package main.java.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * Print the bottom view of the given tree
 * @author mohitjai
 *
 */
//Implemented using vertical order traversal 
public class BottomViewOfBinaryTree {
	Node1 root;

	// Default Constructor
	public BottomViewOfBinaryTree() {
		root = null;
	}

	public void getVerticalOrderTraversal(Node1 root, int hd, Map<Integer, ArrayList<Integer>> m) {

		if (root == null) {
			return;
		}

		ArrayList<Integer> list = m.get(hd);

		if (list == null) {
			list = new ArrayList<Integer>();
			list.add(root.key);
		} else {
			list.add(root.key);
		}

		m.put(hd, list);

		getVerticalOrderTraversal(root.left, hd - 1, m);
		getVerticalOrderTraversal(root.right, hd + 1, m);

	}

	public static void main(String[] args) {

		BottomViewOfBinaryTree tree = new BottomViewOfBinaryTree();
		tree.root = new Node1(1); 
        tree.root.left = new Node1(2); 
        tree.root.right = new Node1(3); 
        tree.root.left.left = new Node1(4); 
        tree.root.left.right = new Node1(5); 
        tree.root.right.left = new Node1(6); 
        tree.root.right.right = new Node1(7); 
        tree.root.right.left.right = new Node1(8); 
        tree.root.right.right.right = new Node1(9); 
		Map<Integer, ArrayList<Integer>> m = new HashMap<>();
		tree.getVerticalOrderTraversal(tree.root, 0, m);
		for(Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
			System.out.println(entry.getValue().get(entry.getValue().size()-1));
		}

	}

}

