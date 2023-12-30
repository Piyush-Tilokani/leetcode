class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length == 1)
            return true; 
        int charCount = 0;
        for(String s: words){
            charCount += s.length();
        }
        if(charCount%words.length != 0)
            return false;
        int chars[] = new int[26];
        for(String s: words){
            for(int i = 0; i<s.length(); i++){
                chars[s.charAt(i)-'a']++;
            }
        }
        for(int ch: chars){
            if(ch % words.length != 0)
                return false;
        }
        return true;
    }
}