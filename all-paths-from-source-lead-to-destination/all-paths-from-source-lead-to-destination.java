class Solution {
    
   List<List<Integer>> adj = new ArrayList<>();
    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        
        for(int i =0; i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int []edge: edges){
            adj.get(edge[0]).add(edge[1]);
        }
       return dfs(new HashSet<>(),n,edges,source,destination);
        
        
    }
    
    
     public boolean dfs(HashSet<Integer> path,int n, int[][] edges, int source, int destination) {
         path.add(source);
         

         List<Integer>nextNodes= adj.get(source); 
        if(nextNodes.isEmpty()){
            return source == destination;
        }
         for(int num : nextNodes){
             if(path.contains(num ) || !dfs(path,n,edges,num,destination)){
                 return false;
             }
             path.remove(num);
         }
         return true;
    }
}