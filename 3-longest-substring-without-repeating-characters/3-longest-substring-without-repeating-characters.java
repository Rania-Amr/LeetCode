class Solution {
    public int lengthOfLongestSubstring(String str) {
        int startwindow =0;
        int size= 0;
        int maxSize =0;
        Map<Character,Integer> letters = new HashMap<>();
        for(int endWindow = 0; endWindow < str.length();endWindow++){
          if(letters.containsKey(str.charAt(endWindow))){
            startwindow = Math.max(startwindow,letters.get(str.charAt(endWindow))+1);

          }
            letters.put(str.charAt(endWindow),endWindow);
            size = endWindow- startwindow+1;
            maxSize = Math.max(maxSize,size);

        }
        return maxSize;
    }
}