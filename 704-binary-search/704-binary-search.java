class Solution {
    public int search(int[] nums, int target) {
        int right = 0;
        int left = nums.length-1;
        while(right <= left){
             int med = right+(left-right)/2;
            if(nums[med] > target){
                left = med - 1;
            }else if(nums[med] < target){
                right = med +1;
            }else{
                return med;
            }
        }
        return -1;
    }
}