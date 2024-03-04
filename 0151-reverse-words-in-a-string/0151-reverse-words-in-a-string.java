class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        StringBuilder ans = new StringBuilder();
        List<String> words = new ArrayList<>();
        int len = s.length();
        for(int i=0; i<len; i++){
            if(s.charAt(i)!=' '){
                int j=i;
                while(j<len && s.charAt(j)!=' ')
                    j++;
                if(j<len){
                    words.add(s.substring(i, j));
                    i=j-1;
                }
                else{
                    words.add(s.substring(i,j));
                    break;
                }
            }                
        }
        for(int i=words.size()-1; i>=1;i--){
            ans.append(words.get(i));
            ans.append(" ");
        }
        ans.append(words.get(0));
        return ans.toString();
    }
}