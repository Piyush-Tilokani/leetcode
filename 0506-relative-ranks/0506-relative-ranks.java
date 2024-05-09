class Solution {
    public String[] findRelativeRanks(int[] score) {
        //Priority Queue TC: O(n logn), SC: O(n)
        // Map<Integer, Integer> map = new HashMap<>();
        // String [] ans = new String[score.length];
        // for(int i=0; i<score.length; i++){
        //     map.put(i, score[i]);
        // }
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));
        // pq.addAll(map.keySet());
        // for(int i=0; i<score.length; i++){
        //     int ind = pq.poll();
        //     if(i==0)
        //         ans[ind] = "Gold Medal";
        //     else if(i==1)
        //         ans[ind] = "Silver Medal";
        //     else if(i==2)
        //         ans[ind] = "Bronze Medal";
        //     else
        //         ans[ind] = (i+1)+"";
        // }
        // return ans;
        
        //

        //Bucket sort
        //TC: O(n), SC: O(n)
        String [] ans = new String[score.length];
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i: score){
            max=Math.max(max, i);
            min=Math.min(min, i);
        }
        int [] buckets = new int[max-min+1];
        for(int i=0; i<score.length; i++)
            buckets[score[i]-min] = i+1; //Storing (i+1) as the index for that bucket number to avaoid collisions with default value of array (i.e. 0)
        int count=1;
        for(int i=buckets.length-1; i>=0; i--){
            if(buckets[i]==0) continue;
            if(count==1)
                ans[buckets[i]-1] = "Gold Medal";
            else if(count==2)
                ans[buckets[i]-1] = "Silver Medal";
            else if(count==3)
                ans[buckets[i]-1] = "Bronze Medal";
            else
                ans[buckets[i]-1] = count + "";
            count++;
        } 
        return ans;
    }
}