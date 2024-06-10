class Solution {
    public int heightChecker(int[] heights) {
        int ans=0;
        int freq[] = new int[101]; //Arrays for counting sort
        int expected[] = new int[heights.length]; //Sorted array
        for(int i=0; i<heights.length; i++){
            freq[heights[i]]++;
        }
        for(int i=0, j=0; i<freq.length && j<expected.length; i++){
            while(freq[i]>0){
                expected[j++] = i;
                freq[i]--;
            }
        }
        for(int i=0; i<heights.length; i++){
            if(expected[i]!=heights[i])
                ans++;
        }
        return ans;
    }
}