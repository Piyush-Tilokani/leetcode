class Solution {
    public String largestGoodInteger(String num) {
        String[] compare = {"999", "888", "777", "666", "555","444", "333", "222", "111", "000"}; 
        for(String str: compare){
            if (num.contains(str))
                return str;
        }        
        return "";
    }
}