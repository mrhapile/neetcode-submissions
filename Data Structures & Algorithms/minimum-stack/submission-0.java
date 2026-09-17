class MinStack {
    Stack<Long> s1;
    long min;
    public MinStack() {
        s1 = new Stack<>();
    }
    
    public void push(int value) {
        if(s1.isEmpty()){
            min = value;
            s1.push(value - min);
        }else if(value < min ){
            s1.push(value-min);
            min = value;
        }else{
            s1.push(value-min);
        }
    }
    
    public void pop() {
        long t = s1.pop();
        if(t < 0){
            min = min - t;
        }
    }
    
    public int top() {
        long t = s1.peek();
        if(t >= 0){
            return (int)(min + t);
        }else{
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */