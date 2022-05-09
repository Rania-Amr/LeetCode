class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int count =0;
        for(int i = 0; count < n; i++){
            int current  = i;
            int prev = nums[i];
            do{
                int next = (current+k)% n;
                int temp =nums[next];
                nums[next] = prev;
                prev =temp;
                current = next;
                count++;
                
            }while(i != current);
        }
        
    }
}