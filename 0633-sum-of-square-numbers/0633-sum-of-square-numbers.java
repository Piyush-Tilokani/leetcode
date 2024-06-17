class Solution {
    private boolean isPerfectSq(int num){ //Simple Binary search implementation  https://leetcode.com/problems/valid-perfect-square/
        int l=1; 
        int r=num;
        while(l<r){
            long m = l + ((r-l)/2);
            if(m*m == num)
                return true;
            else if(m*m > num)
                r = (int)m-1;
            else
                l = (int)m+1;
        }
        return false;
    }
    public boolean judgeSquareSum(int c) {
        if(isPerfectSq(c)){
            return true;
        }
        long l=0;
        long r=(int)Math.sqrt(c);
        while(l<=r){
            if((l*l) + (r*r) == c)
                return true;
            else if((l*l) + (r*r) > c)
                r--;
            else
                l++;
        }
        return false;
    }
}