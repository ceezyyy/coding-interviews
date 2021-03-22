/**
 * <p>
 * 剑指 Offer 42. 连续子数组的最大和
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/21
 */
class Solution {
    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        /**
         * Continuous subarray
         */
        int maxEndingHere = nums[0];
        /**
         * The maximum of all the subarray
         */
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            /**
             * We have 2 choices:
             *
             * 1) add current element to our subarray
             * maxEndingHere + nums[i] ("maxEndingHere" remains last state)
             *
             * 2) start a new subarray
             * nums[i]
             */
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;

    }
}
