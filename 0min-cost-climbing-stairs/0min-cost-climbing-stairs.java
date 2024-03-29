class Solution { 
    /*
    
    arr to save the cost
    
    [1,100,1,1,1,100,1,1,100,1]
    
    [1,100,2,2,3,102,4,5,105,6 ]
    
    
    
    dp[i] = Math.min(dp[i - 1], dp[i - 2] + num[i]);
    [1,100,1,1,1,100,1,1,100,1]

    [1,100,2,]
    
    
    
    
    [1, 3, 2, 5, 6, 10, 4]
    [0, 0, 1, 3, 3,  8, 9, 13  ]
    */
    public int minCostClimbingStairs(int[] cost) {
    
        int [] dp = new int [cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for(int  i = 2; i < dp.length; i++){
            dp[i] = Math.min(dp[i - 1] + cost[i - 1] , dp[i - 2] + cost[i - 2]);
        }
        return dp[dp.length - 1];
    }
}