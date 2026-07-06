
import java.util.Stack;

public class PeekExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30

        System.out.println("Stack after peek: " + stack); // [10, 20, 30]
    }
}



