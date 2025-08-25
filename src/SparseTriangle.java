
import java.util.Scanner;

public class SparseTriangle {
    public static void main(String[] args) {
        int[][] sparseMatrix = inputSparseMatrix();
        displaySparseMatrix(sparseMatrix);
        transposeSparseMatrix(sparseMatrix);
    }

    static int[][] inputSparseMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of sparse matrix : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns of sparse matrix : ");
        int columns = sc.nextInt();
        System.out.println("Enter number of elements of sparse matrix : ");
        int elements = sc.nextInt();
        int[][] sparseMatrix = new int[elements + 1][3];
        sparseMatrix[0][0] = rows;
        sparseMatrix[0][1] = columns;
        sparseMatrix[0][2] = elements;
        System.out.println("Enter elements of sparse matrix in row major order -->");
        for (int i = 1; i <= elements; i++) {
            System.out.println("Enter row, column and the " + i + "th element : ");
            sparseMatrix[i][0] = sc.nextInt();
            sparseMatrix[i][1] = sc.nextInt();
            sparseMatrix[i][2] = sc.nextInt();
        }
        return sparseMatrix;
    }

    static void displaySparseMatrix(int[][] sparseMatrix) {
        System.out.println("Row  Col  Val");
        System.out.println(" " + sparseMatrix[0][0] + "    " + sparseMatrix[0][1] + "    " + sparseMatrix[0][2]);
        System.out.println("-------------");
        for (int i = 1; i <= sparseMatrix[0][2]; i++) {
            if (sparseMatrix[i][2] != 0) {
                System.out.println(" " + sparseMatrix[i][0] + "    " + sparseMatrix[i][1] + "    " + sparseMatrix[i][2]);
            }
        }
    }

    static void transposeSparseMatrix(int[][] sparseMatrix) {
        
    }

}
