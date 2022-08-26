class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[] > merged = new ArrayList<>();
        int i =0;
        if(intervals ==null || intervals.length < 1){
            merged.add(newInterval);
        return merged.toArray(new int [merged.size()][]);

        }
        while(i< intervals.length  && intervals[i][1] < newInterval[0]){
          
            merged.add( intervals[i]);
              i++;
        }
        int start = newInterval[0];
        int end = newInterval[1];
        while(i< intervals.length  && intervals[i][0] <= newInterval[1]){
        start = Math.min(intervals[i][0],start);
        
          end =  Math.max(intervals[i][1], end);
              i++;
        }
        merged.add( new int[]{start,end});
        while(i< intervals.length ){
          
            merged.add( intervals[i]);
              i++;
        }
        return merged.toArray(new int [merged.size()][]);
    }
}
/*

ccase 1:m 

*/