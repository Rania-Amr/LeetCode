class Solution {
    class Point{
        int x ;
        int y ;
        public int distance;
        Point(int x, int y,int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue <Point> queue = new PriorityQueue<>( ( p1,  p2) -> p2.distance - p1.distance);
        for(int [] point : points){
            int distance = point[0] *point[0] + point[1] *point[1];                                                         
           queue.add(new Point(point[0],point[1],distance));
            if(queue.size() > k){
                queue.poll();
            }
        }
        int [][] res =new int [k][2];
        int i = 0;
        while(!queue.isEmpty()){
           Point curr = queue.poll();
            res[i][0] = curr.x;
            res[i][1] = curr.y; 
            i++;
        }
        return res;
    }
}