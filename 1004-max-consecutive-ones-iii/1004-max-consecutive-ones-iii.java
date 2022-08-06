class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int start = 0;
        int tempLength =0;
        int maxLength =0;
        for(int end = 0; end < nums.length;end++){
            if(nums[end] == 1){
                count++;
            }
            
           while(end-start-count+1 > k){
               if(nums[start] == 1){
                   count--;
               }
                start++;
            }
            
            maxLength =Math.max(maxLength,end-start +1);
        }
        return maxLength;
    }
}