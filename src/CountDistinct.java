
import java.util.Scanner;

public class CountDistinct {
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
        System.out.println("Number of distinct elements in array: " + countDistinct(arr, size));

    }

    static int countDistinct(int[] arr, int size) {
        MergeSort.mergeSort(arr, 0, size - 1);
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[i - 1]) count++;
        }
        return count;
    }

}