class MyQueue {
    Stack<Integer> main = new Stack<>();    
    Stack<Integer> temp = new Stack<>();    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        main.push(x);
    }
    
    public int pop() {
        while(!main.empty()){
            temp.push(main.pop());
        }    
        int ans = temp.pop();
        while(!temp.empty()){
            main.push(temp.pop());
        }   
        return ans;
    }
    
    public int peek() {
        return main.get(0);
    }
    
    public boolean empty() {
        return main.empty();
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