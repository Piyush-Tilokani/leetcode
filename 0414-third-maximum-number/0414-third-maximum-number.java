class Solution {
    public int thirdMax(int[] nums) {
        //Set Approach
        // int max1=Integer.MIN_VALUE;
        // int max2=Integer.MIN_VALUE;
        // int max3=Integer.MIN_VALUE;
        // Set<Integer> s = new HashSet<>();
        // for(int i: nums){
        //     s.add(i);
        //     if(i>max1){
        //         max3=max2;
        //         max2=max1;
        //         max1=i;
        //     }
        //     else if(i>max2 && i!=max1){
        //         max3=max2;
        //         max2=i;
        //     }
        //     else if(i>max3 && i!=max2 && i!=max1){
        //         max3=i;
        //     }
        // }
        // return s.size()>=3 ? max3 : max1;

        //Long.MIN_VALUE hack
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int i: nums){
            if(i>max1){
                max3=max2;
                max2=max1;
                max1=i;
            }
            else if(i>max2 && i!=max1){
                max3=max2;
                max2=i;
            }
            else if(i>max3 && i!=max2 && i!=max1){
                max3=i;
            }
        }
        return max3==Long.MIN_VALUE ? (int)max1 : (int)max3;
    }
}