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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root,arr,0);
    }
    public boolean dfs(TreeNode root, int[] arr,int index) {
        if(root == null ){
            return false;
        }
        if(index == arr.length-1 && root.val ==arr[index] && root.left== null  && root.right ==null){
            return true;
        }
        if(index >=arr.length || root.val != arr[index]  ){
            return false;
        }
        return dfs(root.left,arr,index+1) ||dfs(root.right,arr,index+1);
    }
}