class Solution {
    public int search(int[] nums, int target) {
        int start = 0; 
        int end = nums.length-1;
        //[4,5,6,7,0,1,2]
  //       0 1 2 3 4 5 6 
        /*
        start = 0
        end = 1
        mid = 0
        [3,1]
        
        */
        while(start <= end){
            int mid = start + (end-start)/ 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] >= nums[start]){
                if(target >= nums[start] && target< nums[mid] ){
                    end = mid -1;

                }else{
                     start = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[end]){
                     start = mid +1;
                }else{
                   end = mid-1;
                }
            }
        }
        return -1;
    }
}