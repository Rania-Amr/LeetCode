class Solution {
    public int rob(int[] nums) {
       
        int dp [] = new int [nums.length];
        Arrays.fill(dp,-1);
        return getMaxMoney(dp,nums,nums.length-1);
   
    }
    public int getMaxMoney(int [] dp , int [] nums, int index ){
        if(index == 0){
            return nums[0];
        }
        if(index == 1){
            return Math.max(nums[0],nums[1]);
        }
        if(dp[index] == -1){
            dp[index] = Math.max( getMaxMoney(dp, nums, index - 1), 
                                 nums[index] + getMaxMoney(dp, nums, index-2)); 
        }
        return dp[index];
                                 
                                 }
                               
}