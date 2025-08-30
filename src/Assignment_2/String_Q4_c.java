
package Assignment_2;

import java.util.Scanner;

public class String_Q4_c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to delete vowels from : ");
        String str = sc.nextLine();

        System.out.println("String after deleting vowels : ");
        str = deleteVowels(str);
        System.out.println(str);

    }

    static String deleteVowels(String str) {
        char[] ch = str.toCharArray();
        int size = ch.length;
        for (int i = 0; i < size; i++) {
            if (ch[i] == 'a' ||  ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' ||  ch[i] == 'u' || ch[i] == 'A' ||  ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' ||  ch[i] == 'U') {
                deleteElement(ch, size, i);
                size--;
            }
        }
        char[] newCh = new char[size];
        for (int i = 0; i < size; i++) {
            newCh[i] = ch[i];
        }
        return new String(newCh);
    }

    static void deleteElement(char[] ch, int size, int index) {
        for (int i = index; i < size - 1; i++) {
            ch[i] = ch[i + 1];
        }
    }

}
