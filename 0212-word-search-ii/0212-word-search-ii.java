
class Solution {
    char[][] board = null;
    ArrayList<String> result = new ArrayList<String>();
    class TrieNode {
      HashMap<Character, TrieNode> children = new HashMap<>();
      String word = null;
      public TrieNode() {}
      }
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        this.board = board;
        for(String word : words){
          TrieNode curr = root;
           for(char ch : word.toCharArray()){
               if(!curr.children.containsKey(ch)){
                   curr.children.put(ch,new TrieNode() );
               }
               curr = curr.children.get(ch);
           }
            curr.word =word;
        }
        for(int i =0; i< board.length;i++){
            for(int j =0; j < board[0].length;j++){
                if(root.children.containsKey(board[i][j])){
                    backtracking(i,j,root);
                }
            }
        }
        return result;
    }
    int  [][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    public void backtracking(int row,int col ,TrieNode root ){
        char currChar = board[row][col];
        TrieNode cuuTree = root.children.get(currChar);
        if(cuuTree.word != null){
            result.add(cuuTree.word);
                cuuTree.word = null;
        }
         board[row][col] ='#';
        for( int []dir : directions){
            int r = row + dir[0];
            int c = col + dir[1];
            if(r >=0 && r< board.length && c >=0 && c< board[0].length){
                if(cuuTree.children.containsKey(board[r][c])){
                      backtracking(r,c,cuuTree);
                }
            }
        }
          board[row][col] = currChar;
        if(cuuTree.children.isEmpty()){
            root.children.remove(currChar);
        }
    }
    
}
