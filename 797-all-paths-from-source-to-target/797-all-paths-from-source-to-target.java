class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        boolean [] visited = new boolean [graph.length];
        dfs(graph,0,new ArrayList<>(),paths,visited);
        return paths;

    }
    
    public void dfs(int[][] graph,int i , List<Integer>path ,List<List<Integer>>paths, boolean [] visited ) {
         path.add(i);
         
        if( i == graph.length -1){
            paths.add(new ArrayList<>(path));
            return;
        }
        for(int  n : graph[i]){
        
                  dfs(graph,n,path,paths,visited);
                   path.remove(path.size()-1);

          
        }

    }
    
    
    
}