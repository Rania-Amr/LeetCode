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
     int sum =0;
    public int sumNumbers(TreeNode root) {
       
        sumNumbersDfs(root,0);
        return sum;
    }
   public void sumNumbersDfs(TreeNode root,int levelSum) {
        if (root == null)
      return ;
      
      levelSum+=root.val;
      if (root.left == null && root.right == null){
       sum+=levelSum;
       levelSum-=root.val;
      
          return;
      }
      
  
      sumNumbersDfs(root.left, levelSum*10);      
      sumNumbersDfs(root.right, levelSum*10);
 
    }
}