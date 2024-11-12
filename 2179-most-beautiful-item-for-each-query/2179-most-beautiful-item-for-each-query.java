class Solution {
    private int customCompare(int []a, int []b){
        if(a[0]!=b[0])
            return Integer.compare(a[0], b[0]);
        return Integer.compare(a[1], b[1]);
    }
    private int binarySearch(int [][]items, int price){
        int l=0; 
        int r=items.length-1;
        int max = 0;
        while(l<=r){
            int m = l + ((r-l)/2);
            if(items[m][0]>price){
                r = m-1;
            }
            else{
                max = Math.max(max, items[m][1]);
                l=m+1;
            }
        }
        return max;
    }
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int ans[] = new int[queries.length];
        Arrays.sort(items, (a, b) -> customCompare(a, b));
        // for(int a[]: items)
        //     System.out.print(Arrays.toString(a) + ", ");
        int max = items[0][1];
        for(int i=1; i<items.length; i++){
            max=Math.max(max, items[i][1]);
            items[i][1]=max;
        }
        for(int i=0; i<ans.length; i++){
            ans[i] = binarySearch(items, queries[i]);
        }
        return ans;
    }
}