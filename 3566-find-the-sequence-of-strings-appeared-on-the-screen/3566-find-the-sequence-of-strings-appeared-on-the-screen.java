class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int i=0;
        while(!target.equals(s.toString())){
            s.append("a");
            while(s.charAt(i)!=target.charAt(i)){
                char c = s.charAt(i);
                c+=1;
                ans.add(s.toString());
                s.setCharAt(i, c);
            }
            ans.add(s.toString());
            i++;
        }
        return ans;
    }
}