class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
       int copy[] = new int[points.length];
        for(int i = 0; i<points.length; i++){
            copy[i] = points[i][0];
        }
        Arrays.sort(copy);
        int ret = 0;
        for(int i = 0; i<points.length-1; i++){
            int dist = copy[i+1] - copy[i];
            ret = Math.max(dist, ret);
        }
        System.gc();
        return ret;
    }
}