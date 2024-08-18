class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int start = 1;
        for(int i: target){
            while(i!=start){
                ans.add("Push");
                ans.add("Pop");
                start++;
            }
               ans.add("Push");
            start++;
        }
        return ans;
    }
}