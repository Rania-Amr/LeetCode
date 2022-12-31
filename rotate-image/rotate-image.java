class Solution {
   
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length-1;
        while(l < r) {
            for(int i = 0; i< r-l ;i++){
                  int top = matrix[l][l+i];
                  matrix[l][l+i]= matrix[r-i][l];
                  matrix[r-i][l] = matrix[r][r-i];
                  matrix[r][r-i] =matrix[l+i][r];
                  matrix[l+i][r] =top;
                
            }
          l++;
          r--;
        }
   
    }
}