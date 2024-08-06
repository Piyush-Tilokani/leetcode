class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        int ans=0;
        int keys=0;
        for(char c: word.toCharArray())
            freq[c-'a']++;
        Arrays.sort(freq);
        int i=25;
        while(i>=0 && freq[i]>0){
            keys++;
            int multiplier = keys%8!=0? keys/8 + 1 : keys/8;
            ans += freq[i--]*multiplier;            
        }
        return ans;
    }
}