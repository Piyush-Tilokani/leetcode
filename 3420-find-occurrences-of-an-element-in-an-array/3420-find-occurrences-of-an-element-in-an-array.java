class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n = nums.length; 
        int ans[] = new int[queries.length];
        int pos[] = new int[n+1];
        int occ = 1;
        Arrays.fill(pos, -1);
        for(int i=0; i<n; i++){
            if(nums[i]==x)
                pos[occ++] = i;
        }
        for(int i=0; i<queries.length; i++){
            if(queries[i]<=n)
                ans[i] = pos[queries[i]];
            else
                ans[i] = -1;
        }
        return ans;
    }
}