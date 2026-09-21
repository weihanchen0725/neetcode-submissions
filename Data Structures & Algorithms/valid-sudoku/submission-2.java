class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] != '.'){
                    int currentNum = board[row][col] - '1';
                    int box = (row/3) * 3 + (col/3);
                    if(rows[row][currentNum] || columns[col][currentNum] || boxes[box][currentNum]){
                        return false;
                    }
                    rows[row][currentNum] = true;
                    columns[col][currentNum] = true;
                    boxes[box][currentNum] = true;
                }
            }
        }
        return true;
    }
}
