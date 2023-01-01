class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int maxLength = 0;
        int start  = 0;
        Map <Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c =s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size() > 2){
                char startChar = s.charAt(start);
                  map.put(startChar,map.get(startChar)-1);
                if(map.get(startChar)== 0){
                    map.remove(startChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }
}