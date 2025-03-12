class Solution {
    public int maximumCount(int[] nums) {
        //Brute force
        int pos=0;
        int neg=0;
        for(int i: nums){
            if(i>0)
                pos++;
            if(i<0)
                neg++;
        }
        return Math.max(pos, neg);

        //Binary Search
        // int n=nums.length;
        // int l=0;
        // int r=n-1;
        // int pos=0; //Index of 1st positive number in the array
        // int neg=0; //Index of last negative number in the array
        // while(l<=r){
        //     int m = l+((r-l))/2;
        //     if(nums[m]>=0){
        //         r=m-1;
        //     }
        //     else{
        //         neg=m;
        //         l=m+1;
        //     }
        // }
        // l=0;
        // r=n-1;
        // while(l<=r){
        //     int m = l+((r-l))/2;
        //     if(nums[m]<=0){
        //         l=m+1;
        //     }
        //     else{
        //         pos=m;
        //         r=m-1;
        //     }
        // }
        // // System.out.println(neg+", "+pos);
        // if(pos==0 && neg==0) //To handle the edge case of array with all elements as 0 ([0,0,0,0])
        //     return 0;
        // return Math.max(neg+1, n-pos);
    }
}