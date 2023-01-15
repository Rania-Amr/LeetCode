class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstNum = Integer.MAX_VALUE;
        int secoundNum = Integer.MAX_VALUE;
        for(int n : nums){
            if(n <= firstNum){
                firstNum =n;
            }else if(n <= secoundNum){
                secoundNum =n;
            }else{
                return true;
            }
        }
        return false;
        
    }
}