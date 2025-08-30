
package Assignment_2;

import java.util.Scanner;

public class String_Q4_b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse : ");
        String str = sc.nextLine();

        System.out.println("Reversed string is : ");
        str = reverseString(str);
        System.out.println(str);

    }

    static String reverseString(String str) {
        char[] ch = str.toCharArray();
        int l = 0;
        int r = ch.length - 1;
        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}
