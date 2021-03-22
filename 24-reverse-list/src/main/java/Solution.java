import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 剑指 Offer 24. 反转链表
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
// Intuition
class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null) return head;

        Deque<Integer> stack = new ArrayDeque<>();
        ListNode res;

        while (head.next != null) {
            stack.push(head.val);
            head = head.next;
        }

        res = head;

        while (stack.peek() != null) {
            head.next = new ListNode(stack.pop());
            head = head.next;
        }

        return res;

    }
}


/**
 * Time: O(n)
 * Space: O(n)
 */
