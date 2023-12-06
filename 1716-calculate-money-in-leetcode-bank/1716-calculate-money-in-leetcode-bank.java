class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int days = n%7;
        // int money = (weeks*28) + (7*(((weeks-1)*weeks)/2));  Commented these 2 and returned ans directly for better space complexity
        // money += ((days*(days+1))/2) + (weeks * days);
        return ( (weeks*28) + (7*(((weeks-1)*weeks)/2)) + ((days*(days+1))/2) + (weeks * days) ) ;
    }

}