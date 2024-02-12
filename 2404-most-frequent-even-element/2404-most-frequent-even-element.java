class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int ans = 100001;
        for(int i: nums){
            if(i%2==0){
                map.put(i, 1 + map.getOrDefault(i, 0));
                if(map.get(i)>max){
                    max=map.get(i);
                    ans=i;
                }
                if(map.get(i)==max)
                    ans=Math.min(ans, i);
            }
        }
        return map.isEmpty()? -1: ans;
    }
}