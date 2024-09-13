class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        //Approach: Take a prefix xor array, calculate prefix xor till ith index
        //For a query (q = [start, end]), take prefix xor till end of the interval, and xor it with prefix xor of 'start-1' 
        //This will eliminate the xor of eleemtns from 0th index to start-1'th index resulting in xor of the interval [start, end]

        //TC: O(n), SC: O(n)
        int ans[] = new int[queries.length];
        int pre[] = new int[arr.length]; //Prefix xor array
        pre[0] = arr[0];
        for(int i=1; i<arr.length; i++)
            pre[i] = arr[i] ^ pre[i-1];
        int i=0;
        for(int []q: queries){
            if(q[0]!=0)
                ans[i++] = pre[q[0]-1] ^ pre[q[1]];
            else
                ans[i++] = pre[q[1]];
        }
        return ans;
    }
}