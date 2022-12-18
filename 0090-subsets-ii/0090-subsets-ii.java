class Solution {
    /**
     nums = [1,2,2]
     []
     [] [1] ->2
     [] [1] [2] [1,2] ->4
     
    
    
    
    
    */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        int startIndex = 0;
        int endIndex = 0;
        subsets.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++){
            startIndex = 0;
            if(i > 0 && nums[i-1] == nums[i]){
               startIndex = endIndex;
            }
            endIndex = subsets.size();
            for(int j = startIndex; j < endIndex; j++){
                List<Integer> copyArray = new ArrayList<>(subsets.get(j));
                copyArray.add(nums[i]);
                subsets.add(copyArray);
            }
        }
        return subsets;
    }
}