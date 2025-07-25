package ARRAY2D;

import java.util.Scanner;

public class WavePattern2Darray {

	public static void wave(int matrix[][], int n, int m) {
        // Get the dimensions of the matrix
        n = matrix.length;
        m = matrix[0].length;
        
        // Traverse each column
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                // Traverse down the column
                for (int i = 0; i < n; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Traverse up the column
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int matrix[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		wave(matrix, n, m);
	}

}
