class Solution {
    public int minCostConnectPoints(int[][] points) {
        if( points == null ||  points.length == 0){
             return-1;
        }   
        PriorityQueue<Edge> queue = new PriorityQueue<>((x,y)->x.cost-y.cost);
        int size = points.length;
        UnionFind uf = new UnionFind(size);
        for(int i = 0; i < size; i++){
            int p1[] = points[i];
            for(int j = i+1; j < size; j++){
                 int p2[] = points[j];
                int cost = Math.abs(p1[0] - p2[0]) + 
                           Math.abs(p1[1] - p2[1]);
                Edge edge = new Edge(i, j, cost);
                queue.add(edge);
            }
        }
          int result = 0;
        int count = size - 1;
        while (!queue.isEmpty() && count > 0) {
            Edge edge = queue.poll();
            if (!uf.connected(edge.point1, edge.point2)) {
                uf.union(edge.point1, edge.point2);
                result += edge.cost;
                count--;
            }
        }
        return result;
    }
        
    

     class Edge {
        int point1;
        int point2;
        int cost;

        Edge(int point1, int point2, int cost) {
            this.point1 = point1;
            this.point2 = point2;
            this.cost = cost;
        }
    }

    class UnionFind{
        int root[];
        int rank[];
        
        UnionFind(int n){
            root = new int[n];
            rank = new int[n];
            
            for(int i = 0; i < n; i++){
                root[i] = i;
                rank[i] = 1;
            }
        }
        
        int find (int x){
            if(root[x] == x){
                return x;
            }
            root[x] = find(root[x]);
            return root[x];
        }
        
        void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX == rootY){
                return;
            }else{
                if(rank[rootY] > rank[rootX]){
                    root[rootX] = rootY;
                }else if(rank[rootY] < rank[rootX]){
                    root[rootY] =rootX;
                }else{
                    root[rootY] =rootX;
                    rank[rootX]++;
                }
            }
        }
        public boolean connected(int x, int y) {
            return find(x) == find(y);
        }
    
    
}}