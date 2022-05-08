class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length < 0) return 0;
        int max = nums[0];
        int temp = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum +=nums[i];
            if(nums[i] > sum ){
                 sum =nums[i];
            }
            temp = Math.max(temp,sum);
            
            max = Math.max(temp,max);
        }
        return max;
    }
}