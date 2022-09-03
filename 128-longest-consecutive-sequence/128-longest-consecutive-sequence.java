class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set =new HashSet<>();
        for(int n  :nums){
            set.add(n);
        }
        int maxLength =0;
          for(int n  :set){
            if(!set.contains(n-1)){
             int currNum =n;
            int  currLong =1;
                while(set.contains(currNum+1)){
                    currNum++;
                    currLong++;
                }
                
            maxLength =Math.max(maxLength,currLong)    ;
                
                }    
        }
        return maxLength ;
    }
}