public class Stack {
    private int arr[];
    private int size;
    private int index = 0;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; // or throw an exception
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == size;
    }

    public int size() {
        return index;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(0);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);

        System.out.println("1. Size of stack after push operation: " + stack.size());

        System.out.print("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        System.out.println("3. Size of stack after pop operation: " + stack.size());
    }
}