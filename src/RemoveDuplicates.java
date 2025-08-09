
import java.util.Scanner;

public class RemoveDuplicates {
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

        System.out.println("Before removal: ");
        for (int i : arr) System.out.print(i + ", ");
        size = removeDuplicates(arr, size);
        System.out.println("\nAfter removal: ");
        for (int i = 0; i < size; i++) System.out.print(arr[i] + ", ");

    }

    static int removeDuplicates(int[] arr, int size) {
        MergeSort.mergeSort(arr, 0, size - 1);
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        return newSize;
    }

}