class Solution {
    public int longestPalindrome(String s) {
        int even = 0;
        int odd = 0;
        int map[] = new int[58];
        for(int i=0; i<s.length(); i++){
            map[s.charAt(i) - 'A']++;
        }
        for(int i: map){
            if(i>0 && i%2==0) //All characters w/ even frequency contribute fullly
                even+=i;
            else if(i>0){ //First character w/ odd length contributes fully, rest all contribute (frequency-1) times
                odd += odd==0? i: i-1;
            }
        }
        return even+odd;
    }
}