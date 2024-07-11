class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c==')'){
                StringBuilder temp = new StringBuilder();
                while(st.peek()!='(')
                    temp.append(st.pop());
                st.pop();
                for(char ch: temp.toString().toCharArray()){
                    st.push(ch);
                }
            }
            else
                st.push(c);
        }
        Object []arr = st.toArray();
        StringBuilder ans = new StringBuilder();
        for(Object o: arr){
            ans.append(o);
        }
        return ans.toString();
    }
}