package Array2D;

import java.util.Scanner;

public class PrintLikeAWave_Assign4 {

	public static void wavePrint(int mat[][]) {

if(mat.length == 0) 
{
	return;
}

		int n = mat.length;
		int m = mat[0].length;

		// Traverse each column
		for (int j = 0; j < m; j++) {
			if (j % 2 == 0) {
				// Traverse down the column
				for (int i = 0; i < n; i++) {
					System.out.print(mat[i][j] + " ");
				}
			} else {
				// Traverse up the column
				for (int i = n - 1; i >= 0; i--) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}

	}
	   public static void main(String args[]) {
	        int t, N, M;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) {
	            N = sr.nextInt();
	            M = sr.nextInt();
	            int ar[][] = new int[N][M]; // Swap n and m in array dimensions
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < M; j++) {
	                    ar[i][j] = sr.nextInt();
	                }
	            }
	            PrintLikeAWave_Assign4.wavePrint(ar);
		    System.out.println();
	        }
	    }
	}
	
	