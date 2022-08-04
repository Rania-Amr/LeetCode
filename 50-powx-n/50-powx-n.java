class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        long N=n;
        if(n < 0){
            x= 1.0/x;
            N=-N;
          
        }
        return helper(x,N);
    }
    
    public double helper(double x, long n) {
        
        if(n == 0){
           return 1;
        }
        double half = helper(x,n/2);
        half *= half;
        if(n % 2 == 1){
            half *= x;
        }
        return half;
    }
}

