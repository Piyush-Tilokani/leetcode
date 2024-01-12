class Solution {
    public boolean halvesAreAlike(String s) {
        int vowelCount = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('A'); vowels.add('e'); vowels.add('E'); vowels.add('i'); vowels.add('I');
        vowels.add('o'); vowels.add('O'); vowels.add('u'); vowels.add('U');
        for(int i=0;i<s.length()/2; i++){
                if(vowels.contains(s.charAt(i)))
                    vowelCount++;
                 if(vowels.contains(s.charAt((s.length()/2) + i)))
                    vowelCount--;
            
        }
        return vowelCount==0;
    }
}