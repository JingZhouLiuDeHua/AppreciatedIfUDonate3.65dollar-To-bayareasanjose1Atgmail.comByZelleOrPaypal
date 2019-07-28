package Library;

/* One node of a binary tree. The data element stored is a single 
 * character.
 */
public class TreeNode {
	public int val;      
	public TreeNode left;    
	public TreeNode right; 
	public TreeNode parent;
	private int size=0;

	public TreeNode(int v){
		val = v;
		size = 1;
	}
	
	public void setLeftChild(TreeNode left){
		this.left=left;
		if(left!=null){
			left.parent=this;
		}
	}
	
	public void setRightChild(TreeNode right){
		this.right=right;
		if(right!=null){
			right.parent=this;
		}
	}
	
	public void insertInOrder(int v) {
		if(v<=val){
			if(left==null){
				setLeftChild(new TreeNode(v));
			}else{
				left.insertInOrder(v);
			}
		}else{
			if(right==null){
				setRightChild(new TreeNode(v));
			}else{
				right.insertInOrder(v);
			}
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isBST(){
		if(left!=null){
			if(val<left.val || !left.isBST() ){
				return false;
			}
		}
		
		if(right != null){
			if(val>=right.val || !right.isBST() ){
				return false;
			}
		}				
		return true;
	}
	
	public int height() {
		int leftHeight = left!=null ? left.height() : 0;
		int rightHeight = right!=null ? right.height() : 0;
		return 1+Math.max(leftHeight, rightHeight);
	}
	
	public TreeNode find(int v){
		if(v==val){
			return this;
		}else if(v<=val){
			return left!=null ? left.find(v) : null;
		}else if(v>val){
			return right!=null ? right.find(v) : null;
		}
		return null;
	}
	
	private static TreeNode createMinimalBST(int arr[], int left, int right){
		if (right<left){
			return null;
		}
		int mid=(left+right)/2;
		TreeNode root=new TreeNode(arr[mid]);
		root.setLeftChild(createMinimalBST(arr, left, mid-1));
		root.setRightChild(createMinimalBST(arr, mid+1, right));
		return root;
	}
	
	public static TreeNode createMinimalBST(int arr[]) {
		return createMinimalBST(arr, 0, arr.length-1);
	}
	
	public void print() {
		BTreePrinter.printNode(this);
	}
} 
