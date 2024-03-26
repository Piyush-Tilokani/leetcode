class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans = 1;
        Set<Integer> set= new HashSet<>();
        for(int i: nums){
            if(i>0)
                set.add(i);
        }
        // System.out.println(set);
        for(int i=1; i<=Integer.MAX_VALUE; i++){
            if(!set.contains(i))
                return i;
        }
        return ans-1;
    }
}