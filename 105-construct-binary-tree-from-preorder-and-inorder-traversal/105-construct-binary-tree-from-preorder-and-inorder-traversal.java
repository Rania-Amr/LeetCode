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
    int[] preorder;
    int PreIndex;
    int n ;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        n = preorder.length-1;
        this.preorder = preorder;
        PreIndex =0;
        for(int  i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return helper(0,n);
    }
    public TreeNode helper(int left, int right) {
        if(left >right) return null;
        int number = preorder[PreIndex++];
        int index = map.get(number);
        TreeNode tree =new TreeNode (number);
        tree.left = helper(left,index-1);
        tree.right = helper(index+1,right);
        return tree;
    }
}