class Solution {
    public int subarraySum(int[] nums, int k) {
        //Approach: prefix sum and then 2 sum
        int ans=0;
        Map<Integer, Integer> map =  new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            if(i!=0) //Store sum of elements upto the current element(inclusive) aka prefix sum
                nums[i] = nums[i] + nums[i-1];
            int curr = nums[i]; //For current sum
            ans+=map.getOrDefault(curr-k, 0); //Check how many current-k prefix sums are present and add them to ans
            map.put(curr, 1 + map.getOrDefault(curr, 0)); //Add current sum to the map as well for future preifix sums
        }
        return ans;
    }
}