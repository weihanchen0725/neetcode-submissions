class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length <= 0 || matrix[0].length <= 0) return false;

        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int row = 0;
        int column = matrix[0].length - 1;

        while(row < rows && column >= 0){
            int currentNumber = matrix[row][column];

            if(currentNumber == target){
                return true;
            }else if(currentNumber < target){
                row++;
            }else{
                column--;
            }
        }

        return false;
    }
}
