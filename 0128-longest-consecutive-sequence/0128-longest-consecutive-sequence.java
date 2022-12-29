class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int maxNumber = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        for(int n : nums){
            if(!set.contains(n-1)){
                int count  = 1;
                int currNumber = n;
                while(set.contains(currNumber+1)){
                    currNumber++;
                    count++;
                }
                maxNumber =Math.max(maxNumber,count);
            }
        }
        return maxNumber;
    }
}