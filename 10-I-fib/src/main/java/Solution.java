/**
 * <p>
 * 剑指 Offer 10- I. 斐波那契数列
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
class Solution {
    public int fib(int n) {

        int[] arr = new int[101];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }

        return arr[n];

    }
}
