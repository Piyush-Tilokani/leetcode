class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans []= new int[nums1.length]; //Monotonically decreasing stack
        Map<Integer, Integer> map = new HashMap<>(); //Hash Map to store the corresponding answers
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<nums2.length; i++){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                map.put(nums2[st.pop()], nums2[i]);
            }
            if(st.isEmpty())
                st.push(i);
            else if(nums2[st.peek()]>nums2[i])
                st.push(i);
        }
        for(int i=0; i<nums1.length; i++){
            ans[i] = map.getOrDefault(nums1[i], -1); //if not in map, it means it has no next greater element therefore, -1
        }
        return ans;
    }
}