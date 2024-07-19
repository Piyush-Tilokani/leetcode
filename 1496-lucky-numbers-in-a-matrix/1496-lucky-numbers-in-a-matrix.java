class Solution {
    private boolean isMaxInCol(int [][] mat, int min, int col){
        for(int i=0; i<mat.length; i++){
            if(mat[i][col]>min)
                return false;
        }
        return true;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int rMin = 100001;
            int ind = -1;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<rMin){
                    rMin = matrix[i][j];
                    ind = j;
                }
            }
            if(isMaxInCol(matrix, rMin, ind)){
                ans.add(rMin);
            }
        }
        return ans;
    }
}