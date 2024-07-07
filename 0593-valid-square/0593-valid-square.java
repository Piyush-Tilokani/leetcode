class Solution {
    private double dist(int[]p1, int[]p2){
        return Math.sqrt(Math.pow(p1[0]-p2[0], 2) + Math.pow(p1[1]-p2[1], 2));
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Double> set = new HashSet<>();
        set.add(dist(p1, p2));
        set.add(dist(p1, p3));
        set.add(dist(p1, p4));
        set.add(dist(p2, p3));
        set.add(dist(p2, p4));
        set.add(dist(p3, p4));
        // System.out.println(set);
        //A square will have all sides(s) equal and diagonals equal(sqrt(2)*s) Therefore size of will be strictly 2
        //A rhombus will have all sides(s) equal and diagonals 2 daigonals of unequal length Therefore size of will be strictly 3
        return set.size() == 2 && !set.contains(0.0); //If set contains a 0, it means one or more points(p1, p2, p3, p4) are the same and we cannot form a square with less than 4 points
    }
}