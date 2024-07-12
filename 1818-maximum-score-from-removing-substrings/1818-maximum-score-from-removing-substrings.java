class Solution {
    public int maximumGain(String s, int x, int y) {
        //Brute force (TLE): Greedy approach. First remove substring that gives higher score then remove the one that gives lower score
        //TC: O(n^3) ig, SC: O(n)

        // boolean ab = x>y;
        // int ans=0;
        // StringBuilder st = new StringBuilder(s);
        // if(ab){
        //     while(st.indexOf("ab")!=-1){
        //         ans+=x;
        //         int i=st.indexOf("ab");
        //         st.delete(i,i+2);
        //         // System.out.println("String at this point: "+st);
        //     }
        //     while(st.indexOf("ba")!=-1){
        //         ans+=y;
        //         int i=st.indexOf("ba");
        //         st.delete(i,i+2);
        //         // System.out.println("String at this point: "+st);
        //     }
        // }
        // else{
        //     while(st.indexOf("ba")!=-1){
        //         ans+=y;
        //         int i=st.indexOf("ba");
        //         st.delete(i,i+2);
        //         // System.out.println("String at this point: "+st);
        //     }
        //     while(st.indexOf("ab")!=-1){
        //         ans+=x;
        //         int i=st.indexOf("ab");
        //         st.delete(i,i+2);
        //         // System.out.println("String at this point: "+st);
        //     }
        // }
        // return ans;

        //Better approach: Greedy with stack
        // TC: O(n), SC: O(n)
        int ans=0;
        boolean ab = x>y;
        Stack<Character> st = new Stack<>();
        if(ab){ //If removing ab gives more score, remove ab first and then ba
            for(char c: s.toCharArray()){ //Removing all the "ab" first
                if(c!='b'){
                    st.push(c);
                }
                else{
                    if(!st.isEmpty() && st.peek()=='a'){
                        // System.out.println("top: "+st.peek() + ", curr: "+c + "Terefore: incrementing by: " + x);
                        st.pop();
                        ans+=x;

                    }
                    else{
                        st.push(c);
                    }
                }
            }
            // System.out.println(st);
            //retrive the remaining string and do the same for "ba"
            char rem []= new char[st.size()];
            for(int i=rem.length-1; i>=0; i--)
                rem[i] = st.pop();
            for(char c: rem){ //Removing all the "ba" 
                if(c!='a'){
                    st.push(c);
                }
                else{
                    if(!st.isEmpty() && st.peek()=='b'){
                        st.pop();
                        ans+=y;
                    }
                    else{
                        st.push(c);
                    }
                }
            }            
        }
        else{   //If removing ba gives more score, remove ba first and then ab
            for(char c: s.toCharArray()){ //Removing all the "ba" first
                if(c!='a'){
                    st.push(c);
                }
                else{
                    if(!st.isEmpty() && st.peek()=='b'){
                        st.pop();
                        ans+=y;
                    }
                   else{
                        st.push(c);
                    }
                }
            }
            // System.out.println(st);
            //retrive the remaining string and do the same for "ab"
            char rem []= new char[st.size()];
            for(int i=rem.length-1; i>=0; i--)
                rem[i] = st.pop();
            for(char c: rem){ //Removing all the "ab" 
                if(c!='b'){
                    st.push(c);
                }
                else{
                    if(!st.isEmpty() && st.peek()=='a'){
                        st.pop();
                        ans+=x;
                    }
                    else{
                        st.push(c);
                    }
                }
            }    
        }
        return ans;
    }
}