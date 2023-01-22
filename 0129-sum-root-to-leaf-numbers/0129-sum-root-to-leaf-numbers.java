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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
       findSum(root,0);
        return sum;
    }
     public void findSum(TreeNode root,int level) {
 
         level +=root.val;
        if(root.left == null && root.right == null){
            sum += level;
        }
        if(root.left != null){
            findSum(root.left,level*10);

        }
        if(root.right != null){
          findSum(root.right,level*10);

        }
    }
}