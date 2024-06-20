class Solution {
    private int findWork(int [][]difProf, int ability){
        int l=0;
        int r=difProf.length-1;
        if(ability < difProf[l][0])
            return 0;
        if(ability >= difProf[r][0])
            return difProf[r][2];
        while(l<=r){
            int m = l + ((r-l)/2);
            if(difProf[m][0] > ability)
                r=m-1;
            else
                l=m+1;
        }
        return difProf[r][2];
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int [][] difProf= new int[difficulty.length][3];
        int ans=0;
        for(int i=0; i<difProf.length; i++){
            difProf[i][0] = difficulty[i];
            difProf[i][1] = profit[i];
        }
        Arrays.sort(difProf, (a, b) -> Integer.compare(a[0], b[0]));
        int maxProf=0;
        for(int i=0; i<difProf.length; i++){
            maxProf=Math.max(maxProf, difProf[i][1]);
            difProf[i][2] = maxProf;
        }
        for(int i: worker){
            ans += findWork(difProf, i);
        }
        return ans;
    }
}