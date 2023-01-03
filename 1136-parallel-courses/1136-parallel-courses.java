class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        int [] indegree = new int[ n + 1];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n+1; i++){
            adj.add(new ArrayList<>());
        }
        for(int [] r : relations){
            adj.get(r[0]).add(r[1]);
            indegree[r[1]]++;
        }
        int step = 0;
        int studiedCount = 0;
          List<Integer> bfsQueue = new ArrayList<>();
        for (int node = 1; node < n+ 1; node++) {
            if (indegree[node] == 0) {
                bfsQueue.add(node);
            }}
        while (!bfsQueue.isEmpty()) {
            // start new semester
            step++;
            List<Integer> nextQueue = new ArrayList<>();
            for (int node : bfsQueue) {
                studiedCount++;
                for (int endNode : adj.get(node)) {
                    indegree[endNode]--;
                    // if all prerequisite courses learned
                    if (indegree[endNode] == 0) {
                        nextQueue.add(endNode);
                    }
                }
            }
            bfsQueue = nextQueue;
        }

        // check if learn all courses
        return studiedCount == n ? step : -1;
            
    }
}