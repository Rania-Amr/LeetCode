class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()) return false;
        int j =0;
        int  i =0;
        while(i <t.length() && j <s.length()){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            i++;
        }
        return j == s.length();
    }
    

}