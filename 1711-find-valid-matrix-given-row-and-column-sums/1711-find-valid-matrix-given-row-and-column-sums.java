class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r = rowSum.length;
        int c = colSum.length;
        int [][] ans = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(rowSum[i]<=0)
                    break;
                int min = Math.min(rowSum[i], colSum[j]);
                if(min > 0){
                    ans[i][j] = min;
                    rowSum[i] -= min;
                    colSum[j] -= min;
                }
            }
        }
        return ans;
    }
}