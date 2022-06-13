class Solution {
    class TriesNode{
        Map <Character,TriesNode> childern = new HashMap<>();
        String word;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        TriesNode root = new TriesNode();
        
        for(String word :dictionary){
            TriesNode curr = root;
            for(int i = 0; i< word.length(); i++){
                char ch = word.charAt(i);
                if(curr.childern.get(ch) == null){
                    curr.childern.put(ch,new TriesNode());
                }
                curr = curr.childern.get(ch);
            } 
            curr.word = word;
        }
        
        StringBuilder sb =new StringBuilder();
        for(String word : sentence.split(" ")){
            if(sb.length() > 0){
                sb.append(" ");
            }
            TriesNode curr =root;
            for(int i = 0; i< word.length();i++){
                char ch =word.charAt(i);
                if(curr.childern.get(ch)== null || curr.word != null){
                    break;
                }
                curr = curr.childern.get(ch);
            }
            sb.append(curr.word == null? word: curr.word);
        }
        return sb.toString();
    }
}