class Solution {
    public int maximumDetonation(int[][] bombs) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < bombs.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < bombs.length; i++){
            for(int j = 0; j < bombs.length; j++){
                if(j != i && hasIntersection(bombs[i], bombs[j])){
                    adj.get(i).add(j);
                }
            }
        }
         int max = 0;
        for(int i = 0; i < bombs.length; i++){
            Set<Integer> visited = new HashSet<>();
            visited.add(i);
            dfs(visited,i,adj);
            max = Math.max(max,visited.size());
        }
        
        
        return max;
    }
    
    
    private void  dfs (Set<Integer> visited, int curr, List<List<Integer>> adj){
        for(int n : adj.get(curr)){
            if(!visited.contains(n)){
                 visited.add(n);
               dfs(visited,n,adj);
              
            }
        }
       
    }
    private boolean hasIntersection (int [] a, int [] b){
      double distance = Math.sqrt((Math.pow((a[0] - b[0]), 2) +
        Math.pow((a[1] - b[1]), 2)));
        return Double.valueOf(a[2]) >= distance;
    }
}