class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rowIndex = 0;
        int colIndex = matrix[0].length - 1;
        
        while(rowIndex < rows && colIndex >= 0){
            int currNum = matrix[rowIndex][colIndex];
            if(currNum == target) return true;
            else if(currNum < target){
                rowIndex++;
            }else{
                colIndex--;
            }
        }
        return false;
    }
}
