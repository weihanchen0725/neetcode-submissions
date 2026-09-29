class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for(int rowIndex = 0; rowIndex < 9; rowIndex++){
            for(int colIndex = 0; colIndex < 9; colIndex++){
                if(board[rowIndex][colIndex] != '.'){
                    int currentNum = board[rowIndex][colIndex] - '1';
                int boxIndex = (rowIndex/3) * 3 + (colIndex/3);
                if(rows[rowIndex][currentNum] || cols[colIndex][currentNum] || boxes[boxIndex][currentNum]) return false;
                rows[rowIndex][currentNum] = true;
                cols[colIndex][currentNum] = true;
                boxes[boxIndex][currentNum] = true;
                }
                
            }
        }
        return true;
    }
}
