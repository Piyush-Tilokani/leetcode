class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set = new HashSet<>();
        int bannedCount = 0;
        for(String s: bannedWords)
            set.add(s);
        for(String s: message){
            if(set.contains(s))
                bannedCount++;
            if(bannedCount>=2)
                return true;
        }
        return false;
    }
}