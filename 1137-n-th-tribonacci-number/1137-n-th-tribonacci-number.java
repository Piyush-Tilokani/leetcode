class Solution {
    //Topdwon dp(memoizaztion)
    // Map<Integer, Integer> map = new HashMap<>();

    //Bottom up dp(Tabulation)
    // private int bottomUp(int n, int []dp){
    //     if(n<=2)
    //         return dp[n];
    //     if(dp[n]!=0)
    //         return dp[n];
    //     dp[n] = bottomUp(n-1, dp)+bottomUp(n-2, dp)+bottomUp(n-3, dp);
    //     return dp[n];
    // }
    public int tribonacci(int n) {
        //Topdwon dp(memoizaztion)
        // if(map.getOrDefault(n, -1) != -1){
        //     return map.get(n);
        // }
        // if(n<2)
        //     return n;
        // if(n==2)
        //     return 1;
        // map.put(n, tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
        // return map.get(n);

        //Bottom up dp(Tabulation)
        // if(n<2)
        //     return n;
        // if(n==2)
        //     return 1;
        // int[] dp=new int[n+1];
        // dp[1]=1;
        // dp[2]=1;
        // return bottomUp(n, dp);

        //Iterative approach (Most optimal?) TC: O(n), SC: O(1)
        if(n<2)
            return n;
        if(n==2)
            return 1;
        int a=0;
        int b=1;
        int c=1;
        for(int i=3; i<=n;i++){
            int add=a+b+c;
            a=b;
            b=c;
            c=add;
        }
        return c;
    }
}