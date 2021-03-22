/**
 * <p>
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/19
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;

    }
}


/**
 * HAVE INTERSECTION:
 * <p>
 * linked list A: a + c; linked list B: b + c; common part: c
 * (a + c) + b = (b + c) + a
 * <p>
 * <p>
 * HAVE NO INTERSECTION:
 * <p>
 * linked list A: a
 * linked list B: b
 * a + b = b + a
 */
