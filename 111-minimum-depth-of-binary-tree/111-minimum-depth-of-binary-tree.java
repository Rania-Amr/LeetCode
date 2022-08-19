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
    public int minDepth(TreeNode root) {
         
    if(root == null){
      return 0;
    }
    int dept = Integer.MAX_VALUE;
     ArrayDeque<TreeNode> queue =new ArrayDeque<>();
     queue.addLast(root);
    int j =0;
     while(!queue.isEmpty()){
         j++;
       int n = queue.size();
       for(int i =0;i<n;i++){
         TreeNode temp =queue.removeFirst();
           if(temp.left ==null &&temp.right ==null){
              return j;
           }         
         if(temp.left !=null){
            queue.addLast(temp.left);
         }
         if(temp.right !=null){
            queue.addLast(temp.right);
         }
       }

     }
        return j;
    }
}