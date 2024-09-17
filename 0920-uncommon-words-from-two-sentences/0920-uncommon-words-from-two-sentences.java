class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: s1.split(" "))
            map.put(s, 1+map.getOrDefault(s, 0));
        for(String s: s2.split(" "))
            map.put(s, 1+map.getOrDefault(s, 0));
        List<String> l = new ArrayList<>();
        for(String s: map.keySet())
            if(map.get(s) == 1)
                l.add(s);
        String ans[] = new String[l.size()];
        int i=0;
        for(String s: l)
            ans[i++] = s;
        return ans;
    }
}