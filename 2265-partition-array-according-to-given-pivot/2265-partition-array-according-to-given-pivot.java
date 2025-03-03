class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int pivotCount=0;
        for(int i: nums){
            if(i==pivot)
                pivotCount++;
            else if(i<pivot)
                smaller.add(i);
            else
                greater.add(i);
        }
        int []ans = new int[nums.length];
        int ind=0;
        for(int i: smaller){
            ans[ind++] = i;
        }
        for(int i=0; i<pivotCount; i++){
            ans[ind++] = pivot;
        }
        for(int i: greater){
            ans[ind++] = i;
        }
        return ans;       
    }
}