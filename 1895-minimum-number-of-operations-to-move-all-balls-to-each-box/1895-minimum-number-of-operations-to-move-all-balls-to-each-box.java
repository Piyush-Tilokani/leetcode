class Solution {
    public int[] minOperations(String boxes) {
        int ans [] = new int[boxes.length()];
        for(int i=0; i<boxes.length();i++){
            int moves = 0;
            // System.out.println("i= " +i + ", char= "+boxes.charAt(i));
            for (int j=0; j<boxes.length(); j++){
                if(boxes.charAt(j)=='1'){
                    // System.out.println( "j= " +j + ", char= "+boxes.charAt(j));
                    moves+= Math.abs(i-j);
                }
            }
            ans[i] = moves;
        }
        return ans;
    }
}