public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
            
                char c = board[i][j];
                
                if (c == '.')
                    continue;

                if (c < '0' || c > '9')
                    return false;
            
                int number = c - '1';
                
                if (row[i][number] || col[j][number] || box[(i / 3) * 3 + j / 3][number])
                    return false;
                
                row[i][number] = true;
                col[j][number] = true;
                box[(i / 3) * 3 + j / 3][number] = true;
            }
        }
    
        return true;
    }
}