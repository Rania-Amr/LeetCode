class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if( stack.size()!=0){
                    sb.append(ch);
                }
                stack.addFirst(ch);
            }else if(ch==')') {
                if(stack.size()!=1){
                sb.append(ch);
            }
                stack.removeFirst();
            }
        }
        return sb.toString();
    }
}