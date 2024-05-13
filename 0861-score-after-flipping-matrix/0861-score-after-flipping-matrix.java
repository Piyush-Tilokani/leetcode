class Solution {
    private void flipRow(int [][] grid, int row){
        for(int col=0; col<grid[0].length; col++){
            if(grid[row][col] == 0) 
                grid[row][col] = 1;
            else
                grid[row][col] = 0;
        }
    }
    // private void flipCol(int [][] grid, int col){
    //     for(int row=0; row<grid.length; row++){
    //         if(grid[row][col] == 0)
    //             grid[row][col] = 1;
    //         else
    //             grid[row][col] = 0;
    //     }        
    // }
    public int matrixScore(int[][] grid) {
        // OG approach :Flip rows, then flip cols, then calculate ans and return

        // int m=grid.length;
        // int n=grid[0].length;
        // int ans=0;

        // //Check all rows and flip if needed
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(grid[i][j]==0){
        //             flipRow(grid, i);
        //         }
        //         break;
        //     }
        // }

        // // for(int[] row: grid){
        // //     System.out.println(Arrays.toString(row));
        // // }
        // // System.out.println();


        // //Check all cols and flip if needed
        // for(int j=1; j<n; j++){
        //     int colSum=0;
        //     for(int i=0; i<m; i++){
        //         colSum+=grid[i][j];
        //     }
        //     if(colSum <= (m/2))
        //         flipCol(grid, j);
        // }
        
        // for(int j=0; j<n; j++){
        //     int colSum=0;
        //     for(int i=0; i<m; i++){
        //         colSum+=grid[i][j];
        //     }
        //     ans += ( (Math.pow(2, n-1-j))*(colSum)  );
        // }

        // // for(int[] row: grid){
        // //     System.out.println(Arrays.toString(row));
        // // }
        // return ans;

//----------------------------------------------------------------------------------------------------------
//Optimised approach: Flip rows, Count number of 1s and 0s in col, ans consider whichever is max for the ans
        
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;

        //Check all rows and flip if needed
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==0){
                    flipRow(grid, i);
                }
                break;
            }
        }

        // for(int[] row: grid){
        //     System.out.println(Arrays.toString(row));
        // }
        // System.out.println();


        //Check the number of 0s and 1s in all the cols
        //max(no. of 0s, no. of 1s) is considered for ans
        for(int j=0; j<n; j++){
            int colSum=0;
            for(int i=0; i<m; i++){
                colSum+=grid[i][j];
            }
            ans += Math.pow(2, n-1-j) * Math.max(colSum, m-colSum);
        }
        return ans;
    }
}