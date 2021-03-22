/**
 * <p>
 * 剑指 Offer 04. 二维数组中的查找
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/20
 */
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        // upper right
        int i = 0;
        int j = cols - 1;
        int cur = 0;

        // while (condition)
        while (i < rows && j >= 0) {

            cur = matrix[i][j];

            if (target == cur) return true;
            if (target < cur) {
                // go left
                j--;
            } else {
                // go down
                i++;
            }

        }

        return false;

    }
}
