class Solution {
    //[3,4,2]
    Map <Integer, Integer> point = new HashMap<>();
    Map <Integer, Integer> cache  = new HashMap<>();

    public int deleteAndEarn(int[] nums) {
        
        int maxNumber = 0;
        for(int n : nums){
            point.put(n, point.getOrDefault(n, 0) + 1);
            maxNumber = Math.max(n, maxNumber);
        }
        return getMaxEarn(maxNumber);
    }
    public int getMaxEarn(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return point.getOrDefault(1,0);
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int gain = point.getOrDefault(n, 0) * n;
        cache.put(n, Math.max(getMaxEarn(n - 2) + gain,getMaxEarn(n - 1) ));
        
        
        
        return cache.get(n);
    }
}