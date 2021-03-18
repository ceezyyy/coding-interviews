import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 剑指 Offer 06. 从尾到头打印链表
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
// Intuition
class Solution {
    public int[] reversePrint(ListNode head) {

        if (head == null) return new int[0];

        Deque<Integer> deque = new ArrayDeque<>();
        int counter = 0;
        int i = 0;

        // Put in
        while (head != null) {
            deque.push(head.val);
            head = head.next;
            counter++;
        }

        // Take out
        int[] res = new int[counter];
        while (deque.peek() != null && counter > 0) {
            res[i] = deque.pop();
            i++;
            counter--;
        }

        return res;

    }
}


/**
 * Deque -> Stack: push() / pop() / peek()
 * Deque -> Queue: add() / poll()
 */
