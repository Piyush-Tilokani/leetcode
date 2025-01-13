class Solution {
    public int minimumLength(String s) {
        int freq[]=new int[26];
        int ans=0;
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i: freq){
            if(i==0)
                continue;
            if(i%2==0)
                ans+=2;
            else
                ans++;
        }
        return ans;
    }
}