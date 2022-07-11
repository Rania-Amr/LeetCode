class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((n1,n2)->n1-n2);
        for(int n :nums){
            queue.add(n);
            if(queue.size()>k){
                queue.poll();
            }
        }
        
        
        
        return  queue.poll();
    }
}