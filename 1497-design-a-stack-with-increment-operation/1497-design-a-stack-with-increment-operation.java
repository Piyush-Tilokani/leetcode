class CustomStack {
    //Approach: Stack simulation using array
    int [] st;
    int top=-1;
    public CustomStack(int maxSize) {
        st = new int[maxSize];
    }
    
    public void push(int x) {
        if(this.top<this.st.length-1)
            st[++top] = x;
    }
    
    public int pop() {
        if(top>=0)
            return st[top--];
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<k && i<st.length; i++)
            st[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */