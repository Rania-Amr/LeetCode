class Solution {
    class unionFind{
        int [] root;
        int [] rank ;
        int count ;
       public unionFind(int n){
            root = new int [n];
            rank = new int [n];
           count =n;
           for(int i =0;i<n;i++){
               root[i] = i;
               rank[i] = 1;
           }
        }
        
        public void union(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX !=rootY){
                count--;
                if(rank[rootX] > rank[rootY]){
                    root[rootY] = rootX;
                }else if(rank[rootX] < rank[rootY]){
                     root[rootX] = rootY;
                }else{
                     root[rootY] = rootX;
                    rank[rootX] += 1;
                }
            }
        }
        public int getCount(){
            return count;
        }
      public int find (int x){
             if(x == root[x]){
                 return x;
             }
            return root[x] = find(root[x]);
         }
        public boolean isConeccted(int x,int y){
            return find(x) ==find(y);
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        if(isConnected == null || isConnected.length ==0){
            return 0;
        }
        unionFind uf=new unionFind(isConnected.length);
        for(int i =0;i<isConnected.length;i++){
            for(int j =0; j< isConnected[i].length;j++){
                if(isConnected[i][j] == 1){
                    uf.union(i,j);
                }
            }
        }
        return uf.getCount();
    }
}