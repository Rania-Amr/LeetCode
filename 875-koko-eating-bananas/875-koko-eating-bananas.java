import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left  =1;
        int right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        while(left < right){
            
        int k = (left+right)/2;
         if(eatingSpeed(piles,k) <= h){
             right  =k;
             
         }else{
             left = k+1;
             
         }
        }
        return right;
    }
    
     public int eatingSpeed(int[] piles, int k) {
         int count =0;
         for(int i = 0; i < piles.length;i++){
            count += Math.ceil((double) piles[i]/k);
          
         }
         return count;
    }
}