class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //bianry on roew 
        //binary of col
        
    int row = binarySearchRow(matrix,  target);
        if(row != -1){
            int col =binarySearchCol(matrix,  target,row);
            return col ==-1?false :true;
        }
        return false;
    }
    public int binarySearchRow(int[][] matrix, int target) {
       int start =0;
        int end = matrix.length-1;
        int n =matrix[0].length-1;
        while(start <=end){
            int mid =start+(end-start)/2;
            if(target >=matrix[mid][0] &&  matrix[mid][n] >=target){
                return mid;
            }else if (matrix[mid][n] <target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
      public int binarySearchCol(int[][] matrix, int target,int row) {
       int start =0;
        int end = matrix[row].length-1;
  
        while(start <=end){
            int mid =start+(end-start)/2;
            if(target ==matrix[row][mid]){
                return mid;
            }else if (matrix[row][mid] <target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}