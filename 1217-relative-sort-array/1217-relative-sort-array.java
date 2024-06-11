class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len = 0;
        for(int i: arr1)
            len = Math.max(len, i);
        int freq[] = new int[len+1];
        int ans[] = new int[arr1.length];
        for(int i: arr1)
            freq[i]++;
        int ind=0;
        for(int i: arr2){
            while(freq[i]!=0){
                ans[ind++] = i;
                freq[i]--;
            }
        }
        for(int i=0; i<freq.length; i++){
            while(freq[i]!=0){
                ans[ind++] = i;
                freq[i]--;
            }
        }
        return ans;
    }
}