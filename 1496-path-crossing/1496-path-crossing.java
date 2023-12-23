class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> pointVisited = new HashSet<>();

        pointVisited.add("0,0");
        int x=0, y=0;
        for(char ch : path.toCharArray()) {
            if(ch == 'N') y++;
            else if(ch == 'S') y--;
            else if(ch == 'W') x--;
            else x++;

            String newPoint = x + "," + y;
            if(pointVisited.contains(newPoint)) {
                return true;
            }
            pointVisited.add(newPoint);
        }
        System.gc();
        return false;
    }
}