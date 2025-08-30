
package Assignment_2;

public class BubbleSort_Q2 {
    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int size = 7;

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