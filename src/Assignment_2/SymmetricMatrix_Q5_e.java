
package Assignment_2;

import java.util.Scanner;

public class SymmetricMatrix_Q5_e {
    public static void main(String[] args) {

        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input symmetric matrix array (enter only lower triangle elements): ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th element of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i : arr) System.out.print(i + ", ");

        size = solveQuadratic(size);

        System.out.println("\n");
        System.out.println("Matrix : ");
        displaySymmetricMatrix(arr, size);

    }

    static void displaySymmetricMatrix(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j) {
                    int index = ((j * (j + 1)) / 2) + i;
                    System.out.print(arr[index] + " ");
                }
                else {
                    System.out.print(arr[count] + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }

    static int solveQuadratic(int size) {
        double a = 1;
        double b = 1;
        double c = -(size * 2);
        double d = (b * b) - (4 * a * c);
        double root = (-b + Math.sqrt(d)) / (2 * a);
        return (int) root;
    }

}
