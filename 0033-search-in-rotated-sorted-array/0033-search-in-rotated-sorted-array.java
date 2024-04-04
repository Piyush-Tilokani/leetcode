class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+((r-l)/2);
            if(nums[mid]==target)
                return mid;
            if(nums[l]<=nums[mid]){  //Equality check (<=) is very important here (Because l and mid might be pointing to the same index)
                if(nums[l]<=target && target<=nums[mid])  //(Ex: l=3, r=4, mid=3)
                    r=mid-1;
                else
                    l=mid+1;
            }
            else{
                if(nums[mid]<=target && target<=nums[r])
                    l=mid+1;
                else
                    r=mid-1;
            }
            // System.out.println("Mid: " + mid);
        }
        return -1;
    }
}