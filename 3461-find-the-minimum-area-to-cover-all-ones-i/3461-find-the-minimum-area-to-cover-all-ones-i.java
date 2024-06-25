class Solution {
    public int minimumArea(int[][] grid) {
        //Approach: Find the extreme corners of the rectangle
        int l=grid[0].length;
        int r=0;
        int u=grid.length;
        int d=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    l=Math.min(l, j);
                    r=Math.max(r, j);
                    u=Math.min(u, i);
                    d=Math.max(d, i);
                }
            }
        }
        // System.
        return (r-l+1)*(d-u+1);
    }
}