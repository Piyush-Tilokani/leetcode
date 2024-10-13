class FindSumPairs {
        int nums1[];
        int nums2[];
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        for(int i: nums1)
            map1.put(i, 1+map1.getOrDefault(i, 0));
        for(int i: nums2)
            map2.put(i, 1+map2.getOrDefault(i, 0));
    }
    
    public void add(int index, int val) {
        int freq = map2.get(nums2[index]);
        if(freq>0)
            map2.put(nums2[index], freq-1);
        this.nums2[index] += val;
        map2.put(nums2[index], 1+map2.getOrDefault(nums2[index], 0));
    }
    
    public int count(int tot) {
        int ans=0;
        for(int i: map1.keySet()){
            if(map2.containsKey(tot-i))
                ans+=map1.get(i)*map2.get(tot-i);
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */