class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    findIsland(grid, i, j);
                }
            }
        }
        return count;
    }
    public void findIsland(char[][] grid, int row, int col){
        if(row > grid.length-1  || row < 0
           || col < 0 || col > grid[0].length-1
           ||  grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';
        findIsland(grid, row-1, col);
        findIsland(grid, row+1, col);
        findIsland(grid, row, col-1);
        findIsland(grid, row, col+1);
            
    }
}