class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char [] sort = s.toCharArray();
            Arrays.sort(sort);
            String sorted = new String(sort);
            if(!map.containsKey(sorted))
                map.put(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}