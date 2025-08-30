package Assignment_1;

import java.util.Scanner;

public class ReverseArray_Q4_a {
    public static void main(String[] args) {

        int[] arr;
        int size = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the size of the array: ");
            size = sc.nextInt();
            if (size < 1) {
                System.out.println("Invalid size!");
                continue;
            }
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Enter " + i + "th element: ");
                arr[i] = sc.nextInt();
            }
            break;
        }

        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }

        reverseArray(arr, size);
        System.out.println("\nReversed array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    static void reverseArray(int[] arr, int size) {
        int left = 0, right = size - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
