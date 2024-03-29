/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        // Initialize sum as an array of one element to allow modification inside the range method
        int[] sum = {0};
        range(root, low, high, sum);
        return sum[0];
    }

    public void range(TreeNode root, int low, int high, int[] sum) {
        if (root == null)
            return;

        if (root.val >= low && root.val <= high)
            sum[0] += root.val;

        range(root.left, low, high, sum);
        range(root.right, low, high, sum);
    }
}
