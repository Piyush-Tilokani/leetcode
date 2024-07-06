class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0 || k%nums.length==0)
            return;
        //Copying into new array
        //TC: O(n), SC: O(n)
        // int copy[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     copy[(i+k)%nums.length] = nums[i];
        // }
        // for(int i=0; i<nums.length; i++)
        //     nums[i] = copy[i];

        //Reversing the array and then reversing the first k and the rest of the Array
        //TC: O(N), SC: O(1) But 3 passes
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
        l=0;
        r=(k-1)%nums.length; //Adjust right end for over/underflow
        while(l<r){  //Invert array before pivot
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
        l=k%nums.length;  //Adjust left end for over/underflow
        r=nums.length-1;
        while(l<r){  //Invert array after pivot
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}