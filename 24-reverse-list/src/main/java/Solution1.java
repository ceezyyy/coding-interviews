/**
 * <p>
 * 剑指 Offer 24. 反转链表
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
class Solution1 {
    public ListNode reverseList(ListNode head) {

        if (head == null) return null;

        ListNode pre = null;
        ListNode post = null;

        while (head.next != null) {

            post = head.next;

            // 1. reverse
            head.next = pre;

            // 2. go ahead
            pre = head;
            head = post;

        }

        // 3. reverse (finally)
        if (post != null) {
            post.next = pre;
            return post;
        }

        return head;

    }
}


/**
 * ListNode dummy = null;
 * Save intermediate state
 */
