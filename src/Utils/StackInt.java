package Utils;

public class StackInt {
    private final int MAX = 100;
    private int top;
    private int[] arr;

    public StackInt() {
        top = -1;
        arr = new int[MAX];
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Assignment_3.Stack overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Assignment_3.Stack underflow");
            return 0;
        }
        System.out.println("Popping " + arr[top] + " from top of stack");
        top--;
        return arr[top + 1];
    }

    public int peek() {
        return arr[top];
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + "\n");
            }
        } else System.out.println("Assignment_3.Stack underflow");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX - 1;
    }
}
