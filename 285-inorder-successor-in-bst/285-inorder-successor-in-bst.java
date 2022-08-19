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
        if(root == null){
          return root;
        }
        ArrayDeque<TreeNode> queue =new ArrayDeque<>();
        queue.addLast(root);
        TreeNode maxValue =null;
        while(!queue.isEmpty()){
             TreeNode temp =queue.removeFirst();
               if(temp.val >p.val){
                 if(maxValue == null || maxValue.val >temp.val){
                     maxValue =temp;
                 }
               }         
             if(temp.left !=null){
                queue.addLast(temp.left);
             }
             if(temp.right !=null){
                queue.addLast(temp.right);
             }

         }
            return maxValue;
    }
}