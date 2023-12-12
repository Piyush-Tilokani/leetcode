class Solution {
    public int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sumOfDig = 0;
        for(int num: nums){
            sum += num;
            sumOfDig += sumOfDigits(num);
        }
        return Math.abs(sum-sumOfDig);
    }
}