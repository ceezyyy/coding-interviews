/**
 * <p>
 * 剑指 Offer 18. 删除链表的节点
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/19
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {

        if (head == null) return null;
        ListNode tmpHead = head;
        ListNode pre = null;
        ListNode post = null;

        while (head.next != null) {

            post = head.next;

            if (head.val == val) {
                // "head"
                if (pre == null) return post;
                // "mid"
                pre.next = post;
                return tmpHead;
            }

            // go ahead
            pre = head;
            head = post;

        }

        // "tail"
        pre.next = null;

        return tmpHead;

    }
}
