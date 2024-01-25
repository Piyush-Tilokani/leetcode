class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int [n];
        if(n%2==0){
            int i=0;
            int elem = -(n/2);
            while(i<n){
                elem = elem==0? 1: elem;
                ans[i++] = elem;
                elem += 1;
            }
        }
        else{
            int i=0;
            int elem = -(n/2);
            while(i<n){
                ans[i++] = elem++;
            }
            ans[n/2] = 0;
        }
        return ans;
    }
}