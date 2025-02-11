class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int len = part.length();
        while(str.indexOf(part)!=-1){
            str.delete(str.indexOf(part), str.indexOf(part)+len);
        }
        return str.toString();
    }
}