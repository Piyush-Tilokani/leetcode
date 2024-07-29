class Solution {
    public int numTeams(int[] rating) {
        //Brute force: TC: O(n^3), SC: O(1)
        int ans=0;
        int n=rating.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(rating[i]>rating[j] && rating[j]>rating[k])
                        ans++;
                    if(rating[i]<rating[j] && rating[j]<rating[k])
                        ans++;
                }
            }
        }
        return ans;
    }
}