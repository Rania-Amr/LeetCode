class Solution {
    public int fib(int n) {
        if(n < 1) return n;
        int num1 = 0;
        int num2 =1;
        int num3=1;
        for(int i=1;i<n;i++){
            num3 =num1+num2;
            num1=num2;
            num2 =num3;
        }
        return num3;
    }
}