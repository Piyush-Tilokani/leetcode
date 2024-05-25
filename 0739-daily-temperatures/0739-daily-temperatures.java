class Solution {
    public int[] dailyTemperatures(int[] temp) {
        //Monotonic Stack approach TC: O(n), SC: O(n)
        //Maintain a monotonically decreasing stack 
        int ans [] = new int [temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<temp.length; i++){
            while(!st.isEmpty() && temp[st.peek()] < temp[i]) //While we get current element greater than element on stack top, pop the item and set ans[] array for popped item
                ans[st.peek()] = i-st.pop();
            st.push(i); //Push the new monotonically decreasing element
        }
        return ans;
    }
}