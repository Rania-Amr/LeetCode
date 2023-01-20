class Solution {
    public int rob(int[] nums) {
      if(nums.length == 0){
          return 0;
      }
      if(nums.length == 1){
          return nums[0];
      } 
      int max1 = getRopMoney(nums, 0, nums.length-1);  
      int max2 = getRopMoney(nums, 1, nums.length);   
        
      return Math.max(max1,max2);  
    }
    
    public int getRopMoney(int [] nums, int start, int end){
        int num1 =0;
        int num2 =0;
        for(int i = start;i <end;i++){
            int temp = num1;
            num1 =  Math.max(num2+nums[i],num1);
            num2 =temp;
        }
        return num1;
    }
    
}