package Assignment_1;

public class Sum_Q5 {
    public static void main(String[] args) {

        int r = 3, c = 3;
        int[][] m = {
                {2, 6, 8},
                {1, 3, 5},
                {9, 5, 1}
        };

        int[] sums;
        sums = findSums(m, r, c);

        for (int i = 0; i < r; i++) {
            System.out.println("Sum of elements of " + i + "th row is: " + sums[i]);
        }
        for (int i = r; i < (r + c); i++) {
            System.out.println("Sum of elements of " + (i - r) + "th column is: " + sums[i]);
        }

    }

    static int[] findSums(int[][] m, int r, int c) {
        int[] sums = new int[r + c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sums[i] += m[i][j];
                sums[j + r] += m[i][j];
            }
        }
        return sums;
    }
}
