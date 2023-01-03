class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String result = "";
        HashSet<String> dic = new HashSet<>();
        for(String w : words){
            if(w.length() == 1 || dic.contains(w.substring(0,w.length()-1))){
                if( w.length() > result.length()){
                    result = w;
                }
                dic.add(w);
            }
            
        }
        return result;
    }
}