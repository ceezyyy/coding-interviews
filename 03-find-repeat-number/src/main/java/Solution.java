import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 剑指 Offer 03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/17
 */
// Intuition
class Solution {
    public int findRepeatNumber(int[] nums) {

        if (nums == null || nums.length == 0) return -1;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) return i;
            set.add(i);
        }

        return 0;

    }
}
