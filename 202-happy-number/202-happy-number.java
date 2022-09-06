class Solution {
    /*
    
    n =19
    
   while(n /10 >0){  
    while(n>0 ){
    k += pow(n%10 ,2)
    n=/10;
    
    }
    n=k;
    }
    
    */
    public boolean isHappy(int n) {
        //n 7
        //k=0
        //1
        int slow  =n;
        int fast =n;
        do{
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }while(slow !=fast);
       
return  slow==1? true:false;
    }
    
    public int getSum(int n) {
     int k =0;
        while(n>0){
                //1
            int m=n%10;
            k+=Math.pow(m,2);
            n/=10;
        }
         
        return  k;
    }
}