class Solution {
    private StringBuilder sumOfDigits(StringBuilder n){
        int sum = 0;    
        for(char c: n.toString().toCharArray())
            sum += c-'0';
        return new StringBuilder(sum+"");
    }
    public int getLucky(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(char c: s.toCharArray())
            ans.append(((c-'a')+1));
        while(k--!=0)
            ans = sumOfDigits(ans);
        return Integer.parseInt(ans.toString());
    }
}