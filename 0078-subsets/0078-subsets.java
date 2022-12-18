class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        sets.add(new ArrayList<>());
        for(int  n : nums){
            int size = sets.size();
            for(int i =0;i <size;i++){
              List<Integer>  arrayCopy = new ArrayList<>(sets.get(i));
                arrayCopy.add(n);
               sets.add(arrayCopy) ;
            }
        }
        return sets;
    }
}