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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
                ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result =new ArrayList<>();
        if( root == null){
            return result;
        }
        queue.addLast(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode currNode = queue.removeFirst();
                if(currNode.left != null){
                    queue.addLast(currNode.left);
                }
                if(currNode.right != null){
                    queue.addLast(currNode.right);
                }
                level.add(currNode.val);
            }
            result.add(0,level);
                
        }
        return result;
    }
}