/**
 * <p>
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/17
 */
class Solution {
    public int missingNumber(int[] nums) {

        if (nums.length == 0) return 0;

        int pre = -1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] - pre != 1) break;
            pre = nums[i];
            i++;
        }

        return pre + 1;

    }
}


/**
 * Be aware of the corner case
 */
