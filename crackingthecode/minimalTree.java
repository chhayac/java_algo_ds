package crackingthecode;
/* Minimal Tree : Given a sorted(increasing order) array with unique elements, write an algorithm to 
 * create a binary search tree with minimal height.
 */

/* Binary tree node */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int x) {
		val = x;
		left = right = null;
	}
}

public class minimalTree {
	
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null || nums.length == 0) {
			return null;
		}
		return createMinimalBST(nums, 0, nums.length -1);	
	}
	
	public TreeNode createMinimalBST(int[] nums, int start, int end) {
		if(end < start) {
			return null;
		}
		
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = createMinimalBST(nums, 0, mid -1);
		root.right = createMinimalBST(nums, mid + 1, end);
		return root;
	}
	
	public void preOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		System.out.println(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void main(String[] args) {
		minimalTree bst = new minimalTree(); 
		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
		TreeNode node = bst.sortedArrayToBST(nums);
		System.out.println("Preorder Tree Traveral of new tree: ");
		bst.preOrder(node);

	}

}
