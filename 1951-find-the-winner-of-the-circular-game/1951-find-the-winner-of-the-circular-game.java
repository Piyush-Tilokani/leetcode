class Solution {
    public int findTheWinner(int n, int k) {
        //Simulation using List
        // TC: O(n^2), SC: O(n)
        if(k==1)
            return n;
        List<Integer> friends = new ArrayList<>();
        for(int i=1; i<=n; i++){
            friends.add(i);
        }
        int i=0;
        while(friends.size()!=1){
            int rem=(i+k-1)%friends.size();
            friends.remove(rem);
            i=rem;
        }
        return friends.get(0);
    }
}