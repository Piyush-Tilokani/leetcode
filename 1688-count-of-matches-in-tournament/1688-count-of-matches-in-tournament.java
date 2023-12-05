class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n != 1){
            if(n %2 == 0){
                n /= 2;
                count += n;
            }
            else{
                count += (n/2);
                n = 1+ (n/2);
            }
        }
        return count;
    }
}
