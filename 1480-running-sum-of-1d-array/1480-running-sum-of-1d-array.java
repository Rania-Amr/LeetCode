class Solution {
    public int[] runningSum(int[] nums) {
        int num =0;
        for(int i =0;i<nums.length;i++){
            nums[i]+=num;
            num=nums[i];
        }
        return nums;
    }
}