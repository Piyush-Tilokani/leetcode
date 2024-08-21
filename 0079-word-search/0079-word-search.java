class Solution {
    //Approach: Backtracking, DFS 
    private boolean findWord(char[][] board, String word, boolean[][] visited, int r, int c, int i){
        //Debugging---------------------------------------------------------------------------------------------------
        // System.out.println("Called for char: "+board[r][c] + ", i: "+i+", r: "+r+", c: "+c);
        // System.out.println(i==word.length()-1 && word.charAt(i)==board[r][c]);
        // System.out.println(word.charAt(i)==board[r][c]);

        //If word found, return true
        if(i==word.length()-1 && word.charAt(i)==board[r][c]){
            return true;
        }
        //If next row exists and is not visited and has the same char as that of word, explore it using BFS        
        //If next row exists and is not visited and has the same char as that of word, explore it using BFS        
        if(r+1<board.length && !visited[r+1][c] && word.charAt(i+1)==board[r+1][c]){
            visited[r+1][c] = true; //Mark as visited
            if(findWord(board, word, visited, r+1, c, i+1)) //As soon as found, return true
                return true;
            visited[r+1][c] = false; //Unmark visited
        }
        //If prev row exists and is not visited and has the same char as that of word, explore it using BFS        
        if(r-1>=0 && !visited[r-1][c] && word.charAt(i+1)==board[r-1][c]){
            visited[r-1][c] = true; //Mark as visited
            if(findWord(board, word, visited, r-1, c, i+1)) //As soon as found, return true
                return true;
            visited[r-1][c] = false; //Unmark visited
        }
        //If next col exists and is not visited and has the same char as that of word, explore it using BFS        
        if(c+1<board[0].length && !visited[r][c+1] && word.charAt(i+1)==board[r][c+1]){
            visited[r][c+1] = true; //Mark as visited
            if(findWord(board, word, visited, r, c+1, i+1)) //As soon as found, return true
                return true;
            visited[r][c+1] = false; //Unmark visited
        }
        //If prev col exists and is not visited and has the same char as that of word, explore it using BFS        
        if(c-1>=0 && !visited[r][c-1] && word.charAt(i+1)==board[r][c-1]){
            visited[r][c-1] = true; //Mark as visited
            if(findWord(board, word, visited, r, c-1, i+1)) //As soon as found, return true
                return true;
            visited[r][c-1] = false; //Unmark visited
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean [][]visited = new boolean[board.length][board[0].length]; //To mark the visited cells
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                visited[i][j] = true; //Mark the cell as visited
                if(word.charAt(0)==board[i][j] && findWord(board, word, visited, i, j, 0)){
                    // System.out.println("Called for char: "+board[i][j]);
                    return true;
                }
                visited[i][j] = false; //If word not found, unmark the visited status so that it can be used as intermediate point for other staring cells
            }
        }
        //If never found, return false
        return false;
    }
}