/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low <= high){
            int med = low+(high-low)/2;
            if(guess(med) == 0){
                return med;
            }else if(guess(med) == 1){
                low =med+1;
            }else{
                high = med-1;
            }
            
                
        }
        return -1;
    }
}