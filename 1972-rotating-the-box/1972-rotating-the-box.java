class Solution {
    //Helper function
    private void processBox(char  [][] box){
        int m = box.length;
        int n = box[0].length;
        for(int r=0; r<m; r++){
            for(int c=n-1; c>=0; c--){
                int right = c;
                while(box[r][c]=='#' && right+1<n && box[r][right+1]=='.'){
                    right++;
                }
                if(right<n && right!=c){
                    box[r][right] = '#';
                    box[r][c] = '.';                        
                }
            }
        }
    }
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char [][]ans = new char[n][m];
        //Process the box without rotating it
        processBox(box);

        // for(char []a: box)
        //     System.out.print(Arrays.toString(a)+", ");

        //Fill the ans matrix using processed box
        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){
                ans[c][m-1-r] = box[r][c];
            }
        }
        return ans;
    }
}