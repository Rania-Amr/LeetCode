class Solution {
    public int climbStairs(int n) {
        if(n <=2)return n;
        int num1 = 1;
        int num2 =2;
        int num3 =0;
        
        for(int i =2;i<n;i++){
            num3 =num1+num2;
            num1=num2;
            num2=num3;
        }
        return num2;
    }
}