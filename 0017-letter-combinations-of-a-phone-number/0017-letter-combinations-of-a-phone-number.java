class Solution {
    public List<String> letterCombinations(String digits) {
        Map <Character, String> keyboard = new HashMap<>();
        
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");
        
        ArrayDeque<StringBuilder> queue = new ArrayDeque<>();
        List<String>  res = new ArrayList<>();
        queue.add(new StringBuilder(""));
        if(digits.length() == 0){
            return res;
        }
        for(char currNumber : digits.toCharArray()){
            int n = queue.size();
            for(int  i = 0; i < n; i++){
                StringBuilder currString = queue.removeFirst();
                for(char currchar : keyboard.get(currNumber).toCharArray()){
                    StringBuilder newWord = new StringBuilder(currString);
                    newWord.append(currchar);
                
                queue.addLast(newWord);
            }
            }
        }
        while(!queue.isEmpty()){
            res.add(queue.removeFirst().toString());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        return res;
       
    }
}