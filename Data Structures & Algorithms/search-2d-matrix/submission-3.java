class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mLength = matrix.length, nLength = matrix[0].length;
        int left = 0, right = mLength * nLength - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int row = mid / nLength;
            int col = mid % nLength;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
