class Solution {
    public int threeSumSmaller(int[] arr, int target) {
         int count = 0;
         Arrays.sort(arr);
         for (int i = 0; i < arr.length - 2; i++) {
          count += searchPair(arr, target - arr[i], i);
        }
        return count;
    }
    
    
    
     private  int searchPair(int[] arr, int targetSum, int first) {
        int count = 0;
        int left = first + 1, right = arr.length - 1;
        while (left < right) {
          if (arr[left] + arr[right] < targetSum) { 
            count += right - left;
            left++;
          } else {
            right--; 
          }
        }
        return count;
  }

}