import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("After pop: " + stack);
    }
}
