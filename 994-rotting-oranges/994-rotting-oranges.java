class Solution {

    public class Point {
        int x ;
        int y;
        public Point(int x,int y){
            this.x=x;
            this.y =y;
            
        }
    }
    public int orangesRotting(int[][] grid) {

        int time =-1;
        // 6
        int freshOrange =0;
        //[,(-1,-1),(),()]
        ArrayDeque<Point>queue =new ArrayDeque<>();
        for(int i=0;i< grid.length;i++){
            for(int j =0;j< grid[0].length;j++){
                if(grid[i][j] ==2){
                    queue.addLast(new Point(i,j));
                }else if(grid[i][j] ==1){
                    freshOrange++;
                }
            }
        }
        int direction [][] ={{-1,0},{1,0},{0,1},{0,-1}};
         queue.addLast(new Point(-1,-1));
        while(!queue.isEmpty()){
            //0,0
            Point curr = queue.removeFirst();
            int x = curr.x;
            int y =curr.y;
            if(x ==-1 ){
                time++;
                if(!queue.isEmpty()){
                      queue.addLast(new Point(-1,-1));
                }
                }else{
                    for(int []dir:direction){
                        int row = dir[0]+x;
                        int col = dir[1]+y;    
                        if(row >=0 && row<grid.length&& col >=0 && col<grid[0].length && 
                           grid[row][col] ==1){
                            freshOrange--;
                            grid[row][col]=2;
                             queue.addLast(new Point(row,col));
                        }
                    }
            }
        }
        return freshOrange==0?time:-1;
    }
}