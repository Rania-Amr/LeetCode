class Solution {
  //Input: s = "paper", t = "title"

    public boolean isIsomorphic(String s, String t) {
        /*mapS p-t
        mapT t-p
        */
        Map<Character ,Character> mapS =new HashMap<>();
        Map<Character ,Character> mapT =new HashMap<>();
        for(int i =0; i< s.length();i++){
          char a = s.charAt(i);  
          char b = t.charAt(i);  
          if((mapS.containsKey(a) && mapS.get(a) !=b) || 
             (mapT.containsKey(b) && mapT.get(b) !=a)){
              return false;
          }
            mapS.put(a,b);
            mapT.put(b,a);
        }
return true;
    }
}