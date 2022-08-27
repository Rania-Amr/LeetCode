class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
     List <List <Integer>> adj =new ArrayList<>();
        for(int i =0; i< n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges ){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean [] visited = new boolean[n];
        Arrays.fill(visited,false);
        ArrayDeque<Integer> stack  =new ArrayDeque<>();
        stack.addFirst(source);
        while(!stack.isEmpty()){
            int num =stack.removeFirst();
            if(num == destination){
                return true;
            }
            visited[num] =true;
            for(int child: adj.get(num)){
                if(!visited[child]){
                    stack.addFirst(child);
                }
            }
        }
        return false;
    }
    
    /*
    
    
    
    
    
    */
}