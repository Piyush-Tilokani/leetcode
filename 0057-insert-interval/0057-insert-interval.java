class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            return new int [][]{newInterval};
        }
        List<int []> ans = new ArrayList<>(Arrays.asList(intervals));
        int i=0;
        while(i<ans.size() && newInterval[0] > ans.get(i)[0]){
            i++;
        }
        if(i> 0 && newInterval[0] <= ans.get(i-1)[1]){
            i--;
            ans.get(i)[1] = Math.max(newInterval[1], ans.get(i)[1]);
        }
        else
            ans.add(i, newInterval);
        
        int j=i+1;
        while(j<ans.size() && ans.get(j)[0]<=newInterval[1]){
            // j++;   
            ans.get(i)[1] = Math.max(newInterval[1], ans.get(j)[1]);
            ans.remove(j);
        }
        j -= j==ans.size() ? 1 : 0;             

        int [][] mergedAns = new int[ans.size()][2];
        for(int k=0; k<ans.size(); k++)
            mergedAns[k] = ans.get(k);


        // System.out.print("[ ");
        // for(int []x: ans){
        //     System.out.print("["+x[0]+", "+x[1]+"], " );
        // }
        // System.out.println(" ]");


        return mergedAns;
    }
}