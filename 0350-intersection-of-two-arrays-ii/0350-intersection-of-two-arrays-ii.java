class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int max=0; //max to get the size of frequency array to save memory
        for(int i: nums1)
            max=Math.max(max, i);
        for(int i: nums2)
            max=Math.max(max, i);
        int freq [] = new int [max+1];
        for(int i: nums1) //Fill the array with frequencies
            freq[i]++;
        List<Integer> ans = new ArrayList<>();
        for(int i: nums2){
            if(freq[i]>0){ //If already seen in nums1, add to ans and decrement frequency
                ans.add(i);
                freq[i]--;
            }
        }
        return ans.stream().mapToInt(i -> i).toArray(); //converty ArrayList to integer array
    }
}