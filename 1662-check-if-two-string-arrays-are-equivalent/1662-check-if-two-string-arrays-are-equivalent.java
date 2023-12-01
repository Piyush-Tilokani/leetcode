class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="", str2="";
        
       for(String s1: word1){
           str1 += s1;
       }
       for(String s2: word2){
           str2 += s2;
       }

    return str1.equals(str2);
    }
}