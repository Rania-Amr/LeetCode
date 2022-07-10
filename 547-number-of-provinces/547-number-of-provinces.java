class Solution {
    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null || isConnected.length == 0) {
            return 0;
        }

        int n = isConnected.length;
        UnionFind u = new UnionFind(n);
        for(int  i= 0; i< isConnected.length; i++){
            for(int j =0;j<isConnected.length;j++){
                if(isConnected[i][j] == 1){
                    u.union(i,j);
                }
            }
            
        }
        
       return u.getCount(); 
    }
    
    
    class UnionFind{
        int [] rank;
        int [] root;
        int count ;
        public UnionFind(int n){
            rank = new int [n];
            root =new int [n];
            count = n;
            for(int i =0; i<n;i++){
                root[i]=i;
                rank[i] = 1;
            }
        }
        
        public int find (int x){
            if(root[x] == x){
                return x;
            }
           return  root[x] =find(root[x]);
        }
         public int getCount() {
             return count;
         }
        
        public void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX != rootY){
                if(rank[rootX] > rank[rootY]){
                    root[rootY] = rootX;
                }else if(rank[rootX] < rank[rootY]){
                    root[rootX] = rootY;
                }else{
                    root[rootY] = rootX;
                    rank[rootX] += 1;
                }
                count--;
            }
            
        }
    }
}