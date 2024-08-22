class Solution {
    public int findComplement(int num) {
        int ans = 0; 
        int i=0; //To track the ith bit from right
        while(num!=0){
            if((num&1)==0) //If bit is not set(is 0)
                ans += 1<<i; //Set the ith bit of ans
            i++; //Increase i
            num>>=1; //Right shift num to get next bit 
        }
        return ans;
    }
}