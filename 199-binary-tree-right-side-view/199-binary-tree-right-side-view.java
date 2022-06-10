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
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> list = new ArrayList<>();
        if(root == null) return list;
        ArrayDeque <TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i< size;i++){
                TreeNode node = queue.pollFirst();
                if(i == size-1){
                    list.add(node.val);
                }
                 if (node.left != null) {
                    queue.offer(node.left);    
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return list;
    }
}