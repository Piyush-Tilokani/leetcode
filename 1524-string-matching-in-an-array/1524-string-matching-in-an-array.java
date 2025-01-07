class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(j!=i && words[j].indexOf(words[i])!=-1){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}