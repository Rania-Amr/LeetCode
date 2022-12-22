class Solution { 
    /*
0 -> 0
1 -> 1
2 -> 1
tn = tn-1 tn-2 tn-3



*/
    public int tribonacci(int n) {
        if (n < 3) return n == 0 ? 0 : 1;

       int firstNumber =0;
        int secoundNumber = 1;
        int thirdNumber  = 1;
        for(int i = 3; i <= n; i++){
            int sum = thirdNumber + secoundNumber+firstNumber;
            firstNumber = secoundNumber;
            secoundNumber = thirdNumber;
            thirdNumber =sum;
        }
        return thirdNumber;
    }
}