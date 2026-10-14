class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int row = 0;
        int col = totalCols - 1;

        while(row < totalRows && col >= 0){
            int currNum = matrix[row][col];
            if(currNum == target){
                return true;
            }else if(currNum > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
