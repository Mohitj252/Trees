package main.java.tree;

/**
 * Insert element in a binary search tree
 * @author mohitjai
 *
 */
public class BST_INSERT {
	Node1 root;
	
	public BST_INSERT(){
		root = null;
	}
	public  void insert(int key){
		root = insertRecord(root, key); 
		
	}
	
	Node1 insertRecord(Node1 root, int key){
		if(root == null){
			root = new Node1(key);
			return root;
		}
		if(key < root.key){
			root.left = insertRecord(root.left,key);
		}else{
			root.right = insertRecord(root.right, key);
		}
		
		return root;
	}
	
	
	void inorder()  {
	       inorderRec(root);
	    }
	// A utility function to do inorder traversal of BST
    void inorderRec(Node1 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
	
	public static void main(String[] args){
		BST_INSERT tree = new BST_INSERT();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorder();
	}

}
