class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;
        while(num!=0){
            if(n % (num%10) == 0)
                count++;
            num /= 10;
        }
        return count;
    }
}