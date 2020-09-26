package main.java.tree;

/**
 * Find the second largest element in the binary search tree
 * @author mohitjai
 *
 */
public class SecondLargestElementInBST {
	
	
	Node1 root;
	
	void findSecondLargestElement(Node1 root, int temp) {
		if(root == null) {
			return;
		}
		
		if(root.right != null) {
			temp = root.key;
			findSecondLargestElement(root.right, temp);
		}
		
		//this condition will execute when our root pointing to the right most element of the tree and that time second largest element
		// element is hold by temp variable.
		if(root.right == null) {
			System.out.println("The second largest element is "+ temp);
			return;
		}
	}
	
	
	public static void main(String[] args) {

		SecondLargestElementInBST tree = new SecondLargestElementInBST();
		tree.root = new Node1(10); 
        tree.root.left = new Node1(5); 
        tree.root.right = new Node1(30);  
        tree.root.right.left = new Node1(20); 
        tree.root.right.right = new Node1(30); 
		
        //condition 1 if my tree have only 1 element, condition 2 (else if), if my tree have only two elements.
        if(tree.root.right==null && tree.root.left == null) {
        	System.out.println("Total elements are lesser than two in the BST, please add the element and try it..");
        }else if(tree.root.right == null) {
        	System.out.println("The second largest element is "+ tree.root.key);
        }else {
        	int temp = tree.root.key;
        	tree.findSecondLargestElement(tree.root, temp);
        }

	}

}
