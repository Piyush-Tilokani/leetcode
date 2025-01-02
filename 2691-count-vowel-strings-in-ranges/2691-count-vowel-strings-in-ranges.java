class Solution {
    private boolean isVowelString(String s){
        String v="aeiou";
        if(v.indexOf(s.charAt(0))!=-1 && v.indexOf(s.charAt(s.length()-1))!=-1)
            return true;
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] ans = new int[queries.length];
        int [] prefix = new int[words.length];
        if(isVowelString(words[0]))
            prefix[0]=1;
        for(int i=1; i<words.length; i++){
            // System.out.println(words[i]+": "+isVowelString(words[i]));
            if(isVowelString(words[i]))
                prefix[i] += prefix[i-1]+1;
            else
                prefix[i] += prefix[i-1];
        }
        // System.out.println(Arrays.toString(prefix));
        for(int i=0; i<queries.length; i++){
            if(queries[i][0]>0)
                ans[i] = prefix[queries[i][1]]  - prefix[queries[i][0]-1];
            else
                ans[i] = prefix[queries[i][1]];
        }
        return ans;
    }
}