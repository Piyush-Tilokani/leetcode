class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] freq = new int[n+1];
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            freq[A[i]]++;
            freq[B[i]]++;
            int count=0;
            for(int j: freq){
                if(j==2)
                    count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}