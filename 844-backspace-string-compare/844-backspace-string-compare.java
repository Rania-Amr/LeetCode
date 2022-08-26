class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        int sRemove =0;
        int tRemove =0;
        /*
"ab##"
"c#d#"
i=1
j=2
remove1 =2
remove2 =1

*/
        while( i >=0 || j >= 0){
            while( i >=0 ){
                if(s.charAt(i) =='#'){
                sRemove++;
                i--;
                }else if(sRemove >0){
                   i--;
                sRemove--;   
                }else{
                    break;
                }
            
            }
            while(j >= 0 ){
              if( t.charAt(j)=='#'){
                tRemove++;
                j--;}
                else if( tRemove >0){
                j--;
                tRemove--;
            }else{
                    break;
                }
            }
           
          
            if(j>=0 && i >=0 && s.charAt(i)!= t.charAt(j)){
                return false;
            }
            
            if(i>=0 != j>=0){
                return false;
            }
            j--;i--;
        }
        return true;
    }
}
