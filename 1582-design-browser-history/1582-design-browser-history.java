class BrowserHistory {
    Stack<String> hist = new Stack<>();
    Stack<String> temp = new Stack<>();

    public BrowserHistory(String homepage) {
        hist.push(homepage);
    }

    public void visit(String url) {
        while (!temp.isEmpty())
            temp.pop();
        hist.push(url);
    }

    public String back(int steps) {
        while (steps-- != 0 && hist.size() != 1)
            temp.push(hist.pop());
        return hist.peek();
    }

    public String forward(int steps) {
        while (steps-- != 0 && !temp.isEmpty())
            hist.push(temp.pop());
        return hist.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
