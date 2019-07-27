package leetcode.mid.BinaryTree.Traversal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import Library.TreeNode;

public class binaryTreePostorderTraversal_145 {
	public List<Integer> postorderTraversal(TreeNode root) {
	    Stack<TreeNode> stack = new Stack<>();
	    List<Integer> result = new ArrayList<>();
	    if (root != null) {
	        stack.push(root);
	    }
	    while (!stack.isEmpty()) {
	        TreeNode node = stack.pop();
	        result.add(node.val);
	        if (node.left != null) {
	            stack.push(node.left);
	        }
	        if (node.right != null) {
	            stack.push(node.right);
	        }
	    }
	    Collections.reverse(result);
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
