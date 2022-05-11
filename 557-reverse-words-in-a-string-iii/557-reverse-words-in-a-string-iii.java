class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i)==' '){
            sb.append(reversWord(s,j,i-1));
            sb.append(' ');
            j = i+1;
            }
            
        }
        sb.append(reversWord(s,j,s.length()-1));
        return sb.toString();
    }
    
    
    public StringBuilder reversWord(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i =end; i>= start; i--){
          sb.append(s.charAt(i));
        }
        return sb;
    }
}