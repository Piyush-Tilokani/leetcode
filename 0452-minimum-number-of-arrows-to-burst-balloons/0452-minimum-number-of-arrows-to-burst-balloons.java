class Solution {
    public int findMinArrowShots(int[][] points) {
        // Arrays.sort(points, (a, b) -> a[1] - b[1]); // Sorting is not proper at int boundary values (need to check why)
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        for(int i=0; i<points.length; ){
            ans++;
            int rightEnd = points[i][1];
            int j;
            for( j=i+1; j<points.length; j++){
                if(points[j][0]>rightEnd)
                    break;
            }
            i = j;
        }
        return ans;
    }
}