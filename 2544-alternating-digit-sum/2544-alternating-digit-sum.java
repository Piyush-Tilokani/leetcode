class Solution {
    public int alternateDigitSum(int n) {
        int digits = 0;
        int ans = 0;
        while(n != 0){
            ans += (Math.pow(-1, (digits++))) * n%10;    
            n /= 10;
        }
        return digits%2 == 0 ? -1*ans : ans;
    }
}