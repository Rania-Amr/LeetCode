class WordDictionary {
class Tries{
    Map <Character,Tries> map = new HashMap<>();
    boolean isWord=false;
}
     Tries root;
    public WordDictionary() {
        root= new Tries(); 
    }
    
    public void addWord(String word) {
        Tries curr = root;
        for(char ch : word.toCharArray()){
            if(curr.map.get(ch) == null){
                curr.map.put(ch,new Tries());
            }
            curr = curr.map.get(ch);
        }
        curr.isWord=true;
    }
    
    public boolean search(String word) {
        Tries curr = root;
         return searchInNode(word, curr);
    }
    public boolean searchInNode(String word,Tries curr){
        for(int i =0;i<word.length();i++){
            char ch =  word.charAt(i);
            if(curr.map.get(ch) == null){
                if(ch == '.'){
                    for(char x : curr.map.keySet()){
                        Tries child = curr.map.get(x);
                        if(searchInNode(word.substring(i+1),child)){
                            return true;
                        }
                    }
                    
                }
                return false;
                
            }else{
              curr =  curr.map.get(ch) ;
            }
        }
        return curr.isWord;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */