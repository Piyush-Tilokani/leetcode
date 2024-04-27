class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), 1 + map.getOrDefault(s.charAt(i), 0));
        }
    //Using Priority queue (Max Heap) to store in decsending sorted order of frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a)); //Using comparator to sort in decreassing order of frequency
        pq.addAll(map.keySet());
        while(!pq.isEmpty()){
            char ch = pq.poll(); // Just like dequeue in queue (Return front elem and removes it from queue)
            int freq = map.get(ch);
            for(int i=0; i<freq; i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}