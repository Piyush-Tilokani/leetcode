class Solution {
    public int minDifficulty(int[] job, int d) {
        if(d > job.length){
            return -1;
        }
     
        int [] dp = new int[job.length + 1];
        for(int i = 1; i <= job.length; i++){
            dp[i] = Math.max(dp[i-1],job[i-1]);
        }

    for(int j = 2; j <= d; j++){ 
        for(int i = job.length; i >= 1; i--){
                int thisRow = Integer.MAX_VALUE;
                int maxValue = Integer.MIN_VALUE;
                for(int k = i - 1; k >= j - 1; k--){  
                    maxValue = Math.max(maxValue,job[k]); 
                    thisRow= Math.min(thisRow,dp[k] + maxValue);
                }
                dp[i] = thisRow;
            }   
        }
       return dp[job.length];
    }



}