/**
 * <p>
 * 剑指 Offer 58 - II. 左旋转字符串
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/17
 */
// Intuition
class Solution {
    public String reverseLeftWords(String s, int n) {

        if (s.isEmpty()) return s;

        StringBuilder tail = new StringBuilder();

        for (int i = 0; i < n; i++) {
            tail.append(s.charAt(i));
        }

        StringBuilder res = new StringBuilder(s.substring(n));
        res.append(tail);

        return res.toString();

    }
}


/**
 * String: immutable
 * StringBuilder: mutable
 */
