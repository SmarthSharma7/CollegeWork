
package Assignment_4;

import java.util.Scanner;

class Queuee {

    int[] elements;
    int front, rear;
    private static final int MAX = 100;
    Queuee() {
        elements = new int[MAX];
        front = rear = -1;
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) front = rear = 0;
        else rear++;
        elements[rear] = element;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, garbage value is returned");
            return Integer.MIN_VALUE;
        }
        int element = elements[front];
        front++;
        if (front == rear + 1) front = rear = -1;
        return element;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, garbage value is returned");
            return Integer.MIN_VALUE;
        }
        return elements[front];
    }

    boolean isFull() {
        return rear == MAX - 1;
    }
    boolean isEmpty() {
        return front == -1;
    }
    int size() {
        if (!isEmpty()) return (rear - front) + 1;
        return 0;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(elements[i] + ", ");
        }
        System.out.println();
    }
}

public class SimpleQueueMenu_Q1 {
    public static void main(String[] args) {

        Queuee queue = new Queuee();
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if full");
            System.out.println("5. Check if empty");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter element : ");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    System.out.println(queue.dequeue());
                    break;
                case 3:
                    System.out.println(queue.peek());
                    break;
                case 4:
                    System.out.println(queue.isFull());
                    break;
                case 5:
                    System.out.println(queue.isEmpty());
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
