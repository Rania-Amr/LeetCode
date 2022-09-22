class Solution {
    /**
    
    Input: piles = [30,11,23,4,20], h = 5

    6+3+5+1+4
    9+6+4
    */
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;int right =1;
        for(int p:piles){
            right=Math.max(p,right);
        }
        
        while(left <right){
            int mid =left+(right-left)/2;
            int hourspand =0;
            for(int p:piles){
            hourspand+=Math.ceil((double)p/mid);
        }
            
            
            if(hourspand<=h){
                right =mid;
            }else{
                left =mid+1;
            }
        }
        return right;
    }
}