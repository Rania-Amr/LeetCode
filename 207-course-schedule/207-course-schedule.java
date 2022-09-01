class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       
        if (numCourses == 0||prerequisites == null || prerequisites.length == 0) {
            
            return true;
        }
        
        int[] indegree = new int[numCourses];
        Queue<Integer> zeroDegree = new LinkedList<>();
        for (int[] pre : prerequisites) {
            indegree[pre[0]]++;
        }
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0){
                zeroDegree.add(i);
            }
        }
        if (zeroDegree.isEmpty()) {
            return false;
        }
        while (!zeroDegree.isEmpty()) {
            int course = zeroDegree.poll();
          
            for (int[] pre : prerequisites) {
                if (pre[1] == course) {
                    indegree[pre[0]]--;
                    if (indegree[pre[0]] == 0) {
                        zeroDegree.add(pre[0]);
                    }
                }
            }
        }
        
        for (int in : indegree) {
            if (in != 0) {
                return false;
            }
        }

        return true;
    
    }
}