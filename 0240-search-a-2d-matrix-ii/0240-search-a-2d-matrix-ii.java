class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;
        int col=0; //Starting from the bottom left corner (OR the top right corner) so that rows/cols can be eliminated
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)
                row--;
            else
                col++;
        }
        return false;
    }
}