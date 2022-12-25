class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character,Integer> map = new HashMap<>();
        int start = 0;
        int end = s.length();
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            if(map.containsKey(currChar)){
                start = Math.max(start,map.get(currChar) + 1);
            }
            map.put(currChar, i);
            maxLength = Math.max(i - start + 1, maxLength);
        }
        return maxLength;
    }
}