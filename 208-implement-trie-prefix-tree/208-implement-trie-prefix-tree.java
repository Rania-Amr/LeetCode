class Trie {
    class TrieNode{
        public boolean isWord;
        public Map <Character, TrieNode> childern = new HashMap<>();
   
    }
    private TrieNode root ;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = root;
        for(int i = 0; i < word.length();i++){
            char ch = word.charAt(i);
            if(cur.childern.get(ch) == null){
                cur.childern.put(ch,new TrieNode());
                
            }
           cur = cur.childern.get(ch);
        }
        cur.isWord =true;
    }
    
    public boolean search(String word) {
        TrieNode cur = root;
        for(int i = 0; i < word.length();i++){
            char ch = word.charAt(i);
            if(cur.childern.get(ch) == null){
                return false;
                
            }
            cur = cur.childern.get(ch);
        }
        return cur.isWord;
            
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(int i = 0; i < prefix.length();i++){
            char ch = prefix.charAt(i);
            if(cur.childern.get(ch) == null){
                return false;
                
            }
            cur = cur.childern.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */