import java.util.Arrays;

/**
 * <p>
 * 剑指 Offer 40. 最小的k个数
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/17
 */
// Intuition
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {

        int[] res = new int[k];

        Arrays.sort(arr);

        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }

        return res;

    }
}
