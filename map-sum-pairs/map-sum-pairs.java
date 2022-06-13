class MapSum {
    class TriesNode{
        int sum = 0;
        Map <Character,TriesNode> childern = new HashMap<>(); 
    }
    HashMap<String, Integer> map;
    TriesNode root;
    public MapSum() {
        map = new HashMap();
        root = new TriesNode();
    }
    
    public void insert(String key, int val) { 
        int delta = val - map.getOrDefault(key, 0);                                     
         map.put(key, val);
                                             
        TriesNode curr = root;
        for(int i = 0; i < key.length();i++){
            char ch = key.charAt(i);
            if( curr.childern.get(ch)== null){
                curr.childern.put(ch,new TriesNode());
            }
            
            curr= curr.childern.get(ch);
            curr.sum +=delta;
        }
    }
    
    public int sum(String prefix) {
        int sum=0;
        TriesNode curr = root;
        for(int i = 0; i < prefix.length();i++){
            char ch = prefix.charAt(i);
            if( curr.childern.get(ch)== null){
                return 0;
            }
             curr= curr.childern.get(ch);
            sum = curr.sum;
          
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */