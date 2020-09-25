package main.java.tree;

import java.util.ArrayList;
import java.util.List;
/**
 * Print Root to leaf path sum equal to a given number
 * @author mohitjai
 *
 */
public class RootToLeafSumBinaryTree {
	
	static Node1 root;
	static ArrayList<Integer> result = new ArrayList<>();
	public RootToLeafSumBinaryTree(){
		root = null;
	}
	
	boolean rootToLeafSum(Node1 root, int sum, List<Integer> result){
		if(root == null){
			return false;
		}
		if(root.left == null && root.right == null){
			if(root.key == sum){
				this.result.add(root.key);
				return true;
			}else{
				return false;
			}	
		}
		
		if(rootToLeafSum(root.left, sum - root.key, result)){
			this.result.add(root.key);
			return true;
		}
		
		if(rootToLeafSum(root.right, sum - root.key, result)){
			this.result.add(root.key);
			return true;
		}
		return false;
	}
	public static void main(String [] args){
			RootToLeafSumBinaryTree tree = new RootToLeafSumBinaryTree();
		 	RootToLeafSumBinaryTree.root = new Node1(1);
	        RootToLeafSumBinaryTree.root.left = new Node1(2);
	        RootToLeafSumBinaryTree.root.right = new Node1(3);
	        RootToLeafSumBinaryTree.root.left.left = new Node1(4);
	        RootToLeafSumBinaryTree.root.left.right = new Node1(5);
	       RootToLeafSumBinaryTree.root.right.right = new Node1(6);
	       RootToLeafSumBinaryTree.root.right.left = new Node1(15);
	       
	       tree.rootToLeafSum(root, 7, result);
	       int i = 1;
	       for(Integer temp : result){
	    	   
	    	   System.out.print(temp);
	    	   
	    	   if(result.size() > i){
	    		   i++;
	    		   System.out.print(",");
	    	   }
	       }
	       
	}

}
