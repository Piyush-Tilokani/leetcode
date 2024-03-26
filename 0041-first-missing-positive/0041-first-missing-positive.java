class Solution {
    public int firstMissingPositive(int[] nums) {
        //My Naive approach Time: O(n), Space: O(n)
        // int ans = 1;
        // Set<Integer> set= new HashSet<>();
        // for(int i: nums){
        //     if(i>0)
        //         set.add(i);
        // }
        // // System.out.println(set);
        // for(int i=1; i<=Integer.MAX_VALUE; i++){
        //     if(!set.contains(i))
        //         return i;
        // }
        // return ans-1;

        //Atharva Bhoite's approach Time: O(n*logn), Space: O(1)
        //  Arrays.sort(nums);
        // // System.out.println(Arrays.toString(nums));
        // int pStart = -1;
        // int pFirst = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]>0){
        //         if(nums[i]>1)
        //             return 1;
        //         pStart = i;
        //         pFirst = nums[i];
        //         break;
        //     }
        // }
        // if(pStart==-1)
        //     return 1;
        
        // for(; pStart<nums.length-1; pStart++){
        //     if(nums[pStart]+1 < nums[pStart+1]){
        //         // System.out.println(pStart);
        //         return nums[pStart]+1;
        //     }
        // }
        // return nums[nums.length-1] + 1;

        //Cyclic sort (GOAT) Time: O(n), Space:O(1)
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i]>0){
                int correct = nums[i] - 1;
                // System.out.println(nums[i] != nums[correct]);
                if(nums[i]<= n && nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else
                    i++;
            }
            else
                i++;
        }
        for(i=0; i<n; i++){
            if(nums[i] != i+1)
                return i+1;
        }
        return n+1;
    }   
}