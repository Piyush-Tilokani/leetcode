class Solution {
    public int numSteps(String s) {
        //Brute force TC:O(n), SC: O(n)
        // if(s.length()==1)
        //      return 0;
        // StringBuilder st = new StringBuilder(s);
        // int ans=0;
        // int r=s.length()-1;
        // while(!st.toString().equals("10")){
        //     if(r>=0 && st.charAt(r)!='1'){
        //         r-=1;
        //         st.deleteCharAt(r+1);
        //         ans++;
        //     }
        //     else{
        //         int temp = r;
        //         while(temp>=0 && st.charAt(temp)=='1'){
        //             st.setCharAt(temp--, '0');
        //         }
        //         if(temp== -1)
        //             st.insert(0, '1');
        //         else
        //             st.setCharAt(temp, '1');
        //         // st.setCharAt(r, '0');
        //         r-=1;
        //         if(r>=0)st.deleteCharAt(r+1);
        //         ans+=2;
        //     }
        //     // System.out.println(st);
        // }
        // return ans+1;

//----------------------------------------------------------------------------------------------

        //Optimal solution TC: O(n), SC: O(1)
        //Right to left with carry bits

        int ans = 0; //ans so far
        int carry=0; //carry from right to left
        for(int i=s.length()-1; i>0; i--){
            ++ans; //For each increment of atleast 1
            if(s.charAt(i) - '0' + carry==1){//If odd, 
                ++ans;                       //One more extra step
                carry=1;                     //Set carry   
            }
        }//Left-most bit is always 1(given in desc) so if theres any carry, we will need an extra step, otherwise no extra step
        return ans+carry;
    }
}