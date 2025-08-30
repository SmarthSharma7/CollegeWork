
package Assignment_3;

import Utils.Stack;
import java.util.Scanner;

public class BalancedParenthesis_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string with parentheses: ");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("The string has balanced parentheses.");
        } else {
            System.out.println("The string does not have balanced parentheses.");
        }
    }

    static boolean isBalanced(String str) {
        Stack stack = new Stack();
        char[] expr =  str.toCharArray();

        for (int i = 0; i < expr.length; i++) {
            char ch = expr[i];

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
