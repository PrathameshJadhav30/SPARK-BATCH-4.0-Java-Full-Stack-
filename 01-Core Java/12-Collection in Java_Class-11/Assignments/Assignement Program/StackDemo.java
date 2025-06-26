import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Python");
        stack.push("Spring");

        System.out.println("Stack: " + stack);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Stack after pop: " + stack);
    }
}
