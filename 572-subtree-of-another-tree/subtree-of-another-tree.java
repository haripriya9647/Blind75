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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
     String left = sub(root);
     String right = sub(subRoot);

     return (left.contains(right));

}

public String sub(TreeNode node){
      StringBuilder sb = new StringBuilder("^");
       if(node==null){
          return "null";
       }

        
        sb.append(node.val);
        sb.append(sub(node.left));
        sb.append( sub(node.right));

        return sb.toString();
}
}