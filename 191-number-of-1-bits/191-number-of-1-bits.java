public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        int bit = 1;
        while(n != 0){
            
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}