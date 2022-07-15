class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        if(graph.length <1){
            return paths;
        }
        dfs(graph,paths,new ArrayList<>(),0);
        return paths;
    }
    
    public void dfs(int[][] graph, List<List<Integer>>paths,
                                       List<Integer> path, int node ){
         path.add(node);
         if(node == graph.length-1){
             paths.add(new ArrayList<>(path));
             return;
          }
        
        for(int n: graph[node]){
            
            dfs(graph,paths,path,n);
            path.remove(path.size()-1);
        }
        
        
        
      }
}