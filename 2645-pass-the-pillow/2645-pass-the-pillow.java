class Solution {
    public int passThePillow(int n, int time) {
        if(time < n) 
            return time + 1;
        int period = n-1;
        if(time%period==0){ //If time is multiple of period(n-1), 
            if((time/period)%2==0) //If even multiple, it will always return to 1st
                return 1;
            return n; //If odd multiple, it will always return to last(nth)
        }
        int rem = time%period;
        time = time/period;
        if(time%2==0)
            return rem+1;
        return n-rem; 
    }
}