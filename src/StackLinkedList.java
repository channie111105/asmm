import java.util.EmptyStackException;

public class StackLinkedList {
    private Node top; // Nút ở đỉnh ngăn xếp

    // Lớp Node biểu diễn một nút trong danh sách liên kết
    private class Node {
        int data; // Dữ liệu của nút
        Node next; // Liên kết đến nút tiếp theo

        // Khởi tạo nút với dữ liệu
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Khởi tạo ngăn xếp rỗng
    public StackLinkedList() {
        top = null;
    }

    // Thêm phần tử vào đầu ngăn xếp
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Lấy phần tử đầu ngăn xếp và xóa khỏi ngăn xếp
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Ném ngoại lệ nếu ngăn xếp rỗng
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Lấy phần tử đầu ngăn xếp mà không xóa khỏi ngăn xếp
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Ném ngoại lệ nếu ngăn xếp rỗng
        }
        return top.data;
    }

    // Kiểm tra ngăn xếp có rỗng hay không
    public boolean isEmpty() {
        return top == null;
    }

    // Lấy kích thước ngăn xếp
    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
    }
}
