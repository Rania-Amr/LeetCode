class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList();
        if(graph ==null ||graph.length==0)  {
            return paths;
        }      
        dfs(0,graph,new ArrayList<>(),paths);
       return paths;
    }
    public void dfs (int val,int[][] graph , List <Integer> path,  List<List<Integer>> paths ) {
       path.add(val);
       if( val == graph.length -1){
           paths.add(new ArrayList<>(path));
           return;
       }
    for(int next : graph[val]){
           dfs(next,graph,path,paths);
            path.remove(path.size()-1);
            
        }
        
    }
    
    
    
}