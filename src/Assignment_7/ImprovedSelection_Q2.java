
package Assignment_7;

import java.util.Arrays;

public class ImprovedSelection_Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2};
        improvedSelection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void  improvedSelection(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int min = i;
            int max = arr.length - 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                if (max == i) max = min;
            }
            if (max != arr.length - 1) {
                int temp = arr[max];
                arr[max] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }
    }

}