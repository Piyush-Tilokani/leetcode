class Solution {
    public int[] searchRange(int[] nums, int target) {
         int l = 0;
        int h = nums.length - 1;
        int mid;
        int ans[] ={-1, -1};
        while(h >= l){
            mid = (h+l)/2;
            if (nums[mid] == target){
                ans[0] = mid;
                // ans[1] = mid;
                if (mid-1>=0 && nums[mid-1] == target) {
                    h = mid-1;
                    ans[0] = h;
//                    continue;
                }else {
                    ans[0] = mid;
                    break;
                }
            }
            else if(target > nums[mid]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        l = 0;
        h = nums.length - 1;
        while(h >= l){
            mid = (h+l)/2;
            if (nums[mid] == target){
                // ans[0] = mid;
                ans[1] = mid;
                if ( mid+1 < nums.length && nums[mid+1] == target) {
                    l = mid+1;
                    ans[1] = l;
                }else {
                    ans[1] = mid;
                    break;
                }
            }
            else if(target > nums[mid]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }
}