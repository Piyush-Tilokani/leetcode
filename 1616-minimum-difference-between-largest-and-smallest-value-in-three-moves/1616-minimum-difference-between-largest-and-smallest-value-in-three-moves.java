class Solution {
    public int minDifference(int[] nums) {
        // if(nums.length<=4)
        //     return 0;
        // Arrays.sort(nums);
        // int ans=Integer.MAX_VALUE;
        // for(int i=0; i<4; i++){ //Only 4 possible cases (Remove first 3 AND none from last), Remove(Last 3 AND none from first), (Remove first 2 AND 1 from last), (Remove 1 from first AND 2 from last) 
        //     int min=nums[i];
        //     int max=nums[nums.length-1-3+i];
        //     ans = Math.min(ans, max-min);
        // }
        // return ans;

//------------------------------------------------------------------------------------------------------------------------------------------------

        //Optimal solution
        // Approach: We only need the smallest 4 and the largest 4 elements in order to compute all the possibilities

        if(nums.length<=4)
            return 0;
        
        int ans = Integer.MAX_VALUE;

        int mins[] = new int[4]; // [1st smallest, 2nd smallest, 3rd smallest, 4th smallest]
        int maxs[] = new int[4]; // [4th largest, 3nd largest, 2nd largest, 1st largest]
        Arrays.fill(mins, Integer.MAX_VALUE);
        Arrays.fill(maxs, Integer.MIN_VALUE);
        for(int i: nums){
            //For min 4s
            if(i<mins[0]){
                mins[3] = mins[2];
                mins[2] = mins[1];
                mins[1] = mins[0];
                mins[0] = i;
            }
            else if(i<mins[1]){
                mins[3] = mins[2];
                mins[2] = mins[1];
                mins[1] = i;
            }
            else if(i<mins[2]){
                mins[3] = mins[2];
                mins[2] = i;
            }
            else if(i<mins[3]){
                mins[3] = i;
            }

            //For max 4s
            if(i>maxs[3]){              //[4th largest, 3nd largest, 2nd largest, 1st largest]
                maxs[0] = maxs[1];
                maxs[1] = maxs[2];
                maxs[2] = maxs[3];
                maxs[3] = i;
            }
            else if(i>maxs[2]){
                maxs[0] = maxs[1];
                maxs[1] = maxs[2];
                maxs[2] = i;
            }
            else if(i>maxs[1]){
                maxs[0] = maxs[1];
                maxs[1] = i;
            }
            else if(i>maxs[0]){
                maxs[0] = i;
            }
        }

        
        for(int i=0; i<4; i++){
            ans=Math.min(ans, maxs[i]-mins[i]);
        }

        // System.out.print(Arrays.toString(mins)+", ");
        // System.out.println(Arrays.toString(maxs));

        return ans;
    }
}