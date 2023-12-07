class Solution {
    public String largestOddNumber(String num) {
        for(int h = num.length() - 1; h >= 0; h--){
            if ((num.charAt(h) - '0') % 2 != 0){
                return num.substring(0, h+1);
            }
        }
         return "";       
    }
}