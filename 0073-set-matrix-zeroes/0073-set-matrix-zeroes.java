class Solution {
    public void setZeroes(int[][] matrix) {
        //Brute force
        Set<int []> set = new HashSet<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0)
                    set.add(new int[]{i, j});
            }
        }
        for(int []i: set){
            int l=i[1];
            int r=i[1];
            int u=i[0];
            int d=i[0];
            while(l-1 >=0){
                matrix[u][l-1] = 0;
                l--;
            }
            while(r+1<matrix[0].length){
                matrix[u][r+1] = 0;
                r++;
            }
            while(u-1>=0){
                matrix[u-1][i[1]] = 0;
                u--;
            }
            while(d+1<matrix.length){
                matrix[d+1][i[1]] = 0;
                d++;
            }

        }
    }
}