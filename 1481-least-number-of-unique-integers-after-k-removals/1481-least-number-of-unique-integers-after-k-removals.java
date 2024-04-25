class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, 1 + map.getOrDefault(i, 0));
        }
        int freq[]=new int[map.size()];
        int i=0;
        for(int n: map.values()){
            freq[i++]= n;
        }
        Arrays.sort(freq);
        for(i=0; i<freq.length; i++){
            if(k<freq[i])
                break;
            k-=freq[i];
        }
        return freq.length-i;
    }
}