class Solution {
    public int[][] generateMatrix(int n) {
        //Same as https://leetcode.com/problems/spiral-matrix/
        int[][] ans = new int[n][n];
        int l=0;
        int r=n-1;
        int u=0;
        int d=n-1;
        int num = 1;
        while(l<=r && u<=d){
            for(int i=l; i<=r; i++){
                ans[u][i] = num++;
            }
            u++;
            for(int i=u; i<=d; i++){
                ans[i][r] = num++;
            }
            r--;
            for(int i=r; i>=l; i--){
                ans[d][i] = num++;
            }
            d--;
            for(int i=d; i>=u; i--){
                ans[i][l] = num++;
            }
            l++;
        }
        return ans;
    }
}