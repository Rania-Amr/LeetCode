class Solution {
     class Pair {
        int index;
        long end;
        public Pair(int index, long end) {
            this.index=index;
            this.end=end;
        }
    }
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        int[] count = new int[n];
        PriorityQueue<Pair> roomsBusy = new PriorityQueue<>((a,b)->a.end == b.end ? a.index - b.index : (int)(a.end - b.end));
        PriorityQueue<Pair> roomsAvailable = new PriorityQueue<>((a,b) -> a.index - b.index);
        
        for(int i = 0; i < n ; i++){
            roomsAvailable.add(new Pair(i, 0));
        }
        
        for(int i = 0; i < meetings.length; i++) {
            int meetingStart = meetings[i][0];
            int meetingEnd = meetings[i][1];
            while(!roomsBusy.isEmpty() && (roomsAvailable.isEmpty() || roomsBusy.peek().end <= meetingStart)) {
                roomsAvailable.add(roomsBusy.remove());
            }
            Pair nextRoom = roomsAvailable.remove();
            count[nextRoom.index]++;
            nextRoom.end = Math.max(meetingEnd, meetingEnd - meetingStart + nextRoom.end);
            roomsBusy.add(nextRoom);
        }
        int max = 0;
        for(int i = 1; i <count.length ; i++) {
              if(count[i] > count[max]) {
                  max = i;
              }
        }
          
        return max;
    }
   
}