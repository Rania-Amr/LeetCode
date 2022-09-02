class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> map =new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue< Map.Entry<Integer,Integer>> queue =new PriorityQueue<>((a,b) -> a.getValue()-b.getValue() );
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           queue.add(entry);
            while(queue.size() > k){
                queue.poll();
            }
        }
        int arr[] =new int [k];
        for(int i =k-1;i>=0;i--){
            arr[i] =queue.poll().getKey();
        }
        return arr;
    }
}