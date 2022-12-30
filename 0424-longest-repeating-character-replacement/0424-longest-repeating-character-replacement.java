class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int length = 0;
        Map <Character , Integer> map = new HashMap<>();
        int start  = 0;
        for(int end =0; end< s.length();end++){
            char curr = s.charAt(end);
            map.put(curr,map.getOrDefault(curr,0)+1);
           max = Math.max(max,map.get(curr));
            if(end-start +1 -max > k){
              map.put( s.charAt(start),map.get( s.charAt(start))-1);
               
                if(map.get(s.charAt(start)) == 0){
                    map.remove(start);
                } start++;
                max--;
            }
            length =end-start+1;
        }
        return length;
    }
}