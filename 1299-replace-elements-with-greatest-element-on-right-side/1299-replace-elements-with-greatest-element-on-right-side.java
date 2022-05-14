class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length-1;
        int max =arr[n];
        arr[n]=-1;
        for(int i = n-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max,temp);
            
        }
        return arr;
    }
}