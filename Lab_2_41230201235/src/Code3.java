import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rowsA = 2, colsA = 3;
        int rowsB = 3, colsB = 2;

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] P = new int[rowsA][colsB];


        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsA; j++)
            {
                A[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rowsB; i++)

        {
            for (int j = 0; j < colsB; j++)
            {
                B[i][j] = input.nextInt();
            }
        }


        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                for (int k = 0; k < colsA; k++)
                {
                    P[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix P = ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(P[i][j] + " ");
            }
            System.out.println();
        }


    }
}
