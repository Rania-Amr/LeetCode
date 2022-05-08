class Solution {
    public int countOdds(int low, int high) {
        int num = high-low;
        if(high %2 == 1) num++;
         if(low %2 == 1) num++;
        
        return num/2;
    }
}