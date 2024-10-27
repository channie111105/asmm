public class StackUsingArray {
    private int maxSize; // Kích thước tối đa của ngăn xếp
    private int[] stackArray; // Mảng lưu trữ các phần tử ngăn xếp
    private int top; // Chỉ số của phần tử ở đỉnh ngăn xếp

    // Constructor để khởi tạo ngăn xếp
    public StackUsingArray(int size) {
        this.maxSize = size; // Thiết lập kích thước tối đa
        this.stackArray = new int[maxSize]; // Khởi tạo mảng lưu trữ
        this.top = -1; // Khởi tạo chỉ số đỉnh ngăn xếp là -1 (ngăn xếp rỗng)
    }

    // Thêm phần tử vào đỉnh ngăn xếp
    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack overflow. Cannot push " + value);
            return; // Nếu ngăn xếp đầy
        }
        stackArray[++top] = value; // Tăng chỉ số đỉnh và gán giá trị
        System.out.println("Pushed " + value + " to stack");
    }

    // Xóa phần tử ở đỉnh ngăn xếp và trả về giá trị đó
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop from empty stack");
            return -1; // Nếu ngăn xếp rỗng
        }
        return stackArray[top--]; // Trả về giá trị ở đỉnh và giảm chỉ số đỉnh
    }

    // Xem phần tử ở đỉnh ngăn xếp mà không xóa
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1; // Nếu ngăn xếp rỗng
        }
        return stackArray[top]; // Trả về giá trị ở đỉnh
    }

    // Kiểm tra ngăn xếp có rỗng hay không
    public boolean isEmpty() {
        return top == -1; // Nếu chỉ số đỉnh là -1 thì ngăn xếp rỗng
    }

    // Lấy kích thước của ngăn xếp
    public int size() {
        return top + 1; // Kích thước là chỉ số đỉnh + 1
    }

    // Phương thức main để thử nghiệm ngăn xếp
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5); // Tạo một ngăn xếp với kích thước tối đa là 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek()); // Xem phần tử ở đỉnh

        System.out.println("Stack size is: " + stack.size()); // Kiểm tra kích thước ngăn xếp

        System.out.println("Popped element: " + stack.pop()); // Xóa phần tử ở đỉnh
        System.out.println("Popped element: " + stack.pop()); // Xóa phần tử tiếp theo
        System.out.println("Stack size after popping: " + stack.size()); // Kiểm tra kích thước sau khi xóa

        stack.push(40);
        stack.push(50);
        stack.push(60); // Thử thêm một phần tử để kiểm tra overflow
        System.out.println("Top element after pushing: " + stack.peek()); // Xem phần tử ở đỉnh
    }
}
