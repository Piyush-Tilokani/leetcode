class Solution {
    public int fib(int n) {
        if(n==0 || n==1)
            return n;
        int i = 0;
        int j = 1;
        for(int k=2;k<=n; k++){
            int sum = i + j;
            i = j;
            j = sum;
        }
        return j;
    }
}