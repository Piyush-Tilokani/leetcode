class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1)
            return arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==arr[i+(arr.length/4)])
                return arr[i];
        }
        return -1;
    }
}