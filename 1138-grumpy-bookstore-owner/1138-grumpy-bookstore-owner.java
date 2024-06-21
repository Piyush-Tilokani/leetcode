class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //Approach: select the window that benefits the most and add rest all
        int satisfaction = 0; //satisfaction of customers when owner is not grumpy
        int gain = 0; //Max gain in satisfaction that can be achieved from window of size minutes
        int windowGain = 0; //Gain in satisfaction from each window of size minutes
        int l=0; //Left end of the window
        int r=0; //Right end of the window
        while(r<grumpy.length){
            if(grumpy[r]==1) //If owner was grumpy, add customer satisfaction to windowGain
                windowGain += customers[r];
            else //If owner wasn't grumpy, add it to usual customer satisfaction
                satisfaction += customers[r];
            if(r-l+1 > minutes){ //If window size is greater than minutes, adjust it by shrinking window from the left
                if(grumpy[l]==1) //If left index contributed to windowGain, then only subtract it from windowGain
                    windowGain -= customers[l];
                l++;
            }
            gain = Math.max(gain, windowGain); //Get the max gain 
            r++;
        }
        return satisfaction + gain;
    }
}