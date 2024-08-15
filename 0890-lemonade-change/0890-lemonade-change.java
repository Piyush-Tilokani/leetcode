class Solution {
    public boolean lemonadeChange(int[] bills) {
        int notes[] = new int[2]; //notes[0] denotes no. of 5$ bills and notes[1] denotes no. of 10$ bills
        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                notes[0]++;
            }
            else if(bills[i]==10){
                if(notes[0]==0)
                    return false;
                notes[0]--;
                notes[1]++;
            }
            else{
                if(notes[1]>0 && notes[0]>0){
                    notes[0]--;
                    notes[1]--;
                }
                else if(notes[0]>=3)
                    notes[0] -= 3;
                else
                    return false;                                 
            }
        }
        return true;
    }
}