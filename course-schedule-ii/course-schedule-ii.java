class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj  =new ArrayList<>();
        int [] indegree = new int [numCourses];
        int counter = 0;
        int [] sortedCourses = new int [numCourses];
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int [] pre : prerequisites){
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        ArrayDeque <Integer> queue = new ArrayDeque<>();
        
        for(int i = 0; i < numCourses; i++){
           if(indegree[i] == 0){
               queue.addLast(i);
           }
        }
        while(!queue.isEmpty()){
            int currNode = queue.removeFirst();
            sortedCourses[counter++]=currNode;
            for(int child : adj.get(currNode)){
                indegree[child]--;
                if(indegree[child] == 0){
                    queue.addLast(child);
                }
            }
        }
        return (counter == numCourses)?  sortedCourses :  new int []{};
    }
}