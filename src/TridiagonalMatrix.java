import java.util.Scanner;

public class TridiagonalMatrix {
    public static void main(String[] args) {

        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input tridiagonal matrix array: ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th element of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i : arr) System.out.print(i + ", ");
        size = (size + 2) / 3;

        System.out.println();
        displayTridiagonalMatrix(arr, size);

    }

    static void displayTridiagonalMatrix(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i - j > 1 || j - i > 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(arr[count] + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
