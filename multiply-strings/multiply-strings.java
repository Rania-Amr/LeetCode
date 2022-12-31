class Solution {

    
    public String multiply(String s1, String s2) {

        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }
        StringBuilder num1 = new StringBuilder(s1);
        StringBuilder num2 = new StringBuilder(s2);
        num1.reverse();
        num2.reverse();
        int  n = s1.length() + s2.length();
        StringBuilder answer = new StringBuilder();
        for (int i =0;i< n;i++){
            answer.append('0');
        }
        for (int  i = 0; i < num1.length(); i++){
              int  digit1 = (num1.charAt(i) - '0');
            for (int  j = 0; j < num2.length(); j++){
                int  digit2 = num2.charAt(j) - '0';
                int index = j + i;
                int carray = answer.charAt(index) - '0';
                int mul = digit1 * digit2 + carray;
                answer.setCharAt(index,(char)(mul % 10 + '0'));
                
                int value = (answer.charAt(index + 1) - '0') + mul / 10;
                answer.setCharAt(index + 1, (char)(value + '0'));
            }
        }
if (answer.charAt(answer.length() - 1) == '0') {
            answer.deleteCharAt(answer.length() - 1);
        }
        
        answer.reverse();
        return answer.toString();
        
    }
}