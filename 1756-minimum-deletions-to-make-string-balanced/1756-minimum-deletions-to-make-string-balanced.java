class Solution {
    public int minimumDeletions(String s) {
        //Ref: https://www.youtube.com/watch?v=WDStNufBUQ8
        //TC: O(n), SC: O(1)
        int aCount = 0; //No. of 'a's to the right
        int ans=s.length();
        for(char c: s.toCharArray()){
            if(c=='a')
                aCount++;
        }
        int bCount = 0; //No. of 'b's to the right
        for(char c: s.toCharArray()){
            if(c=='a')
                aCount--;
            ans = Math.min(ans, aCount+bCount); //At every pivot index, ans will be minimum of ans, no of elements to be deleted from left + no. of elements to be deleted from right of the pivot
            if(c=='b')
                bCount++;
        }
        return ans;
    }
}