class Solution {
    public String largestOddNumber(String num) {
        for(int h = num.length() - 1; h >= 0; h--){
            if (Character.getNumericValue(num.charAt(h)) % 2 != 0){
                return num.substring(0, h+1);
            }
        }
         return "";       
    }
}