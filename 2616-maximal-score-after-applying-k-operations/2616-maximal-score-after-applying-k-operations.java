class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: nums)
            pq.offer(i);
        while(k>0){
            int num = pq.poll();
            ans+=num;
            num = (int)Math.ceil(1.0*num/3);
            pq.offer(num);
            k--;
        }
        // System.out.println(pq);
        return ans;
    }
}