class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer > map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int start  = 0;
        int size = Integer.MAX_VALUE;
        int startString =0;
        String word;
        int match =0;
        for(int end  = 0; end< s.length();end++){
            char right =s.charAt(end);
            if(map.containsKey(right)){
                 map.put(right,map.get(right)-1);
                if(map.get(right) >= 0){
                    match++;
                }
            }

            while(match == t.length()){
                if(size > end -start +1){
                    startString = start;
                    size = end-start +1;
                }

                char left = s.charAt(start++);
                if(map.containsKey(left)){
                  if(map.get(left) == 0){
                      match--;
                  }
                    map.put(left, map.get(left)+1);
                }
                
            }   
            
        }
        return size > s.length()?  "" : s.substring(startString,startString+size);
        
        
    }
}