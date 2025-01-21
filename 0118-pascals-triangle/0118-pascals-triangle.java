class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
        List<Integer> base=new ArrayList<>();
        base.add(1);
        ans.add(base);
        // System.out.println(ans);
        for(int i=2; i<=numRows; i++){
            List<Integer> level=new ArrayList<>(); //ArrayList of length = currentLevel
            level.add(1);
            // level.add(i-1, 1);
            if(i>2){
                for(int j=1; j<i-1; j++){
                    // System.out.println("i: "+i+", ans: "+ans+ ", j: "+j);
                    int curr = ans.get(i-2).get(j) + ans.get(i-2).get(j-1);
                    level.add(curr);
                }
            }
            level.add(1);
            ans.add(level);
        }
        return ans;
    }
}