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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
          return result;
        ArrayDeque <TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        List <Integer> level ;
        int j=0;
        while(!queue.isEmpty()){
           
          level = new ArrayList<>();
          int n = queue.size();
         
          for(int i =0; i< n;i++){
                  TreeNode temp = queue.removeFirst();
            if(temp.left != null){
              queue.addLast(temp.left);
            }
            if(temp.right != null){
               queue.addLast(temp.right);
            }
             if(j%2 ==0){
                  level.add(temp.val);  
              }else{
                  level.add(0,temp.val);  
              }
          }
            j++;
          result.add(level);
        }
        // TODO: Write your code here
        return result;
    }
}