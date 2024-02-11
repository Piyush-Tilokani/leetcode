class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int time=0;
        String init = word.substring(0,k);
        for(int i=0; i<word.length(); i++){
            time++;
            int end = (i*k) + k;
            if(end<word.length()){
                if(word.startsWith(word.substring(end)) )
                    return time;
            }                
            else{
                while(end>=word.length()){
                    end--;
                }
                if(word.startsWith(word.substring(end)) )
                    return time;
            }
        }
        if(word.length()%k==0)
            return word.length()/k;
        else
            return word.length()/k + 1;
    }
}