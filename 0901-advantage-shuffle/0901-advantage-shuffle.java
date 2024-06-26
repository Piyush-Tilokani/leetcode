class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for(int i: nums1)
            l.add(i);
        Collections.sort(l);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(nums2[a], nums2[b]));
        for(int i=0; i<nums2.length; i++)
            pq.offer(i);
        int j=0;
        while(!pq.isEmpty()){
            int i=pq.poll();
            while(j<l.size() && l.get(j) <= nums2[i])
                j++;
            nums1[i] = j<l.size() ? l.get(j) : l.get(0);
            if(j<l.size())
                l.remove(j);
            else 
                l.remove(0);
        }
        return nums1;
    }
}