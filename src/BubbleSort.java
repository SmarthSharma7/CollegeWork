
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input array: ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting: ");
        for (int i : arr) System.out.print(i + ", ");
        bubbleSort(arr, size);
        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < size; i++) System.out.print(arr[i] + ", ");

    }

    static void bubbleSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if  (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}