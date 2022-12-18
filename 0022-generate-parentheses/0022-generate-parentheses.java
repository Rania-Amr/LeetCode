class Solution {
    /**
    
    n 1
    [()]
   n = 2 
   ()(  
   
    
    */
    class Parenthesis{
        String str;
        int open;
        int close;
        Parenthesis( String str, int open,int close){
            this.str = str;
            this.open = open;
            this.close = close;
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String > res =new ArrayList<>();
        ArrayDeque <Parenthesis> queue = new ArrayDeque<>();
        queue.addFirst(new Parenthesis("",0,0) );
        while(!queue.isEmpty()){
            Parenthesis curr= queue.removeFirst();
            if(curr.close == n && curr.open ==n){
               res.add(curr.str); 
            }else{
                if(curr.open <n){
                    queue.addLast(new Parenthesis(curr.str + "(", curr.open + 1, curr.close)) ;
                }
            
                if(curr.close< curr.open){
                   queue.addLast(new Parenthesis(curr.str + ")", curr.open , curr.close + 1)) ;
                }
            
        }
           
            
        }
        return res;
    }
}