class Solution {
    public int characterReplacement(String str, int k) {
      Map<Character,Integer> letters = new HashMap<>();
    int startWindow = 0;
    int maxSize = 0;
    int size = 0;
    for(int endWindow = 0; endWindow< str.length();endWindow++){
      letters.put(str.charAt(endWindow),letters.getOrDefault(str.charAt(endWindow),0)+1);
      size = Math.max(size,letters.get(str.charAt(endWindow)));
    
      if(endWindow - startWindow +1-size > k){
        char ch =  str.charAt(startWindow);
        letters.put(str.charAt(startWindow),letters.get(str.charAt(startWindow))-1);
          startWindow+=1;
      }
      maxSize =Math.max(maxSize,endWindow-startWindow +1);

    }
    return maxSize;
        
    }
}