
import java.util.*;

public class ImplementStack225 {

    ArrayDeque<Integer> q = new ArrayDeque<>();

    public ImplementStack225() {

    }

    public void push(int x) {
        q.offer(x);

        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {

        if (q.isEmpty()) {
            return -1;
        }
        return q.pop();

    }

    public int top() {
        if (q.isEmpty()) {
            return -1;
        }

        return q.peek();

    }

    public boolean empty() {
        if (q.isEmpty()) {
            return true;
        }
        return false;

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */