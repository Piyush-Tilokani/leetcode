class Solution {
    public int strStr(String haystack, String needle) {
        int nSize = needle.length();
        for(int i = 0; i<=haystack.length()-nSize; i++ ){            
            if(haystack.substring(i, i+nSize).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}