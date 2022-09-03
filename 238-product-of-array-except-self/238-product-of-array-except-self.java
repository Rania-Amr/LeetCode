class Solution {
    /*
    
    
    Input: nums = [1,2,3,4]
    
    
Output: [24,12,8,6]
left =
right1
left 6
= [ 1 , 1 , 2 , 6]



i = 0
 1 

    */
    public int[] productExceptSelf(int[] nums) {
        int left =1;
        int right =1;
        int [] ans =new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i] = left;
            left*=nums[i];
        }
        for(int i =nums.length-1; i>=0;i--){
            ans[i] *=right;
            right*= nums[i];
        }
        return ans;
    }
}