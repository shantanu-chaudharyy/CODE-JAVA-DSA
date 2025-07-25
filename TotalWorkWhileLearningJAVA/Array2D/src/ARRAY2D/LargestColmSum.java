package ARRAY2D;

import java.util.Scanner;

public class LargestColmSum {

	public static void largestcolm(int arr[][], int n, int m) {

		n = arr[0].length;
		m = arr.length;
		int sum;
		int max = Integer.MIN_VALUE;
		int indx = -1;

		for (int j = 0; j < m; j++) {
			sum = 0;
			for (int i = 0; i < n; i++) {
				sum += arr[i][j];// 1+4+7=12

			}

			if (sum > max) {
				max = sum;
				indx = j;// 0

			}
		}

		System.out.println("Column" + " " + indx + " " + max);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int arr[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		largestcolm(arr, n, m);
	}

}
