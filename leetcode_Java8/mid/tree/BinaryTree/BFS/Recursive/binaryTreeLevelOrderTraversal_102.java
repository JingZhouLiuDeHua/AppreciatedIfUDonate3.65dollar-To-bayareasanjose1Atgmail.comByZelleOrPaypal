package leetcode.mid.tree.BinaryTree.BFS.Recursive;
import java.util.ArrayList;
import java.util.List;

import Library.BTreePrinter;
import Library.TreeNode;


public class binaryTreeLevelOrderTraversal_102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
	     List<List<Integer>> result = new ArrayList<List<Integer>>();

	        levelRecursion(root, result, 0);
	     // jing zhou liu da hua yuan chuang 2019 07
	        return result;
	    }

	    private void levelRecursion(TreeNode node, List<List<Integer>> result,
	            int level) {
	        if (node == null) {
	            return;
	        }
	        if (result.size() < level + 1) {// jing zhou liu da hua yuan chuang 2019 07
	            result.add(new ArrayList<Integer>());
	        }
	        result.get(level).add(node.val);

	        levelRecursion(node.left, result, level + 1);
	        levelRecursion(node.right, result, level + 1);
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
