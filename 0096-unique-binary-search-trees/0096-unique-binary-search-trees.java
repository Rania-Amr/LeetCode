class Solution {
    Map <Integer, Integer> count = new HashMap<>();
    public int numTrees(int n) {
        if(count.containsKey(n)){
            return count.get(n);
        }
        if(n <= 1){
            return 1;
        }
        int counter = 0;
        for(int i = 1; i <= n; i++){
            int left = numTrees(i - 1);
            int right = numTrees(n - i);
            counter +=( left * right);
        }
        count.put(n, counter);
        return counter;
    }
    
}