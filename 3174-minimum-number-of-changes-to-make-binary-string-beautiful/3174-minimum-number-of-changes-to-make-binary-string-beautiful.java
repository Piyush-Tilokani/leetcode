class Solution {
    public int minChanges(String s) {
        int ans=0;
        // int zero=0;
        // int one=0;
        for(int i=0; i<s.length()-1; i+=2){
            if(s.charAt(i)!=s.charAt(i+1))
                ans++;
        }
        return ans;
    }
}