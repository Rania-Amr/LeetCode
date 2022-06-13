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
       return isValidBST(root,null,null);
    }
    public boolean isValidBST(TreeNode root, Integer low,Integer hight) {
        if(root == null){
            return true;
        }else if(low != null && low >=root.val ){
            return false;
        }else if(hight !=null && hight <= root.val){
            return false;
        }else{
            return isValidBST(root.right,root.val,hight) &&isValidBST(root.left,low,root.val);
        }
    }
    
 
}