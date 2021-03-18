/**
 * <p>
 * 剑指 Offer 50. 第一个只出现一次的字符
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/17
 */
class Solution1 {
    public char firstUniqChar(String s) {

        int[] map = new int[128];
        char res = ' ';

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return res;

    }
}


/**
 * char -> ascii
 */
