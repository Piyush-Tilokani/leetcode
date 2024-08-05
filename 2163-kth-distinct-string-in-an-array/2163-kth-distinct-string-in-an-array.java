class Solution {
    public String kthDistinct(String[] arr, int k) {
        StringBuilder ans = new StringBuilder("");
        Map<String, Integer> map = new HashMap<>();
        for(String s: arr)
            map.put(s, 1+map.getOrDefault(s, 0));
        for(String s: arr){
            if(map.get(s)==1)
                k--;
            if(k==0)    
                return s;
        }
        return ans.toString();
    }
}