class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i<n;i++ ){
            adj.add(new ArrayList<>());
        }
        
        for(int []edge: edges ){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        Queue <Integer> queue = new LinkedList<>();
        queue.add(source);
        
        boolean [] seen = new boolean[n];
        
        
        while(!queue.isEmpty()){
            int curr  = queue.poll();
            if(curr == destination){
                return true;
            }
            if(seen[curr]){
                continue;
            }
            seen[curr] =true;
            for(int num : adj.get(curr)){
                queue.add(num);
            }
            
        }
        
        return false;
        
    }
}