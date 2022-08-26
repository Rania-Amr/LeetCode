class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int []>  merged =new ArrayList<>();
        int j=-1;
        for(int i =0; i<intervals.length;i++ ){
            if(merged.isEmpty() || merged.get(j)[1] < intervals[i][0]){
                j++;
                merged.add(intervals[i]);
            }else{
              merged.get(j)[1] =Math.max(intervals[i][1],merged.get(j)[1])  ;
            }
        }
        return merged.toArray(new int [merged.size()][]);
    }
}