class Solution {
    public int findMaxLength(int[] nums) {
        int count = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                count--;
            else
                count++;            
            if(map.containsKey(count))
                maxLen = Math.max(maxLen, i + 1 - map.get(count));
            else
                map.put(count, i+1);
        }
        return maxLen;
    }
}