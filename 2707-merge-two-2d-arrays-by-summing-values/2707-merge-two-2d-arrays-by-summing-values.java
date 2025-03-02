class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] n : nums1) {
            if (map.containsKey(n[0]))
                map.put(n[0], map.get(n[0]) + n[1]);
            else
                map.put(n[0], n[1]);
        }
        for (int[] n : nums2) {
            if (map.containsKey(n[0]))
                map.put(n[0], map.get(n[0]) + n[1]);
            else
                map.put(n[0], n[1]);
        }
        int[][] ans = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            ans[i++] = new int[] { entry.getKey(), entry.getValue() };
        return ans;
    }
}