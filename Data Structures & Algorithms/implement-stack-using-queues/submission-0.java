class MyStack {
    Queue<Integer> q;
    int top ;
    public MyStack() {
        q = new ArrayDeque<>();
        top = 0;
    }
    
    public void push(int x) {
        q.add(x);
        top = x;
    }
    
    public int pop() {
        for(int i = 0; i < q.size()-1 ; i++){
            top = q.poll();
            q.add(top);
        }
        return q.poll();
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */