class Solution {
    class Grid{
        int row ;
        int col;
        int step;
        int k ;
        Grid(int row, int col, int step, int k){
            this.row  = row;
            this.col = col;
            this.step = step;
            this.k = k;
        }
         @Override
    public int hashCode() {
        // needed when we put objects into any container class
        return (this.row + 1) * (this.col + 1) * this.k;
    }
@Override
    public boolean equals(Object other) {
        /**
         * only (row, col, k) matters as the state info
         */
        if (!(other instanceof Grid)) {
            return false;
        }
        Grid newState = (Grid) other;
        return (this.row == newState.row) && (this.col == newState.col) && (this.k == newState.k);
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", this.row, this.col, this.k);
    }
    }
    public int shortestPath(int[][] grid, int k) {
        ArrayDeque<Grid> queue = new ArrayDeque<>();
        int [] target = {grid.length-1, grid[0].length-1};
        if(k >= grid.length-1 + grid[0].length-1){
            return grid.length-1+ grid[0].length-1;
        }
        queue.addFirst(new Grid(0, 0, 0,k));
        int min = Integer.MAX_VALUE;
        Set<Grid> seen= new HashSet();
        seen.add(new Grid(0, 0, 0,k));
        int [][]dir ={{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while(!queue.isEmpty()){
            
        Grid curr = queue.removeFirst();
        //  seen.add(curr);
            if(curr.row == grid.length-1 && curr.col == grid[0].length-1){
               return curr.step;
            }
            
            for(int []arr : dir){
                int newRow = arr[0] + curr.row;
                int newCol = arr[1] + curr.col;
                if(newRow >= 0 && newRow < grid.length &&
                   newCol >= 0 && newCol < grid[0].length){
                    
                int nextElimination = curr.k - grid[newRow][newCol];
 Grid newGrid = 
                         new Grid(newRow, newCol, curr.step + 1, nextElimination);
                    if(nextElimination >=0 && !seen.contains(newGrid)){
                        seen.add(newGrid);
                        queue.addLast(newGrid);
                    }
                }
            }
            
        }
        return -1;
    }
}