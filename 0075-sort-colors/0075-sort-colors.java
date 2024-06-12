class Solution {
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        // int arr[] = new int[3];
        // for(int i: nums){
        //     arr[i]++;
        // }
        // for(int i=0, k=0; i<3; i++){
        //     for(int j=0; j<arr[i]; j++){
        //         nums[k++] = i;
        //     }
        // }

//------------------------------------------------------------------------------------------------

        //Dutch national flag algorithm 
        //Single pass
        int l=0; //Left pointer for all the 0s
        int r=nums.length-1; //Right pointer for all the 2s
        int m=0; //Mid pointer to traverse the entire array and perform swaps accordingly
        while(m<=r){
            if(nums[m]==0){ //If mid element is 0, swap it with l pointer so that all the 0s accumulate on the left
                swap(nums, l, m);
                m++;
                l++;
            }
            else if(nums[m]==1) //If the mid element is 1, simple go ahead because 1s belong in the middle of 0s and 2s
                m++;
            else if(nums[m]==2){ //If mid element is 2, swap it with r pointer so that all the 2s accumulate on the right
                swap(nums, m, r);
                r--;
            }
        }
    }
}