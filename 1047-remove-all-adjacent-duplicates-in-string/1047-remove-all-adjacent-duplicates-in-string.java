class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length();i++){
            if(count > 0 && s.charAt(i) == sb.charAt(count-1)){
                sb.deleteCharAt(count-1);
                count--;
            }else{
                sb.append(s.charAt(i));
                count++;
            }
        }
        return sb.toString();
    }
}