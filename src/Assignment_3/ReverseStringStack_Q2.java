
package Assignment_3;

import java.util.Scanner;

public class ReverseStringStack_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse : ");
        char[] str = sc.nextLine().toCharArray();
        reverseString(str);
        System.out.println("Reversed String: ");
        for (int i = 0; i < str.length; i++) System.out.print(str[i]);

    }

    static void reverseString(char[] str) {
        Utils.Stack s = new Utils.Stack(); /* This class has all the functions implemented and is made by me in package
        "Utils" */
        for (int i = 0; i < str.length; i++) s.push(str[i]);
        int i = 0;
        while (!s.isEmpty()) {
            str[i] = s.pop();
            i++;
        }
    }
}
