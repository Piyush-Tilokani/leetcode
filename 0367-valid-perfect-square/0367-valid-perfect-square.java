class Solution {
    public boolean isPerfectSquare(int num) {
        int  l = 1;
        int r = num;
        while(l <= r){
            long mid = l + ((r-l)/2);
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid > num){
                r = (int)mid-1; 
            }
            else{   
                l = (int)mid + 1;
            }
        }
        return false;
    }
}