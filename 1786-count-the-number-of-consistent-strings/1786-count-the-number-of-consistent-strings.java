class Solution {
    //Approach: Brute force
    private boolean isConsistent(String s, int[] map){
        for(char c: s.toCharArray())
            if(map[c-'a']<=0)
                return false;
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int map[] = new int[26];
        int ans=0;
        for(char c: allowed.toCharArray())
            map[c-'a']++;
        for(String s: words)
            if(isConsistent(s, map))
                ans++;
        return ans;
    }
}