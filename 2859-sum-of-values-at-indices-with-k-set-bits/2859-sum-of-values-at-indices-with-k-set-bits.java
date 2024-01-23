class Solution {
    private boolean hasK1s(int num, int k){
        int count = 0;
        while(num>0){
            if((num & 1) == 1)
                count++;
                num = num >> 1;
        }
        return count==k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            if(hasK1s(i, k))
                sum += nums.get(i);
        }
        return sum;
    }
}