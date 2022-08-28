class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        dfs(graph,0,new ArrayList<>(),paths);
        return paths;

    }
    
    public void dfs(int[][] graph,int i , List<Integer>path ,List<List<Integer>>paths ) {
         path.add(i);
         
        if( i == graph.length -1){
            paths.add(new ArrayList<>(path));
            return;
        }
        for(int  n : graph[i]){
        
                  dfs(graph,n,path,paths);
                   path.remove(path.size()-1);

          
        }

    }
    
    
    
}