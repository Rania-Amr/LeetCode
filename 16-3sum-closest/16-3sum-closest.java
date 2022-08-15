class Solution {
    public int threeSumClosest(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int smallestDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
          int left = i + 1, right = arr.length - 1;
          while (left < right) {
           
            int targetDiff = targetSum - arr[i] - arr[left] - arr[right];
            if (targetDiff == 0) 
              return targetSum;

            if (Math.abs(targetDiff) < Math.abs(smallestDifference)
                || (Math.abs(targetDiff) == Math.abs(smallestDifference) && targetDiff > smallestDifference))
              smallestDifference = targetDiff; 

            if (targetDiff > 0)
              left++; 
            else
              right--; 
          }
        }
        return targetSum - smallestDifference;
    }
}