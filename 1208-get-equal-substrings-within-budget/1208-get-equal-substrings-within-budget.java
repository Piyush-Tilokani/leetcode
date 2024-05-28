class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        //Sliding window TC:O(n), SC: O(n)
        int diff[] = new int[s.length()];
        int ans=0;
        for(int i=0; i<s.length(); i++){// Calculate the diff array for absolute difference b/w characters
            diff[i] = Math.abs(s.charAt(i)-t.charAt(i));
        }
        // System.out.println(Arrays.toString(diff));
        int l=0; 
        int r=0;
        int windowSum = 0; //Maintain windowSum for sliding 
        while(r<s.length()){
            while(r<s.length() && windowSum+diff[r]<=maxCost){ //If window exceeds max value, stop increasing window size
                windowSum+=diff[r++];
            }
            ans = Math.max(ans, r-l);
            while(l<s.length() && r<s.length() && windowSum+diff[r]>maxCost){ //Reduce window size to adjust more elements in the window
                // System.out.println("Window sum: "+windowSum+", l: "+l+", r: "+r);
                windowSum-=diff[l++];
            }
            // System.out.println("Before exiting l: "+l);
        }
        return ans;
    }
}