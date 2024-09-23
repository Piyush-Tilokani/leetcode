class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int ans=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        if(players[0] > trainers[trainers.length-1])
            return ans;
        while(i<players.length && j<trainers.length){
            if(players[i] <= trainers[j]){
                ans++;
                i++;
            }
            j++;            
        }
        return ans;
    }
}