class Solution {
    public boolean squareIsWhite(String coordinates) {
        // int letter = coordinates.charAt(0)-'a';
        // int num = coordinates.charAt(1) - '0';
        return ((coordinates.charAt(0)-'a')+(coordinates.charAt(1) - '0'))%2 == 0;
    }
}