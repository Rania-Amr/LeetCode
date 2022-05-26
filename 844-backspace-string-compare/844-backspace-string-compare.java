class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        int sSkip = 0;
        int tSkip = 0;
        
        while(i >= 0 || j >= 0){
            while(i >= 0 ){
                
            if(s.charAt(i) == '#'){
                i--;
                sSkip++;
            }else if(sSkip >0){
                i--;
                sSkip--;
            }else{
                break;
            }
            }
            
            while(j>= 0){ 
                if(t.charAt(j)=='#'){
                j--;
                tSkip++;
            }else if(tSkip>0){
                  tSkip--;j--;  
            }else{
                    break;
                }
            }            
            if(i >= 0 && j >= 0 &&t.charAt(j) != s.charAt(i)){
                return false;
            }
            i--;
            j--;
        }
        if( j !=i) {return false;}
        else{
        return true;}
    }
}