class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int n = word.length();
        for(int i=0; i<n; i++){
            int count=1;
            while(i+1<word.length() && word.charAt(i)==word.charAt(i+1)){
                count++;
                i++;
            }
            while(count>9){
                comp.append(9+""+word.charAt(i));
                count-=9;
            }
            comp.append(count+""+word.charAt(i));
        }
        return comp.toString();
    }
}