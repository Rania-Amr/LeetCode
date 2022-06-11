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
    boolean cousins = true;
    int depthX= 0;
    int depthY= 0;
    public boolean isCousins(TreeNode root, int x, int y) {
        getDepth(root, x,y, 0);
        return (depthX==depthY) && cousins;

    }
    
    public void getDepth(TreeNode root, int x,int y, int depth) {
        if(root == null) {
           return;
        }
        if(root.val == x) {
             depthX = depth ;
        }else if(root.val == y){
             depthY = depth ;
        }
        if(root.right != null && root.left != null){
            if((root.right.val  == x && root.left.val == y)
               ||
               (root.right.val == y&& root.left.val == x)){
                cousins =false;
            }
        }
        
    getDepth(root.left,x,y,depth+1);
    getDepth(root.right,x,y,depth+1);
    }
}