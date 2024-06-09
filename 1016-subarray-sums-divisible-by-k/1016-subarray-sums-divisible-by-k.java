class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int pre = 0;
        for(int i=0; i<nums.length; i++){
            pre+=nums[i];
            int mod = pre%k;
            mod += mod<0?k:0;
            if(map.containsKey(mod)){
                ans+=map.get(mod);
            }
            map.put(mod, 1 + map.getOrDefault(mod, 0));
        }
        return ans;
    }
}