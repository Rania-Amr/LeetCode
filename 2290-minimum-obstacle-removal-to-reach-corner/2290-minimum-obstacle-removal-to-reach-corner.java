class Solution
{
    private int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int minimumObstacles(int[][] grid) 
    {
        int n = grid.length, m = grid[0].length;
        
        Integer[][] removal = new Integer[n][m]; 
        removal[0][0] =  grid[0][0];
        
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[]{0, 0});
        
        while(!qu.isEmpty())
        {
            int[] curr = qu.remove();
            
            for(int[] dir : dirs)
            {
                int i = curr[0] + dir[0];
                int j = curr[1] + dir[1];
                if(i < n && j < m && i >= 0 && j >= 0)
                {
                    int nextEntry =  removal[curr[0]][curr[1]] + grid[i][j];
                    update_Removals(i, j, curr, removal, qu, nextEntry);
                }
            }
        }
        return removal[n - 1][m - 1];
    }
    
    private void update_Removals(int i, int j, int[] curr, Integer[][] removal, Queue<int[]> qu, int nextEntry)
    {
        if(removal[i][j] == null || removal[i][j] > nextEntry){
            removal[i][j] = nextEntry;
            qu.add(new int[]{i, j});
        }
    }
}