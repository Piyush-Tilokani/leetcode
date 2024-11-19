class Solution {
    public int minimumChairs(String s) {
        int ans=0;
        int chairs = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='E')
                chairs++;
            else 
                chairs--;
            ans=Math.max(chairs, ans);
        }
        return ans;
    }
}