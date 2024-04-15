class Solution {
    private List<String> permutations(String p, String up, List<String> ans, Map<Character, String> map){
        if(up.length()==0){
            ans.add(p);
            return ans;
        }
        for(int i=0; i<map.get(up.charAt(0)).length(); i++){
            char ch = map.get(up.charAt(0)).charAt(i);
            permutations(p+ch,up.substring(1), ans, map);
        }
        return ans;
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        Map<Character, String> map= new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> ans=new ArrayList<>();
        permutations("", digits, ans, map);
        return ans;
    }
}