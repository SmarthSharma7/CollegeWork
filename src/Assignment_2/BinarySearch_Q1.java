package Assignment_2;

import java.util.Scanner;

public class BinarySearch_Q1 {
    public static void main(String[] args) {

        int[] arr;
        int size;
        int element;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input sorted array: ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i : arr) System.out.print(i + ", ");

        System.out.println("\nEnter the element you want to search : ");
        element = sc.nextInt();
        binarySearch(arr, size, element);

    }

    static void binarySearch(int[] arr, int size, int element) {
        int l = 0;
        int r = size - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == element) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if (arr[mid] < element) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        System.out.println("Element not found in given array!");
    }
}