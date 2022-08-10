class Solution {
    public int removeDuplicates(int[] arr) {
       int start = 0;
    for(int i =  1 ; i <arr.length; i++){
      if(arr[i] != arr[start]){
        arr[++start] = arr[i];
      }
    }
    return start+1; 
    }
}