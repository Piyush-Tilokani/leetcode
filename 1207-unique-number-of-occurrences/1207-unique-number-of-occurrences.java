class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map <Integer, Integer> nums = new HashMap<>();
        for(int i: arr){
            int prevValue = nums.getOrDefault(i, 0);
            nums.put(i, ++prevValue);
        }
        Map <Integer, Integer> freq = new HashMap<>();
        for(Map.Entry m: nums.entrySet()){
            int prevFreq = freq.getOrDefault( m.getValue(), 0);
            if(prevFreq >= 1){
                return false;
            }
            // int insertVal = m.getValue();
            freq.put((int)m.getValue(), ++prevFreq);
        }
        return true;
    }
}