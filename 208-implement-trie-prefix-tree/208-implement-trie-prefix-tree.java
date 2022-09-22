class Trie {   
    class TriesNode{
        public boolean isWord;
        public Map<Character,TriesNode>childernMap=new HashMap<>();
    }
    TriesNode root ;
    public Trie() {
        root=new TriesNode();
    }
    
    public void insert(String word) {
          TriesNode cur =root;
        for(int i=0;i<word.length();i++){
            char ch =word.charAt(i);
            if(!cur.childernMap.containsKey(ch)){
                cur.childernMap.put(ch,new TriesNode());
            }
            cur =cur.childernMap.get(ch);
        }
        cur.isWord =true;
    }
    
    public boolean search(String word) {
        TriesNode cur =root;
        for(int i=0;i<word.length();i++){
            char ch =word.charAt(i);
            if(!cur.childernMap.containsKey(ch)){
                return false;
            }
            cur =cur.childernMap.get(ch);
        }
       return cur.isWord ;
    }
    
    public boolean startsWith(String prefix) {
           TriesNode cur =root;
        for(int i=0;i<prefix.length();i++){
            char ch =prefix.charAt(i);
            if(!cur.childernMap.containsKey(ch)){
                return false;
            }
            cur =cur.childernMap.get(ch);
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