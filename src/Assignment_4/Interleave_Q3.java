
package Assignment_4;

import Utils.StackInt;

public class Interleave_Q3 {
    public static void main(String[] args) {
        Queuee queue = new Queuee();
        int[] arr = {4, 7, 11, 20, 5, 9};
        if (arr.length % 2 != 0) {
            System.out.println("Array length is not even");
            System.exit(0);
        }
        for (int j : arr) {
            queue.enqueue(j);
        }
        System.out.println("Queue before interleaving : ");
        queue.display();
        interleave(queue);
        System.out.println("Queue after interleaving : ");
        queue.display();
    }

    static void interleave(Queuee queue) {
        StackInt stack = new StackInt(); // This is a class made by me in utils package
        int n = queue.size();
        for (int i = 0; i < n / 2; i++) {
            stack.push(queue.dequeue());
        }
        for (int i = 0; i < n / 2; i++) {
            queue.enqueue(stack.pop());
        }
        for (int i = 0; i < n / 2; i++) {
            queue.enqueue(queue.dequeue());
        }
        for (int i = 0; i < n / 2; i++) {
            stack.push(queue.dequeue());
        }
        for (int i = 0; i < n / 2; i++) {
            queue.enqueue(stack.pop());
            queue.enqueue(queue.dequeue());
        }
    }
}
