class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result  = new ArrayList<>();
        ArrayDeque<List<Integer>> queue = new ArrayDeque<>();
        queue.addLast( new ArrayList<>());
        for(int num : nums){
            int n = queue.size();
            for(int i =0; i< n;i++){
              List<Integer> oldPermute = queue.removeFirst();
              for(int j = 0; j <= oldPermute.size();j++ ){
                  List<Integer> newPermation = new ArrayList<>(oldPermute);
                  newPermation.add(j,num);
                  if(newPermation.size() == nums.length){
                      result.add(newPermation);
                  }else{
                     queue.addLast(newPermation); 
                  }
                  
              }
            }
        }
        return result;
    }
}