class Solution {
    /*
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    
    eat - tea  ate
    tan  nat
    
    empty 
    
    */
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> ans =new ArrayList<>();
        if(strs ==null || strs.length <1){
            return ans;
        }
        Map<String ,List<String>>map =new HashMap<>();
        for(String s : strs){
             char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String sortedString  = String.valueOf(ca);
            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }
        return new  ArrayList<>(map.values());
    }
}