class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left =0;
        int right = nums.length-1;
      
            while(left < nums.length-1 && nums[left+1] >= nums[left]){
                left++;
            }
           if(left == nums.length-1)return 0;
             while(right >0 &&nums[right] >= nums[right-1]){
                right--;
            }
       /*
       [2,6,4,8,10,9,15]
       left 1
       right 5
       max 10
       min 4
       */ 
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i =left ;i<=right;i++){
            maxNum =Math.max(maxNum,nums[i]);
            minNum = Math.min(minNum,nums[i]);
        }
        while(left >0 && nums[left-1] > minNum){
            left--;
        }
        while(right <nums.length-1 && nums[right+1] < maxNum){
            right++;
        }
        return right-left+1;
    }
}