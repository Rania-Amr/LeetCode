class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths =new ArrayList<>();
        dfs(paths,new ArrayList(),0,graph);
        return paths;
    }
     public void dfs(List<List<Integer>> paths,List<Integer> path, int source,int[][] graph) {
         path.add(source);
         if(source == graph.length-1){
             paths.add(new ArrayList<>(path));
             return;
         }
          int[] nextNodes = graph[source];
         for(int n:nextNodes){
              dfs(paths,path,n,graph);
                  path.remove(path.size()-1);
         }
    }
    
}