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
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayDeque <TreeNode> stack = new ArrayDeque<>();
        ArrayList <Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        stack.addFirst(root);
        while(!stack.isEmpty()){
           TreeNode node = stack.pollFirst();
            list.add(node.val);
            if(node.right != null){
                stack.addFirst(node.right);
            }
            if(node.left != null){
                stack.addFirst(node.left);
            }
        }
    return list;
    }
}