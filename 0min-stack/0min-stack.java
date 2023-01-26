class MinStack {
    ArrayDeque <int []> stack = new ArrayDeque<>(); 
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.addFirst(new int []{val,val});
        }else{
              int min = Math.min(stack.getFirst()[1],val);
              stack.addFirst(new int []{val,min});
        }
      
    }
    
    public void pop() {
        stack.removeFirst();
    }
    
    public int top() {
       return stack.getFirst()[0];
    }
    
    public int getMin() {
          return stack.getFirst()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */