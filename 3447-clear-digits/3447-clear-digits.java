class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(Character.isDigit(c) && !st.isEmpty())
                st.pop();
            else
                st.push(c);
        }
        // System.out.println(st);
        char[] ans=new char[st.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return new String(ans);
    }
}