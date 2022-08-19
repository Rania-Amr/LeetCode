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
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
      return result;
    Queue <TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    List <Integer> level ;
    while(!queue.isEmpty()){
      level = new ArrayList<>();
      int n = queue.size();
      for(int i =0; i< n;i++){
        TreeNode temp = queue.poll();
        if(temp.left != null){
          queue.offer(temp.left);
        }
        if(temp.right != null){
           queue.offer(temp.right);
        }
       level.add(temp.val);
      }
      result.add(0,level);
    }
    // TODO: Write your code here
    return result;
    }
}