class Solution {
    /**
    go to left wile(arr[i] >arr[i-1]) i++
     [1,2,3] => [1,3,2]   
    [2,3,1] => [3,1,2].
    swich then sort
    [1,2,3], 
    [1,3,2],
    [2, 1, 3],
    [2, 3, 1],
    [3,1,2],
    [3,2,1].
    fiond number is smaller then elly 2abol
    1 5 8 4 7 6 5 3 1
    go get max 
    abtday sort elly abaly
    
    */
    public void nextPermutation(int[] nums) {
        int  i =nums.length -2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0 ){
            int  j = nums.length -1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    
    
     public void swap(int[] nums, int  i, int  j ) {
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;    
     
     }
     public void reverse(int[] nums, int start) {
        int  j = nums.length -1;
         int i = start;
        while(i < j){
           swap(nums,i,j);
            j--;i++;
        }
    }
    
    
}