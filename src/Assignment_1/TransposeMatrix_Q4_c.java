package Assignment_1;

public class TransposeMatrix_Q4_c {
    public static void main(String[] args) {

        int r = 2, c = 3;
        int[][] m = {
                {1, 4, 2},
                {7, 3, 5}
        };

        m = transposeMatrix(m, r, c);
        int temp = r;
        r = c;
        c = temp;
        displayMatrix(m, r, c);

    }

    static int[][] transposeMatrix(int[][] m, int r, int c) {
        int[][] mTranspose = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) mTranspose[j][i] = m[i][j];
        }
        return mTranspose;
    }

    static void displayMatrix(int[][] m, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
