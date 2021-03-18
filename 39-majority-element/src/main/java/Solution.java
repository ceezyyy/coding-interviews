import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
// Intuition
class Solution {
    public int majorityElement(int[] nums) {

        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int occur;

        for (int e : nums) {
            occur = map.getOrDefault(e, 0);
            map.put(e, occur + 1);
            if (map.get(e) > length / 2) return e;
        }

        return nums[0];

    }
}


/**
 * map.getOrDefault(key, defaultVal)
 */

