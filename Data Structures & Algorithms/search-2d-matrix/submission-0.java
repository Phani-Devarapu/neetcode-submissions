class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

          int rows = matrix.length;
        int cols = matrix[0].length;

        int drow = 0;

        for (int i = 0; i < rows; i++) {
            int startElement = matrix[i][0];
            int endElement = matrix[i][cols - 1];
            if (startElement <= target && target <= endElement) {
                drow = i;
            }
        }

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (matrix[drow][mid] == target) {
                return true;
            }

            if (matrix[drow][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }
        }
        return false;
        
    }
}
