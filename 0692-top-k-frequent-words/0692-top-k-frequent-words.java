class Solution {
    private int customCompare(String a, String b, Map<String, Integer> map){
        if(map.get(a) != map.get(b))
            return -Integer.compare(map.get(a), map.get(b));
        return a.compareTo(b);
    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s: words)
            map.put(s, 1+map.getOrDefault(s, 0));
        // System.out.println(map);
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> customCompare(a, b, map));
        pq.addAll(map.keySet());
        // System.out.println(pq);
        while(k-->0)
            ans.add(pq.poll());
        return ans;
    }
}