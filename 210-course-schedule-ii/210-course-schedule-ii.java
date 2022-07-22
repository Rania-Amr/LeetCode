class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int [] order = new int [n];
        if(n == 0){
            return order;
        }
        
        if(prerequisites == null ||  prerequisites.length ==0){
            for(int i = 0; i < n; i++){
                order[i] = i;
            }
            return order;
        }
        int [] degree = new int [n];
        
        for(int [] arr : prerequisites){
            degree[arr[0]]++;
        }
        
        ArrayDeque<Integer> queue =new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            if(degree[i] == 0){
                queue.addLast(i);
            }
        }
        int index =0;
        while(!queue.isEmpty()){
            
            int number = queue.removeFirst();
            order[index] = number;
            index++;
            for(int [] arr :prerequisites){
                if(arr[1] == number ){
                    degree[arr[0]]--;
                    if(  degree[arr[0]] == 0){
                         queue.addLast(arr[0]);
                    }
                }
            }
        
        }
        
          for(int i = 0; i < n; i++){
            if(degree[i] != 0){
              return new int[0];
            }
        }
        return order;
        
    }
}