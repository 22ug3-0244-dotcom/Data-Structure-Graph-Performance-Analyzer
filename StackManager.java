public class StackManager {

    private int[] stack;
    private int top;

    public StackManager(int capacity) {

        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {

        if (top == stack.length - 1) {

            System.out.println("Stack is full.");
            return;
        }

        top++;

        stack[top] = value;

        System.out.println("Value pushed successfully.");
    }

    public void pop() {

        if (top == -1) {

            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Popped value: " + stack[top]);

        top--;
    }

    public void peek() {

        if (top == -1) {

            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Top value: " + stack[top]);
    }

    public void display() {

        if (top == -1) {

            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {

            System.out.println(stack[i]);
        }
    }
}