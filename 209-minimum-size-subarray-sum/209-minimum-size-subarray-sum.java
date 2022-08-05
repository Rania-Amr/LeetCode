class Solution {
    public int minSubArrayLen(int S, int[] arr) {
        int startWindow =0;
        int tempsize=arr.length;
        int sum =0;
        int size = arr.length;
        boolean found =false;
        for(int endWindow =0;endWindow < arr.length; endWindow++){
          sum += arr[endWindow];
          while(sum >=S){
            tempsize = endWindow- startWindow+1;
            sum -= arr[startWindow];
            startWindow++;
              found = true;
          }
          size = Math.min(size,tempsize);

        }

        return found ? size : 0;
   
}}