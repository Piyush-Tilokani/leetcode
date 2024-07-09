class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans = 0;
        int time=customers[0][0];
        for(int c[]: customers){
            if(time>c[0])
                ans += time - c[0];
            time=Math.max(time, c[0]);
            ans+=c[1];
            time+=c[1];
        }
        ans/=customers.length;
        return ans;
    }
}