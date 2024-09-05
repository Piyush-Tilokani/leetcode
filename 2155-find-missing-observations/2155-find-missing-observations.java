class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int [] ans = new int[n];
        int m = rolls.length;
        int total = (m+n)*mean;
        int sum = 0;
        for(int i: rolls)
            sum+=i;
        int req = total - sum;
        if(req<n || req>6*n)
            return new int[0];
        int q = req/n;
        int r = req%n;
        for(int i=0; i<n; i++){
            ans[i] = q;
        }
        for(int i=0; i<r; i++)
            ans[i]++;
        return ans;
    }
}