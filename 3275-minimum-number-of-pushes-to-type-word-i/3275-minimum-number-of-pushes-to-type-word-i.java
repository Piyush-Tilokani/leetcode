class Solution {
    public int minimumPushes(String word) {
        
        int freq[] = new int[26];
        int ans=0;
        int keys=0;
        for(char c: word.toCharArray())
            freq[c-'a']++;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(freq[b], freq[a]));
        for(int i=0; i<26; i++)
            pq.offer(i);
        while(!pq.isEmpty() && freq[pq.peek()]>0){
            keys++;
            int multiplier = keys%8!=0? keys/8 + 1 : keys/8;
            ans += freq[pq.poll()]*multiplier;            
        }
        return ans;
    }
}