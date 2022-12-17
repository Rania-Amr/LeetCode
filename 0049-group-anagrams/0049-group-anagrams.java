class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            String key = hashWord(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }  
            map.get(key).add(s);
        }
       List<List<String>> res = new ArrayList<>();
       for(Map.Entry<String,List<String>> entry : map.entrySet()){
           res.add(entry.getValue());
       }
        return res;
    }
    
    private String hashWord(String word){
        int [] count = new int[26];
        for(char ch : word.toCharArray()){
            count[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int n : count){
            sb.append('#');
            sb.append(n);
        }
        return sb.toString();
        
    }
    
}