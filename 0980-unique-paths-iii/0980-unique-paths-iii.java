class Solution {
    int [][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    int countPath = 0;
    //9
    int countNode =0;
 
    public int uniquePathsIII(int[][] grid) {
        //[0,0]
        int [] start = new int [2];
        for(int i = 0; i< grid.length; i++){
            for(int  j = 0; j < grid[0].length; j++){
                if(grid [i][j] == 1){
                    start[0] = i;
                    start [1]=j;
                }
                if(grid [i][j] == 0){
                    countNode++;
                }
            }
        }
        
        //time 4^(M*n)
        //space m*n 
        //{0-0 ,1-0}
      Set<String> seen = new HashSet<>();
      dfs(grid,seen,start[0],start[1]); 
        return countPath;
    }
       /*
    [[1,0,0,0],
    [0,0,0,0],
    [0,0,2,-1]]
    */
    public void dfs (int [][]grid, Set<String> seen, int row,int col){
        if(grid[row][col] == 2 ){
           if (seen.size()-1 == countNode){
            countPath++;
           }
            return;
        }
        if(seen.contains(row+"-"+col) || grid[row][col] == -1){
            return;
        }
        seen.add(row+"-"+col);
        for(int d[] : dir){
            //2,0
            int r= row+d[0];
            int c =col+d[1];
            if(r >=0 &&r <grid.length && c >=0 &&c <grid[0].length){
                  dfs(grid,seen,r,c);  
            }
        }
        seen.remove(row+"-"+col);
        
    }
}