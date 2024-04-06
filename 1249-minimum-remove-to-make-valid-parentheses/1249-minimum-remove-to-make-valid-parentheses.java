class Solution {
    public String minRemoveToMakeValid(String s) {
        int count=0;
        StringBuilder ans = new StringBuilder(s);
        for(int i=0; i<ans.length(); i++){
            if(ans.charAt(i)=='(')
                count++;            
            else if(ans.charAt(i)==')'){
                if(count>0)
                    count--;                
                else{
                    ans.delete(i, i+1);
                    i--;
                }
            }
        }
        if(count==0)
            return ans.toString();
        
        for(int i=ans.length()-1; i>=0; i--){
            if(ans.charAt(i)=='(' && count>0){
                ans.delete(i,i+1);
                count--;
            }
        }
        
        return ans.toString();        
    }
}