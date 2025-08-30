
package Assignment_2;

import java.util.Scanner;

public class String_Q4_e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter an uppercase character to change its case (characters following the first one (if " +
                "any) will be ignored) : ");
        ch = sc.next().charAt(0);

        ch = changeCase(ch);
        System.out.println("Lowercase character : " + ch);

    }

    static char changeCase(char ch) {
        return (char) (ch + 32);
    }
}
