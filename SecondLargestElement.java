package main.java.tree;
// Find the second largest element in the binary tree note its not complete binary tree.
public class SecondLargestElement {
	Node1 root;
	public SecondLargestElement() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	private int maxValue = 0;
	private int secondLargestElement = 0;
	private int findSecondLargestElement(Node1 root) {
		if(root == null) {
			return 0;
		}
		if(root.key > maxValue) {
			secondLargestElement = maxValue;
			maxValue = root.key;
			System.out.println(maxValue);
		} 
		
		findSecondLargestElement(root.left);
		findSecondLargestElement(root.right);
		return secondLargestElement;
	}
	public static void main(String[] args) {
		SecondLargestElement tree = new SecondLargestElement();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(15);
		tree.root.right.right = new Node1(13);
		tree.root.right.right.left = new Node1(12);
		tree.root.right.right.left.right = new Node1(122);
		int finalValue = tree.findSecondLargestElement(tree.root);
		System.out.println("2nd Largest element "+ finalValue);
	}

}
