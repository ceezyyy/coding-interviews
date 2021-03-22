/**
 * <p>
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/19
 */
class Solution {
    public int[] exchange(int[] nums) {

        if (nums == null || nums.length == 0) return nums;

        int head = 0;
        int tail = nums.length - 1;
        int a, b;

        // [Odd, Even]
        while (head < tail) {

            a = nums[head];
            b = nums[tail];

            if (isEven(a) && !isEven(b)) swap(nums, head, tail);

            if (isEven(a) && isEven(b)) {
                tail--;
                continue;
            }

            if (!isEven(a) && !isEven(b)) {
                head++;
                continue;
            }

            head++;
            tail--;

        }

        return nums;

    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public boolean isEven(int val) {
        return val % 2 == 0;
    }

}
