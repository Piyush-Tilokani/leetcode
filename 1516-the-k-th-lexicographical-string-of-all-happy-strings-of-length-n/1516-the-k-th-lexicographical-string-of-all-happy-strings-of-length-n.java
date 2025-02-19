class Solution {
    private void helper(int n, List<String> l, String s){
        if(s.length()==n){
            l.add(s);
            return;
        }
        for(int i=0; i<3; i++){
            char c = (char)('a'+i);
            if(s.length()>0 && s.charAt(s.length()-1) == c){
                continue;
            }             
            helper(n, l, s+c);
        }
    }
    public String getHappyString(int n, int k) {
        List<String> l = new ArrayList<>();
        helper(n, l, "");
        if(k>l.size())
            return "";
        Collections.sort(l);
        return l.get(k-1);
    }
}