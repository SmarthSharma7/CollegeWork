
package Assignment_2;

public class SparseMatrix_Q6_b {
    public static void main(String[] args) {

        int[][] sm1 = SparseMatrix_Q6_a.inputSparseMatrix();
        int[][] sm2 = SparseMatrix_Q6_a.inputSparseMatrix(); /* The "inputSparseMatrix()" function is written by me
        in file "SparseMatrix_Q6_a" */
        int[][] sm3;
        if (sm1[0][0] == sm2[0][0] && sm1[0][1] == sm2[0][1]) {
            sm3 = addSparseMatrices(sm1, sm2);
            SparseMatrix_Q6_a.displaySparseMatrix(sm3); /* This function is written by me in file "SparseMatrix_Q6_a" */
        } else {
            System.out.println("Invalid dimensions for adding");
        }

    }

    static int[][] addSparseMatrices(int[][] sm1, int[][] sm2) {
        int n1 = sm1[0][2];
        int n2 = sm2[0][2];
        int[][] sm3 = new int[n1 + n2][3];
        sm3[0][0] = sm1[0][0];
        sm3[0][1] = sm1[0][1];
        int i = 1, j = 1, k = 1;
        while (i <= n1 && j <= n2) {
            if (sm1[i][0] < sm2[j][0] || (sm1[i][0] == sm2[j][0] && sm1[i][1] < sm2[j][1])) {
                sm3[k][0] = sm1[i][0];
                sm3[k][1] = sm1[i][1];
                sm3[k][2] = sm1[i][2];
                i++;
                k++;
            }
            else if (sm2[j][0] < sm1[i][0] || (sm2[j][0] == sm1[i][0] && sm2[j][1] < sm1[i][1])) {
                sm3[k][0] = sm2[j][0];
                sm3[k][1] = sm2[j][1];
                sm3[k][2] = sm2[j][2];
                j++;
                k++;
            } else {
                sm3[k][0] = sm1[i][0];
                sm3[k][1] = sm1[i][1];
                sm3[k][2] = sm1[i][2] + sm2[j][2];
                i++;
                j++;
                k++;
            }
        }
        while (i <= n1) {
            sm3[k][0] = sm1[i][0];
            sm3[k][1] = sm1[i][1];
            sm3[k][2] = sm1[i][2];
            i++;
            k++;
        }
        while (j <= n2) {
            sm3[k][0] = sm2[j][0];
            sm3[k][1] = sm2[j][1];
            sm3[k][2] = sm2[j][2];
            j++;
            k++;
        }
        sm3[0][2] = k - 1;
        return sm3;
    }

}
