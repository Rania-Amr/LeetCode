class KthLargest {
    int size;
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    
    public KthLargest(int k, int[] nums) {
        size = k;
        for(int n:nums){
            heap.add(n);
            if(heap.size()> size){
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.add(val);
            if(heap.size()> size){
                heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */