class Solution {
public:
    int balancedStringSplit(string s) {
        int right = 0;
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s[i] == 'L'){
              right--;
            }else{
              right++;
            }
            if(right == 0){
              count++;
            }
        }
        return count;
    }
};