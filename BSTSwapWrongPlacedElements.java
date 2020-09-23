package main.java.tree;

/**
 * In a binary search tree, two elements are placed wrong, so find those two elements and place them at correct position.
 * @author mohitjai
 *
 */
public class BSTSwapWrongPlacedElements {
	Node1 root;
	static Node1 prev, first, middle, last;
	public BSTSwapWrongPlacedElements() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	void correctBSTUtil(Node1 root) {
		if(root == null) {
			return;
		}
		correctBSTUtil(root.left);
		if(prev != null && prev.key > root.key) {
			if(first == null) {
				first = prev;
				middle = root;
			} else {
				last = root;
			}
		}
		prev = root;
		correctBSTUtil(root.right);
	}
	
	void printInorder(Node1 node) 
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(" " + node.key); 
        printInorder(node.right); 
    } 
	
	public static void main(String[] args) {
		BSTSwapWrongPlacedElements tree = new BSTSwapWrongPlacedElements();
		tree.root = new Node1(10);
		tree.root.left = new Node1(8);
		tree.root.right = new Node1(20);
		tree.root.left.left = new Node1(5);
		tree.root.left.left.left = new Node1(3);
		tree.root.left.right = new Node1(7);
		tree.root.right.left = new Node1(15);
		tree.root.right.right = new Node1(25);
		prev = null;
		first = null;
		middle = null;
		last = null;
		int temp;
		tree.correctBSTUtil(tree.root);
		// adjacent case in that case my fist points to first wrong element and middle point
		// to last wrong element
		if(first !=null && last == null) {
			temp = first.key;
			first.key  = middle.key;
			middle.key = temp;
			tree.printInorder(tree.root);
		}
		// in that case my first variable points to first wrong placed element and last points to 2nd wrong element
		if(first != null && last != null) {
			temp = first.key;
			first.key = last.key;
			last.key = temp;
			tree.printInorder(tree.root);
		}
		
		
		
	}

}
