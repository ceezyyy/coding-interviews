/**
 * <p>
 *
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
// Intuition
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {

        if (head == null) return null;

        int size = 0;
        int counter = 0;
        ListNode tmpHead = head;

        // Get the size
        while (head != null) {
            size++;
            head = head.next;
        }

        // Get k-th from the end
        while (counter < size - k) {
            if (counter == size - k) break;
            tmpHead = tmpHead.next;
            counter++;
        }

        return tmpHead;

    }
}
