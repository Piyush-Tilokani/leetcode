class Solution {
    public int minAddToMakeValid(String s) {
        //Using stack, TC: O(n), SC: O(n)
        // st.size() for unbalanced open parentheses 
        // ans for unbalanced closed parentheses
        // int ans=0;
        // Stack<Character> st = new Stack<>();
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i)=='(')
        //         st.push(s.charAt(i));
        //     else
        //         if(!st.isEmpty())
        //             st.pop();
        //         else
        //             ans++;
        // }
        // return ans+st.size();

        //-------------------------------------------------------------------------------------
        //Using counter variables, TC: O(n), SC: O(1)
        int ans=0;
        int o=0;
        int c=0;
        for(char ch: s.toCharArray()){
            if(ch=='(')
                o++;
            else{
                c++;
                if(o>0)
                    o--;
                else
                    ans++;
            }
            // System.out.println("CHar: "+ch+", ans: "+ans);
        }
        return ans+o;
    }
}