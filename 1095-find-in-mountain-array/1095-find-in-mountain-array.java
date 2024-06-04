/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    private int orderAgnosticBinarySearch(MountainArray arr, int target, int l, int r){
        // int l=0;
        // int r=arr.length()-1;
        boolean increasing = arr.get(l) < arr.get(r);
        if(increasing){
            while(l<=r){
                int m = l+((r-l)/2);
                if(arr.get(m)==target)
                    return m;
                else if(arr.get(m)>target)
                    r=m-1;
                else 
                    l=m+1;
            }
            return -1;
        }
        else{
            while(l<=r){
                int m = l+((r-l)/2);
                if(arr.get(m)==target)
                    return m;
                else if(arr.get(m)<target)
                    r=m-1;
                else 
                    l=m+1;
            }
            return -1;
        }
    }

    private int findPeak(MountainArray arr){
        int l=0;
        int r=arr.length()-1;
        int peak = 0;
        while(l<r){
            int m = l+((r-l)/2);
            if(arr.get(m)>arr.get(m+1))
                r=m;
            else 
                l=m+1;
        }
        return l;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ans = -1;
        
        //Find peak index
        int peak = findPeak(mountainArr);
        // System.out.println("Peak found: "+peak);

        //If element exists on left of peak, search left
        ans = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if(ans!=-1)
            return ans;

        //If still no found and exists on right, search right of the peak
        ans = orderAgnosticBinarySearch(mountainArr, target, peak+1, mountainArr.length()-1);


        return ans;
    }
}