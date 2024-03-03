class Solution {
    public String sortVowels(String s) {
        StringBuilder t = new StringBuilder(s);
        List<Character> ch = new ArrayList<>();
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='A' || t.charAt(i)=='a' || t.charAt(i)=='E' || t.charAt(i)=='e' || t.charAt(i)=='I'|| t.charAt(i)=='i' || t.charAt(i)=='O' || t.charAt(i)=='o' || t.charAt(i)=='U' || t.charAt(i)=='u')
            {
                ch.add(t.charAt(i));
                t.setCharAt(i,'0');
            }
        }
        Collections.sort(ch);
        for(int i=0, j=0; i<t.length(); i++){
            if(t.charAt(i)=='0')
            {
                t.setCharAt(i, ch.get(j++));
            }
        }

        return t.toString();
    }
}