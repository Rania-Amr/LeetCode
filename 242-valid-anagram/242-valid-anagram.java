class Solution {
    /**
    Input: s = "anagram", t = "nagaram"
Output: true
a 3
n 1
g 1
 r 1   
    
    m 1
    */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map <Character ,Integer> map = new HashMap<>();
        for(int i =0;i< s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         for(int i =0;i< t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(Map.Entry<Character ,Integer> entry :map.entrySet() ){
          if(entry.getValue() !=0){
              return false;
          }
        }
        return true;
    }
}