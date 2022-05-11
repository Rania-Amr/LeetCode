class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal =new ArrayList<>();
        List<Integer> prev =new ArrayList<>();
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        for(int i = 1 ;i< numRows;i++){
            List<Integer> current =new ArrayList<>();
            current.add(1);
            for(int j =1; j < prev.size();j++){
                current.add(prev.get(j-1) + prev.get(j));
            }
            current.add(1);
            pascal.add(current);
            prev = current;
        }
        return pascal;
    }
}