class Solution {
    public int[] countBits(int n) {
        int [] bits = new int [n + 1];
        for(int  i = 0; i <= n ; i++){
            bits[i] = countOnes(i);
        }
        return bits;
    }
    private int countOnes(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}