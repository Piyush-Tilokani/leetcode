class Solution {
    private long sumOfFirstN(long n){
        if(n<0)
            return 0;
        return n%2==0 ? (n/2)*(n+1) : n*((n+1)/2);
    }
    public long countCompleteDayPairs(int[] hours) {
        // Same to same https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
        // TC: O(n), SC: O(24) = const
        long ans=0;
        long map[] = new long[24];
        for(int i: hours)
            map[i%24]++;
        ans += sumOfFirstN(map[0]-1);
        ans += sumOfFirstN(map[12]-1);
        int l=1;
        int r=23;
        while(l<r){
            ans+= map[l++] * map[r--];
        }
        return ans;
    }
}