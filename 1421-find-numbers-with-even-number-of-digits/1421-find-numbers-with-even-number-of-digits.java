class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num: nums){
            int digits=(int)Math.log10(num) +1;
            if(digits%2==0)
                ans++;
        }
        return ans;
    }
}