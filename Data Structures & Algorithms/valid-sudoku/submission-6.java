class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for(int rowIndex = 0; rowIndex < 9; rowIndex++){
            for(int colIndex = 0; colIndex < 9; colIndex++){
                if(board[rowIndex][colIndex] != '.'){
                    int currentNumber = board[rowIndex][colIndex] - '1';
                int boxIndex = (rowIndex / 3) * 3 + (colIndex / 3);
                if(rows[rowIndex][currentNumber] || columns[colIndex][currentNumber] || boxes[boxIndex][currentNumber]) return false;
                rows[rowIndex][currentNumber] = true;
                columns[colIndex][currentNumber] = true;
                boxes[boxIndex][currentNumber] = true;
                }
            }
        }
        return true;
    }
}
