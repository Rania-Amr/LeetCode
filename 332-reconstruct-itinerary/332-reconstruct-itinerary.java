class Solution {
    Map <String ,PriorityQueue< String>> paths =new  HashMap<>();
     List<String> path =new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> ticket : tickets){
            if(!paths.containsKey(ticket.get(0))){
                 paths.put(ticket.get(0),new PriorityQueue<>());
            }
                paths.get(ticket.get(0)).add(ticket.get(1));
           
        }
        dfs("JFK");
        return path;
    }
    
    public void dfs(String ticket) {
    
      int size = paths.containsKey(ticket) ? paths.get(ticket).size() : 0;
      for(int i = 0; i < size;i++ ){
          String t = paths.get(ticket).poll();
          if( t != null){
               dfs(t);
          }
         
      }
          path.add(0,ticket);
    }
    
    
    
}