class Solution {
    class Race{
        int position;
        int speed;
        int move;
        Race( int position, int speed, int move){
            this.position = position;
            this.move = move;
            this.speed = speed; 
        }
        
        
    }
    public int racecar(int target) {
        ArrayDeque <Race> queue = new ArrayDeque<>();
        Set <String> seen = new HashSet<>();
        queue.addLast(new Race (0, 1, 0));
        while(!queue.isEmpty()){
            Race curr = queue.removeFirst();
            if(curr.position == target){
                return curr.move;
            }
            if(!seen.contains(curr.position + "," + curr.speed)){
                seen.add(curr.position + "," + curr.speed);
                queue.addLast(new Race (curr.position + curr.speed, curr.speed * 2, curr.move + 1));
                if(curr.position + curr.speed > target || (curr.position + curr.speed < target && curr.speed < 0)){
                    curr.speed = curr.speed > 0 ? -1 : 1;
                    queue.addLast(new Race (curr.position, curr.speed , curr.move + 1));

                }
            }
        }
        return -1;
    }
}