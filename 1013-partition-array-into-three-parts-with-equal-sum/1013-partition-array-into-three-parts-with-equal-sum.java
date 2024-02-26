class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i: arr)
            sum += i;
        if(sum%3 != 0)
            return false;
        int pivot = 0;
        int runningSum = 0;
        for(int i=0; i<arr.length; i++){
            runningSum+=arr[i];
            if(runningSum==sum/3){
                if(i!=arr.length-1){
                    pivot++;
                    runningSum=0;
                }
            }
            if(pivot==2)
                return true;
        }
        return false;
    }
}