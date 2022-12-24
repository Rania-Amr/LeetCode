/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode min = null;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addFirst(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.removeFirst();
            if(curr.val > p.val && (min == null || curr.val < min.val)){
                min =curr;
            }
            if(curr.left != null){
                queue.addLast(curr.left);
            }
            if(curr.right != null){
                queue.addLast(curr.right);
            }
        }
        return min;
    }
}