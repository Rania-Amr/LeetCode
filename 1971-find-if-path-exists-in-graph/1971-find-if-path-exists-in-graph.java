class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       List<List<Integer>> adj= new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);

        }
        boolean visit [] =new boolean[n];
        return dfs(visit,adj,source,destination);
    }
    public boolean  dfs(boolean [] visit, List<List<Integer>>  adj, int source,int destination){
        if( source == destination){
            return true;
        }
        visit[source] = true;
        for(int n:adj.get(source)){
            if( visit[n] ){
                continue;
            }
            if( dfs(visit,adj,n,destination)){
                return true;
            }
        }
        return false;
    }
}