class Solution {
    /*
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
    
  0
  1
  
    
    */
    public boolean isValidSudoku(char[][] board) {
        int n =9;
        HashSet<Character> [] row =new HashSet [9];
         HashSet<Character> [] col =new HashSet [9];
         HashSet<Character> [] box =new HashSet [9];
        
        
        for(int i =0;i< n;i++){
           row[i] =new HashSet<>(); 
            col[i] =new HashSet<>(); 
            box[i] =new HashSet<>(); 
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                char ch =board[i][j];
                if(ch =='.'){
                    continue;
                }
                
                if(row[i].contains(ch)){
                    return false;
                }
                row[i].add(ch);
                
                if(col[j].contains(ch)){
                    return false;
                }
                col[j].add(ch);
                int id =(i/3)*3+j/3;
                if(box[id].contains(ch)){
                    return false;
                }
                box[id].add(ch);
            }
        }
        return true;
    }
}