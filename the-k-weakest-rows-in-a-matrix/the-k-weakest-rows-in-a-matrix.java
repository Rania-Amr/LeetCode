class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map <Integer,Integer> count = new HashMap<>();
        
        for( int i =0;i< mat.length;i++ ){
            int sum=0; 
            for(int j =0; j< mat[0].length;j++){
                sum+=mat[i][j];
            }
            count.put(i,sum);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2)->{
            if(count.get(n2)==count.get(n1)) return n2-n1;
                else return count.get(n2)-count.get(n1);
        });
        
        for(int n : count.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
                
            }
        }
        int []top =new int [k];
        for(int i =k-1; i>=0;i--){
            top[i] = heap.poll();
        }
        return top;
    }
}