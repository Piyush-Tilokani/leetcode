class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int prod=nums[i]*nums[j];
                map.put(prod, 1+map.getOrDefault(prod, 0));
            }
        }
        // System.out.println(map);
        for(int i: map.values()){
           int pairs=(i*(i-1))/2;
           ans+=(8*pairs);                
        }
        return ans;
    }
}