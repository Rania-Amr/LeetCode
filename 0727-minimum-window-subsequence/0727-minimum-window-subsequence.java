class Solution {
    public String minWindow(String s1, String s2) {
        int s1size =s1.length();
        int s2size =s2.length();
        int start=0;
        int end =0;
        int index1=0;
        int index2 =0;
        int maxLength =Integer.MAX_VALUE;
        String s="";
        
        
        while(index1 < s1size){
            if(s1.charAt(index1 )== s2.charAt(index2)){
                index2++;
                if(index2 == s2size){
                   start =index1;
                    end =index1+1;
                    index2--;
                    while(index2 >=0){
                        if(s1.charAt(start )== s2.charAt(index2)){
                            index2--;
                        }
                        start--;
                    }
                    start++;
                    if(end-start <maxLength){
                        maxLength =end-start;
                        s=s1.substring(start,end);
                    }
                                    index2=0;
                index1=start;
                }

            }
            
            index1++;
        }
        
        return s;
    }
}