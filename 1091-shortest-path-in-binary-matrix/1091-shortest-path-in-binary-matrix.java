class Solution {
    /*
    n*n
    length short path  or -1
    right  button diagnal
     m =[[0,1],
         [1,0]]
         
    -check frist note is 0 or return -1
    
    -go with 8 direction 
    i+1 , j
   i, j+1
   i+1 ,j+1 
    stop i+1 =
    */
    
    class Point {
        public int x ;
        public int y;
        public Point(int x, int y){
            this.x=x;
            this.y =y;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid == null || grid.length <1 || grid[0][0] !=0 || grid[grid.length-1][grid.length-1] !=0){
            return -1;
        }
        /*[[0,0,0]
        , [1,1,0]
        , [1,1,0]]*/
        //2
        int m= grid.length-1;
        //[]
        ArrayDeque<Point> queue =new ArrayDeque<>();
        //0
        int count =0;
        
        queue.addLast(new Point (0,0));
        //queue =[ ,(1,2)(2,2)]
        while (!queue.isEmpty()){
            //n=2
            int n = queue.size();
            //count  = 3
            count++;
            for(int i =0;i<n;i++){
                //curr =(1, 2)
                Point curr = queue.removeFirst();
                int x = curr.x;
                int y =curr.y;
                if(x == m &&y ==m){
                    return count;
                }
                if(x+1 <= m && grid[x+1][y] ==0){
                      queue.addLast(new Point (x+1,y));
                    grid[x+1][y] =1;
                }
                 if(x-1 >= 0 &&grid[x-1][y] ==0){
                      queue.addLast(new Point (x-1,y));
                      grid[x-1][y]=1;
                }
                
                if(y+1 <= m && grid[x][y+1] ==0){
                      queue.addLast(new Point (x,y+1));
                     grid[x][y+1]=1;
                }
                if(y-1 >= 0 && grid[x][y-1] ==0){
                      queue.addLast(new Point (x,y-1));
                     grid[x][y-1]=1;
                }
                if(x+1 <= m &&y+1 <=m && grid[x+1][y+1] ==0){
                      queue.addLast(new Point (x+1,y+1));
                    grid[x+1][y+1]=1;
                    
                }
               
                if(x-1 >= 0 &&y-1 >=0 && grid[x-1][y-1] ==0){
                      queue.addLast(new Point (x-1,y-1));
                    grid[x-1][y-1] =1;
                    
                }
                
                 if(x-1 >= 0 &&y+1 <=m && grid[x-1][y+1] ==0){
                      queue.addLast(new Point (x-1,y+1));
                     grid[x-1][y+1] =1;
                    
                }
                  if(x+1 <= m &&y-1 >=0 && grid[x+1][y-1] ==0){
                      queue.addLast(new Point (x+1,y-1));
                    grid[x+1][y-1] =1;
                }
            }
        }
        
        
        return -1;
    }
}