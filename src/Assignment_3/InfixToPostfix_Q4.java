
package Assignment_3;

public class InfixToPostfix_Q4 {
    public static void main(String[] args) {

        char[] input = "((A+B)*(C-D))".toCharArray();
        char[] output = new char[input.length];
        int n = infixToPostfix(input, output);
        for (int i = 0; i < n; i++) System.out.print(output[i]);

    }

    static int infixToPostfix(char[] input, char[] output) {
        Utils.Stack s = new Utils.Stack(); /* This class has all the functions implemented and is made by me in package
        "Utils" */
        int k = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                s.push(input[i]);
            }
            else if (input[i] == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    output[k] = s.pop();
                    k++;
                }
                s.pop();
            }
            else if (input[i] == '+' || input[i] == '-') {
                while (!s.isEmpty() && (s.peek() == '+' || s.peek() == '-' || s.peek() == '*' || s.peek() == '/' || s.peek() == '^')) {
                    output[k] = s.pop();
                    k++;
                }
                s.push(input[i]);
            }
            else if (input[i] == '*' || input[i] == '/') {
                while (!s.isEmpty() && (s.peek() == '*' || s.peek() == '/' || s.peek() == '^')) {
                    output[k] = s.pop();
                    k++;
                }
                s.push(input[i]);
            }
            else if (input[i] == '^') {
                while (!s.isEmpty() && s.peek() == '^') {
                    output[k] = s.pop();
                    k++;
                }
                s.push(input[i]);
            }
            else {
                output[k] = input[i];
                k++;
            }
        }
        return k;
    }

}
