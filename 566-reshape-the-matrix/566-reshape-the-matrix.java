class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] reshapeMat = new int [r][c];
        
        if(mat.length ==0 || r*c !=mat.length*mat[0].length)return mat;
        int count = 0;
        for(int i =0; i<mat.length;i++){
           for(int j =0;j <mat[0].length;j++){
           reshapeMat[count/c][count%c] =mat[i][j];
               count++;
          }
        }
        return reshapeMat;
    }
}