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
    int []postorder;
    int [] inorder;
    int postIndex;
    HashMap<Integer,Integer> indexMap = new HashMap<>();
      public TreeNode helper(int in_left, int in_right) {
           if (in_left > in_right)
                return null;
          int root_val = postorder[postIndex];
          TreeNode root = new TreeNode(root_val);
          int index = indexMap.get(root_val);
          postIndex--;
          root.right = helper(index + 1, in_right);
   
       root.left = helper(in_left, index - 1);
          return root;
      }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        for(int i = 0; i < inorder.length; i++){
            indexMap.put(inorder[i],i);
        }
        postIndex = postorder.length-1;
        return helper(0,inorder.length-1);
    }
}