class Solution {
    public boolean validMountainArray(int[] arr) {
        int i =0;
        for(i = 0; i < arr.length-1; i++){
            if(arr[i] >= arr[i+1] )
               break;
        }
        if(i == 0 || i == arr.length-1)
            return false;
        int j=0;
        for(j = i; j < arr.length-1; j++){
            if(arr[j] <= arr[j+1] )
               return false;
        }
        return j == arr.length-1;
    }
}