class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        //Approach: Group indexes into buckets based on group size using hashmap
        int n = groupSizes.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(groupSizes[i]))
                map.put(groupSizes[i], new ArrayList<Integer>());
            map.get(groupSizes[i]).add(i);
        }
        // System.out.println(map);
        for(int i: map.keySet()){
            //For each group size, create sub groups of equal size and add to the ans
            int size = i;
            List<Integer> l = map.get(i);
            //List slicing 
            for(int j=0; j<l.size() ;j+=size)
                ans.add(l.subList(j, j+size));
        }
        return ans;
    }
}