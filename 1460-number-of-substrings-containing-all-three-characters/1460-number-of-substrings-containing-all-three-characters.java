class Solution {
    private boolean containsAll3(int[] freq){
        for(int i: freq)
            if(i==0)
                return false;
        return true;
    }
    public int numberOfSubstrings(String s) {
        int ans=0;
        int[] freq=new int[3];
        int n=s.length();
        int l=0;
        int r=0;
        while(r<n){
            freq[s.charAt(r)-'a']++;
            while(containsAll3(freq)){
                ans+=n-r;
                freq[s.charAt(l++)-'a']--;
            }
            r++;
        }
        return ans;
    }
}