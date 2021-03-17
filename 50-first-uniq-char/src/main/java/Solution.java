import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 * 剑指 Offer 50. 第一个只出现一次的字符
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/17
 */

// Intuition
class Solution {
    public char firstUniqChar(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        char res = ' ';

        for (int i = 0; i < s.length(); i++) {
            int val = 1;
            Character current = s.charAt(i);
            if (map.containsKey(current)) val = map.get(current) + 1;
            map.put(current, val);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return res;

    }
}

/**
 * Store info: map(K, V)  e.g: occurrence
 * Sorted: LinkedHashMap  e.g: first, last
 */
