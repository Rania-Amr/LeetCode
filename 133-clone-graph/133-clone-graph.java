/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }
        HashMap<Node,Node> visited = new  HashMap<>();
        ArrayDeque <Node> queue =new ArrayDeque<>();
        queue.add(node);
        visited.put(node,new Node(node.val,new ArrayList()));
        while(!queue.isEmpty()){
            Node curr = queue.removeFirst();
            for( Node neigbour : curr.neighbors){
                if(!visited.containsKey(neigbour)){
                    visited.put(neigbour,new Node(neigbour.val,new ArrayList()));
                    queue.add(neigbour);
                        
                }
                visited.get(curr).neighbors.add(visited.get(neigbour));
            }
        }
        return visited.get(node);
    }
}