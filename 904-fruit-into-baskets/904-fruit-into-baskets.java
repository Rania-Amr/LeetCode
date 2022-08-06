class Solution {
    public int totalFruit(int[] arr) {
        Map<Integer , Integer> fruit = new HashMap<>();
        int start  = 0;
        int sum = 0;
        int maxSum = 0;
        for(int end =0;end < arr.length;end++){
          fruit.put(arr[end],fruit.getOrDefault(arr[end],0)+1);
          while(fruit.size()>2){
            fruit.put(arr[start],fruit.get(arr[start])-1);
            if(fruit.get(arr[start]) == 0){
                fruit.remove(arr[start]);
            }
            start++;
            sum--;
          }
            sum++;
          maxSum =Math.max(maxSum,sum);
        }
        return maxSum;
    }
}