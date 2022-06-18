class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int left = 0;
        int right = letters.length;

        while(left < right){
            int med =left+(right-left)/2;
            if(letters[med]> target){
                 right =med;
            }else{
                 left = med+1;
            }
        }
        return letters[left % letters.length];
        
    }
}