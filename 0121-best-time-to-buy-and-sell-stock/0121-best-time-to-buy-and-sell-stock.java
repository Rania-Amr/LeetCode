class Solution {
    public int maxProfit(int[] prices) {
        int  i =0;
        int j = 1;
        int maxProfite = 0;
        while(j < prices.length){
            if(prices[i] < prices[j]){
               maxProfite =Math.max(maxProfite,  prices[j]- prices[i]); 
                j++;
            }else{
                i = j;
                j++;
            }
        }
        return maxProfite;
    }
}