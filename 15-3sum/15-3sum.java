class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
      List<List<Integer>> triplets = new ArrayList<>();
    // TODO: Write your code here
        Arrays.sort(arr);
        for(int i = 0; i< arr.length-2; i++){
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
                
          int start = i+1;
          int end  = arr.length-1;
          while(start <end){
            int sum =arr[start] +arr[end];
            if((sum + arr[i ])> 0){
              end--;
            }else if ((sum + arr[i])< 0){
              start++;
            }else{
              triplets.add(Arrays.asList(arr[i ], arr[start], arr[end]));
                   end--;
                 start++;
                while(start < end && arr[start-1]== arr[start]){
                      start++;
                }
                while(start < end && arr[end+1]== arr[end]){
                     end--;
                }
            
            }
          }

        }
        return triplets;  
    }
}