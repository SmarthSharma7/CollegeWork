
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {

        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input diagonal matrix array: ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th element of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i : arr) System.out.print(i + ", ");

        System.out.println();
        displayDiagonalMatrix(arr, size);

    }

    static void displayDiagonalMatrix(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(arr[count] + " ");
                    count++;
                }
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
