class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int i=0;
        for(char c: target.toCharArray()){
            s.append("a");
            while(s.charAt(i)!=c){
                char ch = s.charAt(i);
                ch+=1;
                ans.add(s.toString());
                s.setCharAt(i, ch);
            }
            ans.add(s.toString());
            i++;
        }
        return ans;
    }
}