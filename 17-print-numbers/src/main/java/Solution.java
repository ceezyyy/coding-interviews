/**
 * <p>
 * 剑指 Offer 17. 打印从1到最大的n位数
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/19
 */
class Solution {
    public int[] printNumbers(int n) {

        int size = (int) Math.pow(10, n) - 1;

        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = i + 1;
        }

        return res;

    }
}


/**
 * Math.pow(a, b): a^b -> BigDecimal
 */
