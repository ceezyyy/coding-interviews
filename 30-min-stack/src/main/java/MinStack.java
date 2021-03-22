import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 面试题30. 包含min函数的栈
 * https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/21
 */
class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        if (stack.isEmpty() || x <= minStack.peek()) minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        if (stack.isEmpty()) return;
        if (stack.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top() {
        return (stack.isEmpty()) ? -1 : stack.peek();
    }

    public int min() {
        return (stack.isEmpty()) ? -1 : minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
