/**
 * <p>
 * 剑指 Offer 25. 合并两个排序的链表
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 * <p>
 * Tutorial:
 * https://www.youtube.com/watch?v=GfRQvf7MB3k
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/19
 */
// Iterative
class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {

        if (a == null) return b;
        if (b == null) return a;

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                cur.next = a;
                // go ahead
                a = a.next;
                cur = cur.next;
            } else {
                cur.next = b;
                // go ahead
                b = b.next;
                cur = cur.next;
            }
        }

        cur.next = (a == null) ? b : a;

        return dummy.next;

    }
}


/**
 * The power of "dummy" node
 */
