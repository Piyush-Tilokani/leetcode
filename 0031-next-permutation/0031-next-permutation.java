class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int l = -1;
        //Start fromt the right and see the increasing pattern, when the pattern breaks, retturn the index that violates it
        for (int i = n - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                l = i - 1;
                break;
            }
        }
        //IF no index violates means all are increaing from right to left, which means highes possible permutation
        if (l == -1) {
            int low = 0;
            int high = n - 1;
            //Sort it to make the lowest permutaion, according to description
            while (low < high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        } 
        //Else swap the violating index element with element that is just greater than it(traverse from right to left again)
        else {
            for (int i = n - 1; i > l; i--) {
                if (nums[i] > nums[l]) {
                    int temp = nums[i];
                    nums[i] = nums[l];
                    nums[l] = temp;
                    break;
                }
            }
            //After swapping, just sort part of the array that is to the right side of the violating index
            int low=l+1;
            int high=n-1;
            while (low < high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }

    }
}