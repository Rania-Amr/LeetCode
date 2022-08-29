class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        ArrayDeque <List<Integer>> queue = new ArrayDeque<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        queue.addLast(new ArrayList<>(path));
        while(!queue.isEmpty()){
            List<Integer> currentPath =queue.removeFirst();
            int n= currentPath.get(currentPath.size()-1);
            for(int num :graph[n]){
            List<Integer> tempPath = new ArrayList<>(currentPath);
                tempPath.add(num);
                if(num== graph.length-1){
                     paths.add(new ArrayList<>(tempPath));
                }else{
                   queue.addLast(new ArrayList<>(tempPath));
                }
            } 
        }
        return paths;

    }
    
   
    
    
    
}