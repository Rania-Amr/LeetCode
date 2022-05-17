class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int zeroIndex = -1;
        int count =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && zeroIndex == -1){
                zeroIndex = i;
                count++;
            }else if(nums[i] ==0){
                count = i - zeroIndex ;
                 zeroIndex = i;   
            }else{
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}