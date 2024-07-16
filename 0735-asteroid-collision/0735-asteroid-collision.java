class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a: asteroids){
            if(a>0){ //Moving from left to right
                st.push(a);
            }
            else{ //moving from right to left
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(a)){ //Is smaller than the asteroid on top of stack
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){ //If asteroid on top of stack is also moving from right to left
                    st.push(a);
                }
                else if(a + st.peek() ==0){ //Equal magintude, opposite sign
                    st.pop();
                }
            }
        }
        // System.out.println(st);
        int ans[] = new int[st.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}