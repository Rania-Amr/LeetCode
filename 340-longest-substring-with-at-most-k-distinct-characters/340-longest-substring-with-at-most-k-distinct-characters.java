class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map < Character,Integer>map =new HashMap<>();
        int startWindow  = 0;
        int  size =0;
        int maxSize = 0;
        int count  = 0;
        for(int endWindow =0; endWindow< s.length();endWindow++){
            char ch = s.charAt(endWindow);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                count++;
                map.put(ch,1);
            }
            while(count>k){
                char start = s.charAt(startWindow);
                int x = map.get(start);
                x -=1;
                if(x == 0){
                    count--;
                    map.remove(start);
                }else{
                    map.put(start,x);
                    
                }
                startWindow++;
            }
            size = endWindow-startWindow+1;
            maxSize = Math.max(size,maxSize);
        }
        return maxSize;
    }
}