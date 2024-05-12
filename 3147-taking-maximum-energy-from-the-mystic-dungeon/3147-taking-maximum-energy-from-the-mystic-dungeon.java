class Solution {
    public int maximumEnergy(int[] energy, int k) {
        //DP approach
        //TC: O(n), SC: O(n)
        int ans=Integer.MIN_VALUE;
        int dp[] = new int[energy.length];
        for(int i=energy.length-1; i>=0; i--){
            dp[i] = energy[i] + ( (i+k) < energy.length ? dp[i+k] : 0 );
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}