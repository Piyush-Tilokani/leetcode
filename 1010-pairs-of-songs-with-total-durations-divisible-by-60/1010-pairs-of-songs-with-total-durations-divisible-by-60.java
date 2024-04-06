class Solution {
    private int oneToN(int n){
        return n%2==0? ((n/2)*(n+1)) : (n*((n+1)/2)); //Checking this is very important since int may get overflowed
    }
    public int numPairsDivisibleBy60(int[] time) {
        int ans=0;
        int map[] = new int[60];
        for(int t: time){ //For every song store its duration%60 at index from 0 to 59
            map[t%60]++;
        }
        for(int i=1; i<=29; i++){
            ans+=map[i]*map[60-(i%60)]; //Pair every song in pairs of (duration % 60, 60 - (duration%60)) [EXCEPT 1 and 30]
        }
        ans += oneToN(map[0]-1) + oneToN(map[30]-1); //For 1, 30: every song of duration % 60 = 0 gets paired with songs of duration % 60 = 0, Same for 30 
        // ans += temp;
        return ans;
    }
}