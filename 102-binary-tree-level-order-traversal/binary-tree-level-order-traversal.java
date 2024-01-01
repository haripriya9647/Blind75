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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if(root==null)
          return li;
        
        level(root,0,li);
        return li;
    }
    public void level(TreeNode curr,int height,List<List<Integer>> li){
        if(curr==null)
          return;

        if(height>=li.size())
           li.add(new ArrayList<Integer>());
        li.get(height).add(curr.val);
        level(curr.left,height+1,li);
        level(curr.right,height+1,li);
    }
}