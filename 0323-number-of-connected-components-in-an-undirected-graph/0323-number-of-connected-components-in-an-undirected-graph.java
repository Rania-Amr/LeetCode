class Solution {
    public int countComponents(int n, int[][] edges) {
       UnionFind unionFind =new UnionFind(n);
        for(int[] edge:edges){
            unionFind.union(edge[0],edge[1]);
        }
        return unionFind.getCount();
    }
    class UnionFind{
        int root[];
        int rank [];
        int count;
        UnionFind(int size){
            count =size;
            root=new int[size];
            rank = new int[size];
            for(int i=0;i<size;i++){
                rank[i] =1;
                root[i] =i;
        }}
          int getCount(){
             return count;
             
         }   
         
          int find(int x){
             if(root[x] ==x){
                 return x;
             }
            root[x] =find(root[x]);
             return root[x];
         }
         
           public void  union(int x,int y){
               int rootX=find(x);
               int rootY =find(y);
               if(rootX ==rootY){
                   return;
               }else{
                   count--;
                   if(rank[rootX] >rank[rootY]){
                       root[rootY] =rootX;
                       
                   }else if(rank[rootX] <rank[rootY]){
                       root[rootX] =rootY;
                   }else{
                       root[rootX] =rootY;
                       rank[rootY]++;
                   }
               }
           
             
        }
    }
}