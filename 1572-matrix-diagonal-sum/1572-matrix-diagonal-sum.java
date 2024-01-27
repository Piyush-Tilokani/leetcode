class Solution {
    public int diagonalSum(int[][] mat) {
        int matLen = mat.length;
        int ans = 0;
        for(int i=0; i<matLen/2; i++){
            ans += mat[i][i] + mat[i][matLen-1-i] + mat[matLen-1-i][i] + mat[matLen-1-i][matLen-1-i];
        }        
        if(matLen%2 != 0)
            ans += mat[matLen/2][matLen/2];        
        return ans;
    }
}