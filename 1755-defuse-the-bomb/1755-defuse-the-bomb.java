class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0)
            return new int[code.length];
        int n = code.length;
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<Math.abs(k); j++){
                if(k>0)
                    sum += code[(i+1+j)%n];
                else{
                    int ind = i-1-j;
                    if(ind<0)
                        ind += n;
                    sum += code[(ind)%n];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}