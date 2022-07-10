class Solution {
    public boolean validTree(int n, int[][] edges) {
        List <List<Integer>> adj = new ArrayList<>();
        for(int i =0; i < n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int [] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        stack.push(0);
        while(!stack.isEmpty()){
            int node  =stack.pop();
            for(int num : adj.get(node)){
                if(map.get(node) ==num){
                    continue;
                }
                 
                if (map.containsKey(num)) {
                    return false;
                }
                stack.push(num);
                map.put(num,node);
            }
        }
        return map.size()==n;
        
        
        
    }
}

