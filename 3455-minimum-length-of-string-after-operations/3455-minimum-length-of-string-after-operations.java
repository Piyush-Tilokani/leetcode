class Solution {
    public int minimumLength(String s) {
        int freq[]=new int[26];
        int ans=0;
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0; i<26; i++){
            while(freq[i]>=3){
                freq[i]-=2;
            }
            ans+=freq[i];
        }
        return ans;
    }
}