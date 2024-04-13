class Solution {
    private int timeReq(int[] arr, int speed){
        int time=0;
        for(int i: arr){
            time+=Math.ceil((double)i/(double)speed); //Conversion to double is important to get (double)/(double) output in decimal (Ex: 1.02, 5.09, ...)
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i: piles){
            max=Math.max(max, i);
        }
        int l=1;
        int r=max;
        while(l<=r){
            int m=l+((r-l)/2);
            if(timeReq(piles, m)<=h){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}