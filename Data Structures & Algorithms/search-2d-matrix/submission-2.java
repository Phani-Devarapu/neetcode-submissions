class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println(rows);
        System.out.println(cols);
        System.out.println("-----");


        int left = 0;
        int right = (rows) * (cols) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
      
    }
}
