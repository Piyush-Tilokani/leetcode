class Solution {
    public int minBitFlips(int start, int goal) {
        int max = Math.max(start, goal);
        int ans = 0;
        while(max!=0){
            int res = (start & 1) ^ (goal & 1);
            if(res==1)
                ans++;
            start>>=1;
            goal>>=1;
            max>>=1;
        }
        return ans;
    }
}