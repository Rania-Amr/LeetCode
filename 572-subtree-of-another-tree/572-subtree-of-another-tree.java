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
        if(root ==  null) return false;
        
         if(isMatchNodes(root,subRoot)){
             return true;
         }
     
        
        return isSubtree(root.right,subRoot) || isSubtree(root.left,subRoot) ;
    }
     public boolean isMatchNodes(TreeNode root,TreeNode subRoot) {
         if(root == null && subRoot ==null) return true;
         else if(subRoot == null || root == null){
             return false;
         }
         
        if (root.val != subRoot.val) return false;
      return isMatchNodes(root.left,subRoot.left) && isMatchNodes( root.right, subRoot.right);
    }
}