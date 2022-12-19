class Trie {
    class TrieNode{
        Map <Character,TrieNode> childrenMap = new HashMap<>();
        boolean flag;
    }
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            if(curr.childrenMap.get(ch) == null){
                curr.childrenMap.put(ch, new TrieNode());
            }
            curr = curr.childrenMap.get(ch);
        }
        curr.flag = true;
    }
    
    public boolean search(String word) {
        TrieNode curr =root;
        for(char ch :word.toCharArray()){
            if(curr.childrenMap.get(ch) == null){
                return false;
            }
              curr = curr.childrenMap.get(ch);
        }
        return curr.flag;
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr =root;
        for(char ch : prefix.toCharArray()){
            if(curr.childrenMap.get(ch) == null){
                return false;
            }
              curr = curr.childrenMap.get(ch);
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