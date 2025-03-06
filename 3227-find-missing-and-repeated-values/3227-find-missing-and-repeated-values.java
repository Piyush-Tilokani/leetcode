class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        int n = grid.length;
        int freq[]=new int[(n*n)+1];
        for(int r[]: grid){
            for(int i: r){
                freq[i]++;
                if(freq[i]==2)
                    ans[0]=i;
            }
        }
        for(int i=1; i<=n*n; i++){
            if(freq[i]==0){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}