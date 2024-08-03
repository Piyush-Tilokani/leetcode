class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int freq[] = new int[1001];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
            freq[target[i]]--;
        }
        for(int i=0; i<arr.length; i++){
            if(freq[target[i]]!=0 || freq[arr[i]]!=0)
                return false;
        }
        return true;
    }
}