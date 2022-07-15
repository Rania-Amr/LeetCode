/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if(root == null){
             return root;
         }
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            int size =queue.size();
            for(int i =0 ; i< size;i++){
                Node temp =queue.removeFirst();
                if(i<size-1){
                    temp.next =queue.getFirst();
                }
                  
                if(temp.left !=null){
                    queue.addLast(temp.left);
                }
                if(temp.right !=null){
                    queue.addLast(temp.right);
                }
              
            }
        }
        return root;
        
        
    }
}