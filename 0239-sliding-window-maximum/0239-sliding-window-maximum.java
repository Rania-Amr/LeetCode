class Solution {
            
        /**
        first add get max in the first window 
        scound if last value  < this value remove
        then add my crruent
        check my old value
       
        */
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque <Integer> maxIndexQueue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if(nums.length < 0) return nums;
        if(k > nums.length){
            k = nums.length;
        }
        for(int i =0; i<k ;i++){
            while(!maxIndexQueue.isEmpty() &&(nums[i] >= nums[maxIndexQueue.peekLast()])){
                maxIndexQueue.removeLast();
            }
            maxIndexQueue.addLast(i);
        }
        result.add(nums[maxIndexQueue.peekFirst()]);
        
         for(int i =k; i<nums.length ;i++){
            while(!maxIndexQueue.isEmpty() &&(nums[i] >= nums[maxIndexQueue.peekLast()])){
                maxIndexQueue.removeLast();
            }
            maxIndexQueue.addLast(i);
             if(!maxIndexQueue.isEmpty() &&(maxIndexQueue.peekFirst() <=i-k)){
                 
                     maxIndexQueue.removeFirst();
             }
            result.add(nums[maxIndexQueue.peekFirst()]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}