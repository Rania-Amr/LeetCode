class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String > res =new ArrayList<>();
        Map<String,Integer> map =new HashMap<>();
        int start =0;
        int end =9;
        for(int i =end;i<s.length();i++){
            String curr=s.substring(start,i+1);
            map.put(curr,map.getOrDefault(curr,0)+1);
            start++;
        }
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue() >1){
               res.add(m.getKey()) ;
            }
        }
        return res;
    }
}