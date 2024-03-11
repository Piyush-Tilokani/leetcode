class Solution {
    public String customSortString(String order, String s) {
        int map[] = new int[26];
        for(int i=0; i<s.length(); i++){
            map[s.charAt(i) - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<order.length(); i++){
            for(int j=0; j<map[order.charAt(i) - 'a']; j++){
                ans.append(order.charAt(i));
            }
            map[order.charAt(i) - 'a']=0;
        }
        for(int i=0; i<26; i++){
            for(int j=0; j<map[i]; j++){
                ans.append((char)(97+i));
            }
        }
        
        return ans.toString();
    }
}