import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 剑指 Offer 56 - II. 数组中数字出现的次数 II
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/21
 */
class Solution {
    public int singleNumber(int[] nums) {

        int occurrence = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int e : nums) {
            occurrence = map.getOrDefault(e, 0);
            map.put(e, occurrence + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return 0;

    }
}