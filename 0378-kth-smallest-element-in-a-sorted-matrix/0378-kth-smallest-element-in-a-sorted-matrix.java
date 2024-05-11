class Solution {
    private int countLTE(int [][] matrix, int m){ //Function to get the count of numbers Less Than or Equal to m in the matrix
        int col=matrix.length-1;
        int ans=0;
        // Since matrix is sorted both column and row wise, we come to a column less than or equal to the number m
        //And eliminate all the columns to the right of it this also eliminates all the rows below that column
        for(int row=0; row<matrix.length; row++){
            while(col>=0 && matrix[row][col]>m)
                col--;
            ans+= col+1;
        }
        return ans;
    }
    public int kthSmallest(int[][] matrix, int k) {
        //Binary Search approach, TC: O(pata nai), SC: (1)
        int ans=0;
        int n=matrix.length;
        if(n==1)
            return matrix[0][0];
        int l=matrix[0][0];
        int h=matrix[n-1][n-1];
        //Since the answer lies between top left(min) and bottom right(max) of the matrix,
        //We search for ans in between and eliminate the top left half or bottom right half
        //Based on the number of elements less than or equal to the mid element
        while(l<=h){
            int m=l+((h-l)/2);
            int count=countLTE(matrix, m); //Count the number of elements less than or equal to the mid element
            if(count>=k){ //If count is greater than or equal to k, we may have a potential answer(potential ans because, mid element might not be present in the matrix)
                ans=m;
                h=m-1;
            } //If count is smaller than k, then we increase l by 1 to search for elements greater than the mid element
            else
                l=m+1;                
        }
        return ans;
    }
}