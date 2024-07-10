class Solution {
    public int minOperations(String[] logs) {
        //Using Stack: TC: O(n), SC: O(n)

        // Stack<String> st = new Stack<>();
        // for(String l: logs){
        //     if(l.equals("../") && !st.isEmpty())
        //         st.pop();
        //     else if(!(l.equals("./") || l.equals("../")))
        //         st.push(l);
        // }
        // return st.size();

        //-----------------------------------------------------------------------------------------

        //Using counter variable: TC: O(n), SC: O(1)

        int ans = 0; //Depth of folders from main folder
        for(String l: logs){
            if(l.equals("../") && ans>0)
                ans--;
            else if(!(l.equals("./") || l.equals("../")))
                ans++;
        }
        return ans;
    }
}