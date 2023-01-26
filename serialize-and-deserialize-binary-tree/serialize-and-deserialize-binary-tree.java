/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
 private int i = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> arr = new ArrayList<>();
        serializeTree(root, arr);
        return String.join(",", arr);
    }
    public void serializeTree(TreeNode root, List<String> arr){
        if(root == null){
            arr.add("N");
            return;
        }
         arr.add(String.valueOf(root.val));
         serializeTree(root.left, arr);
         serializeTree(root.right, arr);
        
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] arr = data.split(",");
        return deserializeTree(arr);
        
    }
    
   public TreeNode deserializeTree(String [] arr) {
       String t = arr[this.i];
       if(t.equals("N")){
           this.i++;
            return null;
       }
       TreeNode node = new TreeNode(Integer.valueOf(t));
        this.i++;
        node.left = deserializeTree(arr);
        node.right = deserializeTree(arr);
        return node;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));