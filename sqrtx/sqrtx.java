class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        long num = 0;
        int med = 0;
        int left = 2;
        int right = x/2;
        while(left <= right){
            med = left+(right-left)/2;
            num = (long)med * med;
            if(num > x) {
                right = med - 1;
            }else if(num < x){
                left = med + 1; 
            }else{
                return med;
            }
        }
        return right;
    }
}