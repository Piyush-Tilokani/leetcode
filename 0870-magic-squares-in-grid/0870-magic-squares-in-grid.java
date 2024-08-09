class Solution {
    //Approach: Simulation
    private boolean isMagic(int [][] grid, int i, int j){ //Main helper function
        int r=grid.length; 
        int c=grid[0].length;
        if(i+2>=r || j+2>=c) //If the index cannot form a 3x3 matrix with i, j as [0, 0] of the 3x3 matrix, return false
            return false;
        int diagSum=0; //Primary diagonal sum
        int diagSum2=0; //Secondary diagonal sum
        int freq[] = new int[9]; //Map to store frequency of umbers
        for(int row=i; row<i+3; row++){
            for(int col=j; col<j+3; col++){
                if(grid[row][col]>=1 && grid[row][col]<=9){ //If no. is in [1, 9]
                    freq[grid[row][col]-1]++;
                    if(freq[grid[row][col]-1] > 1) //If repeated numbers, return false
                        return false;
                    //Calculate sum of both the diagonals
                    if(j-i == col-row) //Primary diagonal sum
                        diagSum += grid[row][col];
                    if(i+j+2 == row+col) //Secondary diagonal sum
                        diagSum2 += grid[row][col];                    
                }
                else{ //If no. is NOT in [1, 9] return false
                    return false;
                }
            }
        }
        if(diagSum!=diagSum2) //If diagonal sums don't match, return false
            return false;
        for(int row=i; row<i+3; row++){ //Checking for rows
            int rowSum=0;
            for(int col=j; col<j+3; col++){
                rowSum+=grid[row][col];
            }
            if(rowSum!=diagSum)
                return false;
        }
        for(int col=j; col<j+3; col++){ //Checking for columns
            int colSum=0;
            for(int row=i; row<i+3; row++){
                colSum+=grid[row][col];
            }
            if(colSum!=diagSum)
                return false;
        }
        // System.out.println("For i: "+i+", j: "+j+", DiagSum: "+diagSum+", DiagSum2: "+diagSum2);
        // If all good, return true lol
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]>=1 && grid[i][j]<=9 && isMagic(grid, i, j))
                    ans++;
            }
        }
        return ans;
    }
}