package main.java.tree;
/**
 * Given node n1 and n2, we need to find least common ancestor of n1 and n2.
 * @author mohitjai
 *
 */
public class LCAofBinarytree {
	
	Node1 root;
	
	public LCAofBinarytree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public Node1 LCA(Node1 root, Node1 n1, Node1 n2) {
		// Base condition
		if	(root == null) {
			return null;
		}
		// if root is same as n1 or n2, at that point will return back and pass the root node value(which is either n1 or n2 value) to 
		// the called function
		if (root == n1 || root == n2) {
			return root;
		}
		//if root is not same as n1 or n2, then will traverse the tree's left and right nodes.
		Node1 left = LCA(root.left, n1, n2);
		Node1 right = LCA(root.right, n1, n2);
		
		//if left and right having not null value then we confirmed that root is the LCA for n1 and n2 value.
		if(left !=null && right != null) {
			return root;
		}
		//if left and right are null means we can say that we didn't find the n1 and n2 so returning the null value.
		if(left ==null && right == null) {
			return null;
		}
		// last case if left is not null means we find either n1 or n2 and vice versa. return left if left node having not null value 
		//otherwise return right node
		return left != null ? left:right;
		
	}
	public static void main(String[] args) {

		LCAofBinarytree tree = new LCAofBinarytree();
		tree.root = new Node1(1); 
        tree.root.left = new Node1(2); 
        tree.root.right = new Node1(3); 
        tree.root.left.left = new Node1(4); 
        tree.root.left.right = new Node1(5); 
        tree.root.right.left = new Node1(6); 
        tree.root.right.right = new Node1(7); 
        tree.root.right.left.right = new Node1(8); 
        tree.root.right.right.right = new Node1(9); 
		Node1 resultNode = tree.LCA(tree.root, tree.root.left.left, tree.root.left.right );
		System.out.println("LCA of n1 and n2 is " + resultNode.key);

	}

}
