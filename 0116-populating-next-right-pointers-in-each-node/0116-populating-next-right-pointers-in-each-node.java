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
/**
-put in queue 
apply bsf
if end of queue it will next null
else
next 



*/
class Solution {
    public Node connect(Node root) {
       if(root == null){
           return root;
           
       } 
        
        ArrayDeque<Node> queue =new ArrayDeque<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            int size =queue.size();
            for(int i=0;i<size;i++){
                Node curr =queue.removeFirst();
                if(curr.left !=null){
                     queue.addLast(curr.left);
                }
                if(curr.right !=null){
                     queue.addLast(curr.right);
                }
                if(i ==size-1){
                          curr.next=null;

                }else{
               curr.next=queue.getFirst();

                }
            }

        }
        return root;
    }
}