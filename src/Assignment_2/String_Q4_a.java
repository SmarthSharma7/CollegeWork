
package Assignment_2;

import java.util.Scanner;

public class String_Q4_a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string : ");
        String str2 = sc.nextLine();

        System.out.println("Concatenating second string to first string.... ");
        str1 = concatenateStrings(str1, str2);
        System.out.println("Concatenated string is : " + str1);

    }

    static String concatenateStrings(String str1, String str2) {
        char[] ch1 =  str1.toCharArray();
        char[] ch2 =  str2.toCharArray();
        char[] ch3 = new char[ch1.length + ch2.length];
        for (int i = 0; i < ch1.length; i++) {
            ch3[i] = ch1[i];
        }
        for (int i = 0; i < ch2.length; i++) {
            ch3[i + ch1.length] = ch2[i];
        }
        return new String(ch3);
    }
}
