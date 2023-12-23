class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        set.add("0-0");
        int x = 0;
        int y = 0;

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;                                                    
                default:
                    break;
            }
            String coordinates = getCoordinates(x, y);
            if (set.contains(coordinates)) {
                return true;
            }
            set.add(coordinates);
        }         
        System.gc();
        return false;
    }

    private String getCoordinates(int x, int y) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        stringBuilder.append("-");
        stringBuilder.append(y);
        return stringBuilder.toString();
    }
}