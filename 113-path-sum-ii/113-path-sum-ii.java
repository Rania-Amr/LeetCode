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
    List<List<Integer>> result  = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        pathSumDfs(root,sum,new ArrayList<>());
      return  result;

    }
    public void pathSumDfs(TreeNode root, int sum,List<Integer> list) {
      if (root == null)
      return ;
           list.add(root.val);
    if (root.val == sum && root.left == null && root.right == null){
        result.add(new ArrayList<Integer>(list));
       
    }
      
  
    pathSumDfs(root.left, sum - root.val,list);
         
    pathSumDfs(root.right, sum - root.val,list);
 list.remove(list.size()-1);
    }
    
        
}