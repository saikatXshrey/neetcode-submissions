class MyStack {

    Queue<Integer> q;

    public MyStack() {
        this.q = new LinkedList<>();
    }
    
    public void push(int x) {
        this.q.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < this.q.size() - 1; i++) {
            push(this.q.poll());
        }

        return this.q.poll();
    }
    
    public int top() {
        return ((LinkedList<Integer>) this.q).getLast();
    }
    
    public boolean empty() {
        return this.q.isEmpty();
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