import java.util.Scanner;

public class FindMissing {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int size = arr.length;
        System.out.println("Array: ");
        for (int i : arr) System.out.print(i + ", ");

        System.out.println();
        findMissing(arr, size);

    }

    static void findMissing(int[] arr, int size) {
        boolean missing = false;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                missing = true;
                System.out.println((arr[i] + 1) + " is missing in the array");
            }
        }
        if (!missing) System.out.println("No element is missing in the array");
    }
}
