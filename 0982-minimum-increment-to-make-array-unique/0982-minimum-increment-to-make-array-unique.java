class Solution {
    public int minIncrementForUnique(int[] nums) {

        //Basic sorting approach TC: O(n logn), SC: O(1)

        // Arrays.sort(nums);
        // int ans=0;
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i+1]<=nums[i]){
        //         ans += (nums[i] + 1) - nums[i+1];
        //         nums[i+1]=nums[i]+1;
        //     }
        // }
        // return ans;

        //-----------------------------------------------------------------------------------------------------

        //Count sort with hashmap TC: O(n + max(nums)), SC: O(n + max(nums))

        // int n = nums.length;
        // int max=0;
        // int ans=0;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i: nums){
        //     max=Math.max(i, max);
        //     map.put(i, 1+map.getOrDefault(i,0));
        // }
        // for(int i=0; i<n+max; i++){
        //     if(map.getOrDefault(i, 0)>1){
        //         ans+=map.get(i)-1;
        //         map.put(i+1, map.getOrDefault(i+1, 0) + map.get(i)-1);
        //     }
        // }
        // return ans;

        //-----------------------------------------------------------------------------------------------------

        //Same count sort but with array as map TC: O(n + max(nums)), SC: O(n + max(nums))
        //Faster runtime

        int max=0;
        int ans=0;
        for(int i: nums){
            max=Math.max(i, max);
        }
        int freq[]=new int[max+nums.length];
        for(int i: nums)
            freq[i]++;
        // System.out.println("Initially map: "+map);
        for(int i=0; i<freq.length; i++){
            if(freq[i]>1){
                ans+=freq[i]-1;
                freq[i+1] += freq[i]-1;
            }
        }
        return ans;
    }
}