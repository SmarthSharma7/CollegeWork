
package Assignment_4;

import java.util.Scanner;

class Queueee {

    int[] elements;
    int front, rear;
    private static final int MAX = 100;
    Queueee() {
        elements = new int[MAX];
        front = rear = -1;
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) front = 0;
        rear = (rear + 1) % MAX;
        elements[rear] = element;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, garbage value is returned");
            return Integer.MIN_VALUE;
        }
        int element = elements[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
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
        return front == (rear + 1) % MAX;
    }
    boolean isEmpty() {
        return front == -1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(elements[i]);
            if (i == rear) break;
            System.out.print(", ");
            i = (i + 1) % MAX;
        }
        System.out.println();
    }
}

public class CircularQueueMenu_Q2 {
    public static void main(String[] args) {

        Queueee queue = new Queueee();
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