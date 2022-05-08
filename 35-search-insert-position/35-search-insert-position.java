class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = nums.length-1;
        int right = 0;
        while(left >= right){
            int med = right+(left -right)/2;
            
            if(nums[med] > target){
                left = med -1;
                
            }else if(nums[med] < target){
                right = med+1;
            }else{
                return med;
            }
        }
        return right;
    }
}