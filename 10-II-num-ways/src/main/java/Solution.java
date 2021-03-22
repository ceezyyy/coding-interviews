/**
 * <p>
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/21
 */
class Solution {
    public int numWays(int n) {
        int[] res = new int[101];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        for (int i = 3; i <= n; i++) {
            res[i] = (res[i - 1] + res[i - 2]) % 1000000007;
        }
        return res[n];
    }
}
