package Assignment_1;

public class MultiplyMatrices_Q4_b {
    public static void main(String[] args) {

        int r1 = 2, c1 = 3;
            int[][] m1 = {
                    {1, 4, 2},
                    {7, 3, 5}
            };

            int r2 = 3, c2 = 3;
            int[][] m2 = {
                    {2, 6, 8},
                    {1, 3, 5},
                    {9, 5, 1}
            };
        int[][] m3;
        if (c1 == r2) {
            m3 = multiplyMatrices(m1, r1, c1, m2, r2, c2);
            displayMatrix(m3, r1, c2);
        } else System.out.println("Incompatible row and col numbers of the 2 matrices for multiplication!");

    }

    static int[][] multiplyMatrices(int[][] m1, int r1, int c1, int[][] m2, int r2, int c2) {
        int[][] m3 = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m3;
    }

    static void displayMatrix(int[][] m, int r, int c) {
        for  (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
