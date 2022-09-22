class Solution {
      public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1)
                return nums[0] == target ? 0 : -1;
        int max = findMax(nums);
        int x =-1;
          if(max==0){
               x=binarySearch(nums,target,0,nums.length-1);
          }else if(target <nums[0] ){
             x=binarySearch(nums,target,max,nums.length-1);
          
        }else{
                x=binarySearch(nums,target,0,max-1);
        }
        return x;
    }
    
     public int findMax(int[] nums) {
        int start =0;
        int end =nums.length-1;
         if( nums[start]  < nums[end] ){
             return 0;
         }
        while(start <=end){
            int mid = start+(end-start)/2;
            if(nums[mid] >nums[mid+1]){
              return mid+1;
            }else{
                if(nums[mid] >= nums[start] ){
                    //sorted first part
                    start =mid+1;
                    
                }else{
                    end = mid-1;
                }
             
            }
        }
         return 0;
    }
    
    public int binarySearch(int[] nums, int target,int start,int end) {
        while(start<=end){
            int mid =start+(end-start)/2;
            if(nums[mid] ==target){
                return mid;
            }else if(nums[mid] >target){
                end =mid-1;
            }else{
                start =mid+1;
            }
        }
        return -1;
    }
}