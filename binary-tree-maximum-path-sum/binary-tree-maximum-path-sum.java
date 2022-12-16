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
 
 
         -10
         / \
        9   20
            /\
          15  7
          
          
 
 */
class Solution {
    public int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        getMaxTree(root);
        return max;
    }
    //20 15
   public int getMaxTree(TreeNode root){
       if(root == null){
           return 0;
       }
       //15
       int maxLeft = Math.max(0, getMaxTree(root.left));
       //35
       int maxRigth = Math.max(0, getMaxTree(root.right));
       //40
       max = Math.max(max, maxLeft + root.val + maxRigth);
       
       return  Math.max(root.val + maxLeft, root.val + maxRigth);
       
   }
}