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
    public boolean isUnivalTree(TreeNode root) {
        return isval(root,root.val);
    }
    public boolean isval(TreeNode root,int val){
        
        if(root==null)
          return true;

        if(root.val!=val)
           return false;

        boolean left = isval(root.left,val);
        boolean right = isval(root.right,val);

        return left && right;
        
    }
}