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
    public int countNodes(TreeNode root) {
        if(root==null)
          return 0;

        int[] count = {0};
        c(root,count);
        return count[0]; 
 
    }
    public void c(TreeNode root,int[] count){
        if(root==null)
           return;

        count[0] +=1;
        c(root.left,count);
        c(root.right,count);
    } 
}