class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        if(intervals.length < 2){
            return 1;
        }
     
        int count =1;
        
        PriorityQueue<int []> queue =new PriorityQueue<>(intervals.length , (a,b) -> Integer.compare(a[1],b[1]));
        
        for(int [] meeting  : intervals){
            while(!queue.isEmpty() && meeting[0] >=queue.peek()[1] ){
                queue.poll();
            }
            queue.add(meeting);
            count =Math.max(count,queue.size());
            
        }
        return count;
    }
}