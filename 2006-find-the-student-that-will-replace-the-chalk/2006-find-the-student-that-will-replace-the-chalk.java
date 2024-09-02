class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0; //long is imp because sum overflows int limits
        for(int i: chalk)
            sum+=i;
        k%=sum;
        int ans=0;
        int n=chalk.length;;
        while(k>=chalk[ans]){
            k-=chalk[ans];
            ans = (ans+1)%n;
        }
        return ans;
    }
}