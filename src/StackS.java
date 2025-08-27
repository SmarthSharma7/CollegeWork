
import java.util.Scanner;

class Stack {

    private final int MAX = 100;
    private int top;
    private char[] arr;

    Stack() {
        top = -1;
        arr = new char[MAX];
    }

    void push(char x) {
        if (top == MAX - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = x;
        System.out.println("Pushing " + x + " to top of stack");
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        System.out.println("Popping " + arr[top] + " from top of stack");
        top--;
        return arr[top + 1];
    }

    void peek() {
        System.out.println("Peeking " + arr[top]);
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + "\n");
        }
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class StackS {
    public static void main(String[] args) {

        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);

//        int choice;
//        while (true) {
//            System.out.println("----- Stack Menu -----");
//            System.out.println("1. Push");
//            System.out.println("2. Pop");
//            System.out.println("3. Peek");
//            System.out.println("4. Display");
//            System.out.println("5. Exit");
//            choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter the character to push : ");
//                    int x = sc.nextInt();
//                    s.push(x);
//                    break;
//                case 2:
//                    s.pop();
//                    break;
//                case 3:
//                    s.peek();
//                    break;
//                case 4:
//                    s.display();
//                    break;
//                case 5:
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice");
//            }
//        }

        System.out.println("Enter string to reverse : ");
        char[] str = sc.nextLine().toCharArray();
        reverseString(str);
        System.out.println("Reversed String: ");
        for (int i = 0; i < str.length; i++) System.out.print(str[i]);
    }

    static void reverseString(char[] str) {
        Stack s = new Stack();
        for (int i = 0; i < str.length; i++) s.push(str[i]);
        int i = 0;
        while (!s.isEmpty()) {
            str[i] = s.pop();
            i++;
        }
    }

}
