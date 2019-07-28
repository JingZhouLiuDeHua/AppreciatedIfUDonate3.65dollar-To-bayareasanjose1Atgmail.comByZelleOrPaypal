package leetcode.mid.tree.BinaryTree.BFS.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Library.TreeNode;
import Library.BTreePrinter;
public class binaryTreeLevelOrderTraversal_102 {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<>();
	        
	        if (root == null) {
	            return result;
	        }
	        
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        
	        while (!queue.isEmpty()) {// jing zhou liu da hua yuan chuang 2019 07
	            int levelSize = queue.size();
	            List<Integer> level = new ArrayList<>();
	            
	            for (int i = 0; i < levelSize; i++) {
	                TreeNode node = queue.poll();
	                level.add(node.val);
	                
	                if (node.left != null) {
	                    queue.offer(node.left);
	                }
	                
	                if (node.right != null) {
	                    queue.offer(node.right);
	                }      // jing zhou liu da hua yuan chuang 2019 07          
	            }    
	            
	            result.add(level);
	        }
	        
	        return result;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3); 
		root.left= new TreeNode(9); 
		root.right= new TreeNode(20); 
		root.right.left= new TreeNode(15); 
		root.right.right= new TreeNode(7); 
		binaryTreeLevelOrderTraversal_102 test=new binaryTreeLevelOrderTraversal_102();
		List<List<Integer>> res=test.levelOrder(root);
		BTreePrinter.printNode(root);
		System.out.print(res);
	}

}
