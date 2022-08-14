class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max =0;
        if(grid == null || grid.length ==0){
            return 0;
        }
        for(int i =0;i< grid.length;i++){
            for(int j =0;j< grid[0].length;j++){
                if(grid[i][j] == 1){
                max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    
    
    public int dfs(int[][] grid,int i,int j){
        if(grid[i][j] != 1){
            return 0;
        }
        int sum =1;
        grid[i][j] = 0;
        if(i-1 >=0){
            sum+= dfs(grid,i-1,j);
        }
        if(j-1 >=0){
            sum+= dfs(grid,i,j-1);
        }
        if(i+1 < grid.length){
            sum+= dfs(grid,i+1,j);
        }
        if(j+1<grid[0].length){
            sum+= dfs(grid,i,j+1);
        }
        return sum;
    }
}