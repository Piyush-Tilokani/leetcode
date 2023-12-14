class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rOnes[] = new int [grid.length];
        int cOnes[] = new int [grid[0].length];
        // int diff[][] = new int [grid.length][grid[0].length];

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                rOnes[i] += grid[i][j];
                cOnes[j] += grid[i][j];
            }            
        }
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                grid[i][j] = (2*(rOnes[i]+cOnes[j])) - grid.length - grid[0].length;
            }            
        }
        // System.gc();
        return grid;

    }
}