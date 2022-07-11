class Solution {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs,new Comparator<int[]>(){
            @Override
            public int compare(int[] log1, int[] log2) {
                int tsp1 = log1[0];
                int tsp2 = log2[0];
                return tsp1-tsp2;
            }});
        int count = n;
         unionFind uf = new unionFind(n); 
        for(int[] log: logs){
            if( uf.union(log[1],log[2])){
                count--;
            }
            if(count == 1 ){
                return log[0];
            }
        }
        return -1;
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
        
        public boolean union(int x, int y){
            int rootX =find(x);
            int rootY= find(y);
            if(rootX != rootY){
                root[rootX] = rootY;
                        count--;
                return true;
            }else{
                return false;
            }
            
        }
        int getCount(){
            return count;
        }
        
    }
}