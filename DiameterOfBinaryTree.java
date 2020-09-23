package main.java.tree;

/**
 * Find the diameter of the given tree
 * @author mohitjai
 *
 */
public class DiameterOfBinaryTree {
	Node1 root;

	public DiameterOfBinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	int findMaximumDepth(Node1 root) {
		if (root == null) {
			return 0;
		}
		int left = findMaximumDepth(root.left);
		int right = findMaximumDepth(root.right);

		return 1 + Math.max(left, right);
	}

	public static void main(String[] args) {
		DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(15);
		tree.root.right.right = new Node1(6);
		tree.root.right.right.left = new Node1(12);

		
		int leftDepth = tree.findMaximumDepth(tree.root.left);
		int rightDepth = tree.findMaximumDepth(tree.root.right);
		int finalDiameter = 1 + leftDepth + rightDepth;
		System.out.println(finalDiameter);
		

	}
}
