class Solution {
    private double dist(int x, int y){ //Function to calculate distance from origin
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare(dist(a[0], a[1]), dist(b[0], b[1]))); //Priority Queue with custom distance function to sore points in increasing order of dist from origin
        // System.out.println("Dist: "+dist(points[1][0], points[1][1]));
        for(int[] point: points) //Add all points in the PQ
            pq.offer(point);
            // System.out.println("Point: "+Arrays.toString(point));
        // System.out.println(pq);
        int i=0;
        while(k--!=0){ //Remove k items from the PQ
            ans[i++] = pq.poll();
        }
        return ans;
    }
}