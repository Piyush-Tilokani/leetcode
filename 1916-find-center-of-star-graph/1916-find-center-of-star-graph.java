class Solution {
    public int findCenter(int[][] edges) {
        //Since every node is connected to center, center must be present at every edge
        //potential centers
        int c1 = edges[0][0]; //Either this is the center
        int c2 = edges[0][1]; //Or this is
        if(edges[1][0] == c1 || edges[1][1]==c1)
            return c1;
        return c2;
    }
}