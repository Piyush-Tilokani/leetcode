class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++)
                ans.add(matrix[t][i]);
            t++;
            for (int i = t; i <= b; i++)
                ans.add(matrix[i][r]);
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--)
                    ans.add(matrix[b][i]);
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--)
                    ans.add(matrix[i][l]);
                l++;
            }
        }
        return ans;
    }
}