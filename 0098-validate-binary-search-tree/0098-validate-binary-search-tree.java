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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return dfs(root,null,null);
    }
     public boolean dfs(TreeNode root,TreeNode min,TreeNode max) {
        if(root == null){
            return true;
        }
        if((min != null && min.val >= root.val )||
          (max != null && max.val <= root.val ))
        {
            return false;
        }
         return dfs(root.left,min,root) &&dfs(root.right,root,max);
    }
    
}