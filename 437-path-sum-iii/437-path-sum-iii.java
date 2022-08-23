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
    public int pathSum(TreeNode root, int targetSum) {
        return dfs(root , targetSum,new ArrayList<>());
        
    }
    public int dfs(TreeNode root, int targetSum, List <Integer>list) {
        int count =0;
        long sum =0;
        if(root  == null){
            return 0;
        }
        list.add(root.val);
        int index = list.size()-1;
        while(index >= 0){
            sum+=list.get(index);
            if(sum == targetSum){
                count++;
            }
            index--;
        }
        count+=dfs(root.left , targetSum,list);
        count+=dfs(root.right , targetSum,list);
        list.remove(list.size()-1);
        return count;
        
    }
    
    
}