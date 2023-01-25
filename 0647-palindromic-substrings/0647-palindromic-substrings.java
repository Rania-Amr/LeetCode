class Solution {
    public int countSubstrings(String s) {
     if(s.length()<2){
         return s.length();
     }
        int count =0;
        for(int i =0;i<s.length();i++){
            int oddCount =getCountSubstrings(s,i,i);
            int EvenCount =getCountSubstrings(s,i,i+1);
            count+=oddCount+EvenCount;

        }
        return count;
    }
    public int getCountSubstrings(String s,int l ,int r) {
      int left = l;
        int count =0;
        int right = r;
        while(left >=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count ++;
        }
        return count;
    }
}