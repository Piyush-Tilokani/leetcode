class Solution {
    public long sumDigitDifferences(int[] nums) {
        int numberOfDigits = (int)Math.log10(nums[0])+1; //Number of digits because didn't want to modify the og i/p array
        int n = nums.length; //Length will be handy to reassign total for each decimal place
        // System.out.println(numberOfDigits);
        long ans=0;
        for(int i=0; i<numberOfDigits; i++){ //Do the inner loop "numberOfDigits" times 
            int freq[]=new int[10]; //Array as map to store frequecy of each digit at current decimal place
            int total=n; //Total number of elemnts int array
            for(int j=0; j<nums.length; j++){ //Loop through nums
                int num = (int)(nums[j]/(Math.pow(10, i))); //Calculate the number for ith decimal place (i going from one place to 10s place and so on till number of digits)
                freq[num%10]++; //Store frequency of the digit
            }
            // System.out.println("Freq array: "+Arrays.toString(freq));
            for(int j=0; j<10; j++){ //Iterate over freq array 
                if(freq[j]>0){ 
                    total -= freq[j];    //Pair every digit with every other digit(except the digit itself. Therefore `total -= freq[j]` )
                    ans += freq[j]*total; //Pairing the digit i with every other digit
                }
            }
        }
        return ans;
    }
}