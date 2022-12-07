class Solution {
    /*
    
    
    -remove .
    - + ignored anything after taill at
    
    different  ->set
    
    -> take string spilt for 3 parts
     ->    test      @        test     .com
     ->modidiy ever part
     -> conect again 
     ->add to set
     time o (n)
     space O(n)

    */
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmailSet =new HashSet<String>();
        for( String email: emails){
            int index = email.indexOf('@');
            String name = email.substring(0,index);
            String domain =email.substring(index+1,email.lastIndexOf('.'));
            StringBuilder newEmail = new StringBuilder();
            newEmail.append(filterWord(name));
            newEmail.append("@");
            newEmail.append(domain);
            uniqueEmailSet.add(newEmail.toString());
        }
        return uniqueEmailSet.size();
    }
    
    public String filterWord(String word){
        String newWord = word.replaceAll("\\.","");
        int index = newWord.indexOf("+");
        if(index >0){
           newWord = newWord.substring(0,index);
        }
        return newWord;
    }
} 