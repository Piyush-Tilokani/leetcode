class Solution {
    public int maxFreqSum(String s) {
        int maxVowelCount = 0;
        int maxConsonantCount = 0;
        int freq[] = new int[26];
        for(char c: s.toCharArray()){
            if("aeiou".contains(c+"")){
                freq[c-'a']++;
                maxVowelCount = Math.max(maxVowelCount, freq[c-'a']);
            }
            else{
                freq[c-'a']++;
                maxConsonantCount = Math.max(maxConsonantCount, freq[c-'a']);
            }
        } 
        return maxVowelCount + maxConsonantCount;
    }
}