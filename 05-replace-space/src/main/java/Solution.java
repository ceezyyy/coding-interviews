import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 剑指 Offer 05. 替换空格
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/20
 */
class Solution {
    public String replaceSpace(String s) {

        StringBuilder sb = new StringBuilder();
        char[] nums = s.toCharArray();
        List<Integer> blanks = new ArrayList<>();
        String sub;

        // dummy head
        blanks.add(-1);

        for (int i = 0; i < s.length(); i++) {
            if (nums[i] == ' ') {
                // Store the index of blank space
                blanks.add(i);
            }
        }

        for (int i = 0; i < blanks.size() - 1; i++) {
            sub = s.substring(blanks.get(i) + 1, blanks.get(i + 1));
            sb.append(sub);
            sb.append("%20");
        }

        // tail
        int n = blanks.size();
        sub = s.substring(blanks.get(n - 1) + 1);
        sb.append(sub);

        return sb.toString();

    }
}


/**
 * "emptiness".substring(9) returns "" (an empty string)
 */
