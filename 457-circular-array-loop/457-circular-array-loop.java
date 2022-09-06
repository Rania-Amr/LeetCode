class Solution {
    /**
     [2,-1,1,2,2]
     
     
     fast 2  1
     slow 2  -1
    
    [3,1,2]

    
    [1,-1,2,4,4]
    */
    public boolean circularArrayLoop(int[] nums) {
        if(nums.length ==0)return false;
        for(int i =0;i< nums.length;i++){
                int fast  = i;
        int slow  = i;
        //T
        boolean isForward = nums[i]>0;
        do{
            //-1
            fast =getNextIndex(isForward,fast,nums);
            //-1
            slow =getNextIndex(isForward,slow,nums);
            if(fast !=-1){
                fast =getNextIndex(isForward,fast,nums);
            }
            
        }while(fast !=slow && fast !=-1 &&slow !=-1);
       if (slow !=-1 &&slow == fast)
        return true;
        
        }
    
        
          return false;
    }
    
    //[1,-1,2,4,4]
    public int getNextIndex( boolean isForward,int index,int []nums){
        //T
        boolean nextInterval =nums[index] >0;
        if(nextInterval != isForward){
            return -1;
        }
        int i =(nums[index]+index)%nums.length;
       
        if(i <0){
            i +=nums.length;
        }
        if(i ==index){
            return -1;
        }
        return i;
        
    }
}