class Solution {
    public int singleNumber(int[] nums) {
        //Approach referred from: https://takeuforward.org/bit-manipulation/single-number-ii
        int ans = 0;
        for(int i=0; i<32; i++){
            int ones=0;
            for(int j: nums){
                int num = j>>i;
                if( ((num&1)==1) )
                    ones++;            
            }
            // System.out.println("For i: "+i+", zeroes: "+zeros+" ,ones: "+ones);
            if(ones%3==1)
                ans |= (1<<i);      //Set the ith bit of the answer variable
            // System.out.println("Binary representation of ans: "+Integer.toString(ans, 2));
        }
        return ans;
    }
}