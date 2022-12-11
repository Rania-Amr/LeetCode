class Solution {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, (a, b)->a[0]-b[0]);
        UnionFind unionFind=new UnionFind(n);
        for(int i =0;i<logs.length;i++){
            unionFind.union(logs[i][2],logs[i][1]);
            if(unionFind.getCount()==1){
                return logs[i][0];
            }
        }
        return -1;
    }
    class UnionFind{
        int root[];
        int rank [];
        int count;
        UnionFind(int n){
            root=new int [n];
            rank=new int[n];
            count =n;
            for(int i=0;i<n;i++){
                root[i]=i;
                rank[i] =1;
            }
            
        }
        int getCount(){
            return count;
        }
        
        int find(int x){
            if(root[x] ==x){
                return x;
            }
            return root[x]=find(root[x]);
        }
        void union(int x,int y){
            int rootX =find(x);
            int rootY =find(y);
            if(rootY ==rootX){
                return;
            }else{
                count--;
                if(rank[rootY]> rank[rootX]){
                    root[rootX]=rootY;
                }else if(rank[rootY]<rank[rootX]){
                    root[rootY] =rootX;
                }else{
                      root[rootY] =rootX;
                    rank[rootX]++;
                }
            }
        }
    }
}