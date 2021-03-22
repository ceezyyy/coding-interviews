/**
 * <p>
 * 剑指 Offer 11. 旋转数组的最小数字
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
// Intuition
class Solution {
    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        int min = numbers[0];
        for (int e : numbers) {
            if (e < min) min = e;
        }
        return min;
    }
}
