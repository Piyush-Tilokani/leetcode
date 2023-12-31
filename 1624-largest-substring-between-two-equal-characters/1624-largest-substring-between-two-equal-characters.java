class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -1;
        for(int i = 0; i<s.length(); i++){
            int j = s.length() - 1;
            while(s.charAt(i) != s.charAt(j)){
                j--;
            }
            maxLen = Math.max(maxLen, j-i-1);
        }
        return maxLen;
    }
}