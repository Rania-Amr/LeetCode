/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n < 2) return n;
        int right = 1;
        int left = n;
        while(left > right){
            int med = right+(left-right)/2;
            if(isBadVersion(med)){
                left = med;
            }else{
                right =med + 1;
            }
        }
        return left;
    }
}