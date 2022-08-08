class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> pattern = new HashMap<>();
        for(char ch : p.toCharArray()){
            pattern.put(ch,pattern.getOrDefault(ch,0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int match = 0;
        for(int end = 0; end < s.length(); end++){
            char right = s.charAt(end);
            if(pattern.containsKey(right)){
              pattern.put(right,pattern.get(right)-1);
              if(pattern.get(right) == 0){
                  match++;
              }
            }
            
            if(match == pattern.size()){
                list.add(start);
            }
            if(end >= p.length()-1){
                char startLetter = s.charAt(start++);
                if(pattern.containsKey(startLetter)){
                    if(pattern.get(startLetter) == 0){
                        match--;
                    }
                    pattern.put(startLetter,pattern.get(startLetter)+1);
                }
            }
            
            
        }
               return list;
    }
}