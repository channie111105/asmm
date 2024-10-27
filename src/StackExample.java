import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Add elements to the stack
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        stack.push("Element 4");

        System.out.println("Initial stack: " + stack);

        // Remove the top element from the stack (LIFO)
        String removedElement = stack.pop();
        System.out.println("Popped: " + removedElement);
        System.out.println("Stack after popping: " + stack);

        // Peek at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check the size of the stack
        System.out.println("Current stack size: " + stack.size());

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}
