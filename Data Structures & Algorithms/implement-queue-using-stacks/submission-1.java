class MyQueue {

    Stack<Integer> inner;
    Stack<Integer> outer;

    public MyQueue() {
        inner = new Stack<>();
        outer = new Stack<>();
    }
    
    public void push(int x) {
        inner.push(x);
    }
    
    public int pop() {
        moveIfNeeded();
        return outer.pop();
    }
    
    public int peek() {
        moveIfNeeded();
        return outer.peek();
    }
    
    public boolean empty() {
        return inner.isEmpty() && outer.isEmpty();
    }

    public void moveIfNeeded() {
        if(outer.isEmpty()) {
            while(!inner.isEmpty()) {
                outer.push(inner.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */