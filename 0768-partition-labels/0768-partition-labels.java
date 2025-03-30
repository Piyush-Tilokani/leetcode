class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int last[] = new int[26];
        for(int i=0; i<s.length(); i++){
            last[s.charAt(i)-'a']=i; //Index of last occurence of characters
        }
        int l=0;
        int r=0;
        for(int i=0; i<s.length(); i++){
            r=Math.max(r, last[s.charAt(i)-'a']);
            if(i==r){
                ans.add(r-l+1);
                l=r+1;
            }
        }
        return ans;
    }
}