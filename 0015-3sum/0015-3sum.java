class Solution {
   
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2; i++){
           if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){                                  binarysearch(i,res,nums);
        }
        }
        return res;
    }
    public void binarysearch(int index,List<List<Integer>> res,int[] nums){
        int start = index + 1;
        int end = nums.length -1;
        while(start < end){
        int sum = nums[start] + nums[end] + nums[index] ;
        if(sum == 0){
            List <Integer> arr = new ArrayList<>();
            arr.add(nums[index]);
            arr.add(nums[start]);
            arr.add(nums[end]);
            res.add(arr);
            while(start < end && nums[start] ==nums[start+1] ){
                start++;
            }
             while(start < end && nums[end] ==nums[end-1] ){
                end--;
            }
                         start++;
                         end--;
        }else if(sum > 0){
            end--;
        }else{
            start++;
        }
        }
    }
}