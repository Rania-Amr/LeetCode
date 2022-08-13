class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image == null || image.length==0){
            return image;
        }
      
        int oldColor =image[sr][sc];
        if(oldColor != color){
            dfs(image,sr,sc,oldColor,color);
        }
        return image;
    }
    
      public void dfs(int[][] image, int sr, int sc, int oldColor ,int newColor) {
    
        if(image[sr][sc] == oldColor){
            image[sr][sc] =newColor;
            if(sr+1 <image.length )dfs(image,sr+1,sc,oldColor,newColor);
            if(sr-1 >=0 )dfs(image,sr-1,sc,oldColor,newColor);
            if(sc+1 <image[0].length )dfs(image,sr,sc+1,oldColor,newColor);
            if(sc-1>=0)dfs(image,sr,sc-1,oldColor,newColor);
        }
    }
}