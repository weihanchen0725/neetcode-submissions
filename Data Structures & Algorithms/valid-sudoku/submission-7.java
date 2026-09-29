class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        for(int rowIndex = 0; rowIndex < 9; rowIndex++){
            for(int colIndex = 0; colIndex < 9; colIndex++){
                if(board[rowIndex][colIndex] != '.'){
                    int boxIndex = (rowIndex / 3) * 3 + (colIndex / 3);
                    int currNum = board[rowIndex][colIndex] - '1';
                    if(rows[rowIndex][currNum] ||
                    columns[colIndex][currNum] ||
                    boxes[boxIndex][currNum]){
                        return false;
                    }
                    rows[rowIndex][currNum] = true;
                    columns[colIndex][currNum] = true;
                    boxes[boxIndex][currNum] = true;
                }
            }
        }

        return true;
    }
}
