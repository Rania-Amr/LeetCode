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
    int start = 0;
    int end ;
    int[] preorder;
    public TreeNode bstFromPreorder(int[] preorder) {
        this.preorder=preorder;
        end= preorder.length-1;
        return helper(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
     public TreeNode helper(int lower, int upper) {
        if(start > end) return null;
        int number = preorder[start];
        if(number > upper || number < lower) return null;
         start++;
         TreeNode t= new TreeNode(number);
         t.left = helper(lower,number);
         t.right = helper(number, upper);
         return t;
        
    }
}