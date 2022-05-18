class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int up = 0;
        int down = matrix.length-1;
        while(up <= down){
            int medRow  = up+(down-up)/2;
            if(matrix[medRow][0] < target && matrix[medRow][col-1] < target){
               up = medRow+1; 
            }else if (matrix[medRow][0] > target){
                down = medRow-1;
            }else{
                up =down=medRow;
                int right = 0;
                int left = col-1;
                while(right <= left){
                    int medCol = right+(left-right)/2;
                    if(matrix[medRow][medCol] > target){
                        left = medCol-1;
                    }else if(matrix[medRow][medCol] < target){
                        right = medCol+1;
                    }else{
                        return true;
                    }
                        
                }
                return false;
            }
        }
        return false;
    }
}