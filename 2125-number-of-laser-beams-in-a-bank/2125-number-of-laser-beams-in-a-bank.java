class Solution {
    public int numberOfBeams(String[] bank) {
        int beams = 0;
        int prevRow = 0;
        for(int i = 0; i<bank[0].length(); i++){
            prevRow += (bank[0].charAt(i) - '0');
        }
            System.out.println(prevRow);
        for(int i = 1; i<bank.length; i++){
            int currentRow = 0;
            for(int j = 0; j<bank[i].length(); j++){
                currentRow += (bank[i].charAt(j) - '0');
            }
                System.out.println(prevRow);
                System.out.println(currentRow);
            if(currentRow > 0 && prevRow > 0){
                beams += (currentRow*prevRow);
                prevRow = currentRow;
            }
            else if(currentRow > 0 && prevRow == 0){
                prevRow = currentRow;
            }
        }
        return beams;
    }
}