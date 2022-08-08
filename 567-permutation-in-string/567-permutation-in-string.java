class Solution {
    public boolean checkInclusion(String pattern, String str) {
        Map<Character,Integer> mapPattern =new HashMap<>();
        for(char ch : pattern.toCharArray()){
            mapPattern.put(ch,mapPattern.getOrDefault(ch,0)+1);
            
        }
        
        int start =0;
        int match =0;
        for(int end = 0; end< str.length();end++){
            char right = str.charAt(end);
            if(mapPattern.containsKey(right)){
                mapPattern.put(right,mapPattern.getOrDefault(right,0)-1);
                if(mapPattern.get(right) ==0){
                    match++;
                } 
            }
             if(match == mapPattern.size() ){
                    return true;
            }
            
            if(end>= pattern.length()-1){
                char firsLetter = str.charAt(start);
                start++;
                if( mapPattern.containsKey(firsLetter)){
                    if(mapPattern.get(firsLetter ) == 0 ){
                        match--;
                      
                    }
                     
                    mapPattern.put(firsLetter,mapPattern.getOrDefault(firsLetter,0)+1);

                }

            }
        }
      return false;  
    }
}