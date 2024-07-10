class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String l: logs){
            if(l.equals("../") && !st.isEmpty())
                st.pop();
            else if(!(l.equals("./") || l.equals("../")))
                st.push(l);
        }
        return st.size();
    }
}