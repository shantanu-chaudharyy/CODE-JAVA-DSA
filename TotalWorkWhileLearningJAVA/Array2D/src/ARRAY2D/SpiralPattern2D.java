package ARRAY2D;

import java.util.Scanner;

public class SpiralPattern2D {

	public static void Spiral(int matrix[][], int n, int m) {
		if (matrix == null || matrix.length == 0) {
			return;
		}

	       n = matrix.length; // Added: getting the number of rows
		   m = matrix[0].length; // Added: getting the number of columns

		int total = n * m; // total elements in the matrix
//																1 2 3 4
//																5 6 7 8
//																1 2 3 9
		int upperRow = 0;
		int lowerRow = n - 1;
		int upperColm = 0;
		int lowerColm = m - 1;

		int count = 0;

		while (count < total) {
			// Traverse from left to right along the top row
			for (int i = upperColm; i <= lowerColm; i++) { // Fixed: should be i <= lowerColm
				System.out.print(matrix[upperRow][i] + " ");
				count++;
			}
			upperRow++;

			// Traverse from top to bottom along the right column
			for (int i = upperRow; i <= lowerRow; i++) { // Fixed: should be i <= lowerRow
				System.out.print(matrix[i][lowerColm] + " ");
				count++;
			}
			lowerColm--;

			// Traverse from right to left along the bottom row
			for (int i = lowerColm; i >= upperColm ; i--) { // Fixed: should be i >= upperColm
				System.out.print(matrix[lowerRow][i] + " ");
				count++;
			}
			lowerRow--;

			// Traverse from bottom to top along the left column
			for (int i = lowerRow; i >= upperRow; i--) { // Fixed: should be i >= upperRow
				System.out.print(matrix[i][upperColm] + " ");
				count++;
			}
			upperColm++;
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
		Spiral(matrix, n, m);
	}

}
