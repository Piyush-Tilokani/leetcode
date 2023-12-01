class Solution {
    public int findPeakElement(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        int mid;
        while(h>l){
            mid = (l+h)/2;
            if(arr[mid]>arr[mid+1]){
                h = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}