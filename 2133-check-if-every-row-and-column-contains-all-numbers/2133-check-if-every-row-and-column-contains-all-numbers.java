class Solution {
    public boolean checkValid(int[][] matrix) {
        int col []= new int[matrix.length];
        int sum = (matrix.length*(matrix.length+1))/2;
        for(int[] row: matrix){
            Set<Integer> set= new HashSet<>();
            if(Arrays.stream(row).sum()!= sum)
                return false;
            int i = 0;
            for(int num: row){
                if(set.contains(num))
                    return false;
                set.add(num);
                col[i] += row[i++];
            }
            if(set.size() != matrix.length)
                return false;
        }
        for(int num: col)
            if(num != sum)
                return false;
        return true;
    }
}
