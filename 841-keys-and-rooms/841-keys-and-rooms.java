class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] visited = new boolean [rooms.size()];
        dfs(rooms,visited,0);
        for(boolean flag: visited){
            if(!flag){
                return false;
            }
        }
        return true;
    }
      public void dfs(List<List<Integer>> rooms , boolean [] visited ,int i) {
       if(visited[i]){
           return;
       }
        visited[i] =true;
         for(int n : rooms.get(i)){
               dfs(rooms,visited,n);
         }
    }
    
}