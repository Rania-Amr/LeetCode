class Solution {
    public int countComponents(int n, int[][] edges) {
        unionFind uf= new unionFind(n);
        for(int [] edge : edges){
            uf.union(edge[0],edge[1]);
        }
        return uf.getCount();
    }
    class unionFind{
        int [] root;
        int [] rank;
        int count;
        unionFind(int n){
            count =n;
            root =new int [n];
            rank =new int [n];
            for(int i =0; i< n ; i++){
                root[i] =i;
                rank[i] =1;
            }
        }
        
        public int find (int x){
            if(root[x] == x){
                return x;
            }
            return root[x] = find(root[x]);
        }
        
        public void union(int x, int y){
            int rootX =find(x);
            int rootY= find(y);
            if(rootX != rootY){
                root[rootX] = rootY;
                        count--;

            }
        }
        int getCount(){
            return count;
        }
        
    }
}