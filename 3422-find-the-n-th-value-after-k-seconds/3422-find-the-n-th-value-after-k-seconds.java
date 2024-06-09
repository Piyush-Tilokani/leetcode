class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]++;
        }
        int mod = 1000000007;
        while(k!=0){
            for(int i=1; i<n; i++)
                a[i] = (a[i] + a[i-1]) % mod;
            k--;
        }
        // System.out.println(Arrays.toString(a));
        return a[n-1];
    }
}