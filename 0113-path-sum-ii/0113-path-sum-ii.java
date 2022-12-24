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
     List<List<Integer>> paths = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        findPaths(root,  targetSum, new ArrayList<>());
        return paths;
    }
    private void findPaths(TreeNode root, int sum, List<Integer> path){
        if(root == null)
            return;
        path.add(root.val);
        if(root.val == sum && root.left == null && root.right == null){
            paths.add(new ArrayList<>(path));
        }else{
       
         findPaths(root.left,  sum-root.val, path);
         findPaths(root.right,  sum-root.val, path);
        }
         path.remove(path.size() - 1);
    }
}