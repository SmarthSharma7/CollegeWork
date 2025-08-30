
package Assignment_3;

public class PostfixEvaluation_Q5 {
    public static void main(String[] args) {

        String str = "53+82-*";
        int result = evaluatePostfix(str);
        System.out.println("Result = " + result);
    }

    static int evaluatePostfix(String str) {
        Utils.StackInt s = new Utils.StackInt();  /* This class has all the functions implemented and is made by me in package
        "Utils" */
        char[] expr = str.toCharArray();
        for (int i = 0; i < expr.length; i++) {
            char ch = expr[i];

            if (ch == ' ') continue;
            if (ch >= '0' && ch <= '9') {
                s.push(ch - '0');
            }
            else {
                int b = s.pop();
                int a = s.pop();
                int res = 0;
                switch (ch) {
                    case '+': res = a + b; break;
                    case '-': res = a - b; break;
                    case '*': res = a * b; break;
                    case '/': res = a / b; break;
                    case '^': res = (int) Math.pow(a, b); break;
                }
                s.push(res);
            }
        }
        return s.pop();
    }

}
