package Assignment_2;

import java.util.Scanner;

public class UpperTriangleMatrix_Q5_d {
    public static void main(String[] args) {

        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input upper triangle matrix array: ");
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
        displayUpperTriangleMatrix(arr, size);

    }

    static void displayUpperTriangleMatrix(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) System.out.print(0 + " ");
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
