
package Assignment_2;

import java.util.Scanner;

public class String_Q4_d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings to sort : ");
        int size = sc.nextInt();
        sc.nextLine(); /* I used this because the newline character from sc.nextInt() was being passed to the first
        string */
        String[] strings = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th string (lowercase) : ");
            strings[i] = sc.nextLine();
        }

        sortStrings(strings, size);

        System.out.println("The sorted strings are : ");
        for (int i = 0; i < size; i++) {
            System.out.println(strings[i]);
        }

    }

    static void sortStrings(String[] strings, int size) {
        char[][] sortedStrings = new char[size][];
        for (int i = 0; i < size; i++) {
            sortedStrings[i] = strings[i].toCharArray();
        }
        for (int i = 0; i < size - 1; i++) {
            for  (int j = 0; j < size - i - 1; j++) {
                for (int k = 0; k < sortedStrings[j].length && k < sortedStrings[j + 1].length; k++) {
                    if (sortedStrings[j][k] > sortedStrings[j + 1][k]) {
                        char[] temp = sortedStrings[j];
                        sortedStrings[j] = sortedStrings[j + 1];
                        sortedStrings[j + 1] = temp;
                        break;
                    } else if (sortedStrings[j][k] < sortedStrings[j + 1][k]) {
                        break;
                    } else {
                        if (k == sortedStrings[j + 1].length - 1 && sortedStrings[j].length > k + 1) {
                            char[] temp = sortedStrings[j];
                            sortedStrings[j] = sortedStrings[j + 1];
                            sortedStrings[j + 1] = temp;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            strings[i] = new String(sortedStrings[i]);
        }
    }
}
