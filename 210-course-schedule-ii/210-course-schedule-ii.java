class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        //n =2
        //prerequisites = [[0,1]]
        
        int[] result = new int[n];// []
        if(n ==0){
            return result;
        }
        if(prerequisites == null || prerequisites.length ==0){
            for (int i = 0; i < n; i++) {
                result[i] = i;
            }
            return result;
        }

        //[1,0]
        int[] indegree =new int[n];
        for(int [] arr:prerequisites ){
            indegree[arr[0]]++;
        }//[0]
        ArrayDeque<Integer> zeroQueue =new ArrayDeque<>();
         for(int i = 0; i < indegree.length; i++ ){
             if(indegree[i] ==0){
                 zeroQueue.addLast(i);
             }
        }
        if (zeroQueue.isEmpty()) {
            return new int[0];
        }
        int i =0;
        while(!zeroQueue.isEmpty()){
            int num = zeroQueue.removeFirst();
            result[i] =num;
            i++;
            for(int [] pre :prerequisites){
                if(pre[1] ==num){
                    indegree[pre[0]]--;
                    if (indegree[pre[0]] == 0) {
                        zeroQueue.addLast(pre[0]);
                    }
                }
            }
        }
         for (int in : indegree) {
            if (in != 0) {
                return new int[0];
            }
        }

        return result;
    }
}