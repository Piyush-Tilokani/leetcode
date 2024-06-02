class Solution {
    private int customCompare(int[] a, int []b){ //Custom comparator function for lambda sort
        if(Integer.compare(a[0], b[0])!=0){
            return Integer.compare(a[0], b[0]);
        }
        return Integer.compare(a[1], b[1]);
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> customCompare(a, b)); //Sort acc. to interval start. If start same sort according to interval end
        List<List<Integer>> ansList = new ArrayList<>();
        // for(int []row: intervals){
        //     System.out.print(Arrays.toString(row)+", ");
        // }
        for(int i=0; i<intervals.length; i++){
            List<Integer> temp  = new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            int r=i+1;
            while(r<intervals.length && intervals[r][0] <= temp.get(1))
                temp.set(1, Math.max(temp.get(1), intervals[r++][1])); //Math.max is important for testcases like [[1,3], [2,6], [8,10], [8,9], [9,11], [15,18], [2,4] ,[16,17]]
            ansList.add(temp);
            i=r-1;
        }   
        int ans[][]=new int[ansList.size()][2];
        for(int i=0; i<ans.length; i++){
            ans[i][0] = ansList.get(i).get(0);
            ans[i][1] = ansList.get(i).get(1);
        }
        // System.out.println(ansList);
        return ans;
    }
}