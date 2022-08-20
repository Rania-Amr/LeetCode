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
     List<Integer> result = new ArrayList<>();
     if(root == null){
      return result;
     }
     ArrayDeque<TreeNode> queue =new ArrayDeque<>();
     queue.addLast(root);
   
     while(!queue.isEmpty()){
        
       int n = queue.size();
       for(int i =0;i<n;i++){
         TreeNode temp =queue.removeFirst();
          if(i== n-1){
              result.add(temp.val);
           } 
         if(temp.left !=null){
            queue.addLast(temp.left);
         }
         if(temp.right !=null){
            queue.addLast(temp.right);
         }
        
       }

     }
  
    return result;
    }
}