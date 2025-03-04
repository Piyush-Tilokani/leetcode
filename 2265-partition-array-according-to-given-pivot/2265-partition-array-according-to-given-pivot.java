class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] smaller = new int[nums.length];
        int[] greater = new int[nums.length];
        int pivotCount=0;
        int i=0;
        int j=0;
        for(int n: nums){
            if(n==pivot)
                pivotCount++;
            else if(n<pivot)
                smaller[i++]=n;
            else
                greater[j++]=n;
        }
        int []ans = new int[nums.length];
        int ind=0;
        for(int k=0; k<i; k++){
            ans[ind++] = smaller[k];
        }
        for(int k=0; k<pivotCount; k++){
            ans[ind++] = pivot;
        }
        for(int k=0; k<j; k++){
            ans[ind++] = greater[k];
        }
        return ans;       
    }
}