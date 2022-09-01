class Solution {
    /*
    
    [1,7,3,6,5,6]
  
    right = 28
    loop 
    right-arr[i]
    i=0
    left = 1
    if(right ==left) {
    return
    }
        left =+arr[i]


  right = 1
  left  =11
  i =3

    */
    public int pivotIndex(int[] nums) {
        //right 27
      int rightsum =0;
        //left 0
        int leftSum =0;
        //[1,7,3,6,5,6]
        for(int i =0;i< nums.length;i++){
            rightsum+=nums[i];
        }
        for(int i =0;i< nums.length;i++){
            rightsum-=nums[i];
            if(rightsum ==leftSum ){
                return i;
            }
             leftSum+=nums[i];
        }
        return -1;
    }
}