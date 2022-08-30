/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levels =new ArrayList<>();
        if(root ==null){
            return levels;
        }
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            int size =queue.size();
            List<Integer> level =new ArrayList<>();
            for(int i =0;i< size;i++){
                Node temp = queue.removeFirst();
                level.add(temp.val);
                for(Node child : temp.children){
                          queue.addLast(child);
  
                }
            }
            levels.add(new ArrayList<>(level));
        }
        return levels;
    }
}