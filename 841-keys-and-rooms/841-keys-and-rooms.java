class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean []seen =new boolean[rooms.size()];
        Stack <Integer> stack = new Stack();
        
        stack.push(0);
        seen[0] = true;
        while(!stack.isEmpty()){
            int curr =stack.pop();
            for(int n : rooms.get(curr)){
                if(!seen[n]){
                    stack.push(n);
                    seen[n]=true;
                }
            }
        }
        
        
        
        for(boolean flag: seen){
            if(!flag){
                return false;
            }
        }
        return true;
    }
    
    
    
}