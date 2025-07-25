package ARRAY2D;

import java.util.Scanner;

public class LargestRowOrColm {

	public static void Largest(int mat[][], int n, int m) {
		int maxm = Integer.MIN_VALUE;
		boolean InRow = true;
		int IndX = 0;

		if (mat.length == 0) {
			System.out.println("row" + " " + 0 + " " + maxm);
			return;
		}
		int sum;

		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < m; j++) {
				sum += mat[i][j];
			}

			if (sum > maxm) {
				maxm = sum;
				IndX = i;
			}

		}

		for (int j = 0; j < m; j++) {
			sum = 0;
			for (int i = 0; i < n; i++) {
				sum += mat[i][j];
			}

			if (sum > maxm) {
				maxm = sum;
				IndX = j;
				InRow = false;
			}
		}

		System.out.println((InRow ? "row " : "column ") + IndX + " " + maxm);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int arr[][] = new int[n][m];

		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		Largest(arr, n, m);
	}

}
