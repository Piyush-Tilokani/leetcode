class Solution {
    private int sumOfDigits(int n){
        int ans=0;
        while(n>0){
            ans+=(n%10);
            n/=10;
        }
        return ans;
    }
    public int maximumSum(int[] nums) {
        int ans=-1;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int digitSum = sumOfDigits(nums[i]);
            if(!map.containsKey(digitSum)){
                map.put(digitSum, new PriorityQueue<Integer>(Collections.reverseOrder()));
            }
            PriorityQueue<Integer> pq = map.get(digitSum);
            pq.offer(nums[i]);
        }
        for(PriorityQueue<Integer> pq: map.values()){
            if(pq.size()>=2){
                // System.out.println(pq);
                int a=pq.poll();
                int b=pq.poll();
                ans=Math.max(ans, a+b);
            }
        }
        // System.out.println(map);
        return ans;
    }
}