class Solution {
    // private void getSub(int nums[], int n, List<Integer> l, List<List<Integer>> ans){
    //     if(n==nums.length){
    //         List<Integer> addMe = new ArrayList<>(l); //This line is important because the ans variable is taking an instance of List<> as input
    //         ans.add(addMe);
    //         return;
    //     }
    //     getSub(nums, n+1, l, ans);
    //     l.add(nums[n]);
    //     getSub(nums, n+1, l, ans);
    //     l.remove(l.size()-1);
    // }
    public List<List<Integer>> subsets(int[] nums) {
        //Recursive approach
        // List<List<Integer>> ans = new ArrayList<>();
        // getSub(nums, 0, new ArrayList<Integer>(), ans);
        // return ans;

        //-------------------------------------------------------------

        //Iterative approach

        //Approach:  for n = 3, arr = [1, 2, 3]
        // 0 = Not pick, 1 = Pick
        // All possible cases
        // 0 0 0    --->   If ith, bit is set, add the ith element of array else skip
        // 0 0 1
        // 0 1 0
        // 0 1 1
        // 1 0 0
        // 1 0 1
        // 1 1 0
        // 1 1 1


        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int subsets = 1<<n; //Total number of subsets (2^n)
        for(int i=0; i<subsets; i++){
            List<Integer> sub = new ArrayList<>(); //Each intermediate subset
            for(int j=0; j<n; j++){
                if( (i & (1<<j)) != 0)
                    sub.add(nums[j]);
            }
            ans.add(sub);
        }
        // System.out.println(subsets);
        return ans;
    }
}