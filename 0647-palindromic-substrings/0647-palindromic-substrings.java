class Solution {
    // private boolean isPal(String s){

    //     int l=0;
    //     int r=s.length()-1;
    //     // System.out.println(s);
    //     while(l<r){
    //         if(s.charAt(l++) != s.charAt(r--))
    //             return false;
    //     }
    //     return true;
    // }
    public int countSubstrings(String s) {
        // Extreme brute force: Checking isPalindrome for all the substrings
        // TC: O(n^3). SC: O(1)
        // Would get accepted for this Q but not recommended

    //     int ans = s.length();
    //     for(int i=2; i<=s.length(); i++){
    //         for(int j=0; j<=s.length()-i; j++){
    //             if(isPal(s.substring(j, j+i)))
    //                 ans++;
    //         }
    //     }
    //     return ans;

        //----------------------------------------------------------------------------------------------------

        // Better approach: Based on this approach
        //TC: O(n^2), SC: O(1)

        int ans=0;
        for(int i=0; i<s.length(); i++){
            //For odd length substrings(including substring of length i) with ith char as middle char
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                ans++;
                l--;
                r++;
            }
            //For even length substrings with ith and i+1th char char as middle chars
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                ans++;
                l--;
                r++;
            }
        }
        return ans;
    }
}