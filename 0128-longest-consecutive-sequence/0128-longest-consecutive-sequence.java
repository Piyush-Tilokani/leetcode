class Solution {
    public int longestConsecutive(int[] nums) {
        //Approach: The first element of a sequence(let's say n) does not have a previous element present in the array
        //Use set for storing the elememts so that lookup can be instantaneous
        //TC: O(n), SC: O(n)
        int ans=0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums) // Add all elements to the set
            set.add(i);
        for(int i: set){ 
            if(!set.contains(i-1)){//If the element does not have a element before it, it is the starting point for a asequence
                int len = 1;
                while(set.contains(i+1)){ //While we have the consecutive sequence, increase length
                    len++;
                    i++;
                }
                ans = Math.max(len, ans); //Update ans if current length is greater than any of previous lenghts
            }
        }
        return ans;
    }
}