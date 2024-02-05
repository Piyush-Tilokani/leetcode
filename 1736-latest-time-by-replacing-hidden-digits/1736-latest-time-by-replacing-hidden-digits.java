class Solution {
    public String maximumTime(String time) {
        String ans = ""; 
        for(int i=0; i<time.length(); i++){
            if(time.charAt(i) != '?'){
                ans += time.charAt(i) + "";
            }
            else{
                if(i==0)    ans += time.charAt(1)-'0'<4 || time.charAt(1) == '?'? "2": "1";
                if(i==1)    ans += time.charAt(0) == '2' || time.charAt(0) == '?'? "3": "9";
                if(i==3)    ans += "5";
                if(i==4)    ans += "9";
            }
        }
        return ans;
    }
}