import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 剑指 Offer 09. 用两个栈实现队列
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/22
 */
class CQueue {

    private Deque<Integer> pushStack;
    private Deque<Integer> popStack;

    public CQueue() {
        pushStack = new ArrayDeque<>();
        popStack = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        pushStack.push(value);
    }

    public int deleteHead() {

        if (pushStack.isEmpty() && popStack.isEmpty()) return -1;

        if (popStack.isEmpty()) {
            // "pushStack" -> "popStack"
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        return popStack.pop();

    }
}


/**
 * Reference:
 * <p>
 * Implement A Queue Using Stacks - The Queue ADT ("Implement Queue Using Stacks" on LeetCode)
 * https://www.youtube.com/watch?v=Wg8IiY1LbII
 */


