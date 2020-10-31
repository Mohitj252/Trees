package main.java.tree;

import main.java.tree.KDistanceFromRoot.Node;

public class LeafNodesAtSameLevel {
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

private boolean firstLeaf = true;
private int firstLeafLevel;
private boolean checkAllLeafAtSameLevel(Node1 root, int level) {
	if(root == null) {
		return true;
	}
	// check leaf node condition
	if(root.left == null && root.right == null) {
		//if first leaf then set the value of the firstLeafLevel node else compare the current leaf level with the
		// firstLeafLevel if both are same return true otherwise return false.
		if(firstLeaf) {
			firstLeaf = false;
			firstLeafLevel = level;
			System.out.println("first leaf node level "+ firstLeafLevel);
			return true;
		} else if (firstLeafLevel == level) {
			return true;
		} else {
			return false;
		}
	}
	//recursive call for left and right nodes
	return checkAllLeafAtSameLevel(root.left, level+1) && checkAllLeafAtSameLevel(root.right, level+1);
}
	
public static void main(String[] args) {
	LeafNodesAtSameLevel tree = new LeafNodesAtSameLevel();
	tree.root = new Node1(10); 
    tree.root.left = new Node1(5); 
    tree.root.right = new Node1(30);  
    tree.root.right.left = new Node1(20); 
    tree.root.right.right = new Node1(30);
    tree.root.left.left = new Node1(2);
    tree.root.left.left.left = new Node1(1);
	if(tree.checkAllLeafAtSameLevel(tree.root, 0))
		System.out.println("Leaf nodes are at the same level");
	else {
		System.out.println("Leaf nodes are not at the same level");
	}
}

}
