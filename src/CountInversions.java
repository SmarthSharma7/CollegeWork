
import java.util.Scanner;

public class CountInversions {
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

        System.out.println("Number of inversions in array: " + countInversions(arr, size));

    }

    static int countInversions(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) count++;
            }
        }
        return count;
    }
}