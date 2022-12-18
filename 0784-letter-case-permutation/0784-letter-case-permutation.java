class Solution {

    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        if(s == null){
            return result;
        }
        result.add(s);
        for(int  i = 0 ; i < s.length(); i++){
            int size = result.size();
            if(Character.isLetter(s.charAt(i))){
                for(int j = 0; j < size; j++){
                    char [] newArr = result.get(j).toCharArray();
                    if(Character.isUpperCase(newArr[i])){
                        newArr[i] = Character.toLowerCase(s.charAt(i));
                    }else{
                       newArr[i] = Character.toUpperCase(s.charAt(i)); 
                    }
                   result.add(String.valueOf(newArr));
                }    
            }
        }
        return result;
    }
}