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
    ArrayList<Integer> arr =new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inoreder(root);
        return arr.get(k-1);
    }
     public void inoreder(TreeNode root) {
         if(root ==null)return;
         inoreder(root.left);
         arr.add(root.val);
        inoreder(root.right);
    }
    
}