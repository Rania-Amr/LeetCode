class Solution {
    /**
    
    -every element take zero or more
    - if zero 
    
    */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> paths = new ArrayList<>();
        backtracking(candidates,paths,new ArrayList<>(),target,0);
        return paths;
    }
     public void backtracking(int[] candidates, List<List<Integer>> paths ,
                              List<Integer> path, int target,int index) {
       if(target == 0){
         paths.add(new ArrayList<>(path));  
       }else if(target < 0 || index >= candidates.length){
           return;
       }else{
           path.add(candidates[index]);
           backtracking(candidates,paths,path,target-candidates[index],index);
           path.remove(path.size()-1);
           
           backtracking(candidates,paths,path,target,index+1);

       }
      
    }
}