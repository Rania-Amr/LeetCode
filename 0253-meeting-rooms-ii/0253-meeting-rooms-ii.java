class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals ,(a,b)-> a[0]-b[0]);
        int size =0;
        PriorityQueue<int [] > queue = new PriorityQueue<>((a,b)-> a[1]-b[1]);
        for(int arr[] : intervals){
            queue.add(arr);
            while(queue.peek()[1] <= arr[0]){
                queue.poll();
            }
            size =Math.max(size,queue.size());
        }
        return size;
    }
}