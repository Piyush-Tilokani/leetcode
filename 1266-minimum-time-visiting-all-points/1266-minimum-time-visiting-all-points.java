class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int [] p0 = points[0]; //Starting point
        for(int i = 1; i < points.length; i++){
            int[] p = points[i]; //Current point
            int dx = p[0] - p0[0];
            int dy = p[1] - p0[1];
            time += Math.max(Math.abs(dx), Math.abs(dy));
            p0 = p;
        }        
        return time;
    }
}