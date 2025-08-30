
package Assignment_2;

public class SparseMatrix_Q6_c {
    public static void main(String[] args) {

        int[][] sm1 = SparseMatrix_Q6_a.inputSparseMatrix();
        int[][] sm2 = SparseMatrix_Q6_a.inputSparseMatrix(); /* The "inputSparseMatrix()" function is written by me
        in file "SparseMatrix_Q6_a" */
        int[][] sm3;
        if (sm1[0][1] == sm2[0][0]) {
            sm3 = multiplySparseMatrices(sm1, sm2);
            SparseMatrix_Q6_a.displaySparseMatrix(sm3); /* This function is written by me in file "SparseMatrix_Q6_a" */
        } else {
            System.out.println("Invalid dimensions for multiplication");
        }

    }

    static int[][] multiplySparseMatrices(int[][] sm1, int[][] sm2) {
        int[][] sm3 = new int[sm1[0][0] * sm2[0][1]][3];
        sm3[0][0] = sm1[0][0];
        sm3[0][1] = sm2[0][1];
        SparseMatrix_Q6_a.transposeSparseMatrix(sm2); /* This function is written by me in file "SparseMatrix_Q6_a" */
        SparseMatrix_Q6_a.sortSparseMatrix(sm2); /* This function is written by me in file "SparseMatrix_Q6_a" */
        // I used this to sort the triplet in row major order after taking its transpose
        int k = 1;
        for (int i = 1; i <= sm1[0][2]; i++) {
            for  (int j = 1; j <= sm2[0][2]; j++) {
                if (sm1[i][1] == sm2[j][1]) {
                    boolean found = false;
                    for (int l = 1; l < k; l++) {
                        if (sm3[l][0] == sm1[i][0] && sm3[l][1] == sm2[j][0]) {
                            sm3[l][2] +=  sm1[i][2] * sm2[j][2];
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        sm3[k][0] = sm1[i][0];
                        sm3[k][1] = sm2[j][0];
                        sm3[k][2] =  sm1[i][2] *  sm2[j][2];
                        k++;
                    }
                }
            }
        }
        sm3[0][2] = k - 1;
        SparseMatrix_Q6_a.sortSparseMatrix(sm3); /* I used this to sort the triplet in row major order after
        multiplication */
        return sm3;
    }
}
