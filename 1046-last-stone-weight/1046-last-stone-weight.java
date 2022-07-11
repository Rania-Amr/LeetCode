class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n : stones){
            heap.add(n);
        }
        while (heap.size()> 1){
            int n1 = heap.poll();
            int n2 = heap.poll();
            if(n1 > n2){
                int n3 = n1-n2;
                heap.add(n3);
            }else if(n2 > n1){
                int n3 = n2-n1;
                heap.add(n3);
            }
        }
        return heap.isEmpty() ? 0 : heap.poll();
    }
}