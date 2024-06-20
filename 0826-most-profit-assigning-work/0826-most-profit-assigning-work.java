class Solution {
    private int findWork(int [][]difProf, int ability){ //Simple binary search to find the max profit work for a given ability of worker(similar as finding ceiling of a number in sorted array)
        int l=0;
        int r=difProf.length-1;
        if(ability < difProf[l][0]) //If ability is less than lowest difficulty work, return zero
            return 0;
        if(ability >= difProf[r][0]) //If ability is greater than or equal to highest diffuicutly work, return profit at last index
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
        //Similar to IPO in terms of pairing items together https://leetcode.com/problems/ipo/
        //Here we for a triplet instead. Triple: difProf[i][0] = difficulty[i], difProf[i][1] = profit[i], diffProf[i][2] = max profit till that ability
        int [][] difProf= new int[difficulty.length][3];
        int ans=0;
        for(int i=0; i<difProf.length; i++){
            difProf[i][0] = difficulty[i];
            difProf[i][1] = profit[i];
        }
        Arrays.sort(difProf, (a, b) -> Integer.compare(a[0], b[0])); //Soring array in increasing order of difficulty
        int maxProf=0;
        for(int i=0; i<difProf.length; i++){ //Finding max profit till current ability
            maxProf=Math.max(maxProf, difProf[i][1]);
            difProf[i][2] = maxProf;
        }
        for(int i: worker){ //For each worker, finding the max profit work and adding profit 
            ans += findWork(difProf, i);
        }
        return ans;
    }
}