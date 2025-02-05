class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int freq[]=new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i: freq){
            if(i!=0)
                return false;
        }
        int mismatch=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
                mismatch++;
            if(mismatch>2)
                return false;
        }
        return true;
    }
}